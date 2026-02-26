// Get all RUM retention filters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RumRetentionFiltersResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    try {
      RumRetentionFiltersResponse result =
          apiInstance.listRetentionFilters("1d4b9c34-7ac4-423a-91cf-9902d926e9b3");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionFiltersApi#listRetentionFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
