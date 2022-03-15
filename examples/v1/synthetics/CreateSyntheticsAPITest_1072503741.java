// Create an API SSL test returns "OK - Returns the created test details." response

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
import com.datadog.api.v1.client.model.SyntheticsTestDetailsSubType;
import com.datadog.api.v1.client.model.SyntheticsTestOptions;
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
                        Collections.singletonList(
                            new SyntheticsAssertion(
                                new SyntheticsAssertionTarget()
                                    .operator(SyntheticsAssertionOperator.IS_IN_MORE_DAYS_THAN)
                                    .target(10)
                                    .type(SyntheticsAssertionType.CERTIFICATE))))
                    .request(new SyntheticsTestRequest().host("datadoghq.com").port(443L)))
            .locations(Collections.singletonList("aws:us-east-2"))
            .message("BDD test payload: synthetics_api_ssl_test_payload.json")
            .name(
                "Example-Create_an_API_SSL_test_returns_OK_Returns_the_created_test_details_response")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(true)
                    .checkCertificateRevocation(true)
                    .tickEvery(60L))
            .subtype(SyntheticsTestDetailsSubType.SSL)
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
