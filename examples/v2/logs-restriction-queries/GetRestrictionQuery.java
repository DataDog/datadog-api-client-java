// Get a restriction query returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsRestrictionQueriesApi;
import com.datadog.api.client.v2.model.RestrictionQueryWithRelationshipsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getRestrictionQuery", true);
    LogsRestrictionQueriesApi apiInstance = new LogsRestrictionQueriesApi(defaultClient);

    try {
      RestrictionQueryWithRelationshipsResponse result =
          apiInstance.getRestrictionQuery("restriction_query_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsRestrictionQueriesApi#getRestrictionQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
