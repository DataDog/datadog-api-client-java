import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.AuthNMappingsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);
    Long pageSize = 10L; // Long | Size for a given page.
    Long pageNumber = 0L; // Long | Specific page number to return.
    AuthNMappingsSort sort =
        AuthNMappingsSort.fromValue(
            "created_at"); // AuthNMappingsSort | Sort AuthN Mappings depending on the given field.
    List<String> include =
        Arrays.asList(); // List<String> | Include additional information in the response.
    String filter = "filter_example"; // String | Filter all mappings by the given string.
    try {
      AuthNMappingsResponse result =
          apiInstance.listAuthNMappings(
              new AuthNMappingsApi.ListAuthNMappingsOptionalParameters()
                  .pageSize(pageSize)
                  .pageNumber(pageNumber)
                  .sort(sort)
                  .include(include)
                  .filter(filter));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthNMappingsApi#listAuthNMappings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
