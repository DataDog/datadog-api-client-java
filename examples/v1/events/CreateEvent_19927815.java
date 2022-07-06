// Post an event with a long title returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.EventsApi;
import com.datadog.api.client.v1.model.EventCreateRequest;
import com.datadog.api.client.v1.model.EventCreateResponse;
import java.util.Collections;

public class CreateEvent_19927815 {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    EventsApi apiInstance = new EventsApi(defaultClient);

    EventCreateRequest body =
        new EventCreateRequest()
            .title(
                "Example-Post_an_event_with_a_long_title_returns_OK_response very very very"
                    + " looooooooong looooooooooooong loooooooooooooooooooooong"
                    + " looooooooooooooooooooooooooong title with 100+ characters")
            .text("A text message.")
            .tags(
                Collections.singletonList(
                    "test:ExamplePostaneventwithalongtitlereturnsOKresponse"));

    try {
      EventCreateResponse result = apiInstance.createEvent(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#createEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
