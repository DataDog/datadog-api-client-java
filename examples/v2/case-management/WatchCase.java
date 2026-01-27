// Add user as watcher returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.watchCase", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    try {
      apiInstance.watchCase(
          "f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", "8146583c-0b5f-11ec-abf8-da7ad0900001");
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#watchCase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
