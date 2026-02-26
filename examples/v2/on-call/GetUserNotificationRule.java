// Get an On-Call notification rule for a user returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.api.OnCallApi.GetUserNotificationRuleOptionalParameters;
import com.datadog.api.client.v2.model.OnCallNotificationRule;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    // there is a valid "oncall_email_notification_rule" in the system
    String ONCALL_EMAIL_NOTIFICATION_RULE_DATA_ID = System.getenv("ONCALL_EMAIL_NOTIFICATION_RULE_DATA_ID");

    try {
      OnCallNotificationRule result = apiInstance.getUserNotificationRule(USER_DATA_ID, ONCALL_EMAIL_NOTIFICATION_RULE_DATA_ID,new GetUserNotificationRuleOptionalParameters().include("channel"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#getUserNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}