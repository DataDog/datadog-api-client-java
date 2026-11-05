// Update a Temporal Cloud OpenMetrics account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TemporalCloudOpenMetricsIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.updateTemporalCloudOpenMetricsIntegrationAccount", true);
    TemporalCloudOpenMetricsIntegrationApi apiInstance =
        new TemporalCloudOpenMetricsIntegrationApi(defaultClient);

    TemporalCloudOpenMetricsIntegrationAccountUpdateRequest body =
        new TemporalCloudOpenMetricsIntegrationAccountUpdateRequest()
            .data(
                new TemporalCloudOpenMetricsIntegrationAccountUpdateData()
                    .attributes(
                        new TemporalCloudOpenMetricsIntegrationAccountUpdateAttributes()
                            .authentication(
                                new TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate(
                                    new TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate()
                                        .authType(
                                            TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .name("temporal-cloud-prod")
                            .settings(
                                new TemporalCloudOpenMetricsIntegrationAccountSettingsUpdate()
                                    .includeOptInLabels(false)
                                    .namespacesToInclude("prod-*,billing.a1b2c")))
                    .id("7c2d4e91-5a3b-4f68-b0e2-9d1f6a8c3e57")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      TemporalCloudOpenMetricsIntegrationAccountResponse result =
          apiInstance.updateTemporalCloudOpenMetricsIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " TemporalCloudOpenMetricsIntegrationApi#updateTemporalCloudOpenMetricsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
