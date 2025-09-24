// Delete a case type returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementTypeApi apiInstance = new CaseManagementTypeApi(defaultClient);

    try {
      apiInstance.deleteCaseType("case_type_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementTypeApi#deleteCaseType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
