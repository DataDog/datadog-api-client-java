// Add project to favorites returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.favoriteProject", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    try {
      apiInstance.favoriteProject("e555e290-ed65-49bd-ae18-8acbfcf18db7");
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#favoriteProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
