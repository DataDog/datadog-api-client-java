// Update a critical asset returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetType;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetUpdateRequest;
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
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "critical_asset" in the system
    String CRITICAL_ASSET_DATA_ID = System.getenv("CRITICAL_ASSET_DATA_ID");

    SecurityMonitoringCriticalAssetUpdateRequest body = new SecurityMonitoringCriticalAssetUpdateRequest()
.data(new SecurityMonitoringCriticalAssetUpdateData()
.type(SecurityMonitoringCriticalAssetType.CRITICAL_ASSETS)
.attributes(new SecurityMonitoringCriticalAssetUpdateAttributes()
.enabled(false)
.query("no:alert")
.ruleQuery("type:(log_detection OR signal_correlation OR workload_security OR application_security) ruleId:djg-ktx-ipq")
.severity(SecurityMonitoringCriticalAssetSeverity.DECREASE)
.tags(Collections.singletonList("env:production"))
.version(1)));

    try {
      SecurityMonitoringCriticalAssetResponse result = apiInstance.updateSecurityMonitoringCriticalAsset(CRITICAL_ASSET_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#updateSecurityMonitoringCriticalAsset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}