// List governance control detections returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceControlsApi;
import com.datadog.api.client.v2.model.GovernanceControlDetectionsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listGovernanceControlDetections", true);
    GovernanceControlsApi apiInstance = new GovernanceControlsApi(defaultClient);

    try {
      GovernanceControlDetectionsResponse result =
          apiInstance.listGovernanceControlDetections("unused_api_keys");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GovernanceControlsApi#listGovernanceControlDetections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
