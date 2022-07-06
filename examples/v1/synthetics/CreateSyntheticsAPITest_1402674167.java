// Create an API GRPC test returns "OK - Returns the created test details." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.HTTPMethod;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITestConfig;
import com.datadog.api.client.v1.model.SyntheticsAPITestType;
import com.datadog.api.client.v1.model.SyntheticsAssertion;
import com.datadog.api.client.v1.model.SyntheticsAssertionOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionType;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsMonitorOptions;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsAPITest body =
        new SyntheticsAPITest()
            .config(
                new SyntheticsAPITestConfig()
                    .assertions(
                        Collections.singletonList(
                            new SyntheticsAssertion(
                                new SyntheticsAssertionTarget()
                                    .operator(SyntheticsAssertionOperator.IS)
                                    .target(1)
                                    .type(SyntheticsAssertionType.GRPC_HEALTHCHECK_STATUS))))
                    .request(
                        new SyntheticsTestRequest()
                            .host("localhost")
                            .port(50051L)
                            .service("Hello")
                            .method(HTTPMethod.GET)
                            .message("")
                            .metadata(Map.ofEntries())))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("BDD test payload: synthetics_api_grpc_test_payload.json")
            .name(
                "Example-Create_an_API_GRPC_test_returns_OK_Returns_the_created_test_details_response")
            .options(
                new SyntheticsTestOptions()
                    .minFailureDuration(0L)
                    .minLocationFailed(1L)
                    .monitorOptions(new SyntheticsTestOptionsMonitorOptions().renotifyInterval(0L))
                    .monitorName(
                        "Example-Create_an_API_GRPC_test_returns_OK_Returns_the_created_test_details_response")
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
