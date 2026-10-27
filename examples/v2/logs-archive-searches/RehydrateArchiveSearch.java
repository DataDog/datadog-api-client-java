// Rehydrate an Archive Search returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsArchiveSearchesApi;
import com.datadog.api.client.v2.model.ArchiveSearchRehydrateRequest;
import com.datadog.api.client.v2.model.ArchiveSearchRehydrateRequestAttributes;
import com.datadog.api.client.v2.model.ArchiveSearchRehydrateRequestData;
import com.datadog.api.client.v2.model.ArchiveSearchRehydrateRequestRehydration;
import com.datadog.api.client.v2.model.ArchiveSearchRehydrationTier;
import com.datadog.api.client.v2.model.ArchiveSearchResponse;
import com.datadog.api.client.v2.model.ArchiveSearchType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.rehydrateArchiveSearch", true);
    LogsArchiveSearchesApi apiInstance = new LogsArchiveSearchesApi(defaultClient);

    ArchiveSearchRehydrateRequest body =
        new ArchiveSearchRehydrateRequest()
            .data(
                new ArchiveSearchRehydrateRequestData()
                    .attributes(
                        new ArchiveSearchRehydrateRequestAttributes()
                            .rehydration(
                                new ArchiveSearchRehydrateRequestRehydration()
                                    .retentionDays(15L)
                                    .tier(ArchiveSearchRehydrationTier.STANDARD)))
                    .type(ArchiveSearchType.ARCHIVE_SEARCH));

    try {
      ArchiveSearchResponse result =
          apiInstance.rehydrateArchiveSearch("nv2eu4srgyzdkulggjzg2zkmmzifa2rum5iq", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsArchiveSearchesApi#rehydrateArchiveSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
