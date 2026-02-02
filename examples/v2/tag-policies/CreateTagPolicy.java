// Create a tag policy returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagPoliciesApi;
import com.datadog.api.client.v2.model.TagPolicyAttributesRequest;
import com.datadog.api.client.v2.model.TagPolicyCreateRequest;
import com.datadog.api.client.v2.model.TagPolicyDataRequest;
import com.datadog.api.client.v2.model.TagPolicyResponse;
import com.datadog.api.client.v2.model.TagPolicyType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createTagPolicy", true);
    TagPoliciesApi apiInstance = new TagPoliciesApi(defaultClient);

    TagPolicyCreateRequest body =
        new TagPolicyCreateRequest()
            .data(
                new TagPolicyDataRequest()
                    .attributes(
                        new TagPolicyAttributesRequest()
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
      TagPolicyResponse result = apiInstance.createTagPolicy(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagPoliciesApi#createTagPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
