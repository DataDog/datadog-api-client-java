// Bulk Delete SLO Timeframes returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.ServiceLevelObjectivesApi;
import com.datadog.api.v1.client.model.SLOBulkDeleteResponse;
import com.datadog.api.v1.client.model.SLOTimeframe;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    None body =
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
