// List org authorized clients returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.OrgAuthorizedClientsApi;
import com.datadog.api.client.v2.model.OrgAuthorizedClientData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrgAuthorizedClientsApi apiInstance = new OrgAuthorizedClientsApi(defaultClient);

    try {
      PaginationIterable<OrgAuthorizedClientData> iterable =
          apiInstance.listOrgAuthorizedClientsWithPagination();

      for (OrgAuthorizedClientData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling OrgAuthorizedClientsApi#listOrgAuthorizedClientsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
