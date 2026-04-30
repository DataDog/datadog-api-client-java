// Get a permanent retention filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersPermanentApi;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionFiltersPermanentApi apiInstance =
        new RumRetentionFiltersPermanentApi(defaultClient);

    try {
      RumPermanentRetentionFilterResponse result =
          apiInstance.getPermanentRetentionFilter(
              "a33671aa-24fd-4dcd-ba4b-5bbdbafe7690", "default_synthetics");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumRetentionFiltersPermanentApi#getPermanentRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
