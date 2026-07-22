// Get pup bump test resource returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.PupBumpTestApi;
import com.datadog.api.client.v2.model.PupBumpTestResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getPupBumpTest", true);
    PupBumpTestApi apiInstance = new PupBumpTestApi(defaultClient);

    try {
      PupBumpTestResponse result = apiInstance.getPupBumpTest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PupBumpTestApi#getPupBumpTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
