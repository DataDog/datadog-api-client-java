// Update client token returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.KeyManagementApi;
import com.datadog.api.client.v1.model.ClientToken;
import com.datadog.api.client.v1.model.ClientTokenUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v1.updateClientToken", true);
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    ClientTokenUpdateRequest body =
        new ClientTokenUpdateRequest()
            .hash("1234567890abcdef1234567890abcdef123")
            .name("Updated Client Token Name")
            .originUrls(Collections.singletonList("https://example.com"));

    try {
      ClientToken result = apiInstance.updateClientToken(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#updateClientToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
