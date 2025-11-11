// Get all restriction queries for a given user returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsRestrictionQueriesApi;
import com.datadog.api.client.v2.model.RestrictionQueryListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listUserRestrictionQueries", true);
    LogsRestrictionQueriesApi apiInstance = new LogsRestrictionQueriesApi(defaultClient);

    try {
      RestrictionQueryListResponse result = apiInstance.listUserRestrictionQueries("user_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LogsRestrictionQueriesApi#listUserRestrictionQueries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
