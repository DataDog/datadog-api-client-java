// Create an Application key for current user returns "Created" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.KeyManagementApi;
import com.datadog.api.v2.client.model.ApplicationKeyCreateAttributes;
import com.datadog.api.v2.client.model.ApplicationKeyCreateData;
import com.datadog.api.v2.client.model.ApplicationKeyCreateRequest;
import com.datadog.api.v2.client.model.ApplicationKeyResponse;
import com.datadog.api.v2.client.model.ApplicationKeysType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    ApplicationKeyCreateRequest body =
        new ApplicationKeyCreateRequest()
            .data(
                new ApplicationKeyCreateData()
                    .type(ApplicationKeysType.APPLICATION_KEYS)
                    .attributes(
                        new ApplicationKeyCreateAttributes()
                            .name(
                                "Example-Create_an_Application_key_for_current_user_returns_Created_response")));

    try {
      ApplicationKeyResponse result = apiInstance.createCurrentUserApplicationKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#createCurrentUserApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
