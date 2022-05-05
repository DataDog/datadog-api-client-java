// Get a pipeline returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.LogsPipelinesApi;
import com.datadog.api.v1.client.model.LogsPipeline;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);

    try {
      LogsPipeline result = apiInstance.getLogsPipeline("pipeline_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsPipelinesApi#getLogsPipeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
