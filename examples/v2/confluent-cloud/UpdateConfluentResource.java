// Update resource in Confluent account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ConfluentCloudApi;
import com.datadog.api.client.v2.model.ConfluentResourceRequest;
import com.datadog.api.client.v2.model.ConfluentResourceRequestAttributes;
import com.datadog.api.client.v2.model.ConfluentResourceRequestData;
import com.datadog.api.client.v2.model.ConfluentResourceResponse;
import com.datadog.api.client.v2.model.ConfluentResourceType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ConfluentCloudApi apiInstance = new ConfluentCloudApi(defaultClient);

    ConfluentResourceRequest body =
        new ConfluentResourceRequest()
            .data(
                new ConfluentResourceRequestData()
                    .attributes(
                        new ConfluentResourceRequestAttributes()
                            .enableCustomMetrics(false)
                            .resourceType("kafka")
                            .tags(Arrays.asList("myTag", "myTag2:myValue")))
                    .id("resource-id-123")
                    .type(ConfluentResourceType.CONFLUENT_CLOUD_RESOURCES));

    try {
      ConfluentResourceResponse result =
          apiInstance.updateConfluentResource("account_id", "resource_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfluentCloudApi#updateConfluentResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
