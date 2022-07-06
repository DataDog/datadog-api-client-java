// List permissions returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v2.api.RolesApi;
import com.datadog.api.client.v2.model.PermissionsResponse;

public class ListPermissions {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    RolesApi apiInstance = new RolesApi(defaultClient);

    try {
      PermissionsResponse result = apiInstance.listPermissions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#listPermissions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
