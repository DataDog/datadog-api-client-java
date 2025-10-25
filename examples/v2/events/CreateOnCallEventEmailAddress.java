// Create on-call event email address returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.model.CreateOnCallEventEmailAddressRequest;
import com.datadog.api.client.v2.model.CreateOnCallEventEmailAddressRequestData;
import com.datadog.api.client.v2.model.CreateOnCallEventEmailAddressRequestDataAttributes;
import com.datadog.api.client.v2.model.EventEmailAddressResponse;
import com.datadog.api.client.v2.model.EventEmailsType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createOnCallEventEmailAddress", true);
    EventsApi apiInstance = new EventsApi(defaultClient);

    CreateOnCallEventEmailAddressRequest body =
        new CreateOnCallEventEmailAddressRequest()
            .data(
                new CreateOnCallEventEmailAddressRequestData()
                    .attributes(
                        new CreateOnCallEventEmailAddressRequestDataAttributes()
                            .format("")
                            .tags(Collections.singletonList("")))
                    .type(EventEmailsType.EVENT_EMAILS));

    try {
      EventEmailAddressResponse result = apiInstance.createOnCallEventEmailAddress(body);
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
