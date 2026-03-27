// Delete a WAF exclusion filter returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ApplicationSecurityApi;
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
    ApplicationSecurityApi apiInstance = new ApplicationSecurityApi(defaultClient);

    // there is a valid "exclusion_filter" in the system
    String EXCLUSION_FILTER_DATA_ID = System.getenv("EXCLUSION_FILTER_DATA_ID");

    try {
      apiInstance.deleteApplicationSecurityWafExclusionFilter(EXCLUSION_FILTER_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationSecurityApi#deleteApplicationSecurityWafExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}