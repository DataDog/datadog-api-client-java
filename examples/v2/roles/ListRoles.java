// List roles returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.RolesApi;
import com.datadog.api.v2.client.api.RolesApi.ListRolesOptionalParameters;
import com.datadog.api.v2.client.model.RolesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    RolesApi apiInstance = new RolesApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ATTRIBUTES_NAME = System.getenv("ROLE_DATA_ATTRIBUTES_NAME");

    try {
      RolesResponse result =
          apiInstance.listRoles(
              new ListRolesOptionalParameters().filter(ROLE_DATA_ATTRIBUTES_NAME));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#listRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
