// List application keys for this service account returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.ServiceAccountsApi;
import com.datadog.api.v2.client.model.ListApplicationKeysResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);

    try {
      ListApplicationKeysResponse result =
          apiInstance.listServiceAccountApplicationKeys("00000000-0000-1234-0000-000000000000");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceAccountsApi#listServiceAccountApplicationKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
