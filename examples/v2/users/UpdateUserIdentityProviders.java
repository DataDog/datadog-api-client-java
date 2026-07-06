// Update identity provider overrides for a user returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsersApi;
import com.datadog.api.client.v2.model.UpdateUserIdentityProvidersRequest;
import com.datadog.api.client.v2.model.UserRelationshipIdentityProviderData;
import com.datadog.api.client.v2.model.UserRelationshipIdentityProviderDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    UpdateUserIdentityProvidersRequest body =
        new UpdateUserIdentityProvidersRequest()
            .data(
                Collections.singletonList(
                    new UserRelationshipIdentityProviderData()
                        .id("00000000-0000-0000-0000-000000000001")
                        .type(UserRelationshipIdentityProviderDataType.IDENTITY_PROVIDERS)));

    try {
      apiInstance.updateUserIdentityProviders("00000000-0000-9999-0000-000000000000", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserIdentityProviders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
