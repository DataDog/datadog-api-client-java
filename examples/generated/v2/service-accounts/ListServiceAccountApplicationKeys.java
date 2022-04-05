import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.ServiceAccountsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    String serviceAccountId =
        "00000000-0000-1234-0000-000000000000"; // String | The ID of the service account.
    Long pageSize = 10L; // Long | Size for a given page.
    Long pageNumber = 0L; // Long | Specific page number to return.
    ApplicationKeysSort sort =
        ApplicationKeysSort.fromValue(
            "created_at"); // ApplicationKeysSort | Application key attribute used to sort results.
                           // Sort order is ascending by default. In order to specify a descending
                           // sort, prefix the attribute with a minus sign.
    String filter = "filter_example"; // String | Filter application keys by the specified string.
    String filterCreatedAtStart =
        "2020-11-24T18:46:21+00:00"; // String | Only include application keys created on or after
                                     // the specified date.
    String filterCreatedAtEnd =
        "2020-11-24T18:46:21+00:00"; // String | Only include application keys created on or before
                                     // the specified date.
    try {
      ListApplicationKeysResponse result =
          apiInstance.listServiceAccountApplicationKeys(
              serviceAccountId,
              new ServiceAccountsApi.ListServiceAccountApplicationKeysOptionalParameters()
                  .pageSize(pageSize)
                  .pageNumber(pageNumber)
                  .sort(sort)
                  .filter(filter)
                  .filterCreatedAtStart(filterCreatedAtStart)
                  .filterCreatedAtEnd(filterCreatedAtEnd));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceAccountsApi#listServiceAccountApplicationKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
