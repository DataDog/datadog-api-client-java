// Update a RUM exclusion filter returns "Updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RUMExclusionFilterEventType;
import com.datadog.api.client.v2.model.RUMExclusionFilterResponse;
import com.datadog.api.client.v2.model.RUMExclusionFilterType;
import com.datadog.api.client.v2.model.RUMExclusionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.RUMExclusionFilterUpdateData;
import com.datadog.api.client.v2.model.RUMExclusionFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    RUMExclusionFilterUpdateRequest body =
        new RUMExclusionFilterUpdateRequest()
            .data(
                new RUMExclusionFilterUpdateData()
                    .attributes(
                        new RUMExclusionFilterUpdateAttributes()
                            .enabled(true)
                            .eventType(RUMExclusionFilterEventType.ERROR)
                            .name("Exclude noisy browser extension errors")
                            .query("@error.message:*extension*"))
                    .id("051601eb-54a0-abc0-03f9-cc02efa18892")
                    .type(RUMExclusionFilterType.EXCLUSION_FILTERS));

    try {
      RUMExclusionFilterResponse result =
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
