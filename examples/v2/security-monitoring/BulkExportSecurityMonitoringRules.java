// Bulk export security monitoring rules returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import java.io.File;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleBulkExportAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleBulkExportData;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleBulkExportDataType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleBulkExportPayload;
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
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "security_rule" in the system
    String SECURITY_RULE_ID = System.getenv("SECURITY_RULE_ID");

    SecurityMonitoringRuleBulkExportPayload body = new SecurityMonitoringRuleBulkExportPayload()
.data(new SecurityMonitoringRuleBulkExportData()
.attributes(new SecurityMonitoringRuleBulkExportAttributes()
.ruleIds(Collections.singletonList(SECURITY_RULE_ID)))
.type(SecurityMonitoringRuleBulkExportDataType.SECURITY_MONITORING_RULES_BULK_EXPORT));

    try {
      File result = apiInstance.bulkExportSecurityMonitoringRules(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#bulkExportSecurityMonitoringRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}