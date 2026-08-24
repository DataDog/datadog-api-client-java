// Get a RUM exclusion filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RumExclusionFilterResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getExclusionFilter", true);
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    try {
      RumExclusionFilterResponse result = apiInstance.getExclusionFilter("app_id", "ef_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionFiltersApi#getExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
