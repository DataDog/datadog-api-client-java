// List roles for a restriction query returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsRestrictionQueriesApi;
import com.datadog.api.client.v2.model.RestrictionQueryRolesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listRestrictionQueryRoles", true);
    LogsRestrictionQueriesApi apiInstance = new LogsRestrictionQueriesApi(defaultClient);

    // there is a valid "restriction_query" in the system
    String RESTRICTION_QUERY_DATA_ID = System.getenv("RESTRICTION_QUERY_DATA_ID");

    try {
      RestrictionQueryRolesResponse result =
          apiInstance.listRestrictionQueryRoles(RESTRICTION_QUERY_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LogsRestrictionQueriesApi#listRestrictionQueryRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
