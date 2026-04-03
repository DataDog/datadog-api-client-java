// Update a personal access token returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.KeyManagementApi;
import com.datadog.api.client.v2.model.PersonalAccessTokenResponse;
import com.datadog.api.client.v2.model.PersonalAccessTokenUpdateAttributes;
import com.datadog.api.client.v2.model.PersonalAccessTokenUpdateData;
import com.datadog.api.client.v2.model.PersonalAccessTokenUpdateRequest;
import com.datadog.api.client.v2.model.PersonalAccessTokensType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    // there is a valid "personal_access_token" in the system
    String PERSONAL_ACCESS_TOKEN_DATA_ID = System.getenv("PERSONAL_ACCESS_TOKEN_DATA_ID");

    PersonalAccessTokenUpdateRequest body =
        new PersonalAccessTokenUpdateRequest()
            .data(
                new PersonalAccessTokenUpdateData()
                    .type(PersonalAccessTokensType.PERSONAL_ACCESS_TOKENS)
                    .id(PERSONAL_ACCESS_TOKEN_DATA_ID)
                    .attributes(
                        new PersonalAccessTokenUpdateAttributes()
                            .name("Example-Personal-Access-Token-updated")));

    try {
      PersonalAccessTokenResponse result =
          apiInstance.updatePersonalAccessToken(PERSONAL_ACCESS_TOKEN_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#updatePersonalAccessToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
