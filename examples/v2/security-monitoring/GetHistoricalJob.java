// Get a job's details returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.HistoricalJobResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getHistoricalJob", true);
    defaultClient.setUnstableOperationEnabled("v2.runHistoricalJob", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "historical_job" in the system
    String HISTORICAL_JOB_DATA_ID = System.getenv("HISTORICAL_JOB_DATA_ID");

    try {
      HistoricalJobResponse result = apiInstance.getHistoricalJob(HISTORICAL_JOB_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#getHistoricalJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
