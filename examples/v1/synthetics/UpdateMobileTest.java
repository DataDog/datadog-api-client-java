// Edit a Mobile test returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsMobileTest;
import com.datadog.api.client.v1.model.SyntheticsMobileTestConfig;
import com.datadog.api.client.v1.model.SyntheticsMobileTestOptions;
import com.datadog.api.client.v1.model.SyntheticsMobileTestType;
import com.datadog.api.client.v1.model.SyntheticsMobileTestsMobileApplication;
import com.datadog.api.client.v1.model.SyntheticsMobileTestsMobileApplicationReferenceType;
import com.datadog.api.client.v1.model.SyntheticsTestPauseStatus;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "synthetics_mobile_test" in the system
    String SYNTHETICS_MOBILE_TEST_PUBLIC_ID = System.getenv("SYNTHETICS_MOBILE_TEST_PUBLIC_ID");

    SyntheticsMobileTest body =
        new SyntheticsMobileTest()
            .name("Example-Synthetic-updated")
            .status(SyntheticsTestPauseStatus.PAUSED)
            .type(SyntheticsMobileTestType.MOBILE)
            .config(new SyntheticsMobileTestConfig())
            .message("")
            .options(
                new SyntheticsMobileTestOptions()
                    .deviceIds(
                        Collections.singletonList("synthetics:mobile:device:iphone_15_ios_17"))
                    .mobileApplication(
                        new SyntheticsMobileTestsMobileApplication()
                            .applicationId("ab0e0aed-536d-411a-9a99-5428c27d8f8e")
                            .referenceId("6115922a-5f5d-455e-bc7e-7955a57f3815")
                            .referenceType(
                                SyntheticsMobileTestsMobileApplicationReferenceType.VERSION))
                    .tickEvery(3600L));

    try {
      SyntheticsMobileTest result =
          apiInstance.updateMobileTest(SYNTHETICS_MOBILE_TEST_PUBLIC_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updateMobileTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
