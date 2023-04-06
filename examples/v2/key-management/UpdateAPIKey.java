// Edit an API key returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.KeyManagementApi;
import com.datadog.api.client.v2.model.APIKeyResponse;
import com.datadog.api.client.v2.model.APIKeyUpdateAttributes;
import com.datadog.api.client.v2.model.APIKeyUpdateData;
import com.datadog.api.client.v2.model.APIKeyUpdateRequest;
import com.datadog.api.client.v2.model.APIKeysType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    // there is a valid "api_key" in the system
    String API_KEY_DATA_ID = System.getenv("API_KEY_DATA_ID");

    APIKeyUpdateRequest body =
        new APIKeyUpdateRequest()
            .data(
                new APIKeyUpdateData()
                    .type(APIKeysType.API_KEYS)
                    .id(API_KEY_DATA_ID)
                    .attributes(new APIKeyUpdateAttributes().name("Example-Key-Management")));

    try {
      APIKeyResponse result = apiInstance.updateAPIKey(API_KEY_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#updateAPIKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
