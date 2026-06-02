// Get all Statuspage URL settings returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatuspageIntegrationApi;
import com.datadog.api.client.v2.model.StatuspageUrlSettingsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatuspageIntegrationApi apiInstance = new StatuspageIntegrationApi(defaultClient);

    try {
      StatuspageUrlSettingsResponse result = apiInstance.listStatuspageUrlSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling StatuspageIntegrationApi#listStatuspageUrlSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
