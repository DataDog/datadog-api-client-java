// Run a threat hunting job returns "Status created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.JobCreateResponse;
import com.datadog.api.client.v2.model.JobDefinition;
import com.datadog.api.client.v2.model.RunThreatHuntingJobRequest;
import com.datadog.api.client.v2.model.RunThreatHuntingJobRequestAttributes;
import com.datadog.api.client.v2.model.RunThreatHuntingJobRequestData;
import com.datadog.api.client.v2.model.RunThreatHuntingJobRequestDataType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.ThreatHuntingJobOptions;
import com.datadog.api.client.v2.model.ThreatHuntingJobQuery;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.runThreatHuntingJob", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    RunThreatHuntingJobRequest body =
        new RunThreatHuntingJobRequest()
            .data(
                new RunThreatHuntingJobRequestData()
                    .type(RunThreatHuntingJobRequestDataType.HISTORICALDETECTIONSJOBCREATE)
                    .attributes(
                        new RunThreatHuntingJobRequestAttributes()
                            .jobDefinition(
                                new JobDefinition()
                                    .type("log_detection")
                                    .name("Excessive number of failed attempts.")
                                    .queries(
                                        Collections.singletonList(
                                            new ThreatHuntingJobQuery()
                                                .query("source:non_existing_src_weekend")
                                                .aggregation(
                                                    SecurityMonitoringRuleQueryAggregation.COUNT)))
                                    .cases(
                                        Collections.singletonList(
                                            new SecurityMonitoringRuleCaseCreate()
                                                .name("Condition 1")
                                                .status(SecurityMonitoringRuleSeverity.INFO)
                                                .condition("a > 1")))
                                    .options(
                                        new ThreatHuntingJobOptions()
                                            .keepAlive(SecurityMonitoringRuleKeepAlive.ONE_HOUR)
                                            .maxSignalDuration(
                                                SecurityMonitoringRuleMaxSignalDuration.ONE_DAY)
                                            .evaluationWindow(
                                                SecurityMonitoringRuleEvaluationWindow
                                                    .FIFTEEN_MINUTES))
                                    .message("A large number of failed login attempts.")
                                    .from(1730387522611L)
                                    .to(1730387532611L)
                                    .index("main"))));

    try {
      JobCreateResponse result = apiInstance.runThreatHuntingJob(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#runThreatHuntingJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
