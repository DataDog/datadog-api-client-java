// Delete resource from Confluent account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ConfluentCloudApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ConfluentCloudApi apiInstance = new ConfluentCloudApi(defaultClient);

    try {
      apiInstance.deleteConfluentResource("account_id", "resource_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfluentCloudApi#deleteConfluentResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
