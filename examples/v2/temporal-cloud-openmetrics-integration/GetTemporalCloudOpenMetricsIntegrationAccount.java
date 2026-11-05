// Get a Temporal Cloud OpenMetrics account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TemporalCloudOpenMetricsIntegrationApi;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.getTemporalCloudOpenMetricsIntegrationAccount", true);
    TemporalCloudOpenMetricsIntegrationApi apiInstance =
        new TemporalCloudOpenMetricsIntegrationApi(defaultClient);

    try {
      TemporalCloudOpenMetricsIntegrationAccountResponse result =
          apiInstance.getTemporalCloudOpenMetricsIntegrationAccount("account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " TemporalCloudOpenMetricsIntegrationApi#getTemporalCloudOpenMetricsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
