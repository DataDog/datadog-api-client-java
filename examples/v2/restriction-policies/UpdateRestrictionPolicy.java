// Update a restriction policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RestrictionPoliciesApi;
import com.datadog.api.client.v2.model.RestrictionPolicy;
import com.datadog.api.client.v2.model.RestrictionPolicyAttributes;
import com.datadog.api.client.v2.model.RestrictionPolicyBinding;
import com.datadog.api.client.v2.model.RestrictionPolicyResponse;
import com.datadog.api.client.v2.model.RestrictionPolicyType;
import com.datadog.api.client.v2.model.RestrictionPolicyUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RestrictionPoliciesApi apiInstance = new RestrictionPoliciesApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_RELATIONSHIPS_ORG_DATA_ID =
        System.getenv("USER_DATA_RELATIONSHIPS_ORG_DATA_ID");

    RestrictionPolicyUpdateRequest body =
        new RestrictionPolicyUpdateRequest()
            .data(
                new RestrictionPolicy()
                    .id("dashboard:test-update")
                    .type(RestrictionPolicyType.RESTRICTION_POLICY)
                    .attributes(
                        new RestrictionPolicyAttributes()
                            .bindings(
                                Collections.singletonList(
                                    new RestrictionPolicyBinding()
                                        .relation("editor")
                                        .principals(
                                            Collections.singletonList(
                                                "org:00000000-0000-beef-0000-000000000000"))))));

    try {
      RestrictionPolicyResponse result =
          apiInstance.updateRestrictionPolicy("dashboard:test-update", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RestrictionPoliciesApi#updateRestrictionPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
