// Update personal access token returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.KeyManagementApi;
import com.datadog.api.client.v2.model.PersonalAccessTokenGetResponse;
import com.datadog.api.client.v2.model.PersonalAccessTokenType;
import com.datadog.api.client.v2.model.PersonalAccessTokenUpdateAttributes;
import com.datadog.api.client.v2.model.PersonalAccessTokenUpdateData;
import com.datadog.api.client.v2.model.PersonalAccessTokenUpdateRequest;
import java.util.Arrays;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updatePersonalAccessToken", true);
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    PersonalAccessTokenUpdateRequest body =
        new PersonalAccessTokenUpdateRequest()
            .data(
                new PersonalAccessTokenUpdateData()
                    .attributes(
                        new PersonalAccessTokenUpdateAttributes()
                            .name("Updated Personal Access Token Name")
                            .scopes(Arrays.asList("dashboards_read", "dashboards_write")))
                    .id(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                    .type(PersonalAccessTokenType.PERSONAL_ACCESS_TOKENS));

    try {
      PersonalAccessTokenGetResponse result =
          apiInstance.updatePersonalAccessToken(
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"), body);
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
