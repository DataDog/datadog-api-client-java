// Edit an API test returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.HTTPMethod;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITestConfig;
import com.datadog.api.client.v1.model.SyntheticsAPITestType;
import com.datadog.api.client.v1.model.SyntheticsAssertion;
import com.datadog.api.client.v1.model.SyntheticsAssertionJSONPathOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionJSONPathTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionJSONPathTargetTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionType;
import com.datadog.api.client.v1.model.SyntheticsConfigVariable;
import com.datadog.api.client.v1.model.SyntheticsConfigVariableType;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestPauseStatus;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import com.datadog.api.client.v1.model.SyntheticsTestRequestCertificate;
import com.datadog.api.client.v1.model.SyntheticsTestRequestCertificateItem;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class UpdateAPITest {
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
