// Edit an application key returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.KeyManagementApi;
import com.datadog.api.v1.client.model.ApplicationKey;
import com.datadog.api.v1.client.model.ApplicationKeyResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    ApplicationKey body = new ApplicationKey().name("example user");

    try {
      ApplicationKeyResponse result = apiInstance.updateApplicationKey("key", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#updateApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
