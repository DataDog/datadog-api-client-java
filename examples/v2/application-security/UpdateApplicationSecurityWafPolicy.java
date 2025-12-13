// Update a WAF Policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApplicationSecurityApi;
import com.datadog.api.client.v2.model.ApplicationSecurityPolicyResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityPolicyRuleOverride;
import com.datadog.api.client.v2.model.ApplicationSecurityPolicyScope;
import com.datadog.api.client.v2.model.ApplicationSecurityPolicyType;
import com.datadog.api.client.v2.model.ApplicationSecurityPolicyUpdateAttributes;
import com.datadog.api.client.v2.model.ApplicationSecurityPolicyUpdateData;
import com.datadog.api.client.v2.model.ApplicationSecurityPolicyUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApplicationSecurityApi apiInstance = new ApplicationSecurityApi(defaultClient);

    ApplicationSecurityPolicyUpdateRequest body =
        new ApplicationSecurityPolicyUpdateRequest()
            .data(
                new ApplicationSecurityPolicyUpdateData()
                    .attributes(
                        new ApplicationSecurityPolicyUpdateAttributes()
                            .description("Policy applied to internal web applications.")
                            .isDefault(false)
                            .name("Internal Network Policy")
                            .protectionPresets(Collections.singletonList("attack-tools"))
                            .rules(
                                Collections.singletonList(
                                    new ApplicationSecurityPolicyRuleOverride()
                                        .blocking(false)
                                        .enabled(true)
                                        .id("rasp-001-002")))
                            .scope(
                                Collections.singletonList(
                                    new ApplicationSecurityPolicyScope()
                                        .env("prod")
                                        .service("billing-service")))
                            .version(0L))
                    .type(ApplicationSecurityPolicyType.POLICY));

    try {
      ApplicationSecurityPolicyResponse result =
          apiInstance.updateApplicationSecurityWafPolicy("policy_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ApplicationSecurityApi#updateApplicationSecurityWafPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
