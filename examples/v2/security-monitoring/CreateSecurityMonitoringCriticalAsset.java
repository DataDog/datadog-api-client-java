// Create a critical asset returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetCreateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetCreateData;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringCriticalAssetType;
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

    SecurityMonitoringCriticalAssetCreateRequest body = new SecurityMonitoringCriticalAssetCreateRequest()
.data(new SecurityMonitoringCriticalAssetCreateData()
.type(SecurityMonitoringCriticalAssetType.CRITICAL_ASSETS)
.attributes(new SecurityMonitoringCriticalAssetCreateAttributes()
.query("host:examplesecuritymonitoring")
.ruleQuery("type:(log_detection OR signal_correlation OR workload_security OR application_security) source:cloudtrail")
.severity(SecurityMonitoringCriticalAssetSeverity.DECREASE)
.tags(Arrays.asList("team:security", "env:test"))));

    try {
      SecurityMonitoringCriticalAssetResponse result = apiInstance.createSecurityMonitoringCriticalAsset(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createSecurityMonitoringCriticalAsset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}