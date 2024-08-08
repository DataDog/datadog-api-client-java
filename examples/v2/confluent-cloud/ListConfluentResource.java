// List Confluent Account resources returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ConfluentCloudApi;
import com.datadog.api.client.v2.model.ConfluentResourcesResponse;
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

    try {
      ConfluentResourcesResponse result = apiInstance.listConfluentResource("account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfluentCloudApi#listConfluentResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}