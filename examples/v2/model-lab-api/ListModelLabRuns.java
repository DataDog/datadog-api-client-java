// List Model Lab runs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ModelLabApiApi;
import com.datadog.api.client.v2.model.ModelLabRunsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listModelLabRuns", true);
    ModelLabApiApi apiInstance = new ModelLabApiApi(defaultClient);

    try {
      ModelLabRunsResponse result = apiInstance.listModelLabRuns();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelLabApiApi#listModelLabRuns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
