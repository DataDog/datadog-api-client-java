// Get resource from Confluent account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ConfluentCloudApi;
import com.datadog.api.client.v2.model.ConfluentResourceResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ConfluentCloudApi apiInstance = new ConfluentCloudApi(defaultClient);

    try {
      ConfluentResourceResponse result =
          apiInstance.getConfluentResource("account_id", "resource_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfluentCloudApi#getConfluentResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
