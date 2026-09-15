// Delete a Twilio integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TwilioIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteTwilioIntegrationAccount", true);
    TwilioIntegrationApi apiInstance = new TwilioIntegrationApi(defaultClient);

    try {
      apiInstance.deleteTwilioIntegrationAccount("account_id");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TwilioIntegrationApi#deleteTwilioIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
