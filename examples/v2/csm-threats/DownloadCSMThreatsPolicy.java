// Download the Workload Protection policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmThreatsApi;
import java.io.File;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CsmThreatsApi apiInstance = new CsmThreatsApi(defaultClient);

    try {
      File result = apiInstance.downloadCSMThreatsPolicy();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmThreatsApi#downloadCSMThreatsPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
