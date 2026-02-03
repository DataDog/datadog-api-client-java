// Update investigation feedback returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationFeedbackMetric;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationFeedbackRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationFeedbackRequestAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationFeedbackRequestData;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationFeedbackSection;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationFeedbackType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateInvestigationFeedback", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalInvestigationFeedbackRequest body =
        new SecurityMonitoringSignalInvestigationFeedbackRequest()
            .data(
                new SecurityMonitoringSignalInvestigationFeedbackRequestData()
                    .attributes(
                        new SecurityMonitoringSignalInvestigationFeedbackRequestAttributes()
                            .feedback("positive")
                            .feedbackContent(
                                Collections.singletonList(
                                    new SecurityMonitoringSignalInvestigationFeedbackSection()
                                        .id("section-1")
                                        .metrics(
                                            Collections.singletonList(
                                                new SecurityMonitoringSignalInvestigationFeedbackMetric()
                                                    .placeholder("Enter your feedback here")
                                                    .prompt("How helpful was this investigation?")
                                                    .response("Very helpful")
                                                    .type("sentiment")))
                                        .title("Investigation Quality")))
                            .incomplete(false)
                            .rating("positive")
                            .signalId("AAAAAWgN8Xwgr1vKDQAAAABBV2dOOFh3ZzZobm1mWXJFYTR0OA")
                            .type("metrics"))
                    .type(
                        SecurityMonitoringSignalInvestigationFeedbackType.INVESTIGATION_FEEDBACK));

    try {
      apiInstance.updateInvestigationFeedback(body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#updateInvestigationFeedback");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
