// Update a RUM exclusion filter returns "Updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RumExclusionFilterEventType;
import com.datadog.api.client.v2.model.RumExclusionFilterResponse;
import com.datadog.api.client.v2.model.RumExclusionFilterType;
import com.datadog.api.client.v2.model.RumExclusionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.RumExclusionFilterUpdateData;
import com.datadog.api.client.v2.model.RumExclusionFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateExclusionFilter", true);
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    RumExclusionFilterUpdateRequest body =
        new RumExclusionFilterUpdateRequest()
            .data(
                new RumExclusionFilterUpdateData()
                    .attributes(
                        new RumExclusionFilterUpdateAttributes()
                            .enabled(true)
                            .eventType(RumExclusionFilterEventType.ERROR)
                            .name("Exclude noisy browser extension errors")
                            .query("@error.message:*extension*"))
                    .id("051601eb-54a0-abc0-03f9-cc02efa18892")
                    .type(RumExclusionFilterType.EXCLUSION_FILTERS));

    try {
      RumExclusionFilterResponse result =
          apiInstance.updateExclusionFilter("app_id", "ef_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionFiltersApi#updateExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
