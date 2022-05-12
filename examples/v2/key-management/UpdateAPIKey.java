// Edit an API key returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.KeyManagementApi;
import com.datadog.api.v2.client.model.APIKeyResponse;
import com.datadog.api.v2.client.model.APIKeyUpdateAttributes;
import com.datadog.api.v2.client.model.APIKeyUpdateData;
import com.datadog.api.v2.client.model.APIKeyUpdateRequest;
import com.datadog.api.v2.client.model.APIKeysType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    // there is a valid "api_key" in the system
    String API_KEY_DATA_ID = System.getenv("API_KEY_DATA_ID");

    APIKeyUpdateRequest body =
        new APIKeyUpdateRequest()
            .data(
                new APIKeyUpdateData()
                    .type(APIKeysType.API_KEYS)
                    .id(API_KEY_DATA_ID)
                    .attributes(
                        new APIKeyUpdateAttributes()
                            .name("Example-Edit_an_API_key_returns_OK_response")));

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
