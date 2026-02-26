// Revoke role from a restriction query returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsRestrictionQueriesApi;
import com.datadog.api.client.v2.model.RelationshipToRole;
import com.datadog.api.client.v2.model.RelationshipToRoleData;
import com.datadog.api.client.v2.model.RolesType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.removeRoleFromRestrictionQuery", true);
    LogsRestrictionQueriesApi apiInstance = new LogsRestrictionQueriesApi(defaultClient);

    // there is a valid "restriction_query" in the system
    String RESTRICTION_QUERY_DATA_ID = System.getenv("RESTRICTION_QUERY_DATA_ID");

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    RelationshipToRole body = new RelationshipToRole()
.data(new RelationshipToRoleData()
.id(ROLE_DATA_ID)
.type(RolesType.ROLES));

    try {
      apiInstance.removeRoleFromRestrictionQuery(RESTRICTION_QUERY_DATA_ID, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsRestrictionQueriesApi#removeRoleFromRestrictionQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}