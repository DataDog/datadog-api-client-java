// Convert a rule from JSON to Terraform returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleConvertResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleConvertPayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypeCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRulePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleQuery;
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

    SecurityMonitoringRuleConvertPayload body = new SecurityMonitoringRuleConvertPayload(
new SecurityMonitoringStandardRulePayload()
.name("_49768568946de993")
.queries(Collections.singletonList(new SecurityMonitoringStandardRuleQuery()
.query("@test:true")
.aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
.metric("")))
.cases(Collections.singletonList(new SecurityMonitoringRuleCaseCreate()
.name("")
.status(SecurityMonitoringRuleSeverity.INFO)
.condition("a > 0")))
.options(new SecurityMonitoringRuleOptions()
.evaluationWindow(SecurityMonitoringRuleEvaluationWindow.FIFTEEN_MINUTES)
.keepAlive(SecurityMonitoringRuleKeepAlive.ONE_HOUR)
.maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ONE_DAY))
.message("Test rule")
.isEnabled(true)
.type(SecurityMonitoringRuleTypeCreate.LOG_DETECTION));

    try {
      SecurityMonitoringRuleConvertResponse result = apiInstance.convertSecurityMonitoringRuleFromJSONToTerraform(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#convertSecurityMonitoringRuleFromJSONToTerraform");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}