// Create an API test with multi subtype returns "OK - Returns the created test details." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsAPIStep;
import com.datadog.api.client.v1.model.SyntheticsAPIStepSubtype;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITestConfig;
import com.datadog.api.client.v1.model.SyntheticsAPITestType;
import com.datadog.api.client.v1.model.SyntheticsAssertion;
import com.datadog.api.client.v1.model.SyntheticsAssertionOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionType;
import com.datadog.api.client.v1.model.SyntheticsConfigVariable;
import com.datadog.api.client.v1.model.SyntheticsConfigVariableType;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParseTestOptionsType;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParserType;
import com.datadog.api.client.v1.model.SyntheticsParsingOptions;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import com.datadog.api.client.v1.model.SyntheticsVariableParser;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
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
                                .extractedValues(
                                    Collections.singletonList(
                                        new SyntheticsParsingOptions()
                                            .field("server")
                                            .name("EXTRACTED_VALUE")
                                            .parser(
                                                new SyntheticsVariableParser()
                                                    .type(SyntheticsGlobalVariableParserType.RAW))
                                            .type(
                                                SyntheticsGlobalVariableParseTestOptionsType
                                                    .HTTP_HEADER)
                                            .secure(true)))
                                .isCritical(true)
                                .name("request is sent")
                                .request(
                                    new SyntheticsTestRequest()
                                        .method("GET")
                                        .timeout(10.0)
                                        .url("https://datadoghq.com"))
                                .retry(new SyntheticsTestOptionsRetry().count(5L).interval(1000.0))
                                .subtype(SyntheticsAPIStepSubtype.HTTP))))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("BDD test payload: synthetics_api_test_multi_step_payload.json")
            .name("Example-Synthetic")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .allowInsecure(true)
                    .followRedirects(true)
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .monitorName("Example-Synthetic")
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
