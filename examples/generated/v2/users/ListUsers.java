import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.UsersApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    UsersApi apiInstance = new UsersApi(defaultClient);
    Long pageSize = 10L; // Long | Size for a given page.
    Long pageNumber = 0L; // Long | Specific page number to return.
    String sort =
        "name"; // String | User attribute to order results by. Sort order is ascending by default.
                // Sort order is descending if the field is prefixed by a negative sign, for example
                // `sort=-name`. Options: `name`, `modified_at`, `user_count`.
    QuerySortOrder sortDir =
        QuerySortOrder.fromValue(
            "asc"); // QuerySortOrder | Direction of sort. Options: `asc`, `desc`.
    String filter =
        "filter_example"; // String | Filter all users by the given string. Defaults to no
                          // filtering.
    String filterStatus =
        "Active"; // String | Filter on status attribute. Comma separated list, with possible values
                  // `Active`, `Pending`, and `Disabled`. Defaults to no filtering.
    try {
      UsersResponse result =
          apiInstance.listUsers(
              new UsersApi.ListUsersOptionalParameters()
                  .pageSize(pageSize)
                  .pageNumber(pageNumber)
                  .sort(sort)
                  .sortDir(sortDir)
                  .filter(filter)
                  .filterStatus(filterStatus));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
