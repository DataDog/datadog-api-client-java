// Delete connection returns "Connection deleted successfully" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteConnection", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    try {
      apiInstance.deleteConnection("connection-id-123", "users");
    } catch (ApiException e) {
      System.err.println("Exception when calling RumAudienceManagementApi#deleteConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}