// Get Test Optimization service settings returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TestOptimizationApi;
import com.datadog.api.client.v2.model.TestOptimizationServiceSettingsResponse;
import com.datadog.api.client.v2.model.TestOptimizationGetServiceSettingsRequest;
import com.datadog.api.client.v2.model.TestOptimizationGetServiceSettingsRequestAttributes;
import com.datadog.api.client.v2.model.TestOptimizationGetServiceSettingsRequestData;
import com.datadog.api.client.v2.model.TestOptimizationGetServiceSettingsRequestDataType;
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
    defaultClient.setUnstableOperationEnabled("v2.getTestOptimizationServiceSettings", true);
    TestOptimizationApi apiInstance = new TestOptimizationApi(defaultClient);

    TestOptimizationGetServiceSettingsRequest body = new TestOptimizationGetServiceSettingsRequest()
.data(new TestOptimizationGetServiceSettingsRequestData()
.attributes(new TestOptimizationGetServiceSettingsRequestAttributes()
.env("prod")
.repositoryId("github.com/datadog/shopist")
.serviceName("shopist"))
.type(TestOptimizationGetServiceSettingsRequestDataType.TEST_OPTIMIZATION_GET_SERVICE_SETTINGS_REQUEST));

    try {
      TestOptimizationServiceSettingsResponse result = apiInstance.getTestOptimizationServiceSettings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestOptimizationApi#getTestOptimizationServiceSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}