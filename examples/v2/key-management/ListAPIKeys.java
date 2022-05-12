// Get all API keys returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.KeyManagementApi;
import com.datadog.api.v2.client.api.KeyManagementApi.ListAPIKeysOptionalParameters;
import com.datadog.api.v2.client.model.APIKeysResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    // there is a valid "api_key" in the system
    String API_KEY_DATA_ATTRIBUTES_NAME = System.getenv("API_KEY_DATA_ATTRIBUTES_NAME");

    try {
      APIKeysResponse result =
          apiInstance.listAPIKeys(
              new ListAPIKeysOptionalParameters().filter(API_KEY_DATA_ATTRIBUTES_NAME));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#listAPIKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
