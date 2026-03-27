// Get a change request returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ChangeManagementApi;
import com.datadog.api.client.v2.model.ChangeRequestResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getChangeRequest", true);
    ChangeManagementApi apiInstance = new ChangeManagementApi(defaultClient);

    try {
      ChangeRequestResponse result = apiInstance.getChangeRequest("CHM-1234");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeManagementApi#getChangeRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
