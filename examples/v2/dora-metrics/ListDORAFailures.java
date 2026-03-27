// Get a list of incident events returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DoraMetricsApi;
import com.datadog.api.client.v2.model.DORAFailuresListResponse;
import com.datadog.api.client.v2.model.DORAListFailuresRequest;
import com.datadog.api.client.v2.model.DORAListFailuresRequestAttributes;
import com.datadog.api.client.v2.model.DORAListFailuresRequestData;
import com.datadog.api.client.v2.model.DORAListFailuresRequestDataType;
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

    DORAListFailuresRequest body = new DORAListFailuresRequest()
.data(new DORAListFailuresRequestData()
.attributes(new DORAListFailuresRequestAttributes()
.from(OffsetDateTime.parse("2025-01-01T00:00:00Z"))
.limit(100)
.query("severity:(SEV-1 OR SEV-2) env:production team:backend")
.sort("-started_at")
.to(OffsetDateTime.parse("2025-01-31T23:59:59Z")))
.type(DORAListFailuresRequestDataType.DORA_FAILURES_LIST_REQUEST));

    try {
      DORAFailuresListResponse result = apiInstance.listDORAFailures(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DoraMetricsApi#listDORAFailures");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}