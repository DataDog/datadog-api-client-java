// Delete an app key owned by this service account returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v2.api.ServiceAccountsApi;

public class DeleteServiceAccountApplicationKey_992091161 {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);

    // there is a valid "service_account_user" in the system
    String SERVICE_ACCOUNT_USER_DATA_ID = System.getenv("SERVICE_ACCOUNT_USER_DATA_ID");

    // there is a valid "service_account_application_key" for "service_account_user"
    String SERVICE_ACCOUNT_APPLICATION_KEY_DATA_ID =
        System.getenv("SERVICE_ACCOUNT_APPLICATION_KEY_DATA_ID");

    try {
      apiInstance.deleteServiceAccountApplicationKey(
          SERVICE_ACCOUNT_USER_DATA_ID, SERVICE_ACCOUNT_APPLICATION_KEY_DATA_ID);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceAccountsApi#deleteServiceAccountApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
