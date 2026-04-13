// Create a secure embed for a dashboard returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DashboardSecureEmbedApi;
import com.datadog.api.client.v2.model.SecureEmbedCreateRequest;
import com.datadog.api.client.v2.model.SecureEmbedCreateRequestAttributes;
import com.datadog.api.client.v2.model.SecureEmbedCreateRequestData;
import com.datadog.api.client.v2.model.SecureEmbedCreateResponse;
import com.datadog.api.client.v2.model.SecureEmbedGlobalTime;
import com.datadog.api.client.v2.model.SecureEmbedGlobalTimeLiveSpan;
import com.datadog.api.client.v2.model.SecureEmbedRequestType;
import com.datadog.api.client.v2.model.SecureEmbedSelectableTemplateVariable;
import com.datadog.api.client.v2.model.SecureEmbedStatus;
import com.datadog.api.client.v2.model.SecureEmbedViewingPreferences;
import com.datadog.api.client.v2.model.SecureEmbedViewingPreferencesTheme;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createDashboardSecureEmbed", true);
    DashboardSecureEmbedApi apiInstance = new DashboardSecureEmbedApi(defaultClient);

    SecureEmbedCreateRequest body =
        new SecureEmbedCreateRequest()
            .data(
                new SecureEmbedCreateRequestData()
                    .attributes(
                        new SecureEmbedCreateRequestAttributes()
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
                            .title("Q1 Metrics Dashboard")
                            .viewingPreferences(
                                new SecureEmbedViewingPreferences()
                                    .highDensity(false)
                                    .theme(SecureEmbedViewingPreferencesTheme.SYSTEM)))
                    .type(SecureEmbedRequestType.SECURE_EMBED_REQUEST));

    try {
      SecureEmbedCreateResponse result =
          apiInstance.createDashboardSecureEmbed("abc-def-ghi", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling DashboardSecureEmbedApi#createDashboardSecureEmbed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
