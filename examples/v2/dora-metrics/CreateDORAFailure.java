// Send an incident event returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DoraMetricsApi;
import com.datadog.api.client.v2.model.DORAFailureResponse;
import com.datadog.api.client.v2.model.DORAFailureRequest;
import com.datadog.api.client.v2.model.DORAFailureRequestAttributes;
import com.datadog.api.client.v2.model.DORAFailureRequestData;
import com.datadog.api.client.v2.model.DORAGitInfo;
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
    DoraMetricsApi apiInstance = new DoraMetricsApi(defaultClient);

    DORAFailureRequest body = new DORAFailureRequest()
.data(new DORAFailureRequestData()
.attributes(new DORAFailureRequestAttributes()
.customTags(Arrays.asList("language:java", "department:engineering"))
.env("staging")
.finishedAt(1693491984000000000L)
.git(new DORAGitInfo()
.commitSha("66adc9350f2cc9b250b69abddab733dd55e1a588")
.repositoryUrl("https://github.com/organization/example-repository"))
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