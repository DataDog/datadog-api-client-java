// Get specified daily custom reports returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.UsageMeteringApi;
import com.datadog.api.v1.client.model.UsageSpecifiedCustomReportsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("getSpecifiedDailyCustomReports", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageSpecifiedCustomReportsResponse result =
          apiInstance.getSpecifiedDailyCustomReports("2022-03-20");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getSpecifiedDailyCustomReports");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
