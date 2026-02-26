// Update GCP scan options returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.AgentlessScanningApi;
import com.datadog.api.client.v2.model.GcpScanOptions;
import com.datadog.api.client.v2.model.GcpScanOptionsInputUpdate;
import com.datadog.api.client.v2.model.GcpScanOptionsInputUpdateData;
import com.datadog.api.client.v2.model.GcpScanOptionsInputUpdateDataAttributes;
import com.datadog.api.client.v2.model.GcpScanOptionsInputUpdateDataType;
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

    GcpScanOptionsInputUpdate body = new GcpScanOptionsInputUpdate()
.data(new GcpScanOptionsInputUpdateData()
.id("api-spec-test")
.type(GcpScanOptionsInputUpdateDataType.GCP_SCAN_OPTIONS)
.attributes(new GcpScanOptionsInputUpdateDataAttributes()
.vulnContainersOs(false)));

    try {
      GcpScanOptions result = apiInstance.updateGcpScanOptions("api-spec-test", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#updateGcpScanOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}