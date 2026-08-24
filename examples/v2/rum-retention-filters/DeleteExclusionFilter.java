// Delete a RUM exclusion filter returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteExclusionFilter", true);
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    try {
      apiInstance.deleteExclusionFilter("app_id", "ef_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionFiltersApi#deleteExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
