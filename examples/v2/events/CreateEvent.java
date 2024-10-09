// Post a change event returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.model.ChangeEvent;
import com.datadog.api.client.v2.model.ChangeEventCategory;
import com.datadog.api.client.v2.model.ChangeEventCreateRequest;
import com.datadog.api.client.v2.model.ChangeEventCreateRequestType;
import com.datadog.api.client.v2.model.ChangeEventCreateResponse;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributes;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesAuthor;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesAuthorType;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesChangedResource;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesChangedResourceName;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    EventsApi apiInstance = new EventsApi(defaultClient);

    ChangeEventCreateRequest body =
        new ChangeEventCreateRequest()
            .attributes(
                new ChangeEvent()
                    .attributes(
                        new ChangeEventCustomAttributes()
                            .author(
                                new ChangeEventCustomAttributesAuthor()
                                    .name("")
                                    .type(ChangeEventCustomAttributesAuthorType.USER))
                            .changedResource(
                                new ChangeEventCustomAttributesChangedResource()
                                    .name(
                                        ChangeEventCustomAttributesChangedResourceName.FEATURE_FLAG)
                                    .type("")))
                    .category(ChangeEventCategory.CHANGE)
                    .message("payment_processed feature flag has been enabled")
                    .tags(Collections.singletonList("environment:test"))
                    .timestamp("2017-01-15T01:30:15.010000Z")
                    .title("payment_processed feature flag updated"))
            .type(ChangeEventCreateRequestType.EVENT);

    try {
      ChangeEventCreateResponse result = apiInstance.createEvent(body);
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
