// Create a browser test returns "OK - Returns the created test details." response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.HTTPMethod;
import com.datadog.api.v1.client.model.SyntheticsAssertion;
import com.datadog.api.v1.client.model.SyntheticsBrowserTest;
import com.datadog.api.v1.client.model.SyntheticsBrowserTestConfig;
import com.datadog.api.v1.client.model.SyntheticsBrowserTestType;
import com.datadog.api.v1.client.model.SyntheticsConfigVariable;
import com.datadog.api.v1.client.model.SyntheticsConfigVariableType;
import com.datadog.api.v1.client.model.SyntheticsDeviceID;
import com.datadog.api.v1.client.model.SyntheticsTestOptions;
import com.datadog.api.v1.client.model.SyntheticsTestOptionsRetry;
import com.datadog.api.v1.client.model.SyntheticsTestRequest;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsBrowserTest body =
        new SyntheticsBrowserTest()
            .config(
                new SyntheticsBrowserTestConfig()
                    .assertions(
                        new ArrayList<SyntheticsAssertion>() {
                          {
                            ;
                          }
                        })
                    .configVariables(
                        new ArrayList<SyntheticsConfigVariable>() {
                          {
                            add(
                                new SyntheticsConfigVariable()
                                    .example("content-type")
                                    .name("PROPERTY")
                                    .pattern("content-type")
                                    .type(SyntheticsConfigVariableType.TEXT));
                          }
                        })
                    .request(
                        new SyntheticsTestRequest()
                            .method(HTTPMethod.GET)
                            .url("https://datadoghq.com"))
                    .setCookie("name:test"))
            .locations(
                new ArrayList<String>() {
                  {
                    add("aws:us-east-2");
                  }
                })
            .message("Test message")
            .name(
                "Example-Create_a_browser_test_returns_OK_Returns_the_created_test_details_response")
            .options(
                new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .allowInsecure(true)
                    .deviceIds(
                        new ArrayList<SyntheticsDeviceID>() {
                          {
                            add(SyntheticsDeviceID.TABLET);
                          }
                        })
                    .disableCors(true)
                    .followRedirects(true)
                    .minFailureDuration(10L)
                    .minLocationFailed(1L)
                    .noScreenshot(true)
                    .retry(new SyntheticsTestOptionsRetry().count(3L).interval(10.0))
                    .tickEvery(300L))
            .tags(
                new ArrayList<String>() {
                  {
                    add("testing:browser");
                  }
                })
            .type(SyntheticsBrowserTestType.BROWSER);

    try {
      SyntheticsBrowserTest result = apiInstance.createSyntheticsBrowserTest(body);
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
