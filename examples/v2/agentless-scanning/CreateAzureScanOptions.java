// Create Azure scan options returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.AgentlessScanningApi;
import com.datadog.api.client.v2.model.AzureScanOptions;
import com.datadog.api.client.v2.model.AzureScanOptions;
import com.datadog.api.client.v2.model.AzureScanOptionsData;
import com.datadog.api.client.v2.model.AzureScanOptionsDataAttributes;
import com.datadog.api.client.v2.model.AzureScanOptionsDataType;
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
    AgentlessScanningApi apiInstance = new AgentlessScanningApi(defaultClient);

    AzureScanOptions body = new AzureScanOptions()
.data(new AzureScanOptionsData()
.attributes(new AzureScanOptionsDataAttributes()
.vulnContainersOs(true)
.vulnHostOs(true))
.id("12345678-90ab-cdef-1234-567890abcdef")
.type(AzureScanOptionsDataType.AZURE_SCAN_OPTIONS));

    try {
      AzureScanOptions result = apiInstance.createAzureScanOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#createAzureScanOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}