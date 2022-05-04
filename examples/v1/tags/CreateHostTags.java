// Add tags to a host returns "Created" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.TagsApi;
import com.datadog.api.v1.client.model.HostTags;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    TagsApi apiInstance = new TagsApi(defaultClient);

    HostTags body =
        new HostTags().host("test.host").tags(Collections.singletonList("environment:production"));

    try {
      HostTags result = apiInstance.createHostTags("host_name", body);
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
