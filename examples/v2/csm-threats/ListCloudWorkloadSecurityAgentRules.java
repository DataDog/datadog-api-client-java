// Get all Workload Protection agent rules (US1-FED) returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmThreatsApi;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRulesListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CsmThreatsApi apiInstance = new CsmThreatsApi(defaultClient);

    try {
      CloudWorkloadSecurityAgentRulesListResponse result =
          apiInstance.listCloudWorkloadSecurityAgentRules();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CsmThreatsApi#listCloudWorkloadSecurityAgentRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
