// AWS Integration - Patch account returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSAccountPatch;
import com.datadog.api.client.v2.model.AWSAccountPatchAttributes;
import com.datadog.api.client.v2.model.AWSAccountPatchRequest;
import com.datadog.api.client.v2.model.AWSAccountType;
import com.datadog.api.client.v2.model.AWSAuthConfig;
import com.datadog.api.client.v2.model.AWSLambdaForwarder;
import com.datadog.api.client.v2.model.AWSLogs;
import com.datadog.api.client.v2.model.AWSMetrics;
import com.datadog.api.client.v2.model.AWSNamespaceTagFilter;
import com.datadog.api.client.v2.model.AWSNamespacesList;
import com.datadog.api.client.v2.model.AWSRegionsList;
import com.datadog.api.client.v2.model.AWSResources;
import com.datadog.api.client.v2.model.AWSTraces;
import com.datadog.api.client.v2.model.AWSXRayServicesList;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.patchAWSAccountv2", true);
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSAccountPatchRequest body =
        new AWSAccountPatchRequest()
            .data(
                new AWSAccountPatch()
                    .attributes(
                        new AWSAccountPatchAttributes()
                            .authConfig(new AWSAuthConfig())
                            .awsAccountId("123456789012")
                            .awsRegions(
                                new AWSRegionsList()
                                    .includeOnly(Collections.singletonList("us-east-1")))
                            .logsConfig(
                                new AWSLogs()
                                    .lambdaForwarder(
                                        new AWSLambdaForwarder()
                                            .sources(Collections.singletonList("s3"))))
                            .metricsConfig(
                                new AWSMetrics()
                                    .namespaceFilters(
                                        new AWSNamespacesList()
                                            .excludeOnly(Collections.singletonList("AWS/EC2"))
                                            .includeOnly(Collections.singletonList("AWS/EC2")))
                                    .tagFilters(
                                        Collections.singletonList(
                                            new AWSNamespaceTagFilter().namespace("AWS/EC2"))))
                            .resourcesConfig(new AWSResources())
                            .tracesConfig(
                                new AWSTraces()
                                    .xrayServices(
                                        new AWSXRayServicesList()
                                            .includeOnly(
                                                Collections.singletonList("AWS/AppSync")))))
                    .type(AWSAccountType.AWS_ACCOUNT));

    try {
      apiInstance.patchAWSAccountv2("aws_account_config_id", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#patchAWSAccountv2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
