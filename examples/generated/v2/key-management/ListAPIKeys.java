import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageNumber = 0L; // Long | Specific page number to return.
        APIKeysSort sort = APIKeysSort.fromValue("created_at"); // APIKeysSort | API key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign.
        String filter = "filter_example"; // String | Filter API keys by the specified string.
        String filterCreatedAtStart = "2020-11-24T18:46:21+00:00"; // String | Only include API keys created on or after the specified date.
        String filterCreatedAtEnd = "2020-11-24T18:46:21+00:00"; // String | Only include API keys created on or before the specified date.
        String filterModifiedAtStart = "2020-11-24T18:46:21+00:00"; // String | Only include API keys modified on or after the specified date.
        String filterModifiedAtEnd = "2020-11-24T18:46:21+00:00"; // String | Only include API keys modified on or before the specified date.
        String include = "created_by,modified_by"; // String | Comma separated list of resource paths for related resources to include in the response. Supported resource paths are `created_by` and `modified_by`.
        try {
            APIKeysResponse result = apiInstance.listAPIKeys(new KeyManagementApi.ListAPIKeysOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .filter(filter)
                .filterCreatedAtStart(filterCreatedAtStart)
                .filterCreatedAtEnd(filterCreatedAtEnd)
                .filterModifiedAtStart(filterModifiedAtStart)
                .filterModifiedAtEnd(filterModifiedAtEnd)
                .include(include));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#listAPIKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
