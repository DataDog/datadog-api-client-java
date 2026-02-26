// Update pipeline order returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.LogsPipelinesApi;
import com.datadog.api.client.v1.model.LogsPipelinesOrder;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);

    LogsPipelinesOrder body =
        new LogsPipelinesOrder().pipelineIds(Arrays.asList("tags", "org_ids", "products"));

    try {
      LogsPipelinesOrder result = apiInstance.updateLogsPipelineOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsPipelinesApi#updateLogsPipelineOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
