// Create a Microsoft Sentinel custom destination returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationAttributeTagsRestrictionListType;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequest;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequestAttributes;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequestDefinition;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestination;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestinationMicrosoftSentinel;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestinationMicrosoftSentinelType;
import com.datadog.api.client.v2.model.CustomDestinationType;
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
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    CustomDestinationCreateRequest body = new CustomDestinationCreateRequest()
.data(new CustomDestinationCreateRequestDefinition()
.attributes(new CustomDestinationCreateRequestAttributes()
.enabled(false)
.forwardTags(false)
.forwardTagsRestrictionList(Arrays.asList("datacenter", "host"))
.forwardTagsRestrictionListType(CustomDestinationAttributeTagsRestrictionListType.ALLOW_LIST)
.forwarderDestination(new CustomDestinationForwardDestination(
new CustomDestinationForwardDestinationMicrosoftSentinel()
.type(CustomDestinationForwardDestinationMicrosoftSentinelType.MICROSOFT_SENTINEL)
.tenantId("f3c9a8a1-4c2e-4d2e-b911-9f3c28c3c8b2")
.clientId("9a2f4d83-2b5e-429e-a35a-2b3c4182db71")
.dataCollectionEndpoint("https://my-dce-5kyl.eastus-1.ingest.monitor.azure.com")
.dataCollectionRuleId("dcr-000a00a000a00000a000000aa000a0aa")
.streamName("Custom-MyTable")))
.name("Nginx logs")
.query("source:nginx"))
.type(CustomDestinationType.CUSTOM_DESTINATION));

    try {
      CustomDestinationResponse result = apiInstance.createLogsCustomDestination(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsCustomDestinationsApi#createLogsCustomDestination");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}