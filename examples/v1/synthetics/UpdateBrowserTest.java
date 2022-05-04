// Edit a browser test returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.HTTPMethod;
import com.datadog.api.v1.client.model.SyntheticsBasicAuth;
import com.datadog.api.v1.client.model.SyntheticsBasicAuthWeb;
import com.datadog.api.v1.client.model.SyntheticsBasicAuthWebType;
import com.datadog.api.v1.client.model.SyntheticsBrowserTest;
import com.datadog.api.v1.client.model.SyntheticsBrowserTestConfig;
import com.datadog.api.v1.client.model.SyntheticsBrowserTestType;
import com.datadog.api.v1.client.model.SyntheticsBrowserVariable;
import com.datadog.api.v1.client.model.SyntheticsBrowserVariableType;
import com.datadog.api.v1.client.model.SyntheticsConfigVariable;
import com.datadog.api.v1.client.model.SyntheticsConfigVariableType;
import com.datadog.api.v1.client.model.SyntheticsDeviceID;
import com.datadog.api.v1.client.model.SyntheticsStep;
import com.datadog.api.v1.client.model.SyntheticsStepType;
import com.datadog.api.v1.client.model.SyntheticsTestOptions;
import com.datadog.api.v1.client.model.SyntheticsTestOptionsMonitorOptions;
import com.datadog.api.v1.client.model.SyntheticsTestOptionsRetry;
import com.datadog.api.v1.client.model.SyntheticsTestPauseStatus;
import com.datadog.api.v1.client.model.SyntheticsTestRequest;
import com.datadog.api.v1.client.model.SyntheticsTestRequestCertificate;
import com.datadog.api.v1.client.model.SyntheticsTestRequestCertificateItem;
import com.datadog.api.v1.client.model.SyntheticsTestRequestProxy;
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
                    .deviceIds(Collections.singletonList(SyntheticsDeviceID.LAPTOP_LARGE))
                    .monitorOptions(new SyntheticsTestOptionsMonitorOptions())
                    .restrictedRoles(
                        Collections.singletonList("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"))
                    .retry(new SyntheticsTestOptionsRetry()))
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
