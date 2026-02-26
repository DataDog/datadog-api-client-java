// List historical jobs returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.ListThreatHuntingJobsOptionalParameters;
import com.datadog.api.client.v2.model.ListThreatHuntingJobsResponse;
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
    defaultClient.setUnstableOperationEnabled("v2.listThreatHuntingJobs", true);
    defaultClient.setUnstableOperationEnabled("v2.runThreatHuntingJob", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "threat_hunting_job" in the system
    String THREAT_HUNTING_JOB_DATA_ID = System.getenv("THREAT_HUNTING_JOB_DATA_ID");

    try {
      ListThreatHuntingJobsResponse result = apiInstance.listThreatHuntingJobs(new ListThreatHuntingJobsOptionalParameters().filterQuery("id:string"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#listThreatHuntingJobs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}