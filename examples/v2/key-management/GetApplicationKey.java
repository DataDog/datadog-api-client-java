// Get an application key returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.KeyManagementApi;
import com.datadog.api.client.v2.model.ApplicationKeyResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    // there is a valid "application_key" in the system
    String APPLICATION_KEY_DATA_ID = System.getenv("APPLICATION_KEY_DATA_ID");

    try {
      ApplicationKeyResponse result = apiInstance.getApplicationKey(APPLICATION_KEY_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#getApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
