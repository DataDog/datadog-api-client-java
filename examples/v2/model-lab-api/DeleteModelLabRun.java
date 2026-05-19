// Delete a Model Lab run returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ModelLabApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteModelLabRun", true);
    ModelLabApiApi apiInstance = new ModelLabApiApi(defaultClient);

    try {
      apiInstance.deleteModelLabRun(70158L);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelLabApiApi#deleteModelLabRun");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
