/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.*;
import org.junit.*;

/** API tests for AwsIntegrationApi */
public class AwsIntegrationApiTest extends V1ApiTest {
  /*
   * NOTE: we test both AwsIntegrationApi and AwsLogsIntegrationApi here because these must not run
   * in parallel and it's not possible to ensure that they don't run in parallel with maven-surefire-plugin
   * when using forking instead of threading. By testing them all inside this one class and having
   * parallelization set to `classes`, we ensure that all Aws* tests run serialized.
   */

  private static AwsIntegrationApi api;
  private static AwsIntegrationApi fakeAuthApi;
  private static AwsIntegrationApi unitApi;

  private static AwsLogsIntegrationApi logsApi;
  private static AwsLogsIntegrationApi logsFakeAuthApi;
  private static AwsLogsIntegrationApi logsUnitApi;

  private static LinkedHashSet<AWSAccount> accountsToDelete;
  private static Random random = new Random();

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final String apiUri = "/api/v1/integration/aws";
  private final String fixturePrefix = "client/v1/api/aws_fixtures";

  private final String logsApiUri = "/api/v1/integration/aws/logs";
  private final String logsFixturePrefix = "client/v1/api/aws_fixtures";

  // Used for AWS Logs API tests
  private static AWSAccount uniqueAWSAccount = new AWSAccount();
  private static AWSAccountAndLambdaRequest uniqueAWSAccountLambdaRequest =
      new AWSAccountAndLambdaRequest();
  private static AWSLogsServicesRequest uniqueAWSLogsServicesRequest = new AWSLogsServicesRequest();

  @Override
  public String getTracingEndpoint() {
    return "integration-aws";
  }

  @BeforeClass
  public static void initApi() {
    api = new AwsIntegrationApi(generalApiClient);
    fakeAuthApi = new AwsIntegrationApi(generalFakeAuthApiClient);
    unitApi = new AwsIntegrationApi(generalApiUnitTestClient);

    logsApi = new AwsLogsIntegrationApi(generalApiClient);
    logsFakeAuthApi = new AwsLogsIntegrationApi(generalFakeAuthApiClient);
    logsUnitApi = new AwsLogsIntegrationApi(generalApiUnitTestClient);
  }

  @Before
  public void resetAccountsToDelete() {
    accountsToDelete = new LinkedHashSet<>();
  }

  @Before
  public void setupAwsLogsAccounts() {
    // Used for AWS Logs API tests
    String uniqueName = getUniqueEntityName();
    String accountId = generateAwsAccountId();

    // Setup a unique AWS account to use to something unique
    uniqueAWSAccount.setAccountId(accountId);
    uniqueAWSAccount.setRoleName(uniqueName);
    Map<String, Boolean> accountSpecificNamespaceRules = new HashMap<String, Boolean>();
    accountSpecificNamespaceRules.put("api_gateway", true);
    uniqueAWSAccount.accountSpecificNamespaceRules(accountSpecificNamespaceRules);
    uniqueAWSAccount.addHostTagsItem("javaTag:one");
    uniqueAWSAccount.addHostTagsItem("java:success");
    uniqueAWSAccount.addFilterTagsItem("dontCollect:java");

    // Setup unique AWSAccountAndLambdaRequest to use
    uniqueAWSAccountLambdaRequest.setAccountId(accountId);
    uniqueAWSAccountLambdaRequest.setLambdaArn(
        "arn:aws:lambda:us-east-1:123456789101:function:JavaClientTest");

    // Setup unique AWSLogsServicesRequest to use
    uniqueAWSLogsServicesRequest.setAccountId(accountId);
    uniqueAWSLogsServicesRequest.addServicesItem("s3");
    uniqueAWSLogsServicesRequest.addServicesItem("elb");
    uniqueAWSLogsServicesRequest.addServicesItem("elbv2");
    uniqueAWSLogsServicesRequest.addServicesItem("cloudfront");
    uniqueAWSLogsServicesRequest.addServicesItem("redshift");
    uniqueAWSLogsServicesRequest.addServicesItem("lambda");
  }

  @After
  public void removeAccounts() throws TestUtils.RetryException {
    for (AWSAccount account : accountsToDelete) {
      AWSAccountDeleteRequest body = new AWSAccountDeleteRequest();
      body.setAccountId(account.getAccountId());
      body.setRoleName(account.getRoleName());

      TestUtils.retry(
          random.nextInt(10),
          20,
          () -> {
            try {
              api.deleteAWSAccount(body);
            } catch (ApiException e) {
              System.out.println(String.format("Error deleting AWS Account: %s", e));
              return false;
            }
            return true;
          });
    }
  }

  public String generateAwsAccountId() {
    String uniqueId =
        new StringBuilder(String.valueOf(now.toInstant().toEpochMilli()))
            .reverse()
            .substring(0, 12);
    return uniqueId;
  }

  public void assertAccountIn(AWSAccount accountToAssert, List<AWSAccount> accounts) {
    for (AWSAccount account : accounts) {
      if (account.getAccessKeyId() != null) {
        // Skip current account if it uses settings for GovCloud/China where AccountID does not
        // exist
        continue;
      } else if (account.getAccountId().equals(accountToAssert.getAccountId())) {
        assertEquals(account.getRoleName(), accountToAssert.getRoleName());
        assertEquals(account.getFilterTags(), accountToAssert.getFilterTags());
        assertEquals(
            account.getAccountSpecificNamespaceRules(),
            accountToAssert.getAccountSpecificNamespaceRules());
        assertEquals(account.getHostTags(), accountToAssert.getHostTags());
        return;
      }
    }
    fail(String.format("Unable to find account %s in list %s", accountToAssert, accounts));
  }

  @Test
  public void createAWSAccountTest() throws TestUtils.RetryException {
    // Test Creating an AWS Account with just the account_id and role_name
    AWSAccount awsAccount = new AWSAccount();
    awsAccount.setAccountId(generateAwsAccountId());
    awsAccount.setRoleName(getUniqueEntityName());

    TestUtils.retry(
        random.nextInt(10),
        20,
        () -> {
          try {
            AWSAccountCreateResponse createResponse = api.createAWSAccount(awsAccount);
            accountsToDelete.add(awsAccount);
            assertNotNull(createResponse.getExternalId());
          } catch (ApiException e) {
            System.out.println(String.format("Error creating AWS Account: %s", e));
            return false;
          }
          return true;
        });

    // Test Creating an AWS account with all the optional fields too
    AWSAccount awsAccountFull = new AWSAccount();
    Map<String, Boolean> accountSpecificNamespaceRules = new HashMap<String, Boolean>();
    List<String> hostTags = new ArrayList<String>();
    hostTags.add("javaTag:one");
    hostTags.add("java:success");
    List<String> excludedRegions = new ArrayList<String>();
    excludedRegions.add("us-east-1");
    excludedRegions.add("us-west-1");
    accountSpecificNamespaceRules.put("api_gateway", true);
    awsAccountFull.setAccountId(awsAccount.getAccountId().substring(0, 10) + "00");
    awsAccountFull.setRoleName(awsAccount.getRoleName() + "-full");
    awsAccountFull.setHostTags(hostTags);
    awsAccountFull.setExcludedRegions(excludedRegions);
    awsAccountFull.addFilterTagsItem("dontCollect:java");
    awsAccountFull.setAccountSpecificNamespaceRules(accountSpecificNamespaceRules);

    TestUtils.retry(
        random.nextInt(10),
        20,
        () -> {
          try {
            AWSAccountCreateResponse createResponse = api.createAWSAccount(awsAccountFull);
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
    // Test an exception is thrown if you're missing the account_id field
    AWSAccount awsAccount = new AWSAccount();
    awsAccount.setRoleName("java_testRoleName");
    try {
      api.createAWSAccount(awsAccount);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      // Currently, @Test(expected = ApiException.class) is wrongly reported as failed by APM.
    }
  }

  @Test
  public void createAWSAccountMissingRoleNameTest() throws IOException {
    // Test an exception is thrown if you're missing the role_name field
    AWSAccount awsAccount = new AWSAccount();
    awsAccount.setAccountId(generateAwsAccountId());
    try {
      api.createAWSAccount(awsAccount);
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
      awsAccounts
          .get(i)
          .setAccountId(generateAwsAccountId().substring(0, 11) + String.format("%d", i));
      awsAccounts.get(i).setRoleName(String.format("Java_Client_Role_Name_%s", i));
      awsAccounts.get(i).addFilterTagsItem("dontCollect:java");
      awsAccounts.get(i).setHostTags(hostTags);
      awsAccounts.get(i).setAccountSpecificNamespaceRules(accountSpecificNamespaceRules);
      int finalI = i;
      TestUtils.retry(
          random.nextInt(10),
          20,
          () -> {
            try {
              AWSAccountCreateResponse createResponse =
                  api.createAWSAccount(awsAccounts.get(finalI));
              accountsToDelete.add(awsAccounts.get(finalI));
              assertNotNull(createResponse.getExternalId());
            } catch (ApiException e) {
              System.out.println(String.format("Error creating AWS Account: %s", e));
              return false;
            }
            return true;
          });
    }

    List<AWSAccount> awsAllAccounts = api.listAWSAccounts().getAccounts();
    assertTrue(awsAllAccounts.size() >= 5);
    for (AWSAccount account : awsAccounts) {
      assertAccountIn(account, awsAllAccounts);
    }
  }

  @Test
  public void updateAWSAccountTest() throws ApiException, TestUtils.RetryException {
    AWSAccount awsAccount = new AWSAccount();
    awsAccount.setAccountId(generateAwsAccountId());
    awsAccount.setRoleName(getUniqueEntityName());

    TestUtils.retry(
        random.nextInt(10),
        20,
        () -> {
          try {
            AWSAccountCreateResponse createResponse = api.createAWSAccount(awsAccount);
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

    TestUtils.retry(
        random.nextInt(10),
        20,
        () -> {
          try {
            api.updateAWSAccount(
                awsAccount,
                new AwsIntegrationApi.UpdateAWSAccountOptionalParameters()
                    .accountId(awsAccount.getAccountId())
                    .roleName(awsAccount.getRoleName()));
          } catch (ApiException e) {
            System.out.println(String.format("Error updating AWS Account: %s", e));
            return false;
          }
          return true;
        });

    AWSAccount newAccount =
        api.listAWSAccounts(
                new AwsIntegrationApi.ListAWSAccountsOptionalParameters()
                    .accountId(awsAccount.getAccountId())
                    .roleName(awsAccount.getRoleName()))
            .getAccounts()
            .get(0);
    // collection fields are intialized to null on the objects, but returned as empty list/map by
    // API
    awsAccount.setAccountSpecificNamespaceRules(new HashMap<String, Boolean>());
    awsAccount.setFilterTags(new ArrayList<String>());
    assertEquals(awsAccount, newAccount);
  }

  @Test
  public void generateNewExternalIdTest() throws ApiException, TestUtils.RetryException {
    AWSAccount awsAccount = new AWSAccount();
    awsAccount.setAccountId(generateAwsAccountId());
    awsAccount.setRoleName(getUniqueEntityName());

    TestUtils.retry(
        random.nextInt(10),
        20,
        () -> {
          try {
            AWSAccountCreateResponse createResponse = api.createAWSAccount(awsAccount);
            accountsToDelete.add(awsAccount);
            assertNotNull(createResponse.getExternalId());
          } catch (ApiException e) {
            System.out.println(String.format("Error updating AWS Account: %s", e));
            return false;
          }
          return true;
        });

    AWSAccountCreateResponse generateNewID = api.createNewAWSExternalID(awsAccount);
    assertNotEquals(generateNewID.getExternalId(), "");
  }

  @Test
  public void listNamespacesTest() throws ApiException {
    List<String> namespaces = api.listAvailableAWSNamespaces();

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
      api.createNewAWSExternalID(new AWSAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createNewAWSExternalID(new AWSAccount());
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
      api.createAWSAccount(new AWSAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createAWSAccount(new AWSAccount());
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
      api.deleteAWSAccount(new AWSAccountDeleteRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.deleteAWSAccount(new AWSAccountDeleteRequest());
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
      fakeAuthApi.listAWSAccounts();
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
    stubFor(get(urlPathEqualTo(apiUri)).willReturn(okJson(fixtureData).withStatus(400)));
    // Mocked because it is only returned when the aws integration is not installed, which is not
    // the case on test org
    // and it can't be done through the API
    try {
      unitApi.listAWSAccounts();
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
      fakeAuthApi.listAvailableAWSNamespaces();
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
      api.updateAWSAccount(new AWSAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateAWSAccount(new AWSAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  ///////////////// Tests for the AWS Logs API follow
  /**
   * Check function to see if a lambda_arn exists within an account.
   *
   * <p>### Overview Check function to see if a lambda_arn exists within an account. This sends a
   * job on our side if it does not exist, then immediately returns the status of that job.
   * Subsequent requests will always repeat the above, so this endpoint can be polled intermittently
   * instead of blocking. - Returns a status of &#39;created&#39; when it&#39;s checking if the
   * Lambda exists in the account. - Returns a status of &#39;waiting&#39; while checking. - Returns
   * a status of &#39;checked and ok&#39; if the Lambda exists. - Returns a status of
   * &#39;error&#39; if the Lambda does not exist. ### Arguments * **&#x60;account_id&#x60;**
   * [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. *
   * **&#x60;lambda_arn&#x60;** [*required*, *default* &#x3D; **None**]: ARN of the Lambda to be
   * checked.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void aWSLogsCheckLambdaAsyncTest() throws ApiException, TestUtils.RetryException {
    TestUtils.retry(
        random.nextInt(10),
        20,
        () -> {
          try {
            api.createAWSAccount(uniqueAWSAccount);
            accountsToDelete.add(uniqueAWSAccount);
          } catch (ApiException e) {
            System.out.println(String.format("Error creating AWS Account: %s", e));
            return false;
          }
          return true;
        });

    AWSLogsAsyncResponse response = logsApi.checkAWSLogsLambdaAsync(uniqueAWSAccountLambdaRequest);
    assertNull(response.getErrors());
    assertEquals(response.getStatus(), "created");

    // Give the async call time to finish, only run assertions once we know we have an error state
    // This should only require a small amount of time to be complete
    TestUtils.retry(
        5,
        20,
        () -> {
          AWSLogsAsyncResponse retryResponse;
          try {
            retryResponse = logsApi.checkAWSLogsLambdaAsync(uniqueAWSAccountLambdaRequest);
          } catch (ApiException e) {
            System.out.println(String.format("Error checking the lambda status: %s", e));
            return false;
          }
          if (!retryResponse.getStatus().equals("error")) {
            System.out.println(
                String.format(
                    "Log lambda check is not done, currently in state: %s",
                    retryResponse.getStatus()));
            return false;
          } else {
            return true;
          }
        });

    response = logsApi.checkAWSLogsLambdaAsync(uniqueAWSAccountLambdaRequest);
    assertNotEquals(response.getErrors().get(0).getCode(), "");
    assertNotEquals(response.getErrors().get(0).getMessage(), "");
    assertEquals(response.getStatus(), "error");
  }

  /**
   * Asynchronous check for permissions for AWS log lambda config.
   *
   * <p>### Overview Test if permissions are present to add log-forwarding triggers for the given
   * services + AWS account. Input is the same as for EnableAWSLogServices. Done async, so can be
   * repeatedly polled in a non-blocking fashion until the async request completes - Returns a
   * status of &#39;created&#39; when it&#39;s checking if the permissions exists in the AWS
   * account. - Returns a status of &#39;waiting&#39; while checking. - Returns a status of
   * &#39;checked and ok&#39; if the Lambda exists. - Returns a status of &#39;error&#39; if the
   * Lambda does not exist. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D;
   * **None**]: Your AWS Account ID without dashes. * **&#x60;services&#x60;** [*required*,
   * *default* &#x3D; **None**]: Array of services IDs set to enable automatic log collection.
   * Discover the list of available services with the Get list of AWS log ready services API
   * endpoint
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void aWSLogsCheckServicesAsyncTest() throws ApiException, TestUtils.RetryException {
    TestUtils.retry(
        random.nextInt(10),
        20,
        () -> {
          try {
            api.createAWSAccount(uniqueAWSAccount);
            accountsToDelete.add(uniqueAWSAccount);
          } catch (ApiException e) {
            System.out.println(String.format("Error creating AWS Account: %s", e));
            return false;
          }
          return true;
        });
    AWSLogsAsyncResponse response = logsApi.checkAWSLogsServicesAsync(uniqueAWSLogsServicesRequest);
    assertNotEquals(response.getErrors().get(0).getCode(), "");
    assertNotEquals(response.getErrors().get(0).getMessage(), "");
  }

  /**
   * List and Delete configured AWS log integrations.
   *
   * <p>### Overview List all Datadog-AWS Logs integrations configured in your Datadog account.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void aWSLogsAddListEnableAndDeleteTest() throws ApiException, TestUtils.RetryException {
    TestUtils.retry(
        random.nextInt(10),
        20,
        () -> {
          try {
            api.createAWSAccount(uniqueAWSAccount);
            accountsToDelete.add(uniqueAWSAccount);
          } catch (ApiException e) {
            System.out.println(String.format("Error creating AWS Account: %s", e));
            return false;
          }
          return true;
        });
    // Add Lambda to Account
    logsApi.createAWSLambdaARN(uniqueAWSAccountLambdaRequest);
    // Enable services for Lambda
    logsApi.enableAWSLogServices(uniqueAWSLogsServicesRequest);

    // List AWS Logs integrations before deleting
    List<AWSLogsListResponse> listOutput1;
    try {
      listOutput1 = logsApi.listAWSLogsIntegrations();

    } catch (Exception e) {
      System.out.print("yoooo");
      for (StackTraceElement ste : e.getStackTrace()) {
        System.out.println(ste + "\n");
      }
      throw e;
    }
    Boolean accountExists = false;
    // Iterate over output and list Lambdas
    for (AWSLogsListResponse account : listOutput1) {
      if (account.getAccountId().equals(uniqueAWSAccount.getAccountId())
          && account
              .getLambdas()
              .get(0)
              .getArn()
              .equals(uniqueAWSAccountLambdaRequest.getLambdaArn())) {
        accountExists = true;
      }
    }

    // Test that variable is true as expected
    assertEquals(true, accountExists);

    // Delete newly added Lambda
    logsApi.deleteAWSLambdaARN(uniqueAWSAccountLambdaRequest);
    List<AWSLogsListResponse> listOutput2 = logsApi.listAWSLogsIntegrations();
    Boolean accountExistsAfterDelete = false;
    List<AWSLogsLambda> listOfARNs2 = new ArrayList<>();

    for (AWSLogsListResponse account : listOutput2) {
      if (account.getAccountId().equals(uniqueAWSAccount.getAccountId())) {
        listOfARNs2 = account.getLambdas();
      }
    }
    for (AWSLogsLambda lambda : listOfARNs2) {
      if (lambda.getArn().equals(uniqueAWSAccountLambdaRequest.getLambdaArn())) {
        accountExistsAfterDelete = true;
      }
    }
    // Check that ARN no longer exists after delete
    assertFalse(accountExistsAfterDelete);
  }

  /**
   * Get list of AWS log ready services.
   *
   * <p>### Overview Get the list of current AWS services that Datadog offers automatic log
   * collection. Use returned service IDs with the services parameter for the Enable an AWS service
   * log collection API endpoint.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void aWSLogsServicesListTest() throws ApiException {
    List<AWSLogsListServicesResponse> response = logsApi.listAWSLogsServices();
    // There are currently 6 supported AWS Logs services as noted in the docs
    // https://docs.datadoghq.com/api/?lang=bash#get-list-of-aws-log-ready-services
    assertTrue(response.size() >= 6);
  }

  @Test
  public void logsList400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(logsFixturePrefix + "/error_400.json");
    stubFor(get(urlPathEqualTo(logsApiUri)).willReturn(okJson(fixtureData).withStatus(400)));
    // Mocked because it is only returned when the aws integration is not installed, which is not
    // the case on test org
    // and it can't be done through the API
    try {
      logsUnitApi.listAWSLogsIntegrations();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void logsList403ErrorTest() throws IOException {
    try {
      logsFakeAuthApi.listAWSLogsIntegrations();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void logsAdd400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(logsFixturePrefix + "/error_400.json");
    stubFor(post(urlPathEqualTo(logsApiUri)).willReturn(okJson(fixtureData).withStatus(400)));
    // Mocked because it is only returned when the aws integration is not installed, which is not
    // the case on test org
    // and it can't be done through the API
    try {
      logsUnitApi.createAWSLambdaARN(new AWSAccountAndLambdaRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void logsAdd403ErrorTest() throws IOException {
    try {
      logsFakeAuthApi.createAWSLambdaARN(new AWSAccountAndLambdaRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void logsDelete400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(logsFixturePrefix + "/error_400.json");
    stubFor(delete(urlPathEqualTo(logsApiUri)).willReturn(okJson(fixtureData).withStatus(400)));
    // Mocked because it is only returned when the aws integration is not installed, which is not
    // the case on test org
    // and it can't be done through the API
    try {
      logsUnitApi.deleteAWSLambdaARN(new AWSAccountAndLambdaRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void logsDelete403ErrorTest() throws IOException {
    try {
      logsFakeAuthApi.deleteAWSLambdaARN(new AWSAccountAndLambdaRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void logsServicesListErrorsTest() throws IOException {
    try {
      logsFakeAuthApi.listAWSLogsServices();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void logsServicesEnableErrorsTest() throws IOException {
    try {
      logsApi.enableAWSLogServices(new AWSLogsServicesRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      logsFakeAuthApi.enableAWSLogServices(new AWSLogsServicesRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Ignore // FIXME: APi responds with 502 instead of 400 or 403, so skipping until it is fixed
  @Test
  public void logsLambdaCheckListErrorsTest() throws IOException {
    try {
      logsApi.checkAWSLogsLambdaAsync(new AWSAccountAndLambdaRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      logsFakeAuthApi.checkAWSLogsLambdaAsync(new AWSAccountAndLambdaRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
