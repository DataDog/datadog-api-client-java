// Create an API test with UDP subtype returns "OK - Returns the created test details." response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.SyntheticsAPITest;
import com.datadog.api.v1.client.model.SyntheticsAPITestConfig;
import com.datadog.api.v1.client.model.SyntheticsAPITestType;
import com.datadog.api.v1.client.model.SyntheticsAssertion;
import com.datadog.api.v1.client.model.SyntheticsAssertionOperator;
import com.datadog.api.v1.client.model.SyntheticsAssertionTarget;
import com.datadog.api.v1.client.model.SyntheticsAssertionType;
import com.datadog.api.v1.client.model.SyntheticsConfigVariable;
import com.datadog.api.v1.client.model.SyntheticsTestDetailsSubType;
import com.datadog.api.v1.client.model.SyntheticsTestOptions;
import com.datadog.api.v1.client.model.SyntheticsTestOptionsRetry;
import com.datadog.api.v1.client.model.SyntheticsTestRequest;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsAPITest body =
        new SyntheticsAPITest()
            .config(
                new SyntheticsAPITestConfig()
                    .assertions(
                        new ArrayList<SyntheticsAssertion>() {
                          {
                            add(
                                new SyntheticsAssertion(
                                    new SyntheticsAssertionTarget()
                                        .operator(SyntheticsAssertionOperator.IS)
                                        .target("message")
                                        .type(SyntheticsAssertionType.RECEIVED_MESSAGE)));
                            add(
                                new SyntheticsAssertion(
                                    new SyntheticsAssertionTarget()
                                        .operator(SyntheticsAssertionOperator.LESS_THAN)
                                        .target(2000)
                                        .type(SyntheticsAssertionType.RESPONSE_TIME)));
                          }
                        })
                    .configVariables(
                        new ArrayList<SyntheticsConfigVariable>() {
                          {
                            ;
                          }
                        })
                    .request(
                        new SyntheticsTestRequest()
                            .host("https://datadoghq.com")
                            .message("message")
                            .port(443L)))
            .locations(
                new ArrayList<String>() {
                  {
                    add("aws:us-east-2");
                  }
                })
            .message("BDD test payload: synthetics_api_test_udp_payload.json")
            .name(
                "Example-Create_an_API_test_with_UDP_subtype_returns_OK_Returns_the_created_test_details_response")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .allowInsecure(true)
                    .followRedirects(true)
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .monitorName(
                        "Example-Create_an_API_test_with_UDP_subtype_returns_OK_Returns_the_created_test_details_response")
                    .monitorPriority(5)
                    .retry(new SyntheticsTestOptionsRetry().count(3L).interval(10.0))
                    .tickEvery(60L))
            .subtype(SyntheticsTestDetailsSubType.UDP)
            .tags(
                new ArrayList<String>() {
                  {
                    add("testing:api");
                  }
                })
            .type(SyntheticsAPITestType.API);

    try {
      SyntheticsAPITest result = apiInstance.createSyntheticsAPITest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
