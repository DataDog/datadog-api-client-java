// Delete an email access policy returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    try {
      apiInstance.deleteEmailAccessPolicy(
          UUID.fromString("1234abcd-12ab-34cd-56ef-123456abcdef"),
          UUID.fromString("1234abcd-12ab-34cd-56ef-123456abcdef"));
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#deleteEmailAccessPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
