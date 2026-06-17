// Get an intake API key returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntakeKeyApi;
import com.datadog.api.client.v2.model.IntakeAPIKeyResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IntakeKeyApi apiInstance = new IntakeKeyApi(defaultClient);

    try {
      IntakeAPIKeyResponse result = apiInstance.getIntakeKey();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntakeKeyApi#getIntakeKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
