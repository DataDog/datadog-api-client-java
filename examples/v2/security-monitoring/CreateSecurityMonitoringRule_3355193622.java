// Create a detection rule with detection method 'anomaly_detection' with enabled feature
// 'instantaneousBaseline' returns
// "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleAnomalyDetectionOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypeCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardDataSource;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleQuery;
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
                .queries(
                    Collections.singletonList(
                        new SecurityMonitoringStandardRuleQuery()
                            .aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
                            .dataSource(SecurityMonitoringStandardDataSource.LOGS)
                            .groupByFields(Arrays.asList("@usr.email", "@network.client.ip"))
                            .hasOptionalGroupByFields(false)
                            .name("")
                            .query("service:app status:error")))
                .cases(
                    Collections.singletonList(
                        new SecurityMonitoringRuleCaseCreate()
                            .name("")
                            .status(SecurityMonitoringRuleSeverity.INFO)
                            .condition("a > 0.995")))
                .message("An anomaly detection rule")
                .options(
                    new SecurityMonitoringRuleOptions()
                        .detectionMethod(SecurityMonitoringRuleDetectionMethod.ANOMALY_DETECTION)
                        .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.FIFTEEN_MINUTES)
                        .keepAlive(SecurityMonitoringRuleKeepAlive.ONE_HOUR)
                        .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ONE_DAY)
                        .anomalyDetectionOptions(
                            new SecurityMonitoringRuleAnomalyDetectionOptions()
                                .bucketDuration(
                                    SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration
                                        .FIVE_MINUTES)
                                .learningDuration(
                                    SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration
                                        .ONE_DAY)
                                .detectionTolerance(
                                    SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance
                                        .THREE)
                                .instantaneousBaseline(true))));

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
