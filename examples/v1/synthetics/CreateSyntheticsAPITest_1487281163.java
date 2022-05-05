// Create an API HTTP test returns "OK - Returns the created test details." response

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
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
import com.datadog.api.v1.client.model.SyntheticsTestRequest;
import com.datadog.api.v1.client.model.SyntheticsTestRequestCertificate;
import com.datadog.api.v1.client.model.SyntheticsTestRequestCertificateItem;
import com.datadog.api.v1.client.model.SyntheticsTestRequestProxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

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
                                            .content("cert-content")
                                            .filename("cert-filename")
                                            .updatedAt("2020-10-16T09:23:24.857Z"))
                                    .key(
                                        new SyntheticsTestRequestCertificateItem()
                                            .content("key-content")
                                            .filename("key-filename")
                                            .updatedAt("2020-10-16T09:23:24.857Z")))
                            .headers(
                                Map.ofEntries(
                                    Map.entry(
                                        "unique",
                                        "examplecreateanapihttptestreturnsokreturnsthecreatedtestdetailsresponse")))
                            .method(HTTPMethod.GET)
                            .timeout(10.0)
                            .url("https://datadoghq.com")
                            .proxy(
                                new SyntheticsTestRequestProxy()
                                    .url("https://datadoghq.com")
                                    .headers(Map.ofEntries()))))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("BDD test payload: synthetics_api_http_test_payload.json")
            .name(
                "Example-Create_an_API_HTTP_test_returns_OK_Returns_the_created_test_details_response")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .allowInsecure(true)
                    .followRedirects(true)
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .monitorName(
                        "Example-Create_an_API_HTTP_test_returns_OK_Returns_the_created_test_details_response")
                    .monitorPriority(5)
                    .retry(new SyntheticsTestOptionsRetry().count(3L).interval(10.0))
                    .tickEvery(60L))
            .subtype(SyntheticsTestDetailsSubType.HTTP)
            .tags(Collections.singletonList("testing:api"))
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
