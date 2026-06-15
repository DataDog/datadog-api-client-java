// Update a tag policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagPoliciesApi;
import com.datadog.api.client.v2.model.TagPolicyResourceType;
import com.datadog.api.client.v2.model.TagPolicyResponse;
import com.datadog.api.client.v2.model.TagPolicyType;
import com.datadog.api.client.v2.model.TagPolicyUpdateAttributes;
import com.datadog.api.client.v2.model.TagPolicyUpdateData;
import com.datadog.api.client.v2.model.TagPolicyUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateTagPolicy", true);
    TagPoliciesApi apiInstance = new TagPoliciesApi(defaultClient);

    TagPolicyUpdateRequest body =
        new TagPolicyUpdateRequest()
            .data(
                new TagPolicyUpdateData()
                    .attributes(new TagPolicyUpdateAttributes().policyType(TagPolicyType.SURFACING))
                    .id("123")
                    .type(TagPolicyResourceType.TAG_POLICY));

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
