// Search remediation groups returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.SearchRemediationGroupsOptionalParameters;
import com.datadog.api.client.v2.model.RemediationGroupData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.searchRemediationGroups", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      PaginationIterable<RemediationGroupData> iterable =
          apiInstance.searchRemediationGroupsWithPagination(
              new SearchRemediationGroupsOptionalParameters().pageSize(2L));

      for (RemediationGroupData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#searchRemediationGroupsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
