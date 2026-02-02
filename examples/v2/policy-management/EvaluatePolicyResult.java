// Evaluate policy result returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.PolicyManagementApi;
import com.datadog.api.client.v2.model.PolicyResultResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.evaluatePolicyResult", true);
    PolicyManagementApi apiInstance = new PolicyManagementApi(defaultClient);

    try {
      PolicyResultResponse result = apiInstance.evaluatePolicyResult("SAML");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#evaluatePolicyResult");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
