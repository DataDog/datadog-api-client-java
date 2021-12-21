// Create an API key returns "Created" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.KeyManagementApi;
import com.datadog.api.v2.client.model.APIKeyCreateAttributes;
import com.datadog.api.v2.client.model.APIKeyCreateData;
import com.datadog.api.v2.client.model.APIKeyCreateRequest;
import com.datadog.api.v2.client.model.APIKeyResponse;
import com.datadog.api.v2.client.model.APIKeysType;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    APIKeyCreateRequest body =
        new APIKeyCreateRequest()
            .data(
                new APIKeyCreateData()
                    .type(APIKeysType.API_KEYS)
                    .attributes(
                        new APIKeyCreateAttributes()
                            .name("Example-Create_an_API_key_returns_Created_response")));

    try {
      APIKeyResponse result = apiInstance.createAPIKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
