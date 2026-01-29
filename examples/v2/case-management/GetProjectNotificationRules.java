// Get notification rules returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseNotificationRulesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    try {
      CaseNotificationRulesResponse result =
          apiInstance.getProjectNotificationRules("e555e290-ed65-49bd-ae18-8acbfcf18db7");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#getProjectNotificationRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
