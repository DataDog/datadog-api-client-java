// Update a RUM retention filter returns "Updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RumRetentionFilterEventType;
import com.datadog.api.client.v2.model.RumRetentionFilterResponse;
import com.datadog.api.client.v2.model.RumRetentionFilterType;
import com.datadog.api.client.v2.model.RumRetentionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.RumRetentionFilterUpdateData;
import com.datadog.api.client.v2.model.RumRetentionFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    RumRetentionFilterUpdateRequest body =
        new RumRetentionFilterUpdateRequest()
            .data(
                new RumRetentionFilterUpdateData()
                    .id("4b95d361-f65d-4515-9824-c9aaeba5ac2a")
                    .type(RumRetentionFilterType.RETENTION_FILTERS)
                    .attributes(
                        new RumRetentionFilterUpdateAttributes()
                            .name("Test updating retention filter")
                            .eventType(RumRetentionFilterEventType.VIEW)
                            .query("view_query")
                            .sampleRate(100.0)
                            .enabled(true)));

    try {
      RumRetentionFilterResponse result =
          apiInstance.updateRetentionFilter(
              "a33671aa-24fd-4dcd-ba4b-5bbdbafe7690", "4b95d361-f65d-4515-9824-c9aaeba5ac2a", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionFiltersApi#updateRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
