// Create an API key returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.KeyManagementApi;
import com.datadog.api.client.v2.model.APIKeyResponse;
import com.datadog.api.client.v2.model.APIKeyCreateAttributes;
import com.datadog.api.client.v2.model.APIKeyCreateData;
import com.datadog.api.client.v2.model.APIKeyCreateRequest;
import com.datadog.api.client.v2.model.APIKeysType;
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

    APIKeyCreateRequest body = new APIKeyCreateRequest()
.data(new APIKeyCreateData()
.type(APIKeysType.API_KEYS)
.attributes(new APIKeyCreateAttributes()
.name("Example-Key-Management")));

    try {
      APIKeyResponse result = apiInstance.createAPIKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#createAPIKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}