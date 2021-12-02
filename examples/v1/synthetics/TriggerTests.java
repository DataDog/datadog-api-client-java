// Trigger Synthetics tests returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.SyntheticsTriggerBody;
import com.datadog.api.v1.client.model.SyntheticsTriggerCITestsResponse;
import com.datadog.api.v1.client.model.SyntheticsTriggerTest;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "synthetics_api_test" in the system
    String SYNTHETICS_API_TEST_PUBLIC_ID = System.getenv("SYNTHETICS_API_TEST_PUBLIC_ID");

    SyntheticsTriggerBody body =
        new SyntheticsTriggerBody()
            .tests(
                new ArrayList<SyntheticsTriggerTest>() {
                  {
                    add(new SyntheticsTriggerTest().publicId(SYNTHETICS_API_TEST_PUBLIC_ID));
                  }
                });

    try {
      SyntheticsTriggerCITestsResponse result = apiInstance.triggerTests(body);
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
