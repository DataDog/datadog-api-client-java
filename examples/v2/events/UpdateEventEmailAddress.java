// Update an event email address returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.model.EventEmailAddressAlertType;
import com.datadog.api.client.v2.model.EventEmailAddressResourceType;
import com.datadog.api.client.v2.model.EventEmailAddressSingleResponse;
import com.datadog.api.client.v2.model.EventEmailAddressUpdateAttributes;
import com.datadog.api.client.v2.model.EventEmailAddressUpdateData;
import com.datadog.api.client.v2.model.EventEmailAddressUpdateRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateEventEmailAddress", true);
    EventsApi apiInstance = new EventsApi(defaultClient);

    EventEmailAddressUpdateRequest body =
        new EventEmailAddressUpdateRequest()
            .data(
                new EventEmailAddressUpdateData()
                    .attributes(
                        new EventEmailAddressUpdateAttributes()
                            .alertType(EventEmailAddressAlertType.INFO)
                            .description("Updated description for the email address.")
                            .notifyHandles(Collections.singletonList("@slack-my-channel"))
                            .tags(Arrays.asList("env:production", "team:my-team")))
                    .type(EventEmailAddressResourceType.EVENT_EMAILS));

    try {
      EventEmailAddressSingleResponse result =
          apiInstance.updateEventEmailAddress(
              UUID.fromString("00000000-0000-0000-0000-000000000001"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#updateEventEmailAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
