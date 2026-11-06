// Search archived sessions returns "OK" response

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
                    .attributes(
                        new RumArchiveSessionsSearchAttributes()
                            .cursor("example")
                            .from(1789905600000L)
                            .hideRetained(false)
                            .limit(0)
                            .query("service:web")
                            .to(1789992000000L))
                    .id("11111111-1111-4111-8111-111111111111")
                    .type("rum_archive_sessions_request"));

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
