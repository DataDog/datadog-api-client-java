// Delete a tag rule returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteTagRule", true);
    TagRulesApi apiInstance = new TagRulesApi(defaultClient);

    try {
      apiInstance.deleteTagRule("123");
    } catch (ApiException e) {
      System.err.println("Exception when calling TagRulesApi#deleteTagRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
