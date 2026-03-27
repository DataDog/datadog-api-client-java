// Delete a change request decision returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ChangeManagementApi;
import com.datadog.api.client.v2.model.ChangeRequestResponse;
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
    defaultClient.setUnstableOperationEnabled("v2.deleteChangeRequestDecision", true);
    ChangeManagementApi apiInstance = new ChangeManagementApi(defaultClient);

    try {
      ChangeRequestResponse result = apiInstance.deleteChangeRequestDecision("CHM-1234", "decision-id-0");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeManagementApi#deleteChangeRequestDecision");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}