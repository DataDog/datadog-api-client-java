// Get all case types returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementTypeApi;
import com.datadog.api.client.v2.model.CaseTypesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementTypeApi apiInstance = new CaseManagementTypeApi(defaultClient);

    try {
      CaseTypesResponse result = apiInstance.getAllCaseTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementTypeApi#getAllCaseTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
