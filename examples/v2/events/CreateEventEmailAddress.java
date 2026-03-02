// Create an event email address returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.model.EventEmailAddressAlertType;
import com.datadog.api.client.v2.model.EventEmailAddressCreateAttributes;
import com.datadog.api.client.v2.model.EventEmailAddressCreateData;
import com.datadog.api.client.v2.model.EventEmailAddressCreateRequest;
import com.datadog.api.client.v2.model.EventEmailAddressFormat;
import com.datadog.api.client.v2.model.EventEmailAddressResourceType;
import com.datadog.api.client.v2.model.EventEmailAddressSingleResponse;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createEventEmailAddress", true);
    EventsApi apiInstance = new EventsApi(defaultClient);

    EventEmailAddressCreateRequest body =
        new EventEmailAddressCreateRequest()
            .data(
                new EventEmailAddressCreateData()
                    .attributes(
                        new EventEmailAddressCreateAttributes()
                            .alertType(EventEmailAddressAlertType.INFO)
                            .description("Email address for production alerts.")
                            .format(EventEmailAddressFormat.JSON)
                            .notifyHandles(Collections.singletonList("@slack-my-channel"))
                            .tags(Arrays.asList("env:production", "team:my-team")))
                    .type(EventEmailAddressResourceType.EVENT_EMAILS));

    try {
      EventEmailAddressSingleResponse result = apiInstance.createEventEmailAddress(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#createEventEmailAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
