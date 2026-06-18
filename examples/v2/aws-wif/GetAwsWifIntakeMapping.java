// Get an AWS WIF intake mapping returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwswifApi;
import com.datadog.api.client.v2.model.AwsWifIntakeMappingResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwswifApi apiInstance = new AwswifApi(defaultClient);

    try {
      AwsWifIntakeMappingResponse result =
          apiInstance.getAwsWifIntakeMapping(
              UUID.fromString("c5c758c6-18c2-4484-ae3f-46b84128404a"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwswifApi#getAwsWifIntakeMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
