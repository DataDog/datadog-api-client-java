// Update a RUM exclusion filter returns "Updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RumExclusionFilterResponse;
import com.datadog.api.client.v2.model.RumExclusionFilterType;
import com.datadog.api.client.v2.model.RumExclusionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.RumExclusionFilterUpdateData;
import com.datadog.api.client.v2.model.RumExclusionFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    // there is a valid "rum_exclusion_filter" in the system
    String RUM_EXCLUSION_FILTER_DATA_ID = System.getenv("RUM_EXCLUSION_FILTER_DATA_ID");

    RumExclusionFilterUpdateRequest body =
        new RumExclusionFilterUpdateRequest()
            .data(
                new RumExclusionFilterUpdateData()
                    .id(RUM_EXCLUSION_FILTER_DATA_ID)
                    .type(RumExclusionFilterType.EXCLUSION_FILTERS)
                    .attributes(
                        new RumExclusionFilterUpdateAttributes()
                            .enabled(false)
                            .name("Example-Rum-Retention-Filter-updated")));

    try {
      RumExclusionFilterResponse result =
          apiInstance.updateExclusionFilter(
              "a33671aa-24fd-4dcd-ba4b-5bbdbafe7690", RUM_EXCLUSION_FILTER_DATA_ID, body);
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
