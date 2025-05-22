// Get a list of failure events returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DoraMetricsApi;
import com.datadog.api.client.v2.model.DORAListFailuresRequest;
import com.datadog.api.client.v2.model.DORAListFailuresRequestAttributes;
import com.datadog.api.client.v2.model.DORAListFailuresRequestData;
import com.datadog.api.client.v2.model.DORAListFailuresRequestDataType;
import com.datadog.api.client.v2.model.DORAListResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DoraMetricsApi apiInstance = new DoraMetricsApi(defaultClient);

    DORAListFailuresRequest body =
        new DORAListFailuresRequest()
            .data(
                new DORAListFailuresRequestData()
                    .attributes(
                        new DORAListFailuresRequestAttributes()
                            .from(OffsetDateTime.parse("2025-03-23T00:00:00Z"))
                            .limit(1)
                            .to(OffsetDateTime.parse("2025-03-24T00:00:00Z")))
                    .type(DORAListFailuresRequestDataType.DORA_FAILURES_LIST_REQUEST));

    try {
      DORAListResponse result = apiInstance.listDORAFailures(body);
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
