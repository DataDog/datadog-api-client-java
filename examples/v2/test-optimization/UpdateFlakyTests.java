// Update flaky test states returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TestOptimizationApi;
import com.datadog.api.client.v2.model.UpdateFlakyTestsResponse;
import com.datadog.api.client.v2.model.UpdateFlakyTestsRequest;
import com.datadog.api.client.v2.model.UpdateFlakyTestsRequestAttributes;
import com.datadog.api.client.v2.model.UpdateFlakyTestsRequestData;
import com.datadog.api.client.v2.model.UpdateFlakyTestsRequestDataType;
import com.datadog.api.client.v2.model.UpdateFlakyTestsRequestTest;
import com.datadog.api.client.v2.model.UpdateFlakyTestsRequestTestNewState;
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
    defaultClient.setUnstableOperationEnabled("v2.updateFlakyTests", true);
    TestOptimizationApi apiInstance = new TestOptimizationApi(defaultClient);

    UpdateFlakyTestsRequest body = new UpdateFlakyTestsRequest()
.data(new UpdateFlakyTestsRequestData()
.attributes(new UpdateFlakyTestsRequestAttributes()
.tests(Collections.singletonList(new UpdateFlakyTestsRequestTest()
.id("4eb1887a8adb1847")
.newState(UpdateFlakyTestsRequestTestNewState.ACTIVE))))
.type(UpdateFlakyTestsRequestDataType.UPDATE_FLAKY_TEST_STATE_REQUEST));

    try {
      UpdateFlakyTestsResponse result = apiInstance.updateFlakyTests(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestOptimizationApi#updateFlakyTests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}