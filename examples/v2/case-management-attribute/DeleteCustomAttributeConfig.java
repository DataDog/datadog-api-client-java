// Delete custom attributes config returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementAttributeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementAttributeApi apiInstance = new CaseManagementAttributeApi(defaultClient);

    // there is a valid "case_type" in the system
    String CASE_TYPE_ID = System.getenv("CASE_TYPE_ID");

    // there is a valid "custom_attribute" in the system
    String CUSTOM_ATTRIBUTE_ID = System.getenv("CUSTOM_ATTRIBUTE_ID");

    try {
      apiInstance.deleteCustomAttributeConfig(CASE_TYPE_ID, CUSTOM_ATTRIBUTE_ID);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CaseManagementAttributeApi#deleteCustomAttributeConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
