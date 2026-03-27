// Create a Network Path test returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestResponse;
import com.datadog.api.client.v2.model.SyntheticsNetworkAssertion;
import com.datadog.api.client.v2.model.SyntheticsNetworkAssertionLatency;
import com.datadog.api.client.v2.model.SyntheticsNetworkAssertionLatencyType;
import com.datadog.api.client.v2.model.SyntheticsNetworkAssertionOperator;
import com.datadog.api.client.v2.model.SyntheticsNetworkAssertionProperty;
import com.datadog.api.client.v2.model.SyntheticsNetworkTest;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestConfig;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestEdit;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestEditRequest;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestRequest;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestRequestTCPMethod;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestSubType;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestType;
import com.datadog.api.client.v2.model.SyntheticsTestOptions;
import com.datadog.api.client.v2.model.SyntheticsTestPauseStatus;
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

    SyntheticsNetworkTestEditRequest body = new SyntheticsNetworkTestEditRequest()
.data(new SyntheticsNetworkTestEdit()
.attributes(new SyntheticsNetworkTest()
.config(new SyntheticsNetworkTestConfig()
.assertions(Collections.singletonList(new SyntheticsNetworkAssertion(
new SyntheticsNetworkAssertionLatency()
.operator(SyntheticsNetworkAssertionOperator.LESS_THAN)
.property(SyntheticsNetworkAssertionProperty.AVG)
.target(500.0)
.type(SyntheticsNetworkAssertionLatencyType.LATENCY))))
.request(new SyntheticsNetworkTestRequest()
.host("example.com")
.port(443L)
.tcpMethod(SyntheticsNetworkTestRequestTCPMethod.PREFER_SACK)
.maxTtl(30L)
.e2eQueries(50L)
.tracerouteQueries(3L)))
.locations(Arrays.asList("aws:us-east-1", "agent:my-agent-name"))
.message("Network Path test notification")
.name("Example Network Path test")
.options(new SyntheticsTestOptions()
.tickEvery(60L))
.status(SyntheticsTestPauseStatus.LIVE)
.subtype(SyntheticsNetworkTestSubType.TCP)
.tags(Collections.singletonList("env:production"))
.type(SyntheticsNetworkTestType.NETWORK))
.type(SyntheticsNetworkTestType.NETWORK));

    try {
      SyntheticsNetworkTestResponse result = apiInstance.createSyntheticsNetworkTest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#createSyntheticsNetworkTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}