// Send a failure event for DORA Metrics returns "OK - but delayed due to incident" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DoraMetricsApi;
import com.datadog.api.client.v2.model.DORAFailureRequest;
import com.datadog.api.client.v2.model.DORAFailureRequestAttributes;
import com.datadog.api.client.v2.model.DORAFailureRequestData;
import com.datadog.api.client.v2.model.DORAFailureResponse;
import com.datadog.api.client.v2.model.DORAGitInfo;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DoraMetricsApi apiInstance = new DoraMetricsApi(defaultClient);

    DORAFailureRequest body =
        new DORAFailureRequest()
            .data(
                new DORAFailureRequestData()
                    .attributes(
                        new DORAFailureRequestAttributes()
                            .env("staging")
                            .finishedAt(1693491984000000000L)
                            .git(
                                new DORAGitInfo()
                                    .commitSha("66adc9350f2cc9b250b69abddab733dd55e1a588")
                                    .repositoryUrl(
                                        "https://github.com/organization/example-repository"))
                            .name("Webserver is down failing all requests.")
                            .services(Collections.singletonList("shopist"))
                            .severity("High")
                            .startedAt(1693491974000000000L)
                            .team("backend")
                            .version("v1.12.07")));

    try {
      DORAFailureResponse result = apiInstance.createDORAFailure(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DoraMetricsApi#createDORAFailure");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
