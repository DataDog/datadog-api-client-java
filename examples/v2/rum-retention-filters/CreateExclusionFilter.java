// Create a RUM exclusion filter returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RUMExclusionFilterCreateAttributes;
import com.datadog.api.client.v2.model.RUMExclusionFilterCreateData;
import com.datadog.api.client.v2.model.RUMExclusionFilterCreateRequest;
import com.datadog.api.client.v2.model.RUMExclusionFilterEventType;
import com.datadog.api.client.v2.model.RUMExclusionFilterResponse;
import com.datadog.api.client.v2.model.RUMExclusionFilterType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    RUMExclusionFilterCreateRequest body =
        new RUMExclusionFilterCreateRequest()
            .data(
                new RUMExclusionFilterCreateData()
                    .attributes(
                        new RUMExclusionFilterCreateAttributes()
                            .enabled(true)
                            .eventType(RUMExclusionFilterEventType.ERROR)
                            .name("Exclude noisy browser extension errors")
                            .query("@error.message:*extension*"))
                    .type(RUMExclusionFilterType.EXCLUSION_FILTERS));

    try {
      RUMExclusionFilterResponse result = apiInstance.createExclusionFilter("app_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionFiltersApi#createExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
