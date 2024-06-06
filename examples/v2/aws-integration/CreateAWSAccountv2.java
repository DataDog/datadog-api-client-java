// AWS Integration - Create account returns "AWS Account object" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSAccountCreate;
import com.datadog.api.client.v2.model.AWSAccountCreateAttributes;
import com.datadog.api.client.v2.model.AWSAccountCreateRequest;
import com.datadog.api.client.v2.model.AWSAccountResponse;
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
    defaultClient.setUnstableOperationEnabled("v2.createAWSAccountv2", true);
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSAccountCreateRequest body =
        new AWSAccountCreateRequest()
            .data(
                new AWSAccountCreate()
                    .attributes(
                        new AWSAccountCreateAttributes()
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
      AWSAccountResponse result = apiInstance.createAWSAccountv2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#createAWSAccountv2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
