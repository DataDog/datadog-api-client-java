// Create a personal access token returns "Created" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.KeyManagementApi;
import com.datadog.api.client.v2.model.PersonalAccessTokenCreateAttributes;
import com.datadog.api.client.v2.model.PersonalAccessTokenCreateData;
import com.datadog.api.client.v2.model.PersonalAccessTokenCreateRequest;
import com.datadog.api.client.v2.model.PersonalAccessTokenCreateResponse;
import com.datadog.api.client.v2.model.PersonalAccessTokensType;
import java.time.OffsetDateTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    PersonalAccessTokenCreateRequest body =
        new PersonalAccessTokenCreateRequest()
            .data(
                new PersonalAccessTokenCreateData()
                    .type(PersonalAccessTokensType.PERSONAL_ACCESS_TOKENS)
                    .attributes(
                        new PersonalAccessTokenCreateAttributes()
                            .name("Example-Personal-Access-Token")
                            .scopes(Collections.singletonList("dashboards_read"))
                            .expiresAt(OffsetDateTime.now().plusDays(365))));

    try {
      PersonalAccessTokenCreateResponse result = apiInstance.createPersonalAccessToken(body);
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
