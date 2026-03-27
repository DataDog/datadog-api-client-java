// Get all custom attributes config of case type returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementAttributeApi;
import com.datadog.api.client.v2.model.CustomAttributeConfigsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementAttributeApi apiInstance = new CaseManagementAttributeApi(defaultClient);

    // there is a valid "case_type" in the system
    String CASE_TYPE_ID = System.getenv("CASE_TYPE_ID");

    try {
      CustomAttributeConfigsResponse result =
          apiInstance.getAllCustomAttributeConfigsByCaseType(CASE_TYPE_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " CaseManagementAttributeApi#getAllCustomAttributeConfigsByCaseType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
