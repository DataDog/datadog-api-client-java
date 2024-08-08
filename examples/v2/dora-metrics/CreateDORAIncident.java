// Send an incident event for DORA Metrics returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DoraMetricsApi;
import com.datadog.api.client.v2.model.DORAIncidentResponse;
import com.datadog.api.client.v2.model.DORAGitInfo;
import com.datadog.api.client.v2.model.DORAIncidentRequest;
import com.datadog.api.client.v2.model.DORAIncidentRequestAttributes;
import com.datadog.api.client.v2.model.DORAIncidentRequestData;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createDORAIncident", true);
    DoraMetricsApi apiInstance = new DoraMetricsApi(defaultClient);

    DORAIncidentRequest body = new DORAIncidentRequest()
.data(new DORAIncidentRequestData()
.attributes(new DORAIncidentRequestAttributes()
.finishedAt(1707842944600000000L)
.git(new DORAGitInfo()
.commitSha("66adc9350f2cc9b250b69abddab733dd55e1a588")
.repositoryUrl("https://github.com/organization/example-repository"))
.name("Webserver is down failing all requests")
.services(Collections.singletonList("shopist"))
.severity("High")
.startedAt(1707842944500000000L)
.team("backend")
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