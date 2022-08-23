// Modify the triage assignee of a security signal returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SecurityMonitoringApi;
import com.datadog.api.client.v1.model.SignalAssigneeUpdateRequest;
import com.datadog.api.client.v1.model.SuccessfulSignalUpdateResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SignalAssigneeUpdateRequest body =
        new SignalAssigneeUpdateRequest().assignee("773b045d-ccf8-4808-bd3b-955ef6a8c940");

    try {
      SuccessfulSignalUpdateResponse result =
          apiInstance.editSecurityMonitoringSignalAssignee(
              "AQAAAYDiB_Ol8PbzFAAAAABBWURpQl9PbEFBQU0yeXhGTG9ZV2JnQUE", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#editSecurityMonitoringSignalAssignee");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
