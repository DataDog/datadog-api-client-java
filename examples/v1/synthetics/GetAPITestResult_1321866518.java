// Get an API test result returns result with failure object

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.SyntheticsAPITestResultFull;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a "synthetics_api_test_with_wrong_dns" in the system
    String SYNTHETICS_API_TEST_WITH_WRONG_DNS_PUBLIC_ID =
        System.getenv("SYNTHETICS_API_TEST_WITH_WRONG_DNS_PUBLIC_ID");

    // the "synthetics_api_test_with_wrong_dns" is triggered
    String SYNTHETICS_API_TEST_WITH_WRONG_DNS_RESULT_RESULTS_0_RESULT_ID =
        System.getenv("SYNTHETICS_API_TEST_WITH_WRONG_DNS_RESULT_RESULTS_0_RESULT_ID");

    try {
      SyntheticsAPITestResultFull result =
          apiInstance.getAPITestResult(
              SYNTHETICS_API_TEST_WITH_WRONG_DNS_PUBLIC_ID,
              SYNTHETICS_API_TEST_WITH_WRONG_DNS_RESULT_RESULTS_0_RESULT_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#getAPITestResult");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
