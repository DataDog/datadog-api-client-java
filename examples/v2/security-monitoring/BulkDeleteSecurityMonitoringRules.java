// Bulk delete security monitoring rules returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleBulkDeleteAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleBulkDeleteData;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleBulkDeletePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleBulkDeleteRequestDataType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleBulkDeleteResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleBulkDeletePayload body =
        new SecurityMonitoringRuleBulkDeletePayload()
            .data(
                new SecurityMonitoringRuleBulkDeleteData()
                    .attributes(
                        new SecurityMonitoringRuleBulkDeleteAttributes()
                            .ruleIds(Arrays.asList("abc-000-u7q", "abc-000-7dd")))
                    .type(SecurityMonitoringRuleBulkDeleteRequestDataType.BULK_DELETE_RULES));

    try {
      SecurityMonitoringRuleBulkDeleteResponse result =
          apiInstance.bulkDeleteSecurityMonitoringRules(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#bulkDeleteSecurityMonitoringRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
