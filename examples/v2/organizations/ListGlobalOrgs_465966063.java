// List global orgs returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.OrganizationsApi;
import com.datadog.api.client.v2.model.GlobalOrgData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    try {
      PaginationIterable<GlobalOrgData> iterable =
          apiInstance.listGlobalOrgsWithPagination("user@example.com");

      for (GlobalOrgData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling OrganizationsApi#listGlobalOrgsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
