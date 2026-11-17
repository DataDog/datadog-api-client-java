// Update the outreach mode returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsSecurityAnalystApi;
import com.datadog.api.client.v2.model.SecurityAgentOutreachMode;
import com.datadog.api.client.v2.model.SecurityAgentOutreachModeAttributes;
import com.datadog.api.client.v2.model.SecurityAgentOutreachModeResponse;
import com.datadog.api.client.v2.model.SecurityAgentOutreachModeUpdateData;
import com.datadog.api.client.v2.model.SecurityAgentOutreachModeUpdateRequest;
import com.datadog.api.client.v2.model.SecurityAgentOutreachPolicyType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateSecurityAgentOutreachMode", true);
    BitsSecurityAnalystApi apiInstance = new BitsSecurityAnalystApi(defaultClient);

    SecurityAgentOutreachModeUpdateRequest body =
        new SecurityAgentOutreachModeUpdateRequest()
            .data(
                new SecurityAgentOutreachModeUpdateData()
                    .attributes(
                        new SecurityAgentOutreachModeAttributes()
                            .mode(SecurityAgentOutreachMode.AUTOMATED))
                    .type(SecurityAgentOutreachPolicyType.OUTREACH_POLICY));

    try {
      SecurityAgentOutreachModeResponse result = apiInstance.updateSecurityAgentOutreachMode(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling BitsSecurityAnalystApi#updateSecurityAgentOutreachMode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
