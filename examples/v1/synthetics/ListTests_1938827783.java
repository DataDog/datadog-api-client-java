// Get the list of all Synthetic tests returns "OK - Returns the list of all Synthetic tests." response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.api.SyntheticsApi.ListTestsOptionalParameters;
import com.datadog.api.client.v1.model.SyntheticsListTestsResponse;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsWithoutSteps;
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
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    try {
      PaginationIterable<SyntheticsTestDetailsWithoutSteps> iterable = apiInstance.listTestsWithPagination(new ListTestsOptionalParameters().pageSize(2L));

      for (SyntheticsTestDetailsWithoutSteps item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling SyntheticsApi#listTestsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}