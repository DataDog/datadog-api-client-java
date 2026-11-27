// Delete an archive configuration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumManagedArchivesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumManagedArchivesApi apiInstance = new RumManagedArchivesApi(defaultClient);

    // there is a valid "rum_application" in the system
    String RUM_APPLICATION_DATA_ID = System.getenv("RUM_APPLICATION_DATA_ID");

    try {
      apiInstance.deleteRUMArchiveConfig(RUM_APPLICATION_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumManagedArchivesApi#deleteRUMArchiveConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
