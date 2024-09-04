// Create a detection rule with detection method 'third_party' returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleThirdPartyOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypeCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringThirdPartyRootQuery;
import com.datadog.api.client.v2.model.SecurityMonitoringThirdPartyRuleCaseCreate;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleCreatePayload body =
        new SecurityMonitoringRuleCreatePayload(
            new SecurityMonitoringStandardRuleCreatePayload()
                .name("Example-Security-Monitoring")
                .type(SecurityMonitoringRuleTypeCreate.LOG_DETECTION)
                .isEnabled(true)
                .thirdPartyCases(
                    Arrays.asList(
                        new SecurityMonitoringThirdPartyRuleCaseCreate()
                            .query("status:error")
                            .name("high")
                            .status(SecurityMonitoringRuleSeverity.HIGH),
                        new SecurityMonitoringThirdPartyRuleCaseCreate()
                            .query("status:info")
                            .name("low")
                            .status(SecurityMonitoringRuleSeverity.LOW)))
                .message("This is a third party rule")
                .options(
                    new SecurityMonitoringRuleOptions()
                        .detectionMethod(SecurityMonitoringRuleDetectionMethod.THIRD_PARTY)
                        .keepAlive(SecurityMonitoringRuleKeepAlive.ZERO_MINUTES)
                        .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.TEN_MINUTES)
                        .thirdPartyRuleOptions(
                            new SecurityMonitoringRuleThirdPartyOptions()
                                .defaultStatus(SecurityMonitoringRuleSeverity.INFO)
                                .rootQueries(
                                    Arrays.asList(
                                        new SecurityMonitoringThirdPartyRootQuery()
                                            .query("source:guardduty @details.alertType:*EC2*")
                                            .groupByFields(
                                                Collections.singletonList("instance-id")),
                                        new SecurityMonitoringThirdPartyRootQuery()
                                            .query("source:guardduty"))))));

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
