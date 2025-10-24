// Create event email address returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.model.CreateEventEmailAddressRequest;
import com.datadog.api.client.v2.model.CreateEventEmailAddressRequestData;
import com.datadog.api.client.v2.model.CreateEventEmailAddressRequestDataAttributes;
import com.datadog.api.client.v2.model.EventEmailAddressResponse;
import com.datadog.api.client.v2.model.EventEmailsType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createEventEmailAddress", true);
    EventsApi apiInstance = new EventsApi(defaultClient);

    CreateEventEmailAddressRequest body =
        new CreateEventEmailAddressRequest()
            .data(
                new CreateEventEmailAddressRequestData()
                    .attributes(
                        new CreateEventEmailAddressRequestDataAttributes()
                            .format("")
                            .notifyHandles(Collections.singletonList(""))
                            .tags(Collections.singletonList("")))
                    .type(EventEmailsType.EVENT_EMAILS));

    try {
      EventEmailAddressResponse result = apiInstance.createEventEmailAddress(body);
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
