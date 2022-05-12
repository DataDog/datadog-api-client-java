// Get one app key owned by this service account returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.ServiceAccountsApi;
import com.datadog.api.v2.client.model.PartialApplicationKeyResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);

    // there is a valid "service_account_user" in the system
    String SERVICE_ACCOUNT_USER_DATA_ID = System.getenv("SERVICE_ACCOUNT_USER_DATA_ID");

    // there is a valid "service_account_application_key" for "service_account_user"
    String SERVICE_ACCOUNT_APPLICATION_KEY_DATA_ID =
        System.getenv("SERVICE_ACCOUNT_APPLICATION_KEY_DATA_ID");

    try {
      PartialApplicationKeyResponse result =
          apiInstance.getServiceAccountApplicationKey(
              SERVICE_ACCOUNT_USER_DATA_ID, SERVICE_ACCOUNT_APPLICATION_KEY_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceAccountsApi#getServiceAccountApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
