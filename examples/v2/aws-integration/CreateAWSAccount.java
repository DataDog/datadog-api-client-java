// AWS Integration - Create account config returns "AWS Account object" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSAccountCreateRequest;
import com.datadog.api.client.v2.model.AWSAccountCreateRequestAttributes;
import com.datadog.api.client.v2.model.AWSAccountCreateRequestData;
import com.datadog.api.client.v2.model.AWSAccountPartition;
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
    defaultClient.setUnstableOperationEnabled("v2.createAWSAccount", true);
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSAccountCreateRequest body =
        new AWSAccountCreateRequest()
            .data(
                new AWSAccountCreateRequestData()
                    .attributes(
                        new AWSAccountCreateRequestAttributes()
                            .authConfig(new AWSAuthConfig(new AWSAuthConfigRole().roleName("test")))
                            .awsAccountId("123456789012")
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
                    .id("123456789012")
                    .type("account"));

    try {
      AWSAccountResponse result = apiInstance.createAWSAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#createAWSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
