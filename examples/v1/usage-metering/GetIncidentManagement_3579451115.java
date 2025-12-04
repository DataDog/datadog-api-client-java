// Get hourly usage for incident management returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.UsageMeteringApi;
import com.datadog.api.client.v1.api.UsageMeteringApi.GetIncidentManagementOptionalParameters;
import com.datadog.api.client.v1.model.UsageIncidentManagementResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageIncidentManagementResponse result =
          apiInstance.getIncidentManagement(
              OffsetDateTime.now().plusDays(-5),
              new GetIncidentManagementOptionalParameters()
                  .endHr(OffsetDateTime.now().plusDays(-3)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getIncidentManagement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
