// Get Vercel configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.VercelApi;
import com.datadog.api.client.v2.model.VercelConfigResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    VercelApi apiInstance = new VercelApi(defaultClient);

    try {
      VercelConfigResponse result = apiInstance.getVercelConfig("icfg_abc123");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VercelApi#getVercelConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
