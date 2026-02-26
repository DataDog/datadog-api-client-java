// Create an API test with UDP subtype returns "OK - Returns the created test details." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITestConfig;
import com.datadog.api.client.v1.model.SyntheticsAPITestType;
import com.datadog.api.client.v1.model.SyntheticsAssertion;
import com.datadog.api.client.v1.model.SyntheticsAssertionOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionTargetValue;
import com.datadog.api.client.v1.model.SyntheticsAssertionType;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import com.datadog.api.client.v1.model.SyntheticsTestRequestPort;
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
                    .assertions(
                        Arrays.asList(
                            new SyntheticsAssertion(
                                new SyntheticsAssertionTarget()
                                    .operator(SyntheticsAssertionOperator.IS)
                                    .target(new SyntheticsAssertionTargetValue("message"))
                                    .type(SyntheticsAssertionType.RECEIVED_MESSAGE)),
                            new SyntheticsAssertion(
                                new SyntheticsAssertionTarget()
                                    .operator(SyntheticsAssertionOperator.LESS_THAN)
                                    .target(new SyntheticsAssertionTargetValue(2000.0))
                                    .type(SyntheticsAssertionType.RESPONSE_TIME))))
                    .request(
                        new SyntheticsTestRequest()
                            .host("https://datadoghq.com")
                            .message("message")
                            .port(new SyntheticsTestRequestPort(443L))))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("BDD test payload: synthetics_api_test_udp_payload.json")
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
                    .retry(new SyntheticsTestOptionsRetry().count(3L).interval(10.0))
                    .tickEvery(60L))
            .subtype(SyntheticsTestDetailsSubType.UDP)
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
