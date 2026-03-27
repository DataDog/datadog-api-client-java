// Get On-Call escalation policy returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.api.OnCallApi.GetOnCallEscalationPolicyOptionalParameters;
import com.datadog.api.client.v2.model.EscalationPolicy;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "escalation_policy" in the system
    String ESCALATION_POLICY_DATA_ID = System.getenv("ESCALATION_POLICY_DATA_ID");

    try {
      EscalationPolicy result = apiInstance.getOnCallEscalationPolicy(ESCALATION_POLICY_DATA_ID,new GetOnCallEscalationPolicyOptionalParameters().include("steps.targets"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#getOnCallEscalationPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}