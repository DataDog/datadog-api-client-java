// Get an index returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.LogsIndexesApi;
import com.datadog.api.v1.client.model.LogsIndex;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);

    try {
      LogsIndex result = apiInstance.getLogsIndex("name");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsIndexesApi#getLogsIndex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
