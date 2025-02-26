// Get a WAF exclusion filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApplicationSecurityApi;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApplicationSecurityApi apiInstance = new ApplicationSecurityApi(defaultClient);

    // there is a valid "exclusion_filter" in the system
    String EXCLUSION_FILTER_DATA_ID = System.getenv("EXCLUSION_FILTER_DATA_ID");

    try {
      ApplicationSecurityWafExclusionFilterResponse result =
          apiInstance.getApplicationSecurityWafExclusionFilter(EXCLUSION_FILTER_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ApplicationSecurityApi#getApplicationSecurityWafExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
