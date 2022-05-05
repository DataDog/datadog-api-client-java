// Get a list of RUM events returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.RumApi;
import com.datadog.api.v2.client.model.RUMEventsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    RumApi apiInstance = new RumApi(defaultClient);

    try {
      RUMEventsResponse result = apiInstance.listRUMEvents();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#listRUMEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
