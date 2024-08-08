// Get an API test result returns result with failure object

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsAPITestResultFull;
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

    // there is a "synthetics_api_test_with_wrong_dns" in the system
    String SYNTHETICS_API_TEST_WITH_WRONG_DNS_PUBLIC_ID = System.getenv("SYNTHETICS_API_TEST_WITH_WRONG_DNS_PUBLIC_ID");

    // the "synthetics_api_test_with_wrong_dns" is triggered
    String SYNTHETICS_API_TEST_WITH_WRONG_DNS_RESULT_RESULTS_0_RESULT_ID = System.getenv("SYNTHETICS_API_TEST_WITH_WRONG_DNS_RESULT_RESULTS_0_RESULT_ID");

    try {
      SyntheticsAPITestResultFull result = apiInstance.getAPITestResult(SYNTHETICS_API_TEST_WITH_WRONG_DNS_PUBLIC_ID, SYNTHETICS_API_TEST_WITH_WRONG_DNS_RESULT_RESULTS_0_RESULT_ID);
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