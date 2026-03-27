// Update the tags for a device returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.NetworkDeviceMonitoringApi;
import com.datadog.api.client.v2.model.ListTagsResponse;
import com.datadog.api.client.v2.model.ListTagsResponse;
import com.datadog.api.client.v2.model.ListTagsResponseData;
import com.datadog.api.client.v2.model.ListTagsResponseDataAttributes;
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
    NetworkDeviceMonitoringApi apiInstance = new NetworkDeviceMonitoringApi(defaultClient);

    ListTagsResponse body = new ListTagsResponse()
.data(new ListTagsResponseData()
.attributes(new ListTagsResponseDataAttributes()
.tags(Arrays.asList("tag:test", "tag:testbis")))
.id("default_device")
.type("tags"));

    try {
      ListTagsResponse result = apiInstance.updateDeviceUserTags("default_device", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkDeviceMonitoringApi#updateDeviceUserTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}