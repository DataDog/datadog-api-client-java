// Create a detection rule returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityPlatformApi;
import com.datadog.api.v2.client.model.SecurityMonitoringFilter;
import com.datadog.api.v2.client.model.SecurityMonitoringFilterAction;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleHardcodedEvaluatorType;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleImpossibleTravelOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleNewValueOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleNewValueOptionsForgetAfter;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleNewValueOptionsLearningDuration;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleTypeCreate;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SecurityPlatformApi apiInstance = new SecurityPlatformApi(defaultClient);

    SecurityMonitoringRuleCreatePayload body =
        new SecurityMonitoringRuleCreatePayload()
            .filters(
                Collections.singletonList(
                    new SecurityMonitoringFilter().action(SecurityMonitoringFilterAction.REQUIRE)))
            .hasExtendedTitle(true)
            .isEnabled(true)
            .message("")
            .name("My security monitoring rule.")
            .options(
                new SecurityMonitoringRuleOptions()
                    .detectionMethod(SecurityMonitoringRuleDetectionMethod.THRESHOLD)
                    .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.ZERO_MINUTES)
                    .hardcodedEvaluatorType(SecurityMonitoringRuleHardcodedEvaluatorType.LOG4SHELL)
                    .impossibleTravelOptions(
                        new SecurityMonitoringRuleImpossibleTravelOptions()
                            .baselineUserLocations(true))
                    .keepAlive(SecurityMonitoringRuleKeepAlive.ZERO_MINUTES)
                    .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ZERO_MINUTES)
                    .newValueOptions(
                        new SecurityMonitoringRuleNewValueOptions()
                            .forgetAfter(SecurityMonitoringRuleNewValueOptionsForgetAfter.ONE_DAY)
                            .learningDuration(
                                SecurityMonitoringRuleNewValueOptionsLearningDuration.ZERO_DAYS)))
            .tags(Arrays.asList("env:prod", "team:security"))
            .type(SecurityMonitoringRuleTypeCreate.LOG_DETECTION);

    try {
      SecurityMonitoringRuleResponse result = apiInstance.createSecurityMonitoringRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityPlatformApi#createSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
