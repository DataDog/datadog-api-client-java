// Get an archive configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumManagedArchivesApi;
import com.datadog.api.client.v2.model.RumArchiveConfigResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumManagedArchivesApi apiInstance = new RumManagedArchivesApi(defaultClient);

    try {
      RumArchiveConfigResponse result =
          apiInstance.getRUMArchiveConfig(UUID.fromString("a33671aa-24fd-4dcd-ba4b-5bbdbafe7690"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumManagedArchivesApi#getRUMArchiveConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
