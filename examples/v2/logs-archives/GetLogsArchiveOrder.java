// Get archive order returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsArchivesApi;
import com.datadog.api.client.v2.model.LogsArchiveOrder;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);

    try {
      LogsArchiveOrder result = apiInstance.getLogsArchiveOrder();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsArchivesApi#getLogsArchiveOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
