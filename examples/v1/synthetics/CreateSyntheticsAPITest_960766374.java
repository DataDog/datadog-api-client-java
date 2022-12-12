// Create an API HTTP with oauth-rop test returns "OK - Returns the created test details." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
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
import com.datadog.api.client.v1.model.SyntheticsAssertionXPathOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionXPathTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionXPathTargetTarget;
import com.datadog.api.client.v1.model.SyntheticsBasicAuth;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthOauthROP;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthOauthROPType;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthOauthTokenApiAuthentication;
import com.datadog.api.client.v1.model.SyntheticsConfigVariable;
import com.datadog.api.client.v1.model.SyntheticsConfigVariableType;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import com.datadog.api.client.v1.model.SyntheticsTestRequestCertificate;
import com.datadog.api.client.v1.model.SyntheticsTestRequestCertificateItem;
import com.datadog.api.client.v1.model.SyntheticsTestRequestProxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
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
                                    .type(SyntheticsAssertionType.BODY)),
                            new SyntheticsAssertion(
                                new SyntheticsAssertionXPathTarget()
                                    .operator(SyntheticsAssertionXPathOperator.VALIDATES_X_PATH)
                                    .target(
                                        new SyntheticsAssertionXPathTargetTarget()
                                            .xPath("target-xpath")
                                            .targetValue("0")
                                            .operator("contains"))
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
                                        "examplecreateanapihttpwithoauthroptestreturnsokreturnsthecreatedtestdetailsresponse")))
                            .method("GET")
                            .timeout(10.0)
                            .url("https://datadoghq.com")
                            .proxy(
                                new SyntheticsTestRequestProxy()
                                    .url("https://datadoghq.com")
                                    .headers(Map.ofEntries()))
                            .basicAuth(
                                new SyntheticsBasicAuth(
                                    new SyntheticsBasicAuthOauthROP()
                                        .accessTokenUrl("https://datadog-token.com")
                                        .audience("audience")
                                        .clientId("client-id")
                                        .clientSecret("client-secret")
                                        .resource("resource")
                                        .scope("yoyo")
                                        .tokenApiAuthentication(
                                            SyntheticsBasicAuthOauthTokenApiAuthentication.BODY)
                                        .type(SyntheticsBasicAuthOauthROPType.OAUTH_ROP)
                                        .username("oauth-usermame")
                                        .password("oauth-password")))))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("BDD test payload: synthetics_api_http_test_payload.json")
            .name(
                "Example-Create_an_API_HTTP_with_oauth_rop_test_returns_OK_Returns_the_created_test_details_response")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .allowInsecure(true)
                    .followRedirects(true)
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .monitorName(
                        "Example-Create_an_API_HTTP_with_oauth_rop_test_returns_OK_Returns_the_created_test_details_response")
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
