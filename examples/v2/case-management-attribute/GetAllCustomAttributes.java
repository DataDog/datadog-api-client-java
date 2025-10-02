// Get all custom attributes returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementAttributeApi;
import com.datadog.api.client.v2.model.CustomAttributeConfigsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementAttributeApi apiInstance = new CaseManagementAttributeApi(defaultClient);

    try {
      CustomAttributeConfigsResponse result = apiInstance.getAllCustomAttributes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CaseManagementAttributeApi#getAllCustomAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
