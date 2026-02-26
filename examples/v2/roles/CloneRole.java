// Create a new role by cloning an existing role returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RolesApi;
import com.datadog.api.client.v2.model.RoleClone;
import com.datadog.api.client.v2.model.RoleCloneAttributes;
import com.datadog.api.client.v2.model.RoleCloneRequest;
import com.datadog.api.client.v2.model.RoleResponse;
import com.datadog.api.client.v2.model.RolesType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RolesApi apiInstance = new RolesApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    RoleCloneRequest body =
        new RoleCloneRequest()
            .data(
                new RoleClone()
                    .attributes(new RoleCloneAttributes().name("Example-Role clone"))
                    .type(RolesType.ROLES));

    try {
      RoleResponse result = apiInstance.cloneRole(ROLE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#cloneRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
