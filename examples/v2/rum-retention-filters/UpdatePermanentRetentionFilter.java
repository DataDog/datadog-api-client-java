// Update a permanent RUM retention filter returns "Updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RUMCrossProductSamplingUpdate;
import com.datadog.api.client.v2.model.RUMPermanentRetentionFilterID;
import com.datadog.api.client.v2.model.RUMPermanentRetentionFilterResponse;
import com.datadog.api.client.v2.model.RUMPermanentRetentionFilterType;
import com.datadog.api.client.v2.model.RUMPermanentRetentionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.RUMPermanentRetentionFilterUpdateData;
import com.datadog.api.client.v2.model.RUMPermanentRetentionFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    RUMPermanentRetentionFilterUpdateRequest body =
        new RUMPermanentRetentionFilterUpdateRequest()
            .data(
                new RUMPermanentRetentionFilterUpdateData()
                    .attributes(
                        new RUMPermanentRetentionFilterUpdateAttributes()
                            .crossProductSampling(
                                new RUMCrossProductSamplingUpdate()
                                    .traceEnabled(true)
                                    .traceSampleRate(25.0)))
                    .id(RUMPermanentRetentionFilterID.SYNTHETICS_SESSIONS)
                    .type(RUMPermanentRetentionFilterType.PERMANENT_RETENTION_FILTERS));

    try {
      RUMPermanentRetentionFilterResponse result =
          apiInstance.updatePermanentRetentionFilter(
              "app_id", RUMPermanentRetentionFilterID.SYNTHETICS_SESSIONS, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumRetentionFiltersApi#updatePermanentRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
