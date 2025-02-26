// Update a WAF exclusion filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApplicationSecurityApi;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterOnMatch;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterType;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterUpdateData;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApplicationSecurityApi apiInstance = new ApplicationSecurityApi(defaultClient);

    // there is a valid "exclusion_filter" in the system
    String EXCLUSION_FILTER_DATA_ID = System.getenv("EXCLUSION_FILTER_DATA_ID");

    ApplicationSecurityWafExclusionFilterUpdateRequest body =
        new ApplicationSecurityWafExclusionFilterUpdateRequest()
            .data(
                new ApplicationSecurityWafExclusionFilterUpdateData()
                    .attributes(
                        new ApplicationSecurityWafExclusionFilterUpdateAttributes()
                            .description("Exclude false positives on a path")
                            .enabled(false)
                            .ipList(Collections.singletonList("198.51.100.72"))
                            .onMatch(ApplicationSecurityWafExclusionFilterOnMatch.MONITOR))
                    .type(ApplicationSecurityWafExclusionFilterType.EXCLUSION_FILTER));

    try {
      ApplicationSecurityWafExclusionFilterResponse result =
          apiInstance.updateApplicationSecurityWafExclusionFilter(EXCLUSION_FILTER_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ApplicationSecurityApi#updateApplicationSecurityWafExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
