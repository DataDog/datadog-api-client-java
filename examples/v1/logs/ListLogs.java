// Search logs returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.LogsApi;
import com.datadog.api.client.v1.model.LogsListResponse;
import com.datadog.api.client.v1.model.LogsListRequest;
import com.datadog.api.client.v1.model.LogsListRequestTime;
import com.datadog.api.client.v1.model.LogsSort;
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
    LogsApi apiInstance = new LogsApi(defaultClient);

    LogsListRequest body = new LogsListRequest()
.index("retention-3,retention-15")
.query("service:web* AND @http.status_code:[200 TO 299]")
.sort(LogsSort.TIME_ASCENDING)
.time(new LogsListRequestTime()
.from(OffsetDateTime.parse("2020-02-02T02:02:02.202Z"))
.to(OffsetDateTime.parse("2020-02-20T02:02:02.202Z")));

    try {
      LogsListResponse result = apiInstance.listLogs(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#listLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}