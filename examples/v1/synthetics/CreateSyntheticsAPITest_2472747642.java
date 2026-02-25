// Create an API test with WEBSOCKET subtype returns "OK - Returns the created test details." response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITestConfig;
import com.datadog.api.client.v1.model.SyntheticsAPITestType;
import com.datadog.api.client.v1.model.SyntheticsAssertion;
import com.datadog.api.client.v1.model.SyntheticsAssertionOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionTargetValue;
import com.datadog.api.client.v1.model.SyntheticsAssertionTargetValueNumber;
import com.datadog.api.client.v1.model.SyntheticsAssertionType;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsAPITest body = new SyntheticsAPITest()
.config(new SyntheticsAPITestConfig()
.assertions(Arrays.asList(new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.IS)
.target(new SyntheticsAssertionTargetValue(
"message"))
.type(SyntheticsAssertionType.RECEIVED_MESSAGE)), new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.LESS_THAN)
.target(new SyntheticsAssertionTargetValue(
2000.0))
.type(SyntheticsAssertionType.RESPONSE_TIME))))
.request(new SyntheticsTestRequest()
.url("ws://datadoghq.com")
.message("message")))
.locations(Collections.singletonList("aws:us-east-2"))
.message("BDD test payload: synthetics_api_test_websocket_payload.json")
.name("Example-Synthetic")
.options(new SyntheticsTestOptions()
.acceptSelfSigned(false)
.allowInsecure(true)
.followRedirects(true)
.minFailureDuration(10L)
.minLocationFailed(1L)
.monitorName("Example-Synthetic")
.monitorPriority(5)
.retry(new SyntheticsTestOptionsRetry()
.count(3L)
.interval(10.0))
.tickEvery(60L))
.subtype(SyntheticsTestDetailsSubType.WEBSOCKET)
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