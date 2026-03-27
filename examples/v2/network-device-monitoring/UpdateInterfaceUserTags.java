// Update the tags for an interface returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.NetworkDeviceMonitoringApi;
import com.datadog.api.client.v2.model.ListInterfaceTagsResponse;
import com.datadog.api.client.v2.model.ListInterfaceTagsResponse;
import com.datadog.api.client.v2.model.ListInterfaceTagsResponseData;
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

    ListInterfaceTagsResponse body = new ListInterfaceTagsResponse()
.data(new ListInterfaceTagsResponseData()
.attributes(new ListTagsResponseDataAttributes()
.tags(Arrays.asList("tag:test", "tag:testbis")))
.id("example:1.2.3.4:1")
.type("tags"));

    try {
      ListInterfaceTagsResponse result = apiInstance.updateInterfaceUserTags("example:1.2.3.4:1", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkDeviceMonitoringApi#updateInterfaceUserTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}