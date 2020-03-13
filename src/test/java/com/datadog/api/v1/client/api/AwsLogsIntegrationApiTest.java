/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.model.*;
import org.junit.*;
import static org.junit.Assert.*;


import java.util.*;

/**
 * API tests for AwsLogsIntegrationApi
 */
public class AwsLogsIntegrationApiTest extends V1ApiTest {

    private static AwsLogsIntegrationApi api;
    private static AwsIntegrationApi AWSApi;
    private static AWSAccount uniqueAWSAccount = new AWSAccount();
    private static AWSAccountAndLambdaRequest uniqueAWSAccountLambdaRequest = new AWSAccountAndLambdaRequest();
    private static AWSLogsServicesRequest uniqueAWSLogsServicesRequest = new AWSLogsServicesRequest();
    private static Random random = new Random();

    @BeforeClass
    public static void initApi() {
        api = new AwsLogsIntegrationApi(generalApiClient);
        AWSApi = new AwsIntegrationApi(generalApiClient);
    }

    @Before
    public void setupAwsLogsAccounts() {
        String accountId = String.format("java_%07d", System.currentTimeMillis() % 10000000);

        // Setup a unique AWS account to use to something unique
        uniqueAWSAccount.setAccountId(accountId);
        uniqueAWSAccount.setRoleName("DatadogAWSIntegrationRole");
        Map<String, Boolean> accountSpecificNamespaceRules = new HashMap<String, Boolean>();
        accountSpecificNamespaceRules.put("api_gateway", true);
        uniqueAWSAccount.accountSpecificNamespaceRules(accountSpecificNamespaceRules);
        uniqueAWSAccount.addHostTagsItem("javaTag:one");
        uniqueAWSAccount.addHostTagsItem("java:success");
        uniqueAWSAccount.addFilterTagsItem("dontCollect:java");

        // Setup unique AWSAccountAndLambdaRequest to use
        uniqueAWSAccountLambdaRequest.setAccountId(accountId);
        uniqueAWSAccountLambdaRequest.setLambdaArn("arn:aws:lambda:us-east-1:123456789101:function:JavaClientTest");

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
    public void cleanupAWSAccount() throws TestUtils.RetryException {
        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                AWSApi.deleteAWSAccount().body(uniqueAWSAccount).execute();
            } catch(ApiException e) {
                System.out.println(String.format("Error deleting AWS Account: %s", e));
                return false;
            }
            return true;
        });
    }

    /**
     * Check function to see if a lambda_arn exists within an account.
     *
     * ### Overview Check function to see if a lambda_arn exists within an account. This sends a job on our side if it does not exist, then immediately returns the status of that job. Subsequent requests will always repeat the above, so this endpoint can be polled intermittently instead of blocking. - Returns a status of &#39;created&#39; when it&#39;s checking if the Lambda exists in the account. - Returns a status of &#39;waiting&#39; while checking. - Returns a status of &#39;checked and ok&#39; if the Lambda exists. - Returns a status of &#39;error&#39; if the Lambda does not exist. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;lambda_arn&#x60;** [*required*, *default* &#x3D; **None**]: ARN of the Lambda to be checked.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aWSLogsCheckLambdaAsyncTest() throws ApiException, TestUtils.RetryException {
        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                AWSApi.createAWSAccount().body(uniqueAWSAccount).execute();
            } catch(ApiException e) {
                System.out.println(String.format("Error creating AWS Account: %s", e));
                return false;
            }
            return true;
        });

        AWSLogsAsyncResponse response = api.aWSLogsCheckLambdaAsync().body(uniqueAWSAccountLambdaRequest).execute();
        assertNull(response.getErrors());
        assertEquals(response.getStatus(), "created");

        // Give the async call time to finish, only run assertions once we know we have an error state
        // This should only require a small amount of time to be complete
        TestUtils.retry(5, 20, () -> {
            AWSLogsAsyncResponse retryResponse;
            try {
                retryResponse = api.aWSLogsCheckLambdaAsync().body(uniqueAWSAccountLambdaRequest).execute();
            } catch(ApiException e) {
                System.out.println(String.format("Error checking the lambda status: %s", e));
                return false;
            }
            if (!retryResponse.getStatus().equals("error")) {
                System.out.println(String.format("Log lambda check is not done, currently in state: %s", retryResponse.getStatus()));
                return false;
            } else {
                return true;
            }
        });

        response = api.aWSLogsCheckLambdaAsync().body(uniqueAWSAccountLambdaRequest).execute();
        assertNotEquals(response.getErrors().get(0).getCode(), "");
        assertNotEquals(response.getErrors().get(0).getMessage(), "");
        assertEquals(response.getStatus(), "error");
    }
    
    /**
     * Asynchronous check for permissions for AWS log lambda config.
     *
     * ### Overview Test if permissions are present to add log-forwarding triggers for the given services + AWS account. Input is the same as for EnableAWSLogServices. Done async, so can be repeatedly polled in a non-blocking fashion until the async request completes - Returns a status of &#39;created&#39; when it&#39;s checking if the permissions exists in the AWS account. - Returns a status of &#39;waiting&#39; while checking. - Returns a status of &#39;checked and ok&#39; if the Lambda exists. - Returns a status of &#39;error&#39; if the Lambda does not exist. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;services&#x60;** [*required*, *default* &#x3D; **None**]: Array of services IDs set to enable automatic log collection. Discover the list of available services with the Get list of AWS log ready services API endpoint
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aWSLogsCheckServicesAsyncTest() throws ApiException, TestUtils.RetryException {
        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                AWSApi.createAWSAccount().body(uniqueAWSAccount).execute();
            } catch(ApiException e) {
                System.out.println(String.format("Error creating AWS Account: %s", e));
                return false;
            }
            return true;
        });
        AWSLogsAsyncResponse response = api.aWSLogsCheckServicesAsync().body(uniqueAWSLogsServicesRequest).execute();
        assertNotEquals(response.getErrors().get(0).getCode(), "");
        assertNotEquals(response.getErrors().get(0).getMessage(), "");
    }
    
    /**
     * List and Delete configured AWS log integrations.
     *
     * ### Overview List all Datadog-AWS Logs integrations configured in your Datadog account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aWSLogsAddListEnableAndDeleteTest() throws ApiException, TestUtils.RetryException {
        TestUtils.retry(random.nextInt(10), 20, () -> {
            try {
                AWSApi.createAWSAccount().body(uniqueAWSAccount).execute();
            } catch(ApiException e) {
                System.out.println(String.format("Error creating AWS Account: %s", e));
                return false;
            }
            return true;
        });
        // Add Lambda to Account
        api.addAWSLambdaARN().body(uniqueAWSAccountLambdaRequest).execute();
        // Enable services for Lambda
        api.enableAWSLogServices().body(uniqueAWSLogsServicesRequest).execute();

        // List AWS Logs integrations before deleting
        List<AWSLogsListResponse> listOutput1 = api.aWSLogsList().execute();
        Boolean accountExists = false;
        // Iterate over output and list Lambdas
        for (AWSLogsListResponse account: listOutput1) {
            if (account.getAccountId().equals(uniqueAWSAccount.getAccountId()) && account.getLambdas().get(0).getArn().equals(uniqueAWSAccountLambdaRequest.getLambdaArn())) {
                    accountExists = true;
            }
        }

        // Test that variable is true as expected
        assertEquals(true, accountExists);

        // Delete newly added Lambda
        api.deleteAWSLambdaARN().body(uniqueAWSAccountLambdaRequest).execute();
        List<AWSLogsListResponse> listOutput2 = api.aWSLogsList().execute();
        Boolean accountExistsAfterDelete = false;
        List<AWSLogsListResponseLambdas> listOfARNs2 = new ArrayList<>();

        for(AWSLogsListResponse account: listOutput2) {
            if (account.getAccountId().equals(uniqueAWSAccount.getAccountId())) {
                listOfARNs2 = account.getLambdas();
            }
        }
        for(AWSLogsListResponseLambdas lambda: listOfARNs2) {
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
     * ### Overview Get the list of current AWS services that Datadog offers automatic log collection. Use returned service IDs with the services parameter for the Enable an AWS service log collection API endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aWSLogsServicesListTest() throws ApiException {
        List<AWSLogsListServicesResponse> response = api.aWSLogsServicesList().execute();
        // There are currently 6 supported AWS Logs services as noted in the docs
        // https://docs.datadoghq.com/api/?lang=bash#get-list-of-aws-log-ready-services
        assertTrue(response.size() >= 6);
    }
    
}
