// Create an On-Call notification channel for a user returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.NotificationChannel;
import com.datadog.api.client.v2.model.CreateEmailNotificationChannelConfig;
import com.datadog.api.client.v2.model.CreateNotificationChannelAttributes;
import com.datadog.api.client.v2.model.CreateNotificationChannelConfig;
import com.datadog.api.client.v2.model.CreateNotificationChannelData;
import com.datadog.api.client.v2.model.CreateUserNotificationChannelRequest;
import com.datadog.api.client.v2.model.NotificationChannelEmailConfigType;
import com.datadog.api.client.v2.model.NotificationChannelEmailFormatType;
import com.datadog.api.client.v2.model.NotificationChannelType;
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

    CreateUserNotificationChannelRequest body = new CreateUserNotificationChannelRequest()
.data(new CreateNotificationChannelData()
.attributes(new CreateNotificationChannelAttributes()
.config(new CreateNotificationChannelConfig(
new CreateEmailNotificationChannelConfig()
.address("foo@bar.com")
.formats(Collections.singletonList(NotificationChannelEmailFormatType.HTML))
.type(NotificationChannelEmailConfigType.EMAIL))))
.type(NotificationChannelType.NOTIFICATION_CHANNELS));

    try {
      NotificationChannel result = apiInstance.createUserNotificationChannel(USER_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#createUserNotificationChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}