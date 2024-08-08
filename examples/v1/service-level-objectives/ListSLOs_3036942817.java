// Get all SLOs returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v1.api.ServiceLevelObjectivesApi.ListSLOsOptionalParameters;
import com.datadog.api.client.v1.model.SLOListResponse;
import com.datadog.api.client.v1.model.ServiceLevelObjective;
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
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    try {
      PaginationIterable<ServiceLevelObjective> iterable = apiInstance.listSLOsWithPagination(new ListSLOsOptionalParameters().limit(2L));

      for (ServiceLevelObjective item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#listSLOsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}