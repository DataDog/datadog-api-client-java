// Delete the Statuspage account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatuspageIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatuspageIntegrationApi apiInstance = new StatuspageIntegrationApi(defaultClient);

    try {
      apiInstance.deleteStatuspageAccount();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatuspageIntegrationApi#deleteStatuspageAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
