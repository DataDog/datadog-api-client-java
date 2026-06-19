// Update Test Optimization service settings returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TestOptimizationApi;
import com.datadog.api.client.v2.model.TestOptimizationServiceSettingsResponse;
import com.datadog.api.client.v2.model.TestOptimizationUpdateServiceSettingsRequest;
import com.datadog.api.client.v2.model.TestOptimizationUpdateServiceSettingsRequestAttributes;
import com.datadog.api.client.v2.model.TestOptimizationUpdateServiceSettingsRequestData;
import com.datadog.api.client.v2.model.TestOptimizationUpdateServiceSettingsRequestDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TestOptimizationApi apiInstance = new TestOptimizationApi(defaultClient);

    TestOptimizationUpdateServiceSettingsRequest body =
        new TestOptimizationUpdateServiceSettingsRequest()
            .data(
                new TestOptimizationUpdateServiceSettingsRequestData()
                    .attributes(
                        new TestOptimizationUpdateServiceSettingsRequestAttributes()
                            .autoTestRetriesEnabled(false)
                            .autoTestRetriesEnabledInherit(false)
                            .codeCoverageEnabled(false)
                            .codeCoverageEnabledInherit(false)
                            .earlyFlakeDetectionEnabled(false)
                            .earlyFlakeDetectionEnabledInherit(false)
                            .env("prod")
                            .failedTestReplayEnabled(false)
                            .failedTestReplayEnabledInherit(false)
                            .prCommentsEnabled(false)
                            .repositoryId("github.com/datadog/shopist")
                            .serviceName("shopist")
                            .testImpactAnalysisEnabled(true)
                            .testImpactAnalysisEnabledInherit(true))
                    .type(
                        TestOptimizationUpdateServiceSettingsRequestDataType
                            .TEST_OPTIMIZATION_UPDATE_SERVICE_SETTINGS_REQUEST));

    try {
      TestOptimizationServiceSettingsResponse result =
          apiInstance.updateTestOptimizationServiceSettings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TestOptimizationApi#updateTestOptimizationServiceSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
