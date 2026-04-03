// Create a service account access token returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.KeyManagementApi;
import com.datadog.api.client.v2.model.PersonalAccessTokenCreateResponse;
import com.datadog.api.client.v2.model.PersonalAccessTokensType;
import com.datadog.api.client.v2.model.ServiceAccountAccessTokenCreateAttributes;
import com.datadog.api.client.v2.model.ServiceAccountAccessTokenCreateData;
import com.datadog.api.client.v2.model.ServiceAccountAccessTokenCreateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    // there is a valid "service_account_user" in the system
    String SERVICE_ACCOUNT_USER_DATA_ID = System.getenv("SERVICE_ACCOUNT_USER_DATA_ID");

    ServiceAccountAccessTokenCreateRequest body =
        new ServiceAccountAccessTokenCreateRequest()
            .data(
                new ServiceAccountAccessTokenCreateData()
                    .type(PersonalAccessTokensType.PERSONAL_ACCESS_TOKENS)
                    .attributes(
                        new ServiceAccountAccessTokenCreateAttributes()
                            .name("Example-Personal-Access-Token")
                            .scopes(Collections.singletonList("dashboards_read"))));

    try {
      PersonalAccessTokenCreateResponse result =
          apiInstance.createServiceAccountAccessToken(SERVICE_ACCOUNT_USER_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#createServiceAccountAccessToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
