// Create a browser test returns "OK - Returns the created test details." response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.HTTPMethod;
import com.datadog.api.v1.client.model.SyntheticsBrowserTest;
import com.datadog.api.v1.client.model.SyntheticsBrowserTestConfig;
import com.datadog.api.v1.client.model.SyntheticsBrowserTestType;
import com.datadog.api.v1.client.model.SyntheticsConfigVariable;
import com.datadog.api.v1.client.model.SyntheticsConfigVariableType;
import com.datadog.api.v1.client.model.SyntheticsDeviceID;
import com.datadog.api.v1.client.model.SyntheticsStep;
import com.datadog.api.v1.client.model.SyntheticsStepType;
import com.datadog.api.v1.client.model.SyntheticsTestOptions;
import com.datadog.api.v1.client.model.SyntheticsTestOptionsRetry;
import com.datadog.api.v1.client.model.SyntheticsTestRequest;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
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
                            .method(HTTPMethod.GET)
                            .url("https://datadoghq.com"))
                    .setCookie("name:test"))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("Test message")
            .name(
                "Example-Create_a_browser_test_returns_OK_Returns_the_created_test_details_response")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .allowInsecure(true)
                    .deviceIds(Collections.singletonList(SyntheticsDeviceID.TABLET))
                    .disableCors(true)
                    .followRedirects(true)
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .noScreenshot(true)
                    .retry(new SyntheticsTestOptionsRetry().count(3L).interval(10.0))
                    .tickEvery(300L))
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
