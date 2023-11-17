// Send an incident event for DORA Metrics returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DoraMetricsApi;
import com.datadog.api.client.v2.model.DORAGitInfo;
import com.datadog.api.client.v2.model.DORAIncidentRequest;
import com.datadog.api.client.v2.model.DORAIncidentRequestAttributes;
import com.datadog.api.client.v2.model.DORAIncidentRequestData;
import com.datadog.api.client.v2.model.DORAIncidentResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createDORAIncident", true);
    DoraMetricsApi apiInstance = new DoraMetricsApi(defaultClient);

    DORAIncidentRequest body =
        new DORAIncidentRequest()
            .data(
                new DORAIncidentRequestData()
                    .attributes(
                        new DORAIncidentRequestAttributes()
                            .finishedAt(1693491984000000000L)
                            .git(
                                new DORAGitInfo()
                                    .commitSha("66adc9350f2cc9b250b69abddab733dd55e1a588")
                                    .repositoryUrl(
                                        "https://github.com/organization/example-repository"))
                            .name("Webserver is down failing all requests")
                            .service("shopist")
                            .severity("High")
                            .startedAt(1693491974000000000L)
                            .version("v1.12.07")));

    try {
      DORAIncidentResponse result = apiInstance.createDORAIncident(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DoraMetricsApi#createDORAIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
