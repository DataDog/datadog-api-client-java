// Get status page subscription preferences returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentStatuspagePreferencesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getStatuspageSubscriptionPreferences", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    try {
      IncidentStatuspagePreferencesResponse result =
          apiInstance.getStatuspageSubscriptionPreferences();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling IncidentsApi#getStatuspageSubscriptionPreferences");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
