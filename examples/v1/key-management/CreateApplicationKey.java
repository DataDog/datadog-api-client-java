// Create an application key returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.KeyManagementApi;
import com.datadog.api.client.v1.model.ApplicationKey;
import com.datadog.api.client.v1.model.ApplicationKeyResponse;

public class CreateApplicationKey {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    ApplicationKey body = new ApplicationKey().name("example user");

    try {
      ApplicationKeyResponse result = apiInstance.createApplicationKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#createApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
