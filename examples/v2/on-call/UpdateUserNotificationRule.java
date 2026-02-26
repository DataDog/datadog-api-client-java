// Update an On-Call notification rule for a user returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.api.OnCallApi.UpdateUserNotificationRuleOptionalParameters;
import com.datadog.api.client.v2.model.OnCallNotificationRule;
import com.datadog.api.client.v2.model.NotificationChannelType;
import com.datadog.api.client.v2.model.OnCallNotificationRuleCategory;
import com.datadog.api.client.v2.model.OnCallNotificationRuleChannelRelationship;
import com.datadog.api.client.v2.model.OnCallNotificationRuleChannelRelationshipData;
import com.datadog.api.client.v2.model.OnCallNotificationRuleRelationships;
import com.datadog.api.client.v2.model.OnCallNotificationRuleType;
import com.datadog.api.client.v2.model.UpdateOnCallNotificationRuleRequest;
import com.datadog.api.client.v2.model.UpdateOnCallNotificationRuleRequestAttributes;
import com.datadog.api.client.v2.model.UpdateOnCallNotificationRuleRequestData;
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

    // there is a valid "oncall_email_notification_channel" in the system
    String ONCALL_EMAIL_NOTIFICATION_CHANNEL_DATA_ID = System.getenv("ONCALL_EMAIL_NOTIFICATION_CHANNEL_DATA_ID");

    UpdateOnCallNotificationRuleRequest body = new UpdateOnCallNotificationRuleRequest()
.data(new UpdateOnCallNotificationRuleRequestData()
.attributes(new UpdateOnCallNotificationRuleRequestAttributes()
.category(OnCallNotificationRuleCategory.HIGH_URGENCY)
.delayMinutes(1L))
.id(ONCALL_EMAIL_NOTIFICATION_RULE_DATA_ID)
.relationships(new OnCallNotificationRuleRelationships()
.channel(new OnCallNotificationRuleChannelRelationship()
.data(new OnCallNotificationRuleChannelRelationshipData()
.id(ONCALL_EMAIL_NOTIFICATION_CHANNEL_DATA_ID)
.type(NotificationChannelType.NOTIFICATION_CHANNELS))))
.type(OnCallNotificationRuleType.NOTIFICATION_RULES));

    try {
      OnCallNotificationRule result = apiInstance.updateUserNotificationRule(USER_DATA_ID, ONCALL_EMAIL_NOTIFICATION_RULE_DATA_ID, body,new UpdateUserNotificationRuleOptionalParameters().include("channel"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#updateUserNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}