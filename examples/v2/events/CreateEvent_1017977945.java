// Post an event with metric_configuration resource type returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EventsApi;
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
import com.datadog.api.client.v2.model.EventCreateResponsePayload;
import com.datadog.api.client.v2.model.EventPayload;
import com.datadog.api.client.v2.model.EventPayloadAttributes;
import com.datadog.api.client.v2.model.EventPayloadIntegrationId;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    EventsApi apiInstance = new EventsApi(defaultClient);

    EventCreateRequestPayload body =
        new EventCreateRequestPayload()
            .data(
                new EventCreateRequest()
                    .attributes(
                        new EventPayload()
                            .aggregationKey("aggregation_key_123")
                            .attributes(
                                new EventPayloadAttributes(
                                    new ChangeEventCustomAttributes()
                                        .author(
                                            new ChangeEventCustomAttributesAuthor()
                                                .name("example@datadog.com")
                                                .type(ChangeEventCustomAttributesAuthorType.USER))
                                        .changeMetadata(
                                            Map.ofEntries(
                                                Map.entry(
                                                    "dd",
                                                    "{'team': 'datadog_team', 'user_email':"
                                                        + " 'datadog@datadog.com', 'user_id':"
                                                        + " 'datadog_user_id', 'user_name':"
                                                        + " 'datadog_username'}"),
                                                Map.entry(
                                                    "resource_link",
                                                    "datadog.com/metric/config_test")))
                                        .changedResource(
                                            new ChangeEventCustomAttributesChangedResource()
                                                .name("config_test")
                                                .type(
                                                    ChangeEventCustomAttributesChangedResourceType
                                                        .METRIC_CONFIGURATION))
                                        .impactedResources(
                                            Collections.singletonList(
                                                new ChangeEventCustomAttributesImpactedResourcesItems()
                                                    .name("system.cpu.usage")
                                                    .type(
                                                        ChangeEventCustomAttributesImpactedResourcesItemsType
                                                            .SERVICE)))
                                        .newValue(
                                            Map.ofEntries(
                                                Map.entry("aggregation", "avg"),
                                                Map.entry("tags", "['env:prod', 'service:web']"),
                                                Map.entry("unit", "percent")))
                                        .prevValue(
                                            Map.ofEntries(
                                                Map.entry("aggregation", "sum"),
                                                Map.entry("tags", "['env:prod']"),
                                                Map.entry("unit", "percent")))))
                            .category(EventCategory.CHANGE)
                            .integrationId(EventPayloadIntegrationId.CUSTOM_EVENTS)
                            .message("metric configuration has been updated")
                            .tags(Collections.singletonList("env:api_client_test"))
                            .title("metric configuration updated"))
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
