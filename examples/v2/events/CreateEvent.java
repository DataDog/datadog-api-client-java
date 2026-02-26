// Post an event returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.model.EventCreateResponsePayload;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributes;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesAuthor;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesAuthorType;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesChangedResource;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesChangedResourceType;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesImpactedResourcesItems;
import com.datadog.api.client.v2.model.ChangeEventCustomAttributesImpactedResourcesItemsType;
import com.datadog.api.client.v2.model.EventCategory;
import com.datadog.api.client.v2.model.EventCreateRequest;
import com.datadog.api.client.v2.model.EventCreateRequestPayload;
import com.datadog.api.client.v2.model.EventCreateRequestType;
import com.datadog.api.client.v2.model.EventPayload;
import com.datadog.api.client.v2.model.EventPayloadAttributes;
import com.datadog.api.client.v2.model.EventPayloadIntegrationId;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    EventsApi apiInstance = new EventsApi(defaultClient);

    EventCreateRequestPayload body = new EventCreateRequestPayload()
.data(new EventCreateRequest()
.attributes(new EventPayload()
.aggregationKey("aggregation_key_123")
.attributes(new EventPayloadAttributes(
new ChangeEventCustomAttributes()
.author(new ChangeEventCustomAttributesAuthor()
.name("example@datadog.com")
.type(ChangeEventCustomAttributesAuthorType.USER))
.changeMetadata(Map.ofEntries(Map.entry("dd", "{'team': 'datadog_team', 'user_email': 'datadog@datadog.com', 'user_id': 'datadog_user_id', 'user_name': 'datadog_username'}"),Map.entry("resource_link", "datadog.com/feature/fallback_payments_test")))
.changedResource(new ChangeEventCustomAttributesChangedResource()
.name("fallback_payments_test")
.type(ChangeEventCustomAttributesChangedResourceType.FEATURE_FLAG))
.impactedResources(Collections.singletonList(new ChangeEventCustomAttributesImpactedResourcesItems()
.name("payments_api")
.type(ChangeEventCustomAttributesImpactedResourcesItemsType.SERVICE)))
.newValue(Map.ofEntries(Map.entry("enabled", "True"),Map.entry("percentage", "50%"),Map.entry("rule", "{'datacenter': 'devcycle.us1.prod'}")))
.prevValue(Map.ofEntries(Map.entry("enabled", "True"),Map.entry("percentage", "10%"),Map.entry("rule", "{'datacenter': 'devcycle.us1.prod'}")))))
.category(EventCategory.CHANGE)
.integrationId(EventPayloadIntegrationId.CUSTOM_EVENTS)
.host("test-host")
.message("payment_processed feature flag has been enabled")
.tags(Collections.singletonList("env:api_client_test"))
.title("payment_processed feature flag updated"))
.type(EventCreateRequestType.EVENT));

    try {
      EventCreateResponsePayload result = apiInstance.createEvent(body);
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