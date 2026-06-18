// Get a RUM SDK configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRemoteConfigApi;
import com.datadog.api.client.v2.model.RumSdkConfigResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getRumSdkConfig", true);
    RumRemoteConfigApi apiInstance = new RumRemoteConfigApi(defaultClient);

    try {
      RumSdkConfigResponse result =
          apiInstance.getRumSdkConfig("abc12345-1234-5678-abcd-ef1234567890");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRemoteConfigApi#getRumSdkConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
