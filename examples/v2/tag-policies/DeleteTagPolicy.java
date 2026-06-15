// Delete a tag policy returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteTagPolicy", true);
    TagPoliciesApi apiInstance = new TagPoliciesApi(defaultClient);

    try {
      apiInstance.deleteTagPolicy("123");
    } catch (ApiException e) {
      System.err.println("Exception when calling TagPoliciesApi#deleteTagPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
