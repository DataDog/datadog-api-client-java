// Save new value for on-demand concurrency cap returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.OnDemandConcurrencyCapAttributes;
import com.datadog.api.client.v2.model.OnDemandConcurrencyCapResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    OnDemandConcurrencyCapAttributes body = new OnDemandConcurrencyCapAttributes();

    try {
      OnDemandConcurrencyCapResponse result = apiInstance.setOnDemandConcurrencyCap(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#setOnDemandConcurrencyCap");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
