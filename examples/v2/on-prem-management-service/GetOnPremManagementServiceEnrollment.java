// Get enrollment status returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnPremManagementServiceApi;
import com.datadog.api.client.v2.model.OnPremManagementServiceGetEnrollmentResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getOnPremManagementServiceEnrollment", true);
    OnPremManagementServiceApi apiInstance = new OnPremManagementServiceApi(defaultClient);

    try {
      OnPremManagementServiceGetEnrollmentResponse result =
          apiInstance.getOnPremManagementServiceEnrollment(
              "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling OnPremManagementServiceApi#getOnPremManagementServiceEnrollment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
