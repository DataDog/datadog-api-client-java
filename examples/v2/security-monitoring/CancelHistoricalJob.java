// Cancel a historical job returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.runHistoricalJob", true);
    defaultClient.setUnstableOperationEnabled("v2.cancelHistoricalJob", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "historical_job" in the system
    String HISTORICAL_JOB_DATA_ID = System.getenv("HISTORICAL_JOB_DATA_ID");

    try {
      apiInstance.cancelHistoricalJob(HISTORICAL_JOB_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#cancelHistoricalJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
