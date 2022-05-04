// Update pipeline order returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.LogsPipelinesApi;
import com.datadog.api.v1.client.model.LogsPipelinesOrder;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
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
