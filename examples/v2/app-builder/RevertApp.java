// Revert App returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppBuilderApi;
import com.datadog.api.client.v2.model.UpdateAppResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AppBuilderApi apiInstance = new AppBuilderApi(defaultClient);

    try {
      UpdateAppResponse result =
          apiInstance.revertApp(UUID.fromString("65bb1f25-52e1-4510-9f8d-22d1516ed693"), "2");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#revertApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
