// Upload Custom Costs file returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CustomCostsFileLineItem;
import com.datadog.api.client.v2.model.CustomCostsFileUploadResponse;
import java.util.Collections;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    List<CustomCostsFileLineItem> body =
        Collections.singletonList(
            new CustomCostsFileLineItem()
                .billedCost(100.5)
                .billingCurrency("USD")
                .chargeDescription("Monthly usage charge for my service")
                .chargePeriodEnd("2023-02-28")
                .chargePeriodStart("2023-02-01"));

    try {
      CustomCostsFileUploadResponse result = apiInstance.uploadCustomCostsFile(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#uploadCustomCostsFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
