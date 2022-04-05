import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        TagsApi apiInstance = new TagsApi(defaultClient);
        String hostName = "hostName_example"; // String | This endpoint allows you to add new tags to a host, optionally specifying where the tags came from.
        HostTags body = new HostTags(); // HostTags | Update host tags request body.
        String source = "chef"; // String | The source of the tags. [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value).
        try {
            HostTags result = apiInstance.createHostTags(hostName, body, new TagsApi.CreateHostTagsOptionalParameters()
                .source(source));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#createHostTags");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
