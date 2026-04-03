// Update an access token for a service account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceAccountsApi;
import com.datadog.api.client.v2.model.PersonalAccessTokenResponse;
import com.datadog.api.client.v2.model.PersonalAccessTokenUpdateAttributes;
import com.datadog.api.client.v2.model.PersonalAccessTokenUpdateData;
import com.datadog.api.client.v2.model.PersonalAccessTokenUpdateRequest;
import com.datadog.api.client.v2.model.PersonalAccessTokensType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);

    // there is a valid "service_account_user" in the system
    String SERVICE_ACCOUNT_USER_DATA_ID = System.getenv("SERVICE_ACCOUNT_USER_DATA_ID");

    // there is a valid "service_account_access_token" for "service_account_user"
    String SERVICE_ACCOUNT_ACCESS_TOKEN_DATA_ATTRIBUTES_NAME =
        System.getenv("SERVICE_ACCOUNT_ACCESS_TOKEN_DATA_ATTRIBUTES_NAME");
    String SERVICE_ACCOUNT_ACCESS_TOKEN_DATA_ID =
        System.getenv("SERVICE_ACCOUNT_ACCESS_TOKEN_DATA_ID");

    PersonalAccessTokenUpdateRequest body =
        new PersonalAccessTokenUpdateRequest()
            .data(
                new PersonalAccessTokenUpdateData()
                    .id(SERVICE_ACCOUNT_ACCESS_TOKEN_DATA_ID)
                    .type(PersonalAccessTokensType.PERSONAL_ACCESS_TOKENS)
                    .attributes(
                        new PersonalAccessTokenUpdateAttributes()
                            .name("My Personal Access Token-updated")));

    try {
      PersonalAccessTokenResponse result =
          apiInstance.updateServiceAccountAccessToken(
              SERVICE_ACCOUNT_USER_DATA_ID, SERVICE_ACCOUNT_ACCESS_TOKEN_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceAccountsApi#updateServiceAccountAccessToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
