// Delete a ASM Exclusion Filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AsmExclusionFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AsmExclusionFiltersApi apiInstance = new AsmExclusionFiltersApi(defaultClient);

    try {
      apiInstance.deleteASMExclusionFilter("exclusion_filter_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling AsmExclusionFiltersApi#deleteASMExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
