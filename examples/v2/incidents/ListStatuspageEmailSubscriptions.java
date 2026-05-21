// List status page email subscriptions returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentStatuspageSubscriptionsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listStatuspageEmailSubscriptions", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    try {
      IncidentStatuspageSubscriptionsResponse result =
          apiInstance.listStatuspageEmailSubscriptions("my-status-page");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#listStatuspageEmailSubscriptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
