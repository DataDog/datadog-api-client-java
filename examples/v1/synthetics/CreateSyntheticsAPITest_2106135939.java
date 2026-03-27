// Create a multistep test with subtest returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsAPIStep;
import com.datadog.api.client.v1.model.SyntheticsAPISubtestStep;
import com.datadog.api.client.v1.model.SyntheticsAPISubtestStepSubtype;
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
import com.datadog.api.client.v1.model.SyntheticsBasicAuthWeb;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "synthetics_api_test" in the system
    String SYNTHETICS_API_TEST_PUBLIC_ID = System.getenv("SYNTHETICS_API_TEST_PUBLIC_ID");

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
                                new SyntheticsAPISubtestStep()
                                    .subtype(SyntheticsAPISubtestStepSubtype.PLAY_SUB_TEST)
                                    .subtestPublicId(SYNTHETICS_API_TEST_PUBLIC_ID)
                                    .name("subtest step")))))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("BDD test payload: synthetics_api_test_multi_step_with_subtest.json")
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
