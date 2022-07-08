// Bulk Delete SLO Timeframes returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v1.model.SLOBulkDeleteResponse;
import com.datadog.api.client.v1.model.SLOTimeframe;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    Map<String, List<SLOTimeframe>> body =
        Map.ofEntries(
            Map.entry("id1", Arrays.asList(SLOTimeframe.SEVEN_DAYS, SLOTimeframe.THIRTY_DAYS)),
            Map.entry("id2", Arrays.asList(SLOTimeframe.SEVEN_DAYS, SLOTimeframe.THIRTY_DAYS)));

    try {
      SLOBulkDeleteResponse result = apiInstance.deleteSLOTimeframeInBulk(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceLevelObjectivesApi#deleteSLOTimeframeInBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
