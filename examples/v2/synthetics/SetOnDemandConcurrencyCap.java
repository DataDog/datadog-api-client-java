// Save new value for on-demand concurrency cap returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.OnDemandConcurrencyCapResponse;
import com.datadog.api.client.v2.model.OnDemandConcurrencyCapAttributes;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    OnDemandConcurrencyCapAttributes body = new OnDemandConcurrencyCapAttributes()
.onDemandConcurrencyCap(20.0);

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