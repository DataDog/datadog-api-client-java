// Delete role returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RolesApi;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RolesApi apiInstance = new RolesApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    try {
      apiInstance.deleteRole(ROLE_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#deleteRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}