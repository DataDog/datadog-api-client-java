// Get hourly usage for CSM Pro returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.UsageMeteringApi;
import com.datadog.api.client.v1.model.UsageCloudSecurityPostureManagementResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageCloudSecurityPostureManagementResponse result =
          apiInstance.getUsageCloudSecurityPostureManagement(OffsetDateTime.now().plusDays(-3));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling UsageMeteringApi#getUsageCloudSecurityPostureManagement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
