// Get a list of incidents returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.api.IncidentsApi.ListIncidentsOptionalParameters;
import com.datadog.api.client.v2.model.IncidentsResponse;
import com.datadog.api.client.v2.model.IncidentResponseData;
import com.datadog.api.client.PaginationIterable;
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
    defaultClient.setUnstableOperationEnabled("v2.listIncidents", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    try {
      PaginationIterable<IncidentResponseData> iterable = apiInstance.listIncidentsWithPagination(new ListIncidentsOptionalParameters().pageSize(2L));

      for (IncidentResponseData item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling IncidentsApi#listIncidentsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}