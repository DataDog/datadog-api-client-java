// Unregister an App Key returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    try {
      apiInstance.unregisterAppKey("57cc69ae-9214-4ecc-8df8-43ecc1d92d99");
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#unregisterAppKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
