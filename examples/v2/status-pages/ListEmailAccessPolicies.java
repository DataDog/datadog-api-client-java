// List email access policies returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.StatusPageEmailAccessPolicyArrayResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "private_status_page" in the system
    UUID PRIVATE_STATUS_PAGE_DATA_ID = null;
    try {
      PRIVATE_STATUS_PAGE_DATA_ID = UUID.fromString(System.getenv("PRIVATE_STATUS_PAGE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      StatusPageEmailAccessPolicyArrayResponse result =
          apiInstance.listEmailAccessPolicies(PRIVATE_STATUS_PAGE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#listEmailAccessPolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
