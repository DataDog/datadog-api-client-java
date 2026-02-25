// Create GCP scan options returns "Agentless scan options enabled successfully." response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.AgentlessScanningApi;
import com.datadog.api.client.v2.model.GcpScanOptions;
import com.datadog.api.client.v2.model.GcpScanOptions;
import com.datadog.api.client.v2.model.GcpScanOptionsData;
import com.datadog.api.client.v2.model.GcpScanOptionsDataAttributes;
import com.datadog.api.client.v2.model.GcpScanOptionsDataType;
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

    GcpScanOptions body = new GcpScanOptions()
.data(new GcpScanOptionsData()
.id("new-project")
.type(GcpScanOptionsDataType.GCP_SCAN_OPTIONS)
.attributes(new GcpScanOptionsDataAttributes()
.vulnHostOs(true)
.vulnContainersOs(true)));

    try {
      GcpScanOptions result = apiInstance.createGcpScanOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#createGcpScanOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}