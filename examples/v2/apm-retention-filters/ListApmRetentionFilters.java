// List all APM retention filters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApmRetentionFiltersApi;
import com.datadog.api.client.v2.model.RetentionFiltersResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApmRetentionFiltersApi apiInstance = new ApmRetentionFiltersApi(defaultClient);

    try {
      RetentionFiltersResponse result = apiInstance.listApmRetentionFilters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApmRetentionFiltersApi#listApmRetentionFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
