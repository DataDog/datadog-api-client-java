/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;


import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.AWSAccount;
import com.datadog.api.v1.client.model.AWSAccountCreateResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

/**
 * API tests for AwsIntegrationApi
 */
public class AwsIntegrationApiTest extends V1ApiTest {

    private static AwsIntegrationApi api;
    private static AwsIntegrationApi fakeAuthApi;
    private static AwsIntegrationApi unitApi;
    private static LinkedHashSet<AWSAccount> accountsToDelete;
    private static Random random = new Random();

    // ObjectMapper instance configure to not fail when encountering unknown properties
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private final String apiUri = "/api/v1/integration/aws";
    private final String fixturePrefix = "v1/client/api/aws_fixtures";

    @BeforeClass
    public static void initApi() {
        api = new AwsIntegrationApi(generalApiClient);
        fakeAuthApi = new AwsIntegrationApi(generalFakeAuthApiClient);
        unitApi = new AwsIntegrationApi(generalApiUnitTestClient);
    }

    @Before
    public void resetAccountsToDelete() {
        accountsToDelete = new LinkedHashSet<>();
    }

    @After
    public void removeAccounts() throws TestUtils.RetryException {
        for (AWSAccount account : accountsToDelete) {
            TestUtils.retry(random.nextInt(10), 20, () -> {
                try {
                    api.deleteAWSAccount().body(account).execute();
                } catch (ApiException e) {
                    System.out.println(String.format("Error deleting AWS Account: %s", e));
                    return false;
                }
                return true;
            });
        }
    }

    public void assertAccountIn(AWSAccount accountToAssert, List<AWSAccount> accounts) {
        for (AWSAccount account : accounts) {
            if (account.getAccountId().equals(accountToAssert.getAccountId())) {
                assertEquals(account.getRoleName(), accountToAssert.getRoleName());
                assertEquals(account.getFilterTags(), accountToAssert.getFilterTags());
                assertEquals(account.getAccountSpecificNamespaceRules(), accountToAssert.getAccountSpecificNamespaceRules());
                assertEquals(account.getHostTags(), accountToAssert.getHostTags());
                return;
            }
        }
        fail(String.format("Unable to find account %s in list %s", accountToAssert, accounts));
    }

    public String generateAccountId() {
        return String.format("java_%07d", (now.toInstant().toEpochMilli()) % 10000000);
    }

    @Test
    public void createAWSAccountTest() throws TestUtils.RetryException {
        //Test Creating an AWS Account with just the account_id and role_name
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setAccountId(generateAccountId());
        awsAccount.setRoleName(getUniqueEntityName());

        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                AWSAccountCreateResponse createResponse = api.createAWSAccount().body(awsAccount).execute();
                accountsToDelete.add(awsAccount);
                assertNotNull(createResponse.getExternalId());
            } catch (ApiException e) {
                System.out.println(String.format("Error creating AWS Account: %s", e));
                return false;
            }
            return true;
        });

        //Test Creating an AWS account with all the optional fields too
        AWSAccount awsAccountFull = new AWSAccount();
        Map<String, Boolean> accountSpecificNamespaceRules = new HashMap<String, Boolean>();
        List<String> hostTags = new ArrayList<String>();
        hostTags.add("javaTag:one");
        hostTags.add("java:success");
        List<String> excludedRegions = new ArrayList<String>();
        excludedRegions.add("us-east-1");
        excludedRegions.add("us-west-1");
        accountSpecificNamespaceRules.put("api_gateway", true);
        awsAccountFull.setAccountId(awsAccount.getAccountId().replaceFirst("java", "JAVA"));
        awsAccountFull.setRoleName(awsAccount.getRoleName() + "-full");
        awsAccountFull.setHostTags(hostTags);
        awsAccountFull.setExcludedRegions(excludedRegions);
        awsAccountFull.addFilterTagsItem("dontCollect:java");
        awsAccountFull.setAccountSpecificNamespaceRules(accountSpecificNamespaceRules);

        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                AWSAccountCreateResponse createResponse = api.createAWSAccount().body(awsAccountFull).execute();
                accountsToDelete.add(awsAccountFull);
                assertNotNull(createResponse.getExternalId());
            } catch (ApiException e) {
                System.out.println(String.format("Error creating AWS Account: %s", e));
                return false;
            }
            return true;
        });
    }

    @Test
    public void createAWSAccountMissingIDTest() throws IOException {
        try {
            //Test an exception is thrown if you're missing the account_id field
            AWSAccount awsAccount = new AWSAccount();
            awsAccount.setRoleName("java_testRoleName");
            api.createAWSAccount().body(awsAccount).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            // Currently, @Test(expected = ApiException.class) is wrongly reported as failed by APM.
        }
    }

    @Test
    public void createAWSAccountMissingRoleNameTest() throws IOException {
        try {
            //Test an exception is thrown if you're missing the role_name field
            AWSAccount awsAccount = new AWSAccount();
            awsAccount.setAccountId(generateAccountId());
            api.createAWSAccount().body(awsAccount).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            // Currently, @Test(expected = ApiException.class) is wrongly reported as failed by APM.
        }
    }

    @Test
    public void listAWSAccountsTest() throws ApiException, TestUtils.RetryException {
        List<AWSAccount> awsAccounts = new ArrayList<AWSAccount>();
        Map<String, Boolean> accountSpecificNamespaceRules = new HashMap<String, Boolean>();
        List<String> hostTags = new ArrayList<String>();

        accountSpecificNamespaceRules.put("api_gateway", false);
        hostTags.add("java_test_tag:value");

        for (int i = 0; i < 5; i++) {
            awsAccounts.add(new AWSAccount());
            awsAccounts.get(i).setAccountId(generateAccountId().substring(0, 10) + String.format("-%d", i));
            awsAccounts.get(i).setRoleName(String.format("Java Client Role Name_%s", i));
            awsAccounts.get(i).addFilterTagsItem("dontCollect:java");
            awsAccounts.get(i).setHostTags(hostTags);
            awsAccounts.get(i).setAccountSpecificNamespaceRules(accountSpecificNamespaceRules);
            int finalI = i;
            TestUtils.retry(random.nextInt(10), 20, () -> {
                try {
                    AWSAccountCreateResponse createResponse = api.createAWSAccount().body(awsAccounts.get(finalI)).execute();
                    accountsToDelete.add(awsAccounts.get(finalI));
                    assertNotNull(createResponse.getExternalId());
                } catch (ApiException e) {
                    System.out.println(String.format("Error creating AWS Account: %s", e));
                    return false;
                }
                return true;
            });
        }

        List<AWSAccount> awsAllAccounts = api.listAWSAccounts().execute().getAccounts();
        assertTrue(awsAllAccounts.size() >= 5);
        for (AWSAccount account : awsAccounts) {
            assertAccountIn(account, awsAllAccounts);
        }
    }

    @Test
    public void updateAWSAccountTest() throws ApiException, TestUtils.RetryException {
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setAccountId(generateAccountId());
        awsAccount.setRoleName(getUniqueEntityName());

        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                AWSAccountCreateResponse createResponse = api.createAWSAccount().body(awsAccount).execute();
                accountsToDelete.add(awsAccount);
                assertNotNull(createResponse.getExternalId());
            } catch (ApiException e) {
                System.out.println(String.format("Error updating AWS Account: %s", e));
                return false;
            }
            return true;
        });

        List<String> hostTags = new ArrayList<String>();
        hostTags.add("javaTag:one");
        hostTags.add("java:success");
        awsAccount.setHostTags(hostTags);

        List<String> excludedRegions = new ArrayList<String>();
        excludedRegions.add("us-east-1");
        excludedRegions.add("us-west-1");
        awsAccount.setExcludedRegions(excludedRegions);

        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                api.updateAWSAccount().body(awsAccount).accountId(awsAccount.getAccountId()).roleName(awsAccount.getRoleName()).execute();
            } catch (ApiException e) {
                System.out.println(String.format("Error updating AWS Account: %s", e));
                return false;
            }
            return true;
        });

        AWSAccount newAccount = api.listAWSAccounts().accountId(awsAccount.getAccountId()).roleName(awsAccount.getRoleName()).execute().getAccounts().get(0);
        // collection fields are intialized to null on the objects, but returned as empty list/map by API
        awsAccount.setAccountSpecificNamespaceRules(new HashMap<String, Boolean>());
        awsAccount.setFilterTags(new ArrayList<String>());
        assertEquals(awsAccount, newAccount);
    }

    @Test
    public void generateNewExternalIdTest() throws ApiException, TestUtils.RetryException {
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setAccountId(generateAccountId());
        awsAccount.setRoleName(getUniqueEntityName());

        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                AWSAccountCreateResponse createResponse = api.createAWSAccount().body(awsAccount).execute();
                accountsToDelete.add(awsAccount);
                assertNotNull(createResponse.getExternalId());
            } catch (ApiException e) {
                System.out.println(String.format("Error updating AWS Account: %s", e));
                return false;
            }
            return true;
        });

        AWSAccountCreateResponse generateNewID = api.createNewAWSExternalID().body(awsAccount).execute();
        assertNotEquals(generateNewID.getExternalId(), "");
    }

    @Test
    public void listNamespacesTest() throws ApiException {
        List<String> namespaces = api.listAvailableAWSNamespaces().execute();

        // Check that a few examples are in the response
        // Full list - https://docs.datadoghq.com/api/?lang=bash#list-namespace-rules
        assertTrue(namespaces.contains("api_gateway"));
        assertTrue(namespaces.contains("cloudsearch"));
        assertTrue(namespaces.contains("directconnect"));
        assertTrue(namespaces.contains("xray"));
    }

    @Test
    public void generateExternalIDAWSErrorsTest() throws IOException {
        try {
            api.createNewAWSExternalID().body(new AWSAccount()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.createNewAWSExternalID().body(new AWSAccount()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void createErrorsAWSTest() throws IOException {
        try {
            api.createAWSAccount().body(new AWSAccount()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.createAWSAccount().body(new AWSAccount()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void deleteErrorsAWSTest() throws IOException {
        try {
            api.deleteAWSAccount().body(new AWSAccount()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.deleteAWSAccount().body(new AWSAccount()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getAll403ErrorAWSTest() throws IOException {
        try {
            fakeAuthApi.listAWSAccounts().execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getAll400ErrorAWSTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
        stubFor(get(urlPathEqualTo(apiUri))
                .willReturn(okJson(fixtureData).withStatus(400))
        );
        // Mocked because it is only returned when the aws integration is not installed, which is not the case on test org
        // and it can't be done through the API
        try {
            unitApi.listAWSAccounts().execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void listNamespacesAWSErrorsTest() throws IOException {
        try {
            fakeAuthApi.listAvailableAWSNamespaces().execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void updateAWSErrorsTest() throws IOException {
        try {
            api.updateAWSAccount().body(new AWSAccount()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.updateAWSAccount().body(new AWSAccount()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }
}
