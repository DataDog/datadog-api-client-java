// Create a status page email subscription returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentStatuspageSubscriptionDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentStatuspageSubscriptionDataRequest;
import com.datadog.api.client.v2.model.IncidentStatuspageSubscriptionRequest;
import com.datadog.api.client.v2.model.IncidentStatuspageSubscriptionResponse;
import com.datadog.api.client.v2.model.IncidentStatuspageSubscriptionType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createStatuspageEmailSubscription", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentStatuspageSubscriptionRequest body =
        new IncidentStatuspageSubscriptionRequest()
            .data(
                new IncidentStatuspageSubscriptionDataRequest()
                    .attributes(
                        new IncidentStatuspageSubscriptionDataAttributesRequest()
                            .email("user@example.com"))
                    .type(IncidentStatuspageSubscriptionType.STATUSPAGE_EMAIL_SUBSCRIPTION));

    try {
      IncidentStatuspageSubscriptionResponse result =
          apiInstance.createStatuspageEmailSubscription("my-status-page", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createStatuspageEmailSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
