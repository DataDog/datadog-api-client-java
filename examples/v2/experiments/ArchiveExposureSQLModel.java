// Archive exposure SQL model returns "The exposure SQL model was archived. Archiving an
// already-archived model succeeds
// and leaves the original archive time in place." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    try {
      apiInstance.archiveExposureSQLModel(UUID.fromString("550e8400-e29b-41d4-a716-446655440000"));
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#archiveExposureSQLModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
