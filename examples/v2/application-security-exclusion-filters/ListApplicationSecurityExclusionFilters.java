// List all ASM Exclusion Filters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApplicationSecurityExclusionFiltersApi;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApplicationSecurityExclusionFiltersApi apiInstance =
        new ApplicationSecurityExclusionFiltersApi(defaultClient);

    try {
      ApplicationSecurityExclusionFilterListResponse result =
          apiInstance.listApplicationSecurityExclusionFilters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ApplicationSecurityExclusionFiltersApi#listApplicationSecurityExclusionFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
