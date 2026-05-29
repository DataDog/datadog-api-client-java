// Bulk convert rules to Terraform returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleConvertBulkAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleConvertBulkData;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleConvertBulkDataType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleConvertBulkPayload;
import java.io.File;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleConvertBulkPayload body =
        new SecurityMonitoringRuleConvertBulkPayload()
            .data(
                new SecurityMonitoringRuleConvertBulkData()
                    .attributes(
                        new SecurityMonitoringRuleConvertBulkAttributes()
                            .ruleIds(Arrays.asList("def-000-u7q", "def-000-7dd")))
                    .id("convert_bulk")
                    .type(
                        SecurityMonitoringRuleConvertBulkDataType
                            .SECURITY_MONITORING_RULES_CONVERT_BULK));

    try {
      File result = apiInstance.bulkConvertExistingSecurityMonitoringRules(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#bulkConvertExistingSecurityMonitoringRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
