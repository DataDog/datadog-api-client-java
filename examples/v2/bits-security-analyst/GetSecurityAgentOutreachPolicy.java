// Get the user outreach policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsSecurityAnalystApi;
import com.datadog.api.client.v2.model.SecurityAgentOutreachPolicyResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getSecurityAgentOutreachPolicy", true);
    BitsSecurityAnalystApi apiInstance = new BitsSecurityAnalystApi(defaultClient);

    try {
      SecurityAgentOutreachPolicyResponse result = apiInstance.getSecurityAgentOutreachPolicy();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling BitsSecurityAnalystApi#getSecurityAgentOutreachPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
