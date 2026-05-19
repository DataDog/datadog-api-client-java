// Get a Model Lab run returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ModelLabApiApi;
import com.datadog.api.client.v2.model.ModelLabRunResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getModelLabRun", true);
    ModelLabApiApi apiInstance = new ModelLabApiApi(defaultClient);

    try {
      ModelLabRunResponse result = apiInstance.getModelLabRun(70158L);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelLabApiApi#getModelLabRun");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
