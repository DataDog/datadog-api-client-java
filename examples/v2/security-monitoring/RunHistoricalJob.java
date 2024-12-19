// Run a historical job returns "Status created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.HistoricalJobOptions;
import com.datadog.api.client.v2.model.HistoricalJobQuery;
import com.datadog.api.client.v2.model.JobCreateResponse;
import com.datadog.api.client.v2.model.JobDefinition;
import com.datadog.api.client.v2.model.RunHistoricalJobRequest;
import com.datadog.api.client.v2.model.RunHistoricalJobRequestAttributes;
import com.datadog.api.client.v2.model.RunHistoricalJobRequestData;
import com.datadog.api.client.v2.model.RunHistoricalJobRequestDataType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.runHistoricalJob", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    RunHistoricalJobRequest body =
        new RunHistoricalJobRequest()
            .data(
                new RunHistoricalJobRequestData()
                    .type(RunHistoricalJobRequestDataType.HISTORICALDETECTIONSJOBCREATE)
                    .attributes(
                        new RunHistoricalJobRequestAttributes()
                            .jobDefinition(
                                new JobDefinition()
                                    .type("log_detection")
                                    .name("Excessive number of failed attempts.")
                                    .queries(
                                        Collections.singletonList(
                                            new HistoricalJobQuery()
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
                                        new HistoricalJobOptions()
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
      JobCreateResponse result = apiInstance.runHistoricalJob(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#runHistoricalJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
