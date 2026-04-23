// Create an on-call event email address returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.model.EventEmailAddressAlertType;
import com.datadog.api.client.v2.model.EventEmailAddressFormat;
import com.datadog.api.client.v2.model.EventEmailAddressResourceType;
import com.datadog.api.client.v2.model.EventEmailAddressSingleResponse;
import com.datadog.api.client.v2.model.OnCallEventEmailAddressCreateAttributes;
import com.datadog.api.client.v2.model.OnCallEventEmailAddressCreateData;
import com.datadog.api.client.v2.model.OnCallEventEmailAddressCreateRequest;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createOnCallEventEmailAddress", true);
    EventsApi apiInstance = new EventsApi(defaultClient);

    OnCallEventEmailAddressCreateRequest body =
        new OnCallEventEmailAddressCreateRequest()
            .data(
                new OnCallEventEmailAddressCreateData()
                    .attributes(
                        new OnCallEventEmailAddressCreateAttributes()
                            .alertType(EventEmailAddressAlertType.INFO)
                            .description("On-call email address for my team.")
                            .format(EventEmailAddressFormat.JSON)
                            .tags(Arrays.asList("env:production", "team:my-team"))
                            .teamHandle("my-team"))
                    .type(EventEmailAddressResourceType.EVENT_EMAILS));

    try {
      EventEmailAddressSingleResponse result = apiInstance.createOnCallEventEmailAddress(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#createOnCallEventEmailAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
