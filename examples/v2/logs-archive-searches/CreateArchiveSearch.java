// Create an Archive Search returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsArchiveSearchesApi;
import com.datadog.api.client.v2.model.ArchiveSearchCreateRehydration;
import com.datadog.api.client.v2.model.ArchiveSearchCreateRequest;
import com.datadog.api.client.v2.model.ArchiveSearchCreateRequestAttributes;
import com.datadog.api.client.v2.model.ArchiveSearchCreateRequestData;
import com.datadog.api.client.v2.model.ArchiveSearchRehydrationTier;
import com.datadog.api.client.v2.model.ArchiveSearchResponse;
import com.datadog.api.client.v2.model.ArchiveSearchType;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createArchiveSearch", true);
    LogsArchiveSearchesApi apiInstance = new LogsArchiveSearchesApi(defaultClient);

    ArchiveSearchCreateRequest body =
        new ArchiveSearchCreateRequest()
            .data(
                new ArchiveSearchCreateRequestData()
                    .attributes(
                        new ArchiveSearchCreateRequestAttributes()
                            .archiveId("mhmyYmyLTOaFYKvhNadu1w")
                            .description("Investigating the checkout latency spike.")
                            .from(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                            .name("checkout-latency-investigation")
                            .query("service:checkout status:error")
                            .rehydration(
                                new ArchiveSearchCreateRehydration()
                                    .maxRehydratedEvents(1000000L)
                                    .retentionDays(15L)
                                    .tier(ArchiveSearchRehydrationTier.STANDARD))
                            .to(OffsetDateTime.parse("2026-01-02T00:00:00Z")))
                    .type(ArchiveSearchType.ARCHIVE_SEARCH));

    try {
      ArchiveSearchResponse result = apiInstance.createArchiveSearch(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsArchiveSearchesApi#createArchiveSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
