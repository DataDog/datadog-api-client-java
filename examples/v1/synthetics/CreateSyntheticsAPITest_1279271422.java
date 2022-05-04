// Create an API test with multi subtype returns "OK - Returns the created test details." response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.HTTPMethod;
import com.datadog.api.v1.client.model.SyntheticsAPIStep;
import com.datadog.api.v1.client.model.SyntheticsAPIStepSubtype;
import com.datadog.api.v1.client.model.SyntheticsAPITest;
import com.datadog.api.v1.client.model.SyntheticsAPITestConfig;
import com.datadog.api.v1.client.model.SyntheticsAPITestType;
import com.datadog.api.v1.client.model.SyntheticsAssertion;
import com.datadog.api.v1.client.model.SyntheticsAssertionOperator;
import com.datadog.api.v1.client.model.SyntheticsAssertionTarget;
import com.datadog.api.v1.client.model.SyntheticsAssertionType;
import com.datadog.api.v1.client.model.SyntheticsConfigVariable;
import com.datadog.api.v1.client.model.SyntheticsConfigVariableType;
import com.datadog.api.v1.client.model.SyntheticsTestDetailsSubType;
import com.datadog.api.v1.client.model.SyntheticsTestOptions;
import com.datadog.api.v1.client.model.SyntheticsTestOptionsRetry;
import com.datadog.api.v1.client.model.SyntheticsTestRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsAPITest body =
        new SyntheticsAPITest()
            .config(
                new SyntheticsAPITestConfig()
                    .configVariables(
                        Collections.singletonList(
                            new SyntheticsConfigVariable()
                                .example("content-type")
                                .name("PROPERTY")
                                .pattern("content-type")
                                .type(SyntheticsConfigVariableType.TEXT)))
                    .steps(
                        Collections.singletonList(
                            new SyntheticsAPIStep()
                                .allowFailure(true)
                                .assertions(
                                    Collections.singletonList(
                                        new SyntheticsAssertion(
                                            new SyntheticsAssertionTarget()
                                                .operator(SyntheticsAssertionOperator.IS)
                                                .type(SyntheticsAssertionType.STATUS_CODE)
                                                .target(200))))
                                .isCritical(true)
                                .name("request is sent")
                                .request(
                                    new SyntheticsTestRequest()
                                        .method(HTTPMethod.GET)
                                        .timeout(10.0)
                                        .url("https://datadoghq.com"))
                                .retry(new SyntheticsTestOptionsRetry().count(5L).interval(1000.0))
                                .subtype(SyntheticsAPIStepSubtype.HTTP))))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("BDD test payload: synthetics_api_test_multi_step_payload.json")
            .name(
                "Example-Create_an_API_test_with_multi_subtype_returns_OK_Returns_the_created_test_details_response")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .allowInsecure(true)
                    .followRedirects(true)
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .monitorName(
                        "Example-Create_an_API_test_with_multi_subtype_returns_OK_Returns_the_created_test_details_response")
                    .monitorPriority(5)
                    .retry(new SyntheticsTestOptionsRetry().count(3L).interval(1000.0))
                    .tickEvery(60L))
            .subtype(SyntheticsTestDetailsSubType.MULTI)
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
