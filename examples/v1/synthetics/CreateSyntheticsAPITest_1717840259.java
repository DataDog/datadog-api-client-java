// Create a multi-step api test with every type of basicAuth returns "OK - Returns the created test
// details." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsAPIStep;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITestConfig;
import com.datadog.api.client.v1.model.SyntheticsAPITestStep;
import com.datadog.api.client.v1.model.SyntheticsAPITestStepSubtype;
import com.datadog.api.client.v1.model.SyntheticsAPITestType;
import com.datadog.api.client.v1.model.SyntheticsAssertion;
import com.datadog.api.client.v1.model.SyntheticsAssertionOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionTargetValue;
import com.datadog.api.client.v1.model.SyntheticsAssertionType;
import com.datadog.api.client.v1.model.SyntheticsBasicAuth;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthDigest;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthDigestType;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthNTLM;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthNTLMType;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthOauthClient;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthOauthClientType;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthOauthROP;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthOauthROPType;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthOauthTokenApiAuthentication;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthSigv4;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthSigv4Type;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthWeb;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthWebType;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
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
                    .steps(
                        Arrays.asList(
                            new SyntheticsAPIStep(
                                new SyntheticsAPITestStep()
                                    .assertions(
                                        Collections.singletonList(
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.IS)
                                                    .type(SyntheticsAssertionType.STATUS_CODE)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(
                                                            200.0)))))
                                    .name("request is sent")
                                    .request(
                                        new SyntheticsTestRequest()
                                            .url("https://httpbin.org/status/200")
                                            .method("GET")
                                            .basicAuth(
                                                new SyntheticsBasicAuth(
                                                    new SyntheticsBasicAuthWeb()
                                                        .password("password")
                                                        .username("username"))))
                                    .subtype(SyntheticsAPITestStepSubtype.HTTP)),
                            new SyntheticsAPIStep(
                                new SyntheticsAPITestStep()
                                    .assertions(
                                        Collections.singletonList(
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.IS)
                                                    .type(SyntheticsAssertionType.STATUS_CODE)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(
                                                            200.0)))))
                                    .name("request is sent")
                                    .request(
                                        new SyntheticsTestRequest()
                                            .url("https://httpbin.org/status/200")
                                            .method("GET")
                                            .basicAuth(
                                                new SyntheticsBasicAuth(
                                                    new SyntheticsBasicAuthWeb()
                                                        .password("password")
                                                        .username("username")
                                                        .type(SyntheticsBasicAuthWebType.WEB))))
                                    .subtype(SyntheticsAPITestStepSubtype.HTTP)),
                            new SyntheticsAPIStep(
                                new SyntheticsAPITestStep()
                                    .assertions(
                                        Collections.singletonList(
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.IS)
                                                    .type(SyntheticsAssertionType.STATUS_CODE)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(
                                                            200.0)))))
                                    .name("request is sent")
                                    .request(
                                        new SyntheticsTestRequest()
                                            .url("https://httpbin.org/status/200")
                                            .method("GET")
                                            .basicAuth(
                                                new SyntheticsBasicAuth(
                                                    new SyntheticsBasicAuthSigv4()
                                                        .accessKey("accessKey")
                                                        .secretKey("secretKey")
                                                        .type(SyntheticsBasicAuthSigv4Type.SIGV4))))
                                    .subtype(SyntheticsAPITestStepSubtype.HTTP)),
                            new SyntheticsAPIStep(
                                new SyntheticsAPITestStep()
                                    .assertions(
                                        Collections.singletonList(
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.IS)
                                                    .type(SyntheticsAssertionType.STATUS_CODE)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(
                                                            200.0)))))
                                    .name("request is sent")
                                    .request(
                                        new SyntheticsTestRequest()
                                            .url("https://httpbin.org/status/200")
                                            .method("GET")
                                            .basicAuth(
                                                new SyntheticsBasicAuth(
                                                    new SyntheticsBasicAuthNTLM()
                                                        .type(SyntheticsBasicAuthNTLMType.NTLM))))
                                    .subtype(SyntheticsAPITestStepSubtype.HTTP)),
                            new SyntheticsAPIStep(
                                new SyntheticsAPITestStep()
                                    .assertions(
                                        Collections.singletonList(
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.IS)
                                                    .type(SyntheticsAssertionType.STATUS_CODE)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(
                                                            200.0)))))
                                    .name("request is sent")
                                    .request(
                                        new SyntheticsTestRequest()
                                            .url("https://httpbin.org/status/200")
                                            .method("GET")
                                            .basicAuth(
                                                new SyntheticsBasicAuth(
                                                    new SyntheticsBasicAuthDigest()
                                                        .password("password")
                                                        .username("username")
                                                        .type(
                                                            SyntheticsBasicAuthDigestType.DIGEST))))
                                    .subtype(SyntheticsAPITestStepSubtype.HTTP)),
                            new SyntheticsAPIStep(
                                new SyntheticsAPITestStep()
                                    .assertions(
                                        Collections.singletonList(
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.IS)
                                                    .type(SyntheticsAssertionType.STATUS_CODE)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(
                                                            200.0)))))
                                    .name("request is sent")
                                    .request(
                                        new SyntheticsTestRequest()
                                            .url("https://httpbin.org/status/200")
                                            .method("GET")
                                            .basicAuth(
                                                new SyntheticsBasicAuth(
                                                    new SyntheticsBasicAuthOauthClient()
                                                        .accessTokenUrl("accessTokenUrl")
                                                        .tokenApiAuthentication(
                                                            SyntheticsBasicAuthOauthTokenApiAuthentication
                                                                .HEADER)
                                                        .clientId("clientId")
                                                        .clientSecret("clientSecret")
                                                        .type(
                                                            SyntheticsBasicAuthOauthClientType
                                                                .OAUTH_CLIENT))))
                                    .subtype(SyntheticsAPITestStepSubtype.HTTP)),
                            new SyntheticsAPIStep(
                                new SyntheticsAPITestStep()
                                    .assertions(
                                        Collections.singletonList(
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.IS)
                                                    .type(SyntheticsAssertionType.STATUS_CODE)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(
                                                            200.0)))))
                                    .name("request is sent")
                                    .request(
                                        new SyntheticsTestRequest()
                                            .url("https://httpbin.org/status/200")
                                            .method("GET")
                                            .basicAuth(
                                                new SyntheticsBasicAuth(
                                                    new SyntheticsBasicAuthOauthROP()
                                                        .accessTokenUrl("accessTokenUrl")
                                                        .password("password")
                                                        .tokenApiAuthentication(
                                                            SyntheticsBasicAuthOauthTokenApiAuthentication
                                                                .HEADER)
                                                        .username("username")
                                                        .type(
                                                            SyntheticsBasicAuthOauthROPType
                                                                .OAUTH_ROP))))
                                    .subtype(SyntheticsAPITestStepSubtype.HTTP)))))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message(
                "BDD test payload:"
                    + " synthetics_api_test_multi_step_with_every_type_of_basic_auth.json")
            .name("Example-Synthetic")
            .options(new SyntheticsTestOptions().tickEvery(60L))
            .subtype(SyntheticsTestDetailsSubType.MULTI)
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
