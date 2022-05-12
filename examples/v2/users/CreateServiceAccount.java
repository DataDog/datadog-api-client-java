// Create a service account returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.UsersApi;
import com.datadog.api.v2.client.model.RelationshipToRoleData;
import com.datadog.api.v2.client.model.RelationshipToRoles;
import com.datadog.api.v2.client.model.RolesType;
import com.datadog.api.v2.client.model.ServiceAccountCreateAttributes;
import com.datadog.api.v2.client.model.ServiceAccountCreateData;
import com.datadog.api.v2.client.model.ServiceAccountCreateRequest;
import com.datadog.api.v2.client.model.UserRelationships;
import com.datadog.api.v2.client.model.UserResponse;
import com.datadog.api.v2.client.model.UsersType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    ServiceAccountCreateRequest body =
        new ServiceAccountCreateRequest()
            .data(
                new ServiceAccountCreateData()
                    .type(UsersType.USERS)
                    .attributes(
                        new ServiceAccountCreateAttributes()
                            .name("Test API Client")
                            .email(
                                "Example-Create_a_service_account_returns_OK_response@datadoghq.com")
                            .serviceAccount(true))
                    .relationships(
                        new UserRelationships()
                            .roles(
                                new RelationshipToRoles()
                                    .data(
                                        Collections.singletonList(
                                            new RelationshipToRoleData()
                                                .id(ROLE_DATA_ID)
                                                .type(RolesType.ROLES))))));

    try {
      UserResponse result = apiInstance.createServiceAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createServiceAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
