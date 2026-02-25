// Add resource to Confluent account returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ConfluentCloudApi;
import com.datadog.api.client.v2.model.ConfluentResourceResponse;
import com.datadog.api.client.v2.model.ConfluentResourceRequest;
import com.datadog.api.client.v2.model.ConfluentResourceRequestAttributes;
import com.datadog.api.client.v2.model.ConfluentResourceRequestData;
import com.datadog.api.client.v2.model.ConfluentResourceType;
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
    ConfluentCloudApi apiInstance = new ConfluentCloudApi(defaultClient);

    // there is a valid "confluent_account" in the system
    String CONFLUENT_ACCOUNT_DATA_ID = System.getenv("CONFLUENT_ACCOUNT_DATA_ID");

    ConfluentResourceRequest body = new ConfluentResourceRequest()
.data(new ConfluentResourceRequestData()
.attributes(new ConfluentResourceRequestAttributes()
.resourceType("kafka")
.tags(Arrays.asList("myTag", "myTag2:myValue"))
.enableCustomMetrics(false))
.id("exampleconfluentcloud")
.type(ConfluentResourceType.CONFLUENT_CLOUD_RESOURCES));

    try {
      ConfluentResourceResponse result = apiInstance.createConfluentResource(CONFLUENT_ACCOUNT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfluentCloudApi#createConfluentResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}