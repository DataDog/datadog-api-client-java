// List all the RUM applications returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.model.RUMApplicationsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumApi apiInstance = new RumApi(defaultClient);

    try {
      RUMApplicationsResponse result = apiInstance.getRUMApplications();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#getRUMApplications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
