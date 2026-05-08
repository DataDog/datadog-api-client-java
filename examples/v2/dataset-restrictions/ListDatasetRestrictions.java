// List dataset restrictions returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DatasetRestrictionsApi;
import com.datadog.api.client.v2.model.DatasetRestrictionsListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listDatasetRestrictions", true);
    DatasetRestrictionsApi apiInstance = new DatasetRestrictionsApi(defaultClient);

    try {
      DatasetRestrictionsListResponse result = apiInstance.listDatasetRestrictions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetRestrictionsApi#listDatasetRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
