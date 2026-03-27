// Cancel a historical job returns "OK" response

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
    defaultClient.setUnstableOperationEnabled("v2.cancelThreatHuntingJob", true);
    defaultClient.setUnstableOperationEnabled("v2.runThreatHuntingJob", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "threat_hunting_job" in the system
    String THREAT_HUNTING_JOB_DATA_ID = System.getenv("THREAT_HUNTING_JOB_DATA_ID");

    try {
      apiInstance.cancelThreatHuntingJob(THREAT_HUNTING_JOB_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#cancelThreatHuntingJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}