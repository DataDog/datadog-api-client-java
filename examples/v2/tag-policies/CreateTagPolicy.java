// Create a tag policy returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagPoliciesApi;
import com.datadog.api.client.v2.model.TagPolicyCreateAttributes;
import com.datadog.api.client.v2.model.TagPolicyCreateData;
import com.datadog.api.client.v2.model.TagPolicyCreateRequest;
import com.datadog.api.client.v2.model.TagPolicyCreateType;
import com.datadog.api.client.v2.model.TagPolicyResourceType;
import com.datadog.api.client.v2.model.TagPolicyResponse;
import com.datadog.api.client.v2.model.TagPolicySource;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createTagPolicy", true);
    TagPoliciesApi apiInstance = new TagPoliciesApi(defaultClient);

    TagPolicyCreateRequest body =
        new TagPolicyCreateRequest()
            .data(
                new TagPolicyCreateData()
                    .attributes(
                        new TagPolicyCreateAttributes()
                            .enabled(true)
                            .negated(false)
                            .policyName("Service tag must be one of api or web")
                            .policyType(TagPolicyCreateType.SURFACING)
                            .required(true)
                            .scope("env")
                            .source(TagPolicySource.LOGS)
                            .tagKey("service")
                            .tagValuePatterns(Arrays.asList("api", "web")))
                    .type(TagPolicyResourceType.TAG_POLICY));

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
