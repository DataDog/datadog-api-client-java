// Patch a Synthetic test returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsTestDetails;
import com.datadog.api.client.v1.model.SyntheticsPatchTestBody;
import com.datadog.api.client.v1.model.SyntheticsPatchTestOperation;
import com.datadog.api.client.v1.model.SyntheticsPatchTestOperationName;
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

    // there is a valid "synthetics_api_test" in the system
    String SYNTHETICS_API_TEST_PUBLIC_ID = System.getenv("SYNTHETICS_API_TEST_PUBLIC_ID");

    SyntheticsPatchTestBody body = new SyntheticsPatchTestBody()
.data(Arrays.asList(new SyntheticsPatchTestOperation()
.op(SyntheticsPatchTestOperationName.REPLACE)
.path("/name")
.value("New test name"), new SyntheticsPatchTestOperation()
.op(SyntheticsPatchTestOperationName.REMOVE)
.path("/config/assertions/0")));

    try {
      SyntheticsTestDetails result = apiInstance.patchTest(SYNTHETICS_API_TEST_PUBLIC_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#patchTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}