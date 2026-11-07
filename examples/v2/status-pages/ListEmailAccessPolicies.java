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

    try {
      StatusPageEmailAccessPolicyArrayResponse result =
          apiInstance.listEmailAccessPolicies(
              UUID.fromString("1234abcd-12ab-34cd-56ef-123456abcdef"));
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
