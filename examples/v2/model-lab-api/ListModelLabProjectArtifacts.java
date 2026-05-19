// List Model Lab project artifacts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ModelLabApiApi;
import com.datadog.api.client.v2.model.ModelLabProjectArtifactsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listModelLabProjectArtifacts", true);
    ModelLabApiApi apiInstance = new ModelLabApiApi(defaultClient);

    try {
      ModelLabProjectArtifactsResponse result = apiInstance.listModelLabProjectArtifacts(2387L);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelLabApiApi#listModelLabProjectArtifacts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
