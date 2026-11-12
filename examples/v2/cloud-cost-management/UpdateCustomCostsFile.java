// Update Custom Costs file returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CustomCostsFileUpdateAttributes;
import com.datadog.api.client.v2.model.CustomCostsFileUpdateData;
import com.datadog.api.client.v2.model.CustomCostsFileUpdateRequest;
import com.datadog.api.client.v2.model.CustomCostsFileUpdateType;
import com.datadog.api.client.v2.model.CustomCostsFileUploadResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    // there is a valid "custom_costs_file" in the system
    String CUSTOM_COSTS_FILE_DATA_ID = System.getenv("CUSTOM_COSTS_FILE_DATA_ID");

    CustomCostsFileUpdateRequest body =
        new CustomCostsFileUpdateRequest()
            .data(
                new CustomCostsFileUpdateData()
                    .attributes(new CustomCostsFileUpdateAttributes().aiProvider(true))
                    .id(CUSTOM_COSTS_FILE_DATA_ID)
                    .type(CustomCostsFileUpdateType.COST_METADATA));

    try {
      CustomCostsFileUploadResponse result =
          apiInstance.updateCustomCostsFile(CUSTOM_COSTS_FILE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#updateCustomCostsFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
