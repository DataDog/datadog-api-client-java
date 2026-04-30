// Update a permanent retention filter returns "Updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersPermanentApi;
import com.datadog.api.client.v2.model.RumPermanentCrossProductSamplingUpdate;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterResponse;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterType;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterUpdateData;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionFiltersPermanentApi apiInstance =
        new RumRetentionFiltersPermanentApi(defaultClient);

    RumPermanentRetentionFilterUpdateRequest body =
        new RumPermanentRetentionFilterUpdateRequest()
            .data(
                new RumPermanentRetentionFilterUpdateData()
                    .id("default_replays")
                    .type(RumPermanentRetentionFilterType.PERMANENT_RETENTION_FILTERS)
                    .attributes(
                        new RumPermanentRetentionFilterUpdateAttributes()
                            .crossProductSampling(
                                new RumPermanentCrossProductSamplingUpdate()
                                    .traceSampleRate(100.0))));

    try {
      RumPermanentRetentionFilterResponse result =
          apiInstance.updatePermanentRetentionFilter(
              "a33671aa-24fd-4dcd-ba4b-5bbdbafe7690", "default_replays", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumRetentionFiltersPermanentApi#updatePermanentRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
