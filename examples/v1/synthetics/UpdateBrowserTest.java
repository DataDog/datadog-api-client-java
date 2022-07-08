// Edit a browser test returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.HTTPMethod;
import com.datadog.api.client.v1.model.SyntheticsBasicAuth;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthWeb;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthWebType;
import com.datadog.api.client.v1.model.SyntheticsBrowserTest;
import com.datadog.api.client.v1.model.SyntheticsBrowserTestConfig;
import com.datadog.api.client.v1.model.SyntheticsBrowserTestRumSettings;
import com.datadog.api.client.v1.model.SyntheticsBrowserTestType;
import com.datadog.api.client.v1.model.SyntheticsBrowserVariable;
import com.datadog.api.client.v1.model.SyntheticsBrowserVariableType;
import com.datadog.api.client.v1.model.SyntheticsConfigVariable;
import com.datadog.api.client.v1.model.SyntheticsConfigVariableType;
import com.datadog.api.client.v1.model.SyntheticsDeviceID;
import com.datadog.api.client.v1.model.SyntheticsStep;
import com.datadog.api.client.v1.model.SyntheticsStepType;
import com.datadog.api.client.v1.model.SyntheticsTestCiOptions;
import com.datadog.api.client.v1.model.SyntheticsTestExecutionRule;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsMonitorOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestPauseStatus;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import com.datadog.api.client.v1.model.SyntheticsTestRequestCertificate;
import com.datadog.api.client.v1.model.SyntheticsTestRequestCertificateItem;
import com.datadog.api.client.v1.model.SyntheticsTestRequestProxy;
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
                                .name("VARIABLE_NAME")
                                .type(SyntheticsConfigVariableType.TEXT)))
                    .request(
                        new SyntheticsTestRequest()
                            .basicAuth(
                                new SyntheticsBasicAuth(
                                    new SyntheticsBasicAuthWeb()
                                        .password("PaSSw0RD!")
                                        .type(SyntheticsBasicAuthWebType.WEB)
                                        .username("my_username")))
                            .certificate(
                                new SyntheticsTestRequestCertificate()
                                    .cert(new SyntheticsTestRequestCertificateItem())
                                    .key(new SyntheticsTestRequestCertificateItem()))
                            .method(HTTPMethod.GET)
                            .proxy(new SyntheticsTestRequestProxy().url("https://example.com"))
                            .url("https://example.com"))
                    .variables(
                        Collections.singletonList(
                            new SyntheticsBrowserVariable()
                                .name("VARIABLE_NAME")
                                .type(SyntheticsBrowserVariableType.TEXT))))
            .locations(Collections.singletonList("aws:eu-west-3"))
            .message("")
            .name("Example test name")
            .options(
                new SyntheticsTestOptions()
                    .ci(
                        new SyntheticsTestCiOptions()
                            .executionRule(SyntheticsTestExecutionRule.BLOCKING))
                    .deviceIds(Collections.singletonList(SyntheticsDeviceID.LAPTOP_LARGE))
                    .monitorOptions(new SyntheticsTestOptionsMonitorOptions())
                    .restrictedRoles(
                        Collections.singletonList("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"))
                    .retry(new SyntheticsTestOptionsRetry())
                    .rumSettings(
                        new SyntheticsBrowserTestRumSettings()
                            .applicationId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                            .clientTokenId(12345L)
                            .isEnabled(true)))
            .status(SyntheticsTestPauseStatus.LIVE)
            .steps(
                Collections.singletonList(
                    new SyntheticsStep().type(SyntheticsStepType.ASSERT_ELEMENT_CONTENT)))
            .tags(Collections.singletonList("env:prod"))
            .type(SyntheticsBrowserTestType.BROWSER);

    try {
      SyntheticsBrowserTest result = apiInstance.updateBrowserTest("public_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updateBrowserTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
