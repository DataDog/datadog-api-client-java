// Create an API GRPC test returns "OK - Returns the created test details." response

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
import com.datadog.api.client.v1.model.SyntheticsTestOptionsMonitorOptions;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import com.datadog.api.client.v1.model.SyntheticsTestRequestNumericalPort;
import com.datadog.api.client.v1.model.SyntheticsTestRequestPort;
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
1.0))
.type(SyntheticsAssertionType.GRPC_HEALTHCHECK_STATUS)), new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.IS)
.target(new SyntheticsAssertionTargetValue(
"proto target"))
.type(SyntheticsAssertionType.GRPC_PROTO)), new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.IS)
.target(new SyntheticsAssertionTargetValue(
"123"))
.property("property")
.type(SyntheticsAssertionType.GRPC_METADATA))))
.request(new SyntheticsTestRequest()
.host("localhost")
.port(new SyntheticsTestRequestPort(
50051L))
.service("Hello")
.method("GET")
.message("")
.metadata(Map.ofEntries())))
.locations(Collections.singletonList("aws:us-east-2"))
.message("BDD test payload: synthetics_api_grpc_test_payload.json")
.name("Example-Synthetic")
.options(new SyntheticsTestOptions()
.minFailureDuration(0L)
.minLocationFailed(1L)
.monitorOptions(new SyntheticsTestOptionsMonitorOptions()
.renotifyInterval(0L))
.monitorName("Example-Synthetic")
.tickEvery(60L))
.subtype(SyntheticsTestDetailsSubType.GRPC)
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