// Search logs returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.LogsApi;
import com.datadog.api.v1.client.model.LogsListRequest;
import com.datadog.api.v1.client.model.LogsListRequestTime;
import com.datadog.api.v1.client.model.LogsListResponse;
import com.datadog.api.v1.client.model.LogsSort;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsApi apiInstance = new LogsApi(defaultClient);

    LogsListRequest body =
        new LogsListRequest()
            .index("main")
            .limit(5)
            .query("service:web* AND @http.status_code:[200 TO 299]")
            .sort(LogsSort.TIME_ASCENDING)
            .time(
                new LogsListRequestTime()
                    .from(OffsetDateTime.parse("2020-02-02T02:02:02Z"))
                    .timezone("Europe/Paris")
                    .to(OffsetDateTime.parse("2020-02-02T20:20:20Z")));

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
