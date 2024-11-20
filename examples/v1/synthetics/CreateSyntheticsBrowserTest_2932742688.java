// Create a browser test returns "OK - Returns saved rumSettings." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsBrowserTest;
import com.datadog.api.client.v1.model.SyntheticsBrowserTestConfig;
import com.datadog.api.client.v1.model.SyntheticsBrowserTestRumSettings;
import com.datadog.api.client.v1.model.SyntheticsBrowserTestType;
import com.datadog.api.client.v1.model.SyntheticsConfigVariable;
import com.datadog.api.client.v1.model.SyntheticsConfigVariableType;
import com.datadog.api.client.v1.model.SyntheticsStep;
import com.datadog.api.client.v1.model.SyntheticsStepType;
import com.datadog.api.client.v1.model.SyntheticsTestCiOptions;
import com.datadog.api.client.v1.model.SyntheticsTestExecutionRule;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsBrowserTest body =
        new SyntheticsBrowserTest()
            .config(
                new SyntheticsBrowserTestConfig()
                    .configVariables(
                        Collections.singletonList(
                            new SyntheticsConfigVariable()
                                .example("content-type")
                                .name("PROPERTY")
                                .pattern("content-type")
                                .type(SyntheticsConfigVariableType.TEXT)))
                    .request(
                        new SyntheticsTestRequest()
                            .method("GET")
                            .url("https://datadoghq.com")
                            .certificateDomains(Collections.singletonList("https://datadoghq.com")))
                    .setCookie("name:test"))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("Test message")
            .name("Example-Synthetic")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .allowInsecure(true)
                    .deviceIds(Collections.singletonList("tablet"))
                    .disableCors(true)
                    .followRedirects(true)
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .noScreenshot(true)
                    .retry(new SyntheticsTestOptionsRetry().count(2L).interval(10.0))
                    .rumSettings(
                        new SyntheticsBrowserTestRumSettings()
                            .isEnabled(true)
                            .applicationId("mockApplicationId")
                            .clientTokenId(12345L))
                    .tickEvery(300L)
                    .ci(
                        new SyntheticsTestCiOptions()
                            .executionRule(SyntheticsTestExecutionRule.SKIPPED))
                    .ignoreServerCertificateError(true)
                    .disableCsp(true)
                    .initialNavigationTimeout(200L))
            .tags(Collections.singletonList("testing:browser"))
            .type(SyntheticsBrowserTestType.BROWSER)
            .steps(
                Collections.singletonList(
                    new SyntheticsStep()
                        .allowFailure(false)
                        .isCritical(true)
                        .name("Refresh page")
                        .params(new Object())
                        .type(SyntheticsStepType.REFRESH)));

    try {
      SyntheticsBrowserTest result = apiInstance.createSyntheticsBrowserTest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#createSyntheticsBrowserTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
