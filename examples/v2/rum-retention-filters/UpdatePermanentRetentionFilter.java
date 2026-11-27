// Update a permanent RUM retention filter returns "Updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RumCrossProductSamplingUpdate;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterID;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterResponse;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterType;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterUpdateData;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    // there is a valid "rum_application" in the system
    String RUM_APPLICATION_DATA_ID = System.getenv("RUM_APPLICATION_DATA_ID");

    RumPermanentRetentionFilterUpdateRequest body =
        new RumPermanentRetentionFilterUpdateRequest()
            .data(
                new RumPermanentRetentionFilterUpdateData()
                    .id(RumPermanentRetentionFilterID.SYNTHETICS_SESSIONS)
                    .type(RumPermanentRetentionFilterType.PERMANENT_RETENTION_FILTERS)
                    .attributes(
                        new RumPermanentRetentionFilterUpdateAttributes()
                            .crossProductSampling(
                                new RumCrossProductSamplingUpdate()
                                    .traceEnabled(true)
                                    .traceSampleRate(25.0))));

    try {
      RumPermanentRetentionFilterResponse result =
          apiInstance.updatePermanentRetentionFilter(
              RUM_APPLICATION_DATA_ID, RumPermanentRetentionFilterID.SYNTHETICS_SESSIONS, body);
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
