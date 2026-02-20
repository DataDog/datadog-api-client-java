// Edit a Network Path test returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
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
import com.datadog.api.client.v2.model.SyntheticsNetworkTestResponse;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestSubType;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestType;
import com.datadog.api.client.v2.model.SyntheticsTestOptions;
import com.datadog.api.client.v2.model.SyntheticsTestOptionsMonitorOptions;
import com.datadog.api.client.v2.model.SyntheticsTestOptionsMonitorOptionsNotificationPresetName;
import com.datadog.api.client.v2.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v2.model.SyntheticsTestOptionsScheduling;
import com.datadog.api.client.v2.model.SyntheticsTestOptionsSchedulingTimeframe;
import com.datadog.api.client.v2.model.SyntheticsTestPauseStatus;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsNetworkTestEditRequest body =
        new SyntheticsNetworkTestEditRequest()
            .data(
                new SyntheticsNetworkTestEdit()
                    .attributes(
                        new SyntheticsNetworkTest()
                            .config(
                                new SyntheticsNetworkTestConfig()
                                    .assertions(
                                        Collections.singletonList(
                                            new SyntheticsNetworkAssertion(
                                                new SyntheticsNetworkAssertionLatency()
                                                    .operator(
                                                        SyntheticsNetworkAssertionOperator
                                                            .LESS_THAN)
                                                    .property(
                                                        SyntheticsNetworkAssertionProperty.AVG)
                                                    .target(500.0)
                                                    .type(
                                                        SyntheticsNetworkAssertionLatencyType
                                                            .LATENCY))))
                                    .request(
                                        new SyntheticsNetworkTestRequest()
                                            .e2eQueries(50L)
                                            .host("")
                                            .maxTtl(30L)
                                            .port(443L)
                                            .tcpMethod(
                                                SyntheticsNetworkTestRequestTCPMethod.PREFER_SACK)
                                            .tracerouteQueries(3L)))
                            .locations(Arrays.asList("aws:us-east-1", "agent:my-agent-name"))
                            .message("Network Path test notification")
                            .name("Example Network Path test")
                            .options(
                                new SyntheticsTestOptions()
                                    .monitorOptions(
                                        new SyntheticsTestOptionsMonitorOptions()
                                            .notificationPresetName(
                                                SyntheticsTestOptionsMonitorOptionsNotificationPresetName
                                                    .SHOW_ALL))
                                    .restrictedRoles(
                                        Collections.singletonList(
                                            "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"))
                                    .retry(new SyntheticsTestOptionsRetry())
                                    .scheduling(
                                        new SyntheticsTestOptionsScheduling()
                                            .timeframes(
                                                Arrays.asList(
                                                    new SyntheticsTestOptionsSchedulingTimeframe()
                                                        .day(1)
                                                        .from("07:00")
                                                        .to("16:00"),
                                                    new SyntheticsTestOptionsSchedulingTimeframe()
                                                        .day(3)
                                                        .from("07:00")
                                                        .to("16:00")))
                                            .timezone("America/New_York")))
                            .status(SyntheticsTestPauseStatus.LIVE)
                            .subtype(SyntheticsNetworkTestSubType.TCP)
                            .tags(Collections.singletonList("env:production"))
                            .type(SyntheticsNetworkTestType.NETWORK))
                    .type(SyntheticsNetworkTestType.NETWORK));

    try {
      SyntheticsNetworkTestResponse result =
          apiInstance.updateSyntheticsNetworkTest("public_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updateSyntheticsNetworkTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
