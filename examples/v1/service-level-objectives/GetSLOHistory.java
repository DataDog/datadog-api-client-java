// Get an SLO's history returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v1.model.SLOHistoryResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    // there is a valid "slo" in the system
    String SLO_DATA_0_ID = System.getenv("SLO_DATA_0_ID");

    try {
      SLOHistoryResponse result =
          apiInstance.getSLOHistory(
              SLO_DATA_0_ID,
              OffsetDateTime.now().plusDays(-1).toInstant().getEpochSecond(),
              OffsetDateTime.now().toInstant().getEpochSecond());
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#getSLOHistory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
