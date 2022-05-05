// Delete an Application key returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    // there is a valid "application_key" in the system
    String APPLICATION_KEY_DATA_ID = System.getenv("APPLICATION_KEY_DATA_ID");

    try {
      apiInstance.deleteApplicationKey(APPLICATION_KEY_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#deleteApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
