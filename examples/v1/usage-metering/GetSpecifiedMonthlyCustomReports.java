// Get specified monthly custom reports returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.UsageMeteringApi;
import com.datadog.api.v1.client.model.UsageSpecifiedCustomReportsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("getSpecifiedMonthlyCustomReports", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageSpecifiedCustomReportsResponse result =
          apiInstance.getSpecifiedMonthlyCustomReports("2021-05-01");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling UsageMeteringApi#getSpecifiedMonthlyCustomReports");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
