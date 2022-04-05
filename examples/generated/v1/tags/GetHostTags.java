import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.TagsApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    TagsApi apiInstance = new TagsApi(defaultClient);
    String hostName =
        "hostName_example"; // String | When specified, filters list of tags to those tags with the
                            // specified source.
    String source = "source_example"; // String | Source to filter.
    try {
      HostTags result =
          apiInstance.getHostTags(
              hostName, new TagsApi.GetHostTagsOptionalParameters().source(source));
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
