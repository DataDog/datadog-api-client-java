// Create a browser test returns "OK - Returns the created test details." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsBrowserTest;
import com.datadog.api.client.v1.model.SyntheticsBrowserTestConfig;
import com.datadog.api.client.v1.model.SyntheticsBrowserTestType;
import com.datadog.api.client.v1.model.SyntheticsBrowserVariable;
import com.datadog.api.client.v1.model.SyntheticsBrowserVariableType;
import com.datadog.api.client.v1.model.SyntheticsConfigVariable;
import com.datadog.api.client.v1.model.SyntheticsConfigVariableType;
import com.datadog.api.client.v1.model.SyntheticsStep;
import com.datadog.api.client.v1.model.SyntheticsStepType;
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
                    .variables(
                        Collections.singletonList(
                            new SyntheticsBrowserVariable()
                                .type(SyntheticsBrowserVariableType.TEXT)
                                .name("TEST_VARIABLE")
                                .pattern("secret")
                                .secure(true)
                                .example("secret")))
                    .configVariables(
                        Collections.singletonList(
                            new SyntheticsConfigVariable()
                                .example("content-type")
                                .name("PROPERTY")
                                .pattern("content-type")
                                .type(SyntheticsConfigVariableType.TEXT)
                                .secure(true)))
                    .request(new SyntheticsTestRequest().method("GET").url("https://datadoghq.com"))
                    .setCookie("name:test"))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("Test message")
            .name("Example-Synthetic")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .allowInsecure(true)
                    .deviceIds(Collections.singletonList("chrome.laptop_large"))
                    .disableCors(true)
                    .followRedirects(true)
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .noScreenshot(true)
                    .retry(new SyntheticsTestOptionsRetry().count(2L).interval(10.0))
                    .tickEvery(300L)
                    .enableProfiling(true)
                    .enableSecurityTesting(true))
            .tags(Collections.singletonList("testing:browser"))
            .type(SyntheticsBrowserTestType.BROWSER)
            .steps(
                Collections.singletonList(
                    new SyntheticsStep()
                        .allowFailure(false)
                        .alwaysExecute(true)
                        .exitIfSucceed(true)
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
