// AWS Integration - Patch account config returns "AWS Account object" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSAccountPartition;
import com.datadog.api.client.v2.model.AWSAccountPatchRequest;
import com.datadog.api.client.v2.model.AWSAccountPatchRequestAttributes;
import com.datadog.api.client.v2.model.AWSAccountPatchRequestData;
import com.datadog.api.client.v2.model.AWSAccountResponse;
import com.datadog.api.client.v2.model.AWSAuthConfig;
import com.datadog.api.client.v2.model.AWSAuthConfigRole;
import com.datadog.api.client.v2.model.AWSLambdaForwarderConfig;
import com.datadog.api.client.v2.model.AWSLogsConfig;
import com.datadog.api.client.v2.model.AWSMetricsConfig;
import com.datadog.api.client.v2.model.AWSNamespaceFilters;
import com.datadog.api.client.v2.model.AWSNamespaceFiltersIncludeOnly;
import com.datadog.api.client.v2.model.AWSNamespaceTagFilter;
import com.datadog.api.client.v2.model.AWSRegions;
import com.datadog.api.client.v2.model.AWSRegionsIncludeOnly;
import com.datadog.api.client.v2.model.AWSResourcesConfig;
import com.datadog.api.client.v2.model.AWSTracesConfig;
import com.datadog.api.client.v2.model.XRayServicesIncludeOnly;
import com.datadog.api.client.v2.model.XRayServicesList;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateAWSAccount", true);
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    // there is a valid "aws_account_v2" in the system
    String AWS_ACCOUNT_V2_DATA_ATTRIBUTES_AWS_ACCOUNT_ID =
        System.getenv("AWS_ACCOUNT_V2_DATA_ATTRIBUTES_AWS_ACCOUNT_ID");

    AWSAccountPatchRequest body =
        new AWSAccountPatchRequest()
            .data(
                new AWSAccountPatchRequestData()
                    .attributes(
                        new AWSAccountPatchRequestAttributes()
                            .authConfig(new AWSAuthConfig(new AWSAuthConfigRole().roleName("test")))
                            .awsAccountId(AWS_ACCOUNT_V2_DATA_ATTRIBUTES_AWS_ACCOUNT_ID)
                            .awsPartition(AWSAccountPartition.AWS)
                            .awsRegions(
                                new AWSRegions(
                                    new AWSRegionsIncludeOnly()
                                        .includeOnly(Collections.singletonList("us-east-1"))))
                            .logsConfig(
                                new AWSLogsConfig()
                                    .lambdaForwarder(
                                        new AWSLambdaForwarderConfig()
                                            .sources(Collections.singletonList("s3"))))
                            .metricsConfig(
                                new AWSMetricsConfig()
                                    .namespaceFilters(
                                        new AWSNamespaceFilters(
                                            new AWSNamespaceFiltersIncludeOnly()
                                                .includeOnly(Collections.singletonList("AWS/EC2"))))
                                    .tagFilters(
                                        Collections.singletonList(
                                            new AWSNamespaceTagFilter().namespace("AWS/EC2"))))
                            .resourcesConfig(new AWSResourcesConfig())
                            .tracesConfig(
                                new AWSTracesConfig()
                                    .xrayServices(
                                        new XRayServicesList(
                                            new XRayServicesIncludeOnly()
                                                .includeOnly(
                                                    Collections.singletonList("AWS/AppSync"))))))
                    .id(AWS_ACCOUNT_V2_DATA_ATTRIBUTES_AWS_ACCOUNT_ID)
                    .type("account"));

    try {
      AWSAccountResponse result =
          apiInstance.updateAWSAccount(AWS_ACCOUNT_V2_DATA_ATTRIBUTES_AWS_ACCOUNT_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#updateAWSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
