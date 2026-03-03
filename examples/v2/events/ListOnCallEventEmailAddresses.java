// List on-call event email addresses returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.model.EventEmailAddressesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listOnCallEventEmailAddresses", true);
    EventsApi apiInstance = new EventsApi(defaultClient);

    try {
      EventEmailAddressesResponse result = apiInstance.listOnCallEventEmailAddresses("my-team");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#listOnCallEventEmailAddresses");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
