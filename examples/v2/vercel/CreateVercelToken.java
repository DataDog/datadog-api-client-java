// Create Vercel access token returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.VercelApi;
import com.datadog.api.client.v2.model.VercelTokenCreateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    VercelApi apiInstance = new VercelApi(defaultClient);

    VercelTokenCreateRequest body =
        new VercelTokenCreateRequest().authGrantCode("code").vercelConfigurationId("icfg_abc123");

    try {
      apiInstance.createVercelToken(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling VercelApi#createVercelToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
