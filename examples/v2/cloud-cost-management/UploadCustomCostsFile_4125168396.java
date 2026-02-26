// Upload Custom Costs File returns "Accepted" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CustomCostsFileUploadResponse;
import com.datadog.api.client.v2.model.CustomCostsFileLineItem;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    List<CustomCostsFileLineItem> body = Collections.singletonList(new CustomCostsFileLineItem()
.providerName("my_provider")
.chargePeriodStart("2023-05-06")
.chargePeriodEnd("2023-06-06")
.chargeDescription("my_description")
.billedCost(250.0)
.billingCurrency("USD")
.tags(Map.ofEntries(Map.entry("key", "value"))));

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