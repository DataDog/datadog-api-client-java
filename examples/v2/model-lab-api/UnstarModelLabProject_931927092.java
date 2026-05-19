// Unstar a Model Lab project returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ModelLabApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.unstarModelLabProject", true);
    ModelLabApiApi apiInstance = new ModelLabApiApi(defaultClient);

    try {
      apiInstance.unstarModelLabProject(2387L);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelLabApiApi#unstarModelLabProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
