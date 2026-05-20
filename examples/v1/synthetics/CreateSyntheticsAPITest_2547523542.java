// Create an API test with MCP steps returns "OK - Returns the created test details." response

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
import com.datadog.api.client.v1.model.SyntheticsAssertionMCPRespectsSpecification;
import com.datadog.api.client.v1.model.SyntheticsAssertionMCPRespectsSpecificationType;
import com.datadog.api.client.v1.model.SyntheticsAssertionMCPServerCapabilitiesTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionMCPServerCapabilitiesType;
import com.datadog.api.client.v1.model.SyntheticsAssertionOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionTargetValue;
import com.datadog.api.client.v1.model.SyntheticsAssertionType;
import com.datadog.api.client.v1.model.SyntheticsMCPProtocolVersion;
import com.datadog.api.client.v1.model.SyntheticsMCPServerCapability;
import com.datadog.api.client.v1.model.SyntheticsTestCallType;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
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
                    .steps(
                        Arrays.asList(
                            new SyntheticsAPIStep(
                                new SyntheticsAPITestStep()
                                    .name("Initialize MCP session")
                                    .subtype(SyntheticsAPITestStepSubtype.MCP)
                                    .allowFailure(false)
                                    .isCritical(true)
                                    .retry(
                                        new SyntheticsTestOptionsRetry().count(0L).interval(300.0))
                                    .assertions(
                                        Arrays.asList(
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.IS)
                                                    .type(SyntheticsAssertionType.STATUS_CODE)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(200.0))),
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionMCPRespectsSpecification()
                                                    .type(
                                                        SyntheticsAssertionMCPRespectsSpecificationType
                                                            .MCP_RESPECTS_SPECIFICATION)),
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionMCPServerCapabilitiesTarget()
                                                    .operator(SyntheticsAssertionOperator.CONTAINS)
                                                    .type(
                                                        SyntheticsAssertionMCPServerCapabilitiesType
                                                            .MCP_SERVER_CAPABILITIES)
                                                    .target(
                                                        Collections.singletonList(
                                                            SyntheticsMCPServerCapability.TOOLS)))))
                                    .request(
                                        new SyntheticsTestRequest()
                                            .url("https://example.org/mcp")
                                            .callType(SyntheticsTestCallType.INIT)
                                            .mcpProtocolVersion(
                                                SyntheticsMCPProtocolVersion.VERSION_2025_06_18)
                                            .headers(
                                                Map.ofEntries(
                                                    Map.entry("DD-API-KEY", "<YOUR-API-KEY>"),
                                                    Map.entry(
                                                        "DD-APPLICATION-KEY", "<YOUR-APP-KEY>"))))),
                            new SyntheticsAPIStep(
                                new SyntheticsAPITestStep()
                                    .name("List MCP tools")
                                    .subtype(SyntheticsAPITestStepSubtype.MCP)
                                    .allowFailure(false)
                                    .isCritical(true)
                                    .retry(
                                        new SyntheticsTestOptionsRetry().count(0L).interval(300.0))
                                    .assertions(
                                        Arrays.asList(
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.IS)
                                                    .type(SyntheticsAssertionType.STATUS_CODE)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(200.0))),
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.MORE_THAN)
                                                    .type(SyntheticsAssertionType.MCP_TOOL_COUNT)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(0.0))),
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.LESS_THAN)
                                                    .type(
                                                        SyntheticsAssertionType
                                                            .MCP_TOOL_NAME_LENGTH)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(64.0))),
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionMCPRespectsSpecification()
                                                    .type(
                                                        SyntheticsAssertionMCPRespectsSpecificationType
                                                            .MCP_RESPECTS_SPECIFICATION))))
                                    .request(
                                        new SyntheticsTestRequest()
                                            .url("https://example.org/mcp")
                                            .callType(SyntheticsTestCallType.TOOL_LIST)
                                            .mcpProtocolVersion(
                                                SyntheticsMCPProtocolVersion.VERSION_2025_06_18)
                                            .headers(
                                                Map.ofEntries(
                                                    Map.entry("DD-API-KEY", "<YOUR-API-KEY>"),
                                                    Map.entry(
                                                        "DD-APPLICATION-KEY", "<YOUR-APP-KEY>"))))),
                            new SyntheticsAPIStep(
                                new SyntheticsAPITestStep()
                                    .name("Call MCP search tool")
                                    .subtype(SyntheticsAPITestStepSubtype.MCP)
                                    .allowFailure(false)
                                    .isCritical(true)
                                    .retry(
                                        new SyntheticsTestOptionsRetry().count(0L).interval(300.0))
                                    .assertions(
                                        Arrays.asList(
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.IS)
                                                    .type(SyntheticsAssertionType.STATUS_CODE)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(200.0))),
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionTarget()
                                                    .operator(SyntheticsAssertionOperator.LESS_THAN)
                                                    .type(SyntheticsAssertionType.RESPONSE_TIME)
                                                    .target(
                                                        new SyntheticsAssertionTargetValue(
                                                            5000.0))),
                                            new SyntheticsAssertion(
                                                new SyntheticsAssertionMCPRespectsSpecification()
                                                    .type(
                                                        SyntheticsAssertionMCPRespectsSpecificationType
                                                            .MCP_RESPECTS_SPECIFICATION))))
                                    .request(
                                        new SyntheticsTestRequest()
                                            .url("https://example.org/mcp")
                                            .callType(SyntheticsTestCallType.TOOL_CALL)
                                            .mcpProtocolVersion(
                                                SyntheticsMCPProtocolVersion.VERSION_2025_06_18)
                                            .toolName("search")
                                            .toolArgs(
                                                Map.ofEntries(
                                                    Map.entry("limit", "5"),
                                                    Map.entry("query", "datadog synthetics")))
                                            .headers(
                                                Map.ofEntries(
                                                    Map.entry("DD-API-KEY", "<YOUR-API-KEY>"),
                                                    Map.entry(
                                                        "DD-APPLICATION-KEY",
                                                        "<YOUR-APP-KEY>"))))))))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("BDD test payload: synthetics_api_test_mcp_payload.json")
            .name("Example-Synthetic")
            .options(
                new SyntheticsTestOptions()
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .monitorName("Example-Synthetic")
                    .monitorPriority(5)
                    .retry(new SyntheticsTestOptionsRetry().count(3L).interval(1000.0))
                    .tickEvery(900L))
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
