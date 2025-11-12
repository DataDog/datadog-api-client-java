// Update an On-Call email for a user returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.Email;
import com.datadog.api.client.v2.model.EmailAttributes;
import com.datadog.api.client.v2.model.EmailData;
import com.datadog.api.client.v2.model.EmailFormatType;
import com.datadog.api.client.v2.model.EmailType;
import com.datadog.api.client.v2.model.EmailUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    // there is a valid "oncall_email" in the system
    String ONCALL_EMAIL_DATA_ATTRIBUTES_ADDRESS =
        System.getenv("ONCALL_EMAIL_DATA_ATTRIBUTES_ADDRESS");
    String ONCALL_EMAIL_DATA_ID = System.getenv("ONCALL_EMAIL_DATA_ID");

    EmailUpdateRequest body =
        new EmailUpdateRequest()
            .data(
                new EmailData()
                    .id(ONCALL_EMAIL_DATA_ID)
                    .attributes(
                        new EmailAttributes()
                            .active(true)
                            .address(ONCALL_EMAIL_DATA_ATTRIBUTES_ADDRESS)
                            .alias("Example-On-Call-alias")
                            .formats(Collections.singletonList(EmailFormatType.HTML)))
                    .type(EmailType.EMAILS));

    try {
      Email result =
          apiInstance.updateUserEmailNotificationChannel(USER_DATA_ID, ONCALL_EMAIL_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#updateUserEmailNotificationChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
