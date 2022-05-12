// Create an Application key with scopes for current user returns "Created" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.KeyManagementApi;
import com.datadog.api.v2.client.model.ApplicationKeyCreateAttributes;
import com.datadog.api.v2.client.model.ApplicationKeyCreateData;
import com.datadog.api.v2.client.model.ApplicationKeyCreateRequest;
import com.datadog.api.v2.client.model.ApplicationKeyResponse;
import com.datadog.api.v2.client.model.ApplicationKeysType;
import java.util.Arrays;

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
                                "Example-Create_an_Application_key_with_scopes_for_current_user_returns_Created_response")
                            .scopes(
                                Arrays.asList(
                                    "dashboards_read",
                                    "dashboards_write",
                                    "dashboards_public_share"))));

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
