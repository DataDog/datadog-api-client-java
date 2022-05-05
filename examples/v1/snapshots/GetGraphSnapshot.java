// Take graph snapshots returns "OK" response
import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SnapshotsApi;
import com.datadog.api.v1.client.api.SnapshotsApi.GetGraphSnapshotOptionalParameters;
import com.datadog.api.v1.client.model.GraphSnapshot;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);

    try {
      GraphSnapshot result =
          apiInstance.getGraphSnapshot(
              OffsetDateTime.now().plusDays(-1).toInstant().getEpochSecond(),
              OffsetDateTime.now().toInstant().getEpochSecond(),
              new GetGraphSnapshotOptionalParameters()
                  .metricQuery("avg:system.load.1{*}")
                  .title("System load")
                  .height(400L)
                  .width(600L));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#getGraphSnapshot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
