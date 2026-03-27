// List On-Call notification rules for a user returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.api.OnCallApi.ListUserNotificationRulesOptionalParameters;
import com.datadog.api.client.v2.model.ListOnCallNotificationRulesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    try {
      ListOnCallNotificationRulesResponse result =
          apiInstance.listUserNotificationRules(
              USER_DATA_ID, new ListUserNotificationRulesOptionalParameters().include("channel"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#listUserNotificationRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
