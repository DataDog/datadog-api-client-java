/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.AWSAccount;
import com.datadog.api.v1.client.model.AWSAccountCreateResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * API tests for AwsIntegrationApi
 */
public class AwsIntegrationApiTest extends V1ApiTest {

    private static AwsIntegrationApi api;
    private static LinkedHashSet<AWSAccount> accountsToDelete;
    private static Random random = new Random();


    @BeforeClass
    public static void initApi() {
        api = new AwsIntegrationApi(generalApiClient);
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

    @Test
    public void createAWSAccountTest() throws TestUtils.RetryException {
        //Test Creating an AWS Account with just the account_id and role_name
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setAccountId(String.format("java_%07d", (now.toInstant().toEpochMilli()) % 10000000));
        awsAccount.setRoleName("java_testRoleName");

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
        accountSpecificNamespaceRules.put("api_gateway", true);
        awsAccountFull.setAccountId(String.format("java_%07d", (now.toInstant().toEpochMilli() + 1) % 10000000));
        awsAccountFull.setRoleName("java_testRoleName");
        awsAccountFull.setHostTags(hostTags);
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

    @Test(expected = ApiException.class)
    public void createAWSAccountMissingIDTest() throws ApiException {
        //Test an exception is thrown if you're missing the account_id field
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setRoleName("java_testRoleName");
        api.createAWSAccount().body(awsAccount).execute();
    }

    @Test(expected = ApiException.class)
    public void createAWSAccountMissingRoleNameTest() throws ApiException {
        //Test an exception is thrown if you're missing the role_name field
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setAccountId(String.format("java_%07d", (now.toInstant().toEpochMilli()) % 10000000));
        api.createAWSAccount().body(awsAccount).execute();
    }

    @Test
    public void getAllAWSAccountsTest() throws ApiException, TestUtils.RetryException {
        List<AWSAccount> awsAccounts = new ArrayList<AWSAccount>();
        Map<String, Boolean> accountSpecificNamespaceRules = new HashMap<String, Boolean>();
        List<String> hostTags = new ArrayList<String>();

        accountSpecificNamespaceRules.put("api_gateway", false);
        hostTags.add("java_test_tag:value");

        for (int i = 0; i < 5; i++) {
            awsAccounts.add(new AWSAccount());
            awsAccounts.get(i).setAccountId(String.format("java_%07d", (now.toInstant().toEpochMilli() + i) % 10000000));
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

        List<AWSAccount> awsAllAccounts = api.getAllAWSAccounts().execute().getAccounts();
        assertTrue(awsAllAccounts.size() >= 5);
        for (AWSAccount account : awsAccounts) {
            assertAccountIn(account, awsAllAccounts);
        }
    }

    @Test
    public void updateAWSAccountTest() throws ApiException, TestUtils.RetryException {
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setAccountId(String.format("java_%07d", (now.toInstant().toEpochMilli()) % 10000000));
        awsAccount.setRoleName("java_testRoleName");

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

        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                api.updateAWSAccount().body(awsAccount).accountId(awsAccount.getAccountId()).roleName(awsAccount.getRoleName()).execute();
            } catch (ApiException e) {
                System.out.println(String.format("Error updating AWS Account: %s", e));
                return false;
            }
            return true;
        });

        AWSAccount newAccount = api.getAllAWSAccounts().accountId(awsAccount.getAccountId()).roleName(awsAccount.getRoleName()).execute().getAccounts().get(0);
        // collection fields are intialized to null on the objects, but returned as empty list/map by API
        awsAccount.setAccountSpecificNamespaceRules(new HashMap<String, Boolean>());
        awsAccount.setFilterTags(new ArrayList<String>());
        assertEquals(awsAccount, newAccount);
    }

    @Test
    public void generateNewExternalIdTest() throws ApiException, TestUtils.RetryException {
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setAccountId(String.format("java_%07d", (now.toInstant().toEpochMilli()) % 10000000));
        awsAccount.setRoleName("java_testRoleName");

        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                AWSAccountCreateResponse createResponse = api.createAWSAccount().body(awsAccount).execute();
                accountsToDelete.add(awsAccount);
                assertNotNull(createResponse.getExternalId());
            } catch(ApiException e) {
                System.out.println(String.format("Error updating AWS Account: %s", e));
                return false;
            }
            return true;
        });

        AWSAccountCreateResponse generateNewID = api.generateNewAWSExternalID().body(awsAccount).execute();
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

}
