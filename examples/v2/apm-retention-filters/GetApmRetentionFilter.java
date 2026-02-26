// Get a given APM retention filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApmRetentionFiltersApi;
import com.datadog.api.client.v2.model.RetentionFilterResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApmRetentionFiltersApi apiInstance = new ApmRetentionFiltersApi(defaultClient);

    // there is a valid "retention_filter" in the system
    String RETENTION_FILTER_DATA_ID = System.getenv("RETENTION_FILTER_DATA_ID");

    try {
      RetentionFilterResponse result = apiInstance.getApmRetentionFilter(RETENTION_FILTER_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApmRetentionFiltersApi#getApmRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
