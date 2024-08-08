// Update Fastly service returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.FastlyIntegrationApi;
import com.datadog.api.client.v2.model.FastlyServiceResponse;
import com.datadog.api.client.v2.model.FastlyServiceAttributes;
import com.datadog.api.client.v2.model.FastlyServiceData;
import com.datadog.api.client.v2.model.FastlyServiceRequest;
import com.datadog.api.client.v2.model.FastlyServiceType;
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
    FastlyIntegrationApi apiInstance = new FastlyIntegrationApi(defaultClient);

    FastlyServiceRequest body = new FastlyServiceRequest()
.data(new FastlyServiceData()
.attributes(new FastlyServiceAttributes()
.tags(Arrays.asList("myTag", "myTag2:myValue")))
.id("abc123")
.type(FastlyServiceType.FASTLY_SERVICES));

    try {
      FastlyServiceResponse result = apiInstance.updateFastlyService("account_id", "service_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FastlyIntegrationApi#updateFastlyService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}