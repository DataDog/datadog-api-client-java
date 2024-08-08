// Create a Custom Header HTTP custom destination returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationAttributeTagsRestrictionListType;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequest;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequestAttributes;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequestDefinition;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestination;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestinationHttp;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestinationHttpType;
import com.datadog.api.client.v2.model.CustomDestinationHttpDestinationAuth;
import com.datadog.api.client.v2.model.CustomDestinationHttpDestinationAuthCustomHeader;
import com.datadog.api.client.v2.model.CustomDestinationHttpDestinationAuthCustomHeaderType;
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
new CustomDestinationForwardDestinationHttp()
.auth(new CustomDestinationHttpDestinationAuth(
new CustomDestinationHttpDestinationAuthCustomHeader()
.headerValue("my-secret")
.type(CustomDestinationHttpDestinationAuthCustomHeaderType.CUSTOM_HEADER)
.headerName("MY-AUTHENTICATION-HEADER")))
.endpoint("https://example.com")
.type(CustomDestinationForwardDestinationHttpType.HTTP)))
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