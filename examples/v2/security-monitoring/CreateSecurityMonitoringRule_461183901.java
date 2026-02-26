// Create a detection rule with type 'impossible_travel' returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleImpossibleTravelOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypeCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleQuery;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleCreatePayload body =
        new SecurityMonitoringRuleCreatePayload(
            new SecurityMonitoringStandardRuleCreatePayload()
                .queries(
                    Collections.singletonList(
                        new SecurityMonitoringStandardRuleQuery()
                            .aggregation(SecurityMonitoringRuleQueryAggregation.GEO_DATA)
                            .groupByFields(Collections.singletonList("@usr.id"))
                            .metric("@network.client.geoip")
                            .query("*")))
                .cases(
                    Collections.singletonList(
                        new SecurityMonitoringRuleCaseCreate()
                            .name("")
                            .status(SecurityMonitoringRuleSeverity.INFO)))
                .hasExtendedTitle(true)
                .message("test")
                .isEnabled(true)
                .options(
                    new SecurityMonitoringRuleOptions()
                        .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ONE_DAY)
                        .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.FIFTEEN_MINUTES)
                        .keepAlive(SecurityMonitoringRuleKeepAlive.ONE_HOUR)
                        .detectionMethod(SecurityMonitoringRuleDetectionMethod.IMPOSSIBLE_TRAVEL)
                        .impossibleTravelOptions(
                            new SecurityMonitoringRuleImpossibleTravelOptions()
                                .baselineUserLocations(false)))
                .name("Example-Security-Monitoring")
                .type(SecurityMonitoringRuleTypeCreate.LOG_DETECTION));

    try {
      SecurityMonitoringRuleResponse result = apiInstance.createSecurityMonitoringRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
