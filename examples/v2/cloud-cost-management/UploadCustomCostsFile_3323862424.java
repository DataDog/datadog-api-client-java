// Upload Custom Costs file marked as an AI provider file returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.api.CloudCostManagementApi.UploadCustomCostsFileOptionalParameters;
import com.datadog.api.client.v2.model.CustomCostsFileLineItem;
import com.datadog.api.client.v2.model.CustomCostsFileUploadResponse;
import java.util.Collections;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    List<CustomCostsFileLineItem> body =
        Collections.singletonList(
            new CustomCostsFileLineItem()
                .providerName("my_ai_provider")
                .chargePeriodStart("2023-05-06")
                .chargePeriodEnd("2023-06-06")
                .chargeDescription("my_description")
                .billedCost(250.0)
                .billingCurrency("USD"));

    try {
      CustomCostsFileUploadResponse result =
          apiInstance.uploadCustomCostsFile(
              body, new UploadCustomCostsFileOptionalParameters().aiProvider(true));
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
