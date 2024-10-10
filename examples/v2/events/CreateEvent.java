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
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesChangedResourceType;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesImpactedResourcesItems;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesImpactedResourcesItemsType;
import java.util.Collections;
import java.util.Map;

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
                                    .name("user")
                                    .type(ChangeEventCustomAttributesAuthorType.USER))
                            .changeMetadata(
                                Map.ofEntries(
                                    Map.entry("resource_link", "/feature/fallback_payments_test"),
                                    Map.entry(
                                        "user", "{'email': 'dd_user_email', 'name': 'dd_user'}")))
                            .changedResource(
                                new ChangeEventCustomAttributesChangedResource()
                                    .name("fallback_payments_test")
                                    .type(
                                        ChangeEventCustomAttributesChangedResourceType
                                            .FEATURE_FLAG))
                            .impactedResources(
                                Collections.singletonList(
                                    new ChangeEventCustomAttributesImpactedResourcesItems()
                                        .name("payments_api")
                                        .type(
                                            ChangeEventCustomAttributesImpactedResourcesItemsType
                                                .SERVICE)))
                            .newValue(
                                Map.ofEntries(
                                    Map.entry("enabled", "True"),
                                    Map.entry("percentage", "50%"),
                                    Map.entry("rule", "{'datacenter': 'us1.prod'}")))
                            .prevValue(
                                Map.ofEntries(
                                    Map.entry("enabled", "True"),
                                    Map.entry("percentage", "10%"),
                                    Map.entry("rule", "{'datacenter': 'us1.prod'}"))))
                    .category(ChangeEventCategory.CHANGE)
                    .message("payment_processed feature flag has been enabled")
                    .tags(Collections.singletonList("environment:test"))
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
