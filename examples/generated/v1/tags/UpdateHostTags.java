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
        "hostName_example"; // String | This endpoint allows you to update/replace all in an
                            // integration source with those supplied in the request.
    HostTags body = new HostTags(); // HostTags | Add tags to host
    String source =
        "source_example"; // String | The source of the tags (for example chef, puppet). [Complete
                          // list of source attribute
                          // values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value)
    try {
      HostTags result =
          apiInstance.updateHostTags(
              hostName, body, new TagsApi.UpdateHostTagsOptionalParameters().source(source));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#updateHostTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
