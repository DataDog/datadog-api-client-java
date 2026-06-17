// List AWS WIF intake mappings returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwswifApi;
import com.datadog.api.client.v2.model.AwsWifIntakeMappingsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwswifApi apiInstance = new AwswifApi(defaultClient);

    try {
      AwsWifIntakeMappingsResponse result = apiInstance.listAwsWifIntakeMappings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwswifApi#listAwsWifIntakeMappings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
