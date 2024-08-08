// Get all powerpacks returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.PowerpackApi;
import com.datadog.api.client.v2.api.PowerpackApi.ListPowerpacksOptionalParameters;
import com.datadog.api.client.v2.model.ListPowerpacksResponse;
import com.datadog.api.client.v2.model.PowerpackData;
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
    PowerpackApi apiInstance = new PowerpackApi(defaultClient);

    try {
      PaginationIterable<PowerpackData> iterable = apiInstance.listPowerpacksWithPagination(new ListPowerpacksOptionalParameters().pageLimit(2L));

      for (PowerpackData item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling PowerpackApi#listPowerpacksWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}