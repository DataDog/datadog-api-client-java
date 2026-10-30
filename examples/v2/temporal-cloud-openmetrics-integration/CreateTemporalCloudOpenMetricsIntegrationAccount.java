// Create a Temporal Cloud OpenMetrics account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TemporalCloudOpenMetricsIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthRequest;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountSettingsRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.createTemporalCloudOpenMetricsIntegrationAccount", true);
    TemporalCloudOpenMetricsIntegrationApi apiInstance =
        new TemporalCloudOpenMetricsIntegrationApi(defaultClient);

    TemporalCloudOpenMetricsIntegrationAccountCreateRequest body =
        new TemporalCloudOpenMetricsIntegrationAccountCreateRequest()
            .data(
                new TemporalCloudOpenMetricsIntegrationAccountCreateData()
                    .attributes(
                        new TemporalCloudOpenMetricsIntegrationAccountCreateAttributes()
                            .authentication(
                                new TemporalCloudOpenMetricsIntegrationAccountAuthenticationRequest(
                                    new TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthRequest()
                                        .authType(
                                            TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .name("temporal-cloud-prod")
                            .settings(
                                new TemporalCloudOpenMetricsIntegrationAccountSettingsRequest()
                                    .includeOptInLabels(false)
                                    .namespacesToInclude("prod-*,billing.a1b2c")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      TemporalCloudOpenMetricsIntegrationAccountResponse result =
          apiInstance.createTemporalCloudOpenMetricsIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " TemporalCloudOpenMetricsIntegrationApi#createTemporalCloudOpenMetricsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
