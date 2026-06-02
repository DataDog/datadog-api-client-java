// Get a hardcoded retention filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersHardcodedApi;
import com.datadog.api.client.v2.model.RumHardcodedRetentionFilterResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionFiltersHardcodedApi apiInstance =
        new RumRetentionFiltersHardcodedApi(defaultClient);

    try {
      RumHardcodedRetentionFilterResponse result =
          apiInstance.getHardcodedRetentionFilter(
              "Example-RUM-Retention-Filters-Hardcoded", "Example-RUM-Retention-Filters-Hardcoded");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumRetentionFiltersHardcodedApi#getHardcodedRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
