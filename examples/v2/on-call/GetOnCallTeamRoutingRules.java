// Get On-Call team routing rules returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.TeamRoutingRules;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    try {
      TeamRoutingRules result =
          apiInstance.getOnCallTeamRoutingRules("27590dae-47be-4a7d-9abf-8f4e45124020");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#getOnCallTeamRoutingRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
