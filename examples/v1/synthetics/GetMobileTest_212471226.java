// Get a Mobile test returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsMobileTest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "synthetics_mobile_test" in the system
    String SYNTHETICS_MOBILE_TEST_PUBLIC_ID = System.getenv("SYNTHETICS_MOBILE_TEST_PUBLIC_ID");

    try {
      SyntheticsMobileTest result = apiInstance.getMobileTest(SYNTHETICS_MOBILE_TEST_PUBLIC_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#getMobileTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
