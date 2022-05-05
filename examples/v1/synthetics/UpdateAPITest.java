// Edit an API test returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.HTTPMethod;
import com.datadog.api.v1.client.model.SyntheticsAPITest;
import com.datadog.api.v1.client.model.SyntheticsAPITestConfig;
import com.datadog.api.v1.client.model.SyntheticsAPITestType;
import com.datadog.api.v1.client.model.SyntheticsAssertion;
import com.datadog.api.v1.client.model.SyntheticsAssertionJSONPathOperator;
import com.datadog.api.v1.client.model.SyntheticsAssertionJSONPathTarget;
import com.datadog.api.v1.client.model.SyntheticsAssertionJSONPathTargetTarget;
import com.datadog.api.v1.client.model.SyntheticsAssertionOperator;
import com.datadog.api.v1.client.model.SyntheticsAssertionTarget;
import com.datadog.api.v1.client.model.SyntheticsAssertionType;
import com.datadog.api.v1.client.model.SyntheticsConfigVariable;
import com.datadog.api.v1.client.model.SyntheticsConfigVariableType;
import com.datadog.api.v1.client.model.SyntheticsTestDetailsSubType;
import com.datadog.api.v1.client.model.SyntheticsTestOptions;
import com.datadog.api.v1.client.model.SyntheticsTestOptionsRetry;
import com.datadog.api.v1.client.model.SyntheticsTestPauseStatus;
import com.datadog.api.v1.client.model.SyntheticsTestRequest;
import com.datadog.api.v1.client.model.SyntheticsTestRequestCertificate;
import com.datadog.api.v1.client.model.SyntheticsTestRequestCertificateItem;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "synthetics_api_test" in the system
    String SYNTHETICS_API_TEST_PUBLIC_ID = System.getenv("SYNTHETICS_API_TEST_PUBLIC_ID");

    SyntheticsAPITest body =
        new SyntheticsAPITest()
            .config(
                new SyntheticsAPITestConfig()
                    .assertions(
                        Arrays.asList(
                            new SyntheticsAssertion(
                                new SyntheticsAssertionTarget()
                                    .operator(SyntheticsAssertionOperator.IS)
                                    .property("{{ PROPERTY }}")
                                    .target("text/html")
                                    .type(SyntheticsAssertionType.HEADER)),
                            new SyntheticsAssertion(
                                new SyntheticsAssertionTarget()
                                    .operator(SyntheticsAssertionOperator.LESS_THAN)
                                    .target(2000)
                                    .type(SyntheticsAssertionType.RESPONSE_TIME)),
                            new SyntheticsAssertion(
                                new SyntheticsAssertionJSONPathTarget()
                                    .operator(
                                        SyntheticsAssertionJSONPathOperator.VALIDATES_JSON_PATH)
                                    .target(
                                        new SyntheticsAssertionJSONPathTargetTarget()
                                            .jsonPath("topKey")
                                            .operator("isNot")
                                            .targetValue("0"))
                                    .type(SyntheticsAssertionType.BODY))))
                    .configVariables(
                        Collections.singletonList(
                            new SyntheticsConfigVariable()
                                .example("content-type")
                                .name("PROPERTY")
                                .pattern("content-type")
                                .type(SyntheticsConfigVariableType.TEXT)))
                    .request(
                        new SyntheticsTestRequest()
                            .certificate(
                                new SyntheticsTestRequestCertificate()
                                    .cert(
                                        new SyntheticsTestRequestCertificateItem()
                                            .filename("cert-filename")
                                            .updatedAt("2020-10-16T09:23:24.857Z"))
                                    .key(
                                        new SyntheticsTestRequestCertificateItem()
                                            .filename("key-filename")
                                            .updatedAt("2020-10-16T09:23:24.857Z")))
                            .headers(
                                Map.ofEntries(
                                    Map.entry("unique", "exampleeditanapitestreturnsokresponse")))
                            .method(HTTPMethod.GET)
                            .timeout(10.0)
                            .url("https://datadoghq.com")))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("BDD test payload: synthetics_api_test_payload.json")
            .name("Example-Edit_an_API_test_returns_OK_response-updated")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .allowInsecure(true)
                    .followRedirects(true)
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .monitorName("Test-TestSyntheticsAPITestLifecycle-1623076664")
                    .monitorPriority(5)
                    .retry(new SyntheticsTestOptionsRetry().count(3L).interval(10.0))
                    .tickEvery(60L))
            .status(SyntheticsTestPauseStatus.LIVE)
            .subtype(SyntheticsTestDetailsSubType.HTTP)
            .tags(Collections.singletonList("testing:api"))
            .type(SyntheticsAPITestType.API);

    try {
      SyntheticsAPITest result = apiInstance.updateAPITest(SYNTHETICS_API_TEST_PUBLIC_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updateAPITest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
