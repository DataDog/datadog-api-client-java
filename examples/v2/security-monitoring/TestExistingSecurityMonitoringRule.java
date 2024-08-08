// Test an existing rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTestResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryPayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryPayloadData;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTestRequest;
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

    SecurityMonitoringRuleTestRequest body = new SecurityMonitoringRuleTestRequest()
.ruleQueryPayloads(Collections.singletonList(new SecurityMonitoringRuleQueryPayload()
.expectedResult(true)
.index(0L)
.payload(new SecurityMonitoringRuleQueryPayloadData()
.ddsource("nginx")
.ddtags("env:staging,version:5.1")
.hostname("i-012345678")
.message("2019-11-19T14:37:58,995 INFO [process.name][20081] Hello World")
.service("payment"))));

    try {
      SecurityMonitoringRuleTestResponse result = apiInstance.testExistingSecurityMonitoringRule("rule_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#testExistingSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}