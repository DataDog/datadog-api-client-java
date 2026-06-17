// Delete an AWS WIF intake mapping returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwswifApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwswifApi apiInstance = new AwswifApi(defaultClient);

    try {
      apiInstance.deleteAwsWifIntakeMapping(
          UUID.fromString("c5c758c6-18c2-4484-ae3f-46b84128404a"));
    } catch (ApiException e) {
      System.err.println("Exception when calling AwswifApi#deleteAwsWifIntakeMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
