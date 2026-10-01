// Get an Archive Search returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsArchiveSearchesApi;
import com.datadog.api.client.v2.model.ArchiveSearchResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getArchiveSearch", true);
    LogsArchiveSearchesApi apiInstance = new LogsArchiveSearchesApi(defaultClient);

    try {
      ArchiveSearchResponse result =
          apiInstance.getArchiveSearch("nv2eu4srgyzdkulggjzg2zkmmzifa2rum5iq");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsArchiveSearchesApi#getArchiveSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
