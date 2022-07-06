// Create role returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v2.api.RolesApi;
import com.datadog.api.client.v2.model.RoleCreateAttributes;
import com.datadog.api.client.v2.model.RoleCreateData;
import com.datadog.api.client.v2.model.RoleCreateRequest;
import com.datadog.api.client.v2.model.RoleCreateResponse;
import com.datadog.api.client.v2.model.RolesType;

public class CreateRole {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    RolesApi apiInstance = new RolesApi(defaultClient);

    RoleCreateRequest body =
        new RoleCreateRequest()
            .data(
                new RoleCreateData()
                    .type(RolesType.ROLES)
                    .attributes(
                        new RoleCreateAttributes()
                            .name("Example-Create_role_returns_OK_response")));

    try {
      RoleCreateResponse result = apiInstance.createRole(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#createRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
