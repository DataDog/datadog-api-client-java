// List historical jobs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.ListHistoricalJobsOptionalParameters;
import com.datadog.api.client.v2.model.ListHistoricalJobsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.runHistoricalJob", true);
    defaultClient.setUnstableOperationEnabled("v2.listHistoricalJobs", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "historical_job" in the system
    String HISTORICAL_JOB_DATA_ID = System.getenv("HISTORICAL_JOB_DATA_ID");

    try {
      ListHistoricalJobsResponse result =
          apiInstance.listHistoricalJobs(
              new ListHistoricalJobsOptionalParameters().filterQuery("id:string"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#listHistoricalJobs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
