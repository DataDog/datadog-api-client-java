// Update a role returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.RolesApi;
import com.datadog.api.v2.client.model.RoleUpdateAttributes;
import com.datadog.api.v2.client.model.RoleUpdateData;
import com.datadog.api.v2.client.model.RoleUpdateRequest;
import com.datadog.api.v2.client.model.RoleUpdateResponse;
import com.datadog.api.v2.client.model.RolesType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    RolesApi apiInstance = new RolesApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ATTRIBUTES_NAME = System.getenv("ROLE_DATA_ATTRIBUTES_NAME");
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    RoleUpdateRequest body =
        new RoleUpdateRequest()
            .data(
                new RoleUpdateData()
                    .id(ROLE_DATA_ID)
                    .type(RolesType.ROLES)
                    .attributes(new RoleUpdateAttributes().name("developers-updated")));

    try {
      RoleUpdateResponse result = apiInstance.updateRole(ROLE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#updateRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
