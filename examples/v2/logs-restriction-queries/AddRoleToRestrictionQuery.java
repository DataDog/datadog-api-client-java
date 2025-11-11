// Grant role to a restriction query returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsRestrictionQueriesApi;
import com.datadog.api.client.v2.model.RelationshipToRole;
import com.datadog.api.client.v2.model.RelationshipToRoleData;
import com.datadog.api.client.v2.model.RolesType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.addRoleToRestrictionQuery", true);
    LogsRestrictionQueriesApi apiInstance = new LogsRestrictionQueriesApi(defaultClient);

    RelationshipToRole body =
        new RelationshipToRole()
            .data(
                new RelationshipToRoleData()
                    .id("3653d3c6-0c75-11ea-ad28-fb5701eabc7d")
                    .type(RolesType.ROLES));

    try {
      apiInstance.addRoleToRestrictionQuery("restriction_query_id", body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LogsRestrictionQueriesApi#addRoleToRestrictionQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
