// List Bits AI SRE investigations returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.BitsAisreApi;
import com.datadog.api.client.v2.model.ListInvestigationsResponseData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listInvestigations", true);
    BitsAisreApi apiInstance = new BitsAisreApi(defaultClient);

    try {
      PaginationIterable<ListInvestigationsResponseData> iterable =
          apiInstance.listInvestigationsWithPagination();

      for (ListInvestigationsResponseData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling BitsAisreApi#listInvestigationsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
