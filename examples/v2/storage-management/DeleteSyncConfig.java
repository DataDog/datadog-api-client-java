// Delete a Storage Management configuration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StorageManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StorageManagementApi apiInstance = new StorageManagementApi(defaultClient);

    try {
      apiInstance.deleteSyncConfig("abc123");
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageManagementApi#deleteSyncConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
