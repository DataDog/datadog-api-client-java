// Send a deployment event for DORA Metrics returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DoraMetricsApi;
import com.datadog.api.client.v2.model.DORADeploymentRequest;
import com.datadog.api.client.v2.model.DORADeploymentRequestAttributes;
import com.datadog.api.client.v2.model.DORADeploymentRequestData;
import com.datadog.api.client.v2.model.DORADeploymentResponse;
import com.datadog.api.client.v2.model.DORAGitInfo;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createDORADeployment", true);
    DoraMetricsApi apiInstance = new DoraMetricsApi(defaultClient);

    DORADeploymentRequest body =
        new DORADeploymentRequest()
            .data(
                new DORADeploymentRequestData()
                    .attributes(
                        new DORADeploymentRequestAttributes()
                            .finishedAt(1693491984000L)
                            .git(
                                new DORAGitInfo()
                                    .commitSha("66adc9350f2cc9b250b69abddab733dd55e1a588")
                                    .repositoryUrl(
                                        "https://github.com/organization/example-repository"))
                            .service("shopist")
                            .startedAt(1693491974000L)
                            .version("v1.12.07")));

    try {
      DORADeploymentResponse result = apiInstance.createDORADeployment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DoraMetricsApi#createDORADeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
