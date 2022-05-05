// Get all Cloud Workload Security Agent rules returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRulesListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);

    try {
      CloudWorkloadSecurityAgentRulesListResponse result =
          apiInstance.listCloudWorkloadSecurityAgentRules();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudWorkloadSecurityApi#listCloudWorkloadSecurityAgentRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
