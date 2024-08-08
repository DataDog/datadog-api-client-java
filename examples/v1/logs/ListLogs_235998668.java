// Search test logs returns "OK" response
import java.time.OffsetDateTime;

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
.index("main")
.query("host:Test*")
.sort(LogsSort.TIME_ASCENDING)
.time(new LogsListRequestTime()
.from(OffsetDateTime.now().plusHours(-1))
.timezone("Europe/Paris")
.to(OffsetDateTime.now()));

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