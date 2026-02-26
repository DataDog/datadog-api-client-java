// Get All Host Tags returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.TagsApi;
import com.datadog.api.client.v1.model.TagToHosts;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TagsApi apiInstance = new TagsApi(defaultClient);

    try {
      TagToHosts result = apiInstance.listHostTags();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#listHostTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
