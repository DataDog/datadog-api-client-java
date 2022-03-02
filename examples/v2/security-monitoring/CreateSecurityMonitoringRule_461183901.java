// Create a detection rule with type 'impossible_travel' returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleImpossibleTravelOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleQueryCreate;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleTypeCreate;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleCreatePayload body =
        new SecurityMonitoringRuleCreatePayload()
            .queries(
                Collections.singletonList(
                    new SecurityMonitoringRuleQueryCreate()
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
            .name("Example-Create_a_detection_rule_with_type_impossible_travel_returns_OK_response")
            .type(SecurityMonitoringRuleTypeCreate.LOG_DETECTION);

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
