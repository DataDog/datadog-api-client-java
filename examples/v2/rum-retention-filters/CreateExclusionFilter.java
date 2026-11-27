// Create a RUM exclusion filter returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RumExclusionFilterCreateAttributes;
import com.datadog.api.client.v2.model.RumExclusionFilterCreateData;
import com.datadog.api.client.v2.model.RumExclusionFilterCreateRequest;
import com.datadog.api.client.v2.model.RumExclusionFilterEventType;
import com.datadog.api.client.v2.model.RumExclusionFilterResponse;
import com.datadog.api.client.v2.model.RumExclusionFilterType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    RumExclusionFilterCreateRequest body =
        new RumExclusionFilterCreateRequest()
            .data(
                new RumExclusionFilterCreateData()
                    .type(RumExclusionFilterType.EXCLUSION_FILTERS)
                    .attributes(
                        new RumExclusionFilterCreateAttributes()
                            .name("Example-Rum-Retention-Filter")
                            .enabled(true)
                            .eventType(RumExclusionFilterEventType.ERROR)
                            .query("@error.message:*extension*")));

    try {
      RumExclusionFilterResponse result =
          apiInstance.createExclusionFilter("a33671aa-24fd-4dcd-ba4b-5bbdbafe7690", body);
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
