// Delete a RUM exclusion filter returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    // there is a valid "rum_exclusion_filter" in the system
    String RUM_EXCLUSION_FILTER_DATA_ID = System.getenv("RUM_EXCLUSION_FILTER_DATA_ID");

    try {
      apiInstance.deleteExclusionFilter(
          "a33671aa-24fd-4dcd-ba4b-5bbdbafe7690", RUM_EXCLUSION_FILTER_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionFiltersApi#deleteExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
