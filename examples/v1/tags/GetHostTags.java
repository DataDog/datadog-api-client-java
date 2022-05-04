// Get host tags returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.TagsApi;
import com.datadog.api.v1.client.model.HostTags;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    TagsApi apiInstance = new TagsApi(defaultClient);

    try {
      HostTags result = apiInstance.getHostTags("host_name");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#getHostTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
