// Create an On-Call email for a user returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.Email;
import com.datadog.api.client.v2.model.EmailAttributes;
import com.datadog.api.client.v2.model.EmailCreateRequest;
import com.datadog.api.client.v2.model.EmailData;
import com.datadog.api.client.v2.model.EmailFormatType;
import com.datadog.api.client.v2.model.EmailType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    EmailCreateRequest body =
        new EmailCreateRequest()
            .data(
                new EmailData()
                    .attributes(
                        new EmailAttributes()
                            .active(true)
                            .address("john.doe@datadoghq.com")
                            .alias("")
                            .formats(Collections.singletonList(EmailFormatType.HTML)))
                    .type(EmailType.EMAILS));

    try {
      Email result = apiInstance.createUserEmailNotificationChannel(USER_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#createUserEmailNotificationChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
