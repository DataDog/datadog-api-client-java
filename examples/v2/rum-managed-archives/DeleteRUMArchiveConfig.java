// Delete an archive configuration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumManagedArchivesApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumManagedArchivesApi apiInstance = new RumManagedArchivesApi(defaultClient);

    try {
      apiInstance.deleteRUMArchiveConfig(UUID.fromString("a33671aa-24fd-4dcd-ba4b-5bbdbafe7690"));
    } catch (ApiException e) {
      System.err.println("Exception when calling RumManagedArchivesApi#deleteRUMArchiveConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
