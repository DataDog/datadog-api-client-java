import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.UsageMeteringApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
    Long pageSize = 56L; // Long | The number of files to return in the response. `[default=60]`.
    Long pageNumber =
        56L; // Long | The identifier of the first page to return. This parameter is used for the
    // pagination feature `[default=0]`.
    UsageSortDirection sortDir =
        UsageSortDirection.fromValue(
            "desc"); // UsageSortDirection | The direction to sort by: `[desc, asc]`.
    UsageSort sort =
        UsageSort.fromValue(
            "computed_on"); // UsageSort | The field to sort by: `[computed_on, size, start_date,
    // end_date]`.
    try {
      UsageCustomReportsResponse result =
          apiInstance.getDailyCustomReports(
              new UsageMeteringApi.GetDailyCustomReportsOptionalParameters()
                  .pageSize(pageSize)
                  .pageNumber(pageNumber)
                  .sortDir(sortDir)
                  .sort(sort));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getDailyCustomReports");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
