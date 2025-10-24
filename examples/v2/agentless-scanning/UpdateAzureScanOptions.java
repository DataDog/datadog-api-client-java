// Update Azure scan options returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentlessScanningApi;
import com.datadog.api.client.v2.model.AzureScanOptions;
import com.datadog.api.client.v2.model.AzureScanOptionsInputUpdate;
import com.datadog.api.client.v2.model.AzureScanOptionsInputUpdateData;
import com.datadog.api.client.v2.model.AzureScanOptionsInputUpdateDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AgentlessScanningApi apiInstance = new AgentlessScanningApi(defaultClient);

    AzureScanOptionsInputUpdate body =
        new AzureScanOptionsInputUpdate()
            .data(
                new AzureScanOptionsInputUpdateData()
                    .id("12345678-90ab-cdef-1234-567890abcdef")
                    .type(AzureScanOptionsInputUpdateDataType.AZURE_SCAN_OPTIONS));

    try {
      AzureScanOptions result =
          apiInstance.updateAzureScanOptions("12345678-90ab-cdef-1234-567890abcdef", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#updateAzureScanOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
