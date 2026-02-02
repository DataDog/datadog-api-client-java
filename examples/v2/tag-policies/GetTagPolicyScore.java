// Get tag policy score returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagPoliciesApi;
import com.datadog.api.client.v2.model.TagPolicyScoreResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getTagPolicyScore", true);
    TagPoliciesApi apiInstance = new TagPoliciesApi(defaultClient);

    try {
      TagPolicyScoreResponse result = apiInstance.getTagPolicyScore("123");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagPoliciesApi#getTagPolicyScore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
