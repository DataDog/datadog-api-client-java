// Get all API keys returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.KeyManagementApi;
import com.datadog.api.client.v2.api.KeyManagementApi.ListAPIKeysOptionalParameters;
import com.datadog.api.client.v2.model.APIKeysResponse;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    // there is a valid "api_key" in the system
    String API_KEY_DATA_ATTRIBUTES_NAME = System.getenv("API_KEY_DATA_ATTRIBUTES_NAME");

    try {
      APIKeysResponse result = apiInstance.listAPIKeys(new ListAPIKeysOptionalParameters().filter(API_KEY_DATA_ATTRIBUTES_NAME));
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