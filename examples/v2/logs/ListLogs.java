// Search logs returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsApi;
import com.datadog.api.v2.client.api.LogsApi.ListLogsOptionalParameters;
import com.datadog.api.v2.client.model.LogsListRequest;
import com.datadog.api.v2.client.model.LogsListRequestPage;
import com.datadog.api.v2.client.model.LogsListResponse;
import com.datadog.api.v2.client.model.LogsQueryFilter;
import com.datadog.api.v2.client.model.LogsSort;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsApi apiInstance = new LogsApi(defaultClient);

    LogsListRequest body =
        new LogsListRequest()
            .filter(
                new LogsQueryFilter()
                    .query("datadog-agent")
                    .indexes(Collections.singletonList("main"))
                    .from("2020-09-17T11:48:36+01:00")
                    .to("2020-09-17T12:48:36+01:00"))
            .sort(LogsSort.TIMESTAMP_ASCENDING)
            .page(new LogsListRequestPage().limit(5));

    try {
      LogsListResponse result = apiInstance.listLogs(new ListLogsOptionalParameters().body(body));
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
