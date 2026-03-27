// Delete Test Optimization service settings returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TestOptimizationApi;
import com.datadog.api.client.v2.model.TestOptimizationDeleteServiceSettingsRequest;
import com.datadog.api.client.v2.model.TestOptimizationDeleteServiceSettingsRequestAttributes;
import com.datadog.api.client.v2.model.TestOptimizationDeleteServiceSettingsRequestData;
import com.datadog.api.client.v2.model.TestOptimizationDeleteServiceSettingsRequestDataType;
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
    defaultClient.setUnstableOperationEnabled("v2.deleteTestOptimizationServiceSettings", true);
    TestOptimizationApi apiInstance = new TestOptimizationApi(defaultClient);

    TestOptimizationDeleteServiceSettingsRequest body = new TestOptimizationDeleteServiceSettingsRequest()
.data(new TestOptimizationDeleteServiceSettingsRequestData()
.attributes(new TestOptimizationDeleteServiceSettingsRequestAttributes()
.env("prod")
.repositoryId("github.com/datadog/shopist")
.serviceName("shopist"))
.type(TestOptimizationDeleteServiceSettingsRequestDataType.TEST_OPTIMIZATION_DELETE_SERVICE_SETTINGS_REQUEST));

    try {
      apiInstance.deleteTestOptimizationServiceSettings(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestOptimizationApi#deleteTestOptimizationServiceSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}