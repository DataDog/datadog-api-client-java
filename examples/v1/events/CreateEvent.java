// Post an event returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.EventsApi;
import com.datadog.api.v1.client.model.EventCreateRequest;
import com.datadog.api.v1.client.model.EventCreateResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    EventsApi apiInstance = new EventsApi(defaultClient);

    EventCreateRequest body =
        new EventCreateRequest()
            .title("Example-Post_an_event_returns_OK_response")
            .text("A text message.")
            .tags(Collections.singletonList("test:ExamplePostaneventreturnsOKresponse"));

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
