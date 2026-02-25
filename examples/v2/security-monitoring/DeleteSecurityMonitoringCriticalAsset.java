// Delete a critical asset returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
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

    try {
      apiInstance.deleteSecurityMonitoringCriticalAsset(CRITICAL_ASSET_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#deleteSecurityMonitoringCriticalAsset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}