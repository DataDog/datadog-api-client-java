// Search for incidents returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.api.IncidentsApi.SearchIncidentsOptionalParameters;
import com.datadog.api.client.v2.model.IncidentSearchResponse;
import com.datadog.api.client.v2.model.IncidentSearchResponseIncidentsData;
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
    defaultClient.setUnstableOperationEnabled("v2.searchIncidents", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    try {
      PaginationIterable<IncidentSearchResponseIncidentsData> iterable = apiInstance.searchIncidentsWithPagination("state:(active OR stable OR resolved)",new SearchIncidentsOptionalParameters().pageSize(2L));

      for (IncidentSearchResponseIncidentsData item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling IncidentsApi#searchIncidentsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}