// Get all service definitions returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ServiceDefinitionApi;
import com.datadog.api.client.v2.api.ServiceDefinitionApi.ListServiceDefinitionsOptionalParameters;
import com.datadog.api.client.v2.model.ServiceDefinitionsListResponse;
import com.datadog.api.client.v2.model.ServiceDefinitionData;
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
    ServiceDefinitionApi apiInstance = new ServiceDefinitionApi(defaultClient);

    try {
      PaginationIterable<ServiceDefinitionData> iterable = apiInstance.listServiceDefinitionsWithPagination(new ListServiceDefinitionsOptionalParameters().pageSize(2L));

      for (ServiceDefinitionData item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#listServiceDefinitionsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}