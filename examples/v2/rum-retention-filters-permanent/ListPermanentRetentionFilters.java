// Get all permanent retention filters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersPermanentApi;
import com.datadog.api.client.v2.model.RumPermanentRetentionFiltersResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionFiltersPermanentApi apiInstance =
        new RumRetentionFiltersPermanentApi(defaultClient);

    try {
      RumPermanentRetentionFiltersResponse result =
          apiInstance.listPermanentRetentionFilters("1d4b9c34-7ac4-423a-91cf-9902d926e9b3");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumRetentionFiltersPermanentApi#listPermanentRetentionFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
