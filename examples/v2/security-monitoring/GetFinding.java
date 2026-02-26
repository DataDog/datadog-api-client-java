// Get a finding returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.GetFindingResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getFinding", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      GetFindingResponse result =
          apiInstance.getFinding(
              "AgAAAYd59gjghzF52gAAAAAAAAAYAAAAAEFZZDU5Z2pnQUFCRTRvV1lFeEo4SlFBQQAAACQAAAAAMDE4NzdhMDEtMDRiYS00NTZlLWFmMzMtNTIxNmNkNjVlNDMz");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#getFinding");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
