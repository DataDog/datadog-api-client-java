// Revoke an access token for a service account returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);

    // there is a valid "service_account_user" in the system
    String SERVICE_ACCOUNT_USER_DATA_ID = System.getenv("SERVICE_ACCOUNT_USER_DATA_ID");

    // there is a valid "service_account_access_token" for "service_account_user"
    String SERVICE_ACCOUNT_ACCESS_TOKEN_DATA_ID =
        System.getenv("SERVICE_ACCOUNT_ACCESS_TOKEN_DATA_ID");

    try {
      apiInstance.revokeServiceAccountAccessToken(
          SERVICE_ACCOUNT_USER_DATA_ID, SERVICE_ACCOUNT_ACCESS_TOKEN_DATA_ID);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceAccountsApi#revokeServiceAccountAccessToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
