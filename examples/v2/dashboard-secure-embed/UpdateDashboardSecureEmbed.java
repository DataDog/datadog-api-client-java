// Update a secure embed for a dashboard returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DashboardSecureEmbedApi;
import com.datadog.api.client.v2.model.SecureEmbedGlobalTime;
import com.datadog.api.client.v2.model.SecureEmbedGlobalTimeLiveSpan;
import com.datadog.api.client.v2.model.SecureEmbedSelectableTemplateVariable;
import com.datadog.api.client.v2.model.SecureEmbedStatus;
import com.datadog.api.client.v2.model.SecureEmbedUpdateRequest;
import com.datadog.api.client.v2.model.SecureEmbedUpdateRequestAttributes;
import com.datadog.api.client.v2.model.SecureEmbedUpdateRequestData;
import com.datadog.api.client.v2.model.SecureEmbedUpdateRequestType;
import com.datadog.api.client.v2.model.SecureEmbedUpdateResponse;
import com.datadog.api.client.v2.model.SecureEmbedViewingPreferences;
import com.datadog.api.client.v2.model.SecureEmbedViewingPreferencesTheme;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateDashboardSecureEmbed", true);
    DashboardSecureEmbedApi apiInstance = new DashboardSecureEmbedApi(defaultClient);

    SecureEmbedUpdateRequest body =
        new SecureEmbedUpdateRequest()
            .data(
                new SecureEmbedUpdateRequestData()
                    .attributes(
                        new SecureEmbedUpdateRequestAttributes()
                            .globalTime(
                                new SecureEmbedGlobalTime()
                                    .liveSpan(SecureEmbedGlobalTimeLiveSpan.PAST_ONE_HOUR))
                            .globalTimeSelectable(true)
                            .selectableTemplateVars(
                                Collections.singletonList(
                                    new SecureEmbedSelectableTemplateVariable()
                                        .defaultValues(Collections.singletonList("1"))
                                        .name("org_id")
                                        .prefix("org_id")
                                        .visibleTags(Collections.singletonList("1"))))
                            .status(SecureEmbedStatus.ACTIVE)
                            .title("Q1 Metrics Dashboard (Updated)")
                            .viewingPreferences(
                                new SecureEmbedViewingPreferences()
                                    .highDensity(false)
                                    .theme(SecureEmbedViewingPreferencesTheme.SYSTEM)))
                    .type(SecureEmbedUpdateRequestType.SECURE_EMBED_UPDATE_REQUEST));

    try {
      SecureEmbedUpdateResponse result =
          apiInstance.updateDashboardSecureEmbed("abc-def-ghi", "s3cur3t0k3n-abcdef123456", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling DashboardSecureEmbedApi#updateDashboardSecureEmbed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
