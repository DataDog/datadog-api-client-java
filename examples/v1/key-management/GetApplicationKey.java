// Get an application key returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.KeyManagementApi;
import com.datadog.api.client.v1.model.ApplicationKeyResponse;
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

    try {
      ApplicationKeyResponse result = apiInstance.getApplicationKey("key");
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