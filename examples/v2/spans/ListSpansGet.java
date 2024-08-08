// Get a list of spans returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SpansApi;
import com.datadog.api.client.v2.model.SpansListResponse;
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
    SpansApi apiInstance = new SpansApi(defaultClient);

    try {
      SpansListResponse result = apiInstance.listSpansGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpansApi#listSpansGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}