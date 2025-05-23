// Create an API test returns "OK - Returns the created test details." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITestConfig;
import com.datadog.api.client.v1.model.SyntheticsAPITestType;
import com.datadog.api.client.v1.model.SyntheticsAssertion;
import com.datadog.api.client.v1.model.SyntheticsAssertionOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionTargetValue;
import com.datadog.api.client.v1.model.SyntheticsAssertionType;
import com.datadog.api.client.v1.model.SyntheticsBrowserTestRumSettings;
import com.datadog.api.client.v1.model.SyntheticsTestCiOptions;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestExecutionRule;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsHTTPVersion;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsMonitorOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsMonitorOptionsNotificationPresetName;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsScheduling;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsSchedulingTimeframe;
import com.datadog.api.client.v1.model.SyntheticsTestPauseStatus;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsAPITest body =
        new SyntheticsAPITest()
            .config(
                new SyntheticsAPITestConfig()
                    .assertions(
                        Collections.singletonList(
                            new SyntheticsAssertion(
                                new SyntheticsAssertionTarget()
                                    .operator(SyntheticsAssertionOperator.LESS_THAN)
                                    .target(new SyntheticsAssertionTargetValue(1000.0))
                                    .type(SyntheticsAssertionType.RESPONSE_TIME))))
                    .request(new SyntheticsTestRequest().method("GET").url("https://example.com")))
            .locations(Collections.singletonList("aws:eu-west-3"))
            .message("Notification message")
            .name("Example test name")
            .options(
                new SyntheticsTestOptions()
                    .ci(
                        new SyntheticsTestCiOptions()
                            .executionRule(SyntheticsTestExecutionRule.BLOCKING))
                    .deviceIds(Collections.singletonList("chrome.laptop_large"))
                    .httpVersion(SyntheticsTestOptionsHTTPVersion.HTTP1)
                    .monitorOptions(
                        new SyntheticsTestOptionsMonitorOptions()
                            .notificationPresetName(
                                SyntheticsTestOptionsMonitorOptionsNotificationPresetName.SHOW_ALL))
                    .restrictedRoles(
                        Collections.singletonList("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"))
                    .retry(new SyntheticsTestOptionsRetry())
                    .rumSettings(
                        new SyntheticsBrowserTestRumSettings()
                            .applicationId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                            .clientTokenId(12345L)
                            .isEnabled(true))
                    .scheduling(
                        new SyntheticsTestOptionsScheduling()
                            .timeframes(
                                Arrays.asList(
                                    new SyntheticsTestOptionsSchedulingTimeframe()
                                        .day(1)
                                        .from("07:00")
                                        .to("16:00"),
                                    new SyntheticsTestOptionsSchedulingTimeframe()
                                        .day(3)
                                        .from("07:00")
                                        .to("16:00")))
                            .timezone("America/New_York")))
            .status(SyntheticsTestPauseStatus.LIVE)
            .subtype(SyntheticsTestDetailsSubType.HTTP)
            .tags(Collections.singletonList("env:production"))
            .type(SyntheticsAPITestType.API);

    try {
      SyntheticsAPITest result = apiInstance.createSyntheticsAPITest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#createSyntheticsAPITest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
