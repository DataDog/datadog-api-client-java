// Delete a restriction query returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsRestrictionQueriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteRestrictionQuery", true);
    LogsRestrictionQueriesApi apiInstance = new LogsRestrictionQueriesApi(defaultClient);

    // there is a valid "restriction_query" in the system
    String RESTRICTION_QUERY_DATA_ID = System.getenv("RESTRICTION_QUERY_DATA_ID");

    try {
      apiInstance.deleteRestrictionQuery(RESTRICTION_QUERY_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsRestrictionQueriesApi#deleteRestrictionQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
