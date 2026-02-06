// Create personal access token returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.KeyManagementApi;
import com.datadog.api.client.v2.model.PersonalAccessTokenCreateAttributes;
import com.datadog.api.client.v2.model.PersonalAccessTokenCreateData;
import com.datadog.api.client.v2.model.PersonalAccessTokenCreateRequest;
import com.datadog.api.client.v2.model.PersonalAccessTokenResponse;
import com.datadog.api.client.v2.model.PersonalAccessTokenType;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createPersonalAccessToken", true);
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    PersonalAccessTokenCreateRequest body =
        new PersonalAccessTokenCreateRequest()
            .data(
                new PersonalAccessTokenCreateData()
                    .attributes(
                        new PersonalAccessTokenCreateAttributes()
                            .expiresAt(OffsetDateTime.parse("2025-03-15T10:30:00.000000+00:00"))
                            .name("Example Personal Access Token")
                            .scopes(Arrays.asList("dashboards_read", "monitors_read")))
                    .type(PersonalAccessTokenType.PERSONAL_ACCESS_TOKENS));

    try {
      PersonalAccessTokenResponse result = apiInstance.createPersonalAccessToken(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#createPersonalAccessToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
