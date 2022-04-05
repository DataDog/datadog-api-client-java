import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.RolesApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    RolesApi apiInstance = new RolesApi(defaultClient);
    Long pageSize = 10L; // Long | Size for a given page.
    Long pageNumber = 0L; // Long | Specific page number to return.
    RolesSort sort =
        RolesSort.fromValue(
            "name"); // RolesSort | Sort roles depending on the given field. Sort order is
                     // **ascending** by default. Sort order is **descending** if the field is
                     // prefixed by a negative sign, for example: `sort=-name`.
    String filter = "filter_example"; // String | Filter all roles by the given string.
    try {
      RolesResponse result =
          apiInstance.listRoles(
              new RolesApi.ListRolesOptionalParameters()
                  .pageSize(pageSize)
                  .pageNumber(pageNumber)
                  .sort(sort)
                  .filter(filter));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#listRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
