// Get all powerpacks returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.PowerpackApi;
import com.datadog.api.client.v2.model.ListPowerpacksResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    PowerpackApi apiInstance = new PowerpackApi(defaultClient);

    try {
      ListPowerpacksResponse result = apiInstance.listPowerpacks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PowerpackApi#listPowerpacks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
