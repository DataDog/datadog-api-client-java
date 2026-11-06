// Search archived sessions returns canonical data and first-page metadata

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRecoveryApi;
import com.datadog.api.client.v2.model.RumArchiveSessionsResponse;
import com.datadog.api.client.v2.model.RumArchiveSessionsSearchAttributes;
import com.datadog.api.client.v2.model.RumArchiveSessionsSearchData;
import com.datadog.api.client.v2.model.RumArchiveSessionsSearchRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRecoveryApi apiInstance = new RumRecoveryApi(defaultClient);

    RumArchiveSessionsSearchRequest body =
        new RumArchiveSessionsSearchRequest()
            .data(
                new RumArchiveSessionsSearchData()
                    .type("rum_archive_sessions_request")
                    .attributes(
                        new RumArchiveSessionsSearchAttributes()
                            .query("service:rum18600-fixture")
                            .from(1636024271000L)
                            .to(1636629071000L)
                            .limit(1)));

    try {
      RumArchiveSessionsResponse result = apiInstance.searchRUMArchiveSessions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRecoveryApi#searchRUMArchiveSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
