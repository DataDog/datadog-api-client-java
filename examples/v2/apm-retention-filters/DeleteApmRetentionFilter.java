// Delete a retention filter returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ApmRetentionFiltersApi;
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
    ApmRetentionFiltersApi apiInstance = new ApmRetentionFiltersApi(defaultClient);

    // there is a valid "retention_filter" in the system
    String RETENTION_FILTER_DATA_ID = System.getenv("RETENTION_FILTER_DATA_ID");

    try {
      apiInstance.deleteApmRetentionFilter(RETENTION_FILTER_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApmRetentionFiltersApi#deleteApmRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}