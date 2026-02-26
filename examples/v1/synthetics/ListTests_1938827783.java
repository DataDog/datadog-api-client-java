// Get the list of all Synthetic tests returns "OK - Returns the list of all Synthetic tests."
// response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.api.SyntheticsApi.ListTestsOptionalParameters;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsWithoutSteps;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    try {
      PaginationIterable<SyntheticsTestDetailsWithoutSteps> iterable =
          apiInstance.listTestsWithPagination(new ListTestsOptionalParameters().pageSize(2L));

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
