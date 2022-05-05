// Get a quick list of logs returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsApi;
import com.datadog.api.v2.client.api.LogsApi.ListLogsGetOptionalParameters;
import com.datadog.api.v2.client.model.LogsListResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsApi apiInstance = new LogsApi(defaultClient);

    try {
      LogsListResponse result =
          apiInstance.listLogsGet(
              new ListLogsGetOptionalParameters()
                  .filterQuery("datadog-agent")
                  .filterIndex("main")
                  .filterFrom(OffsetDateTime.parse("2020-09-17T11:48:36+01:00"))
                  .filterTo(OffsetDateTime.parse("2020-09-17T12:48:36+01:00"))
                  .pageLimit(5));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#listLogsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
