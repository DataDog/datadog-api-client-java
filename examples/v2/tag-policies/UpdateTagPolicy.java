// Update a tag policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagPoliciesApi;
import com.datadog.api.client.v2.model.TagPolicyAttributesUpdateRequest;
import com.datadog.api.client.v2.model.TagPolicyDataUpdateRequest;
import com.datadog.api.client.v2.model.TagPolicyResponse;
import com.datadog.api.client.v2.model.TagPolicyType;
import com.datadog.api.client.v2.model.TagPolicyUpdateRequest;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateTagPolicy", true);
    TagPoliciesApi apiInstance = new TagPoliciesApi(defaultClient);

    TagPolicyUpdateRequest body =
        new TagPolicyUpdateRequest()
            .data(
                new TagPolicyDataUpdateRequest()
                    .attributes(
                        new TagPolicyAttributesUpdateRequest()
                            .enabled(true)
                            .negated(false)
                            .policyName("production-tags-policy")
                            .required(true)
                            .scope("env")
                            .source("logs")
                            .tagKey("service")
                            .tagValuePatterns(Arrays.asList("api", "web")))
                    .type(TagPolicyType.TAG_POLICY));

    try {
      TagPolicyResponse result = apiInstance.updateTagPolicy("123", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagPoliciesApi#updateTagPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
