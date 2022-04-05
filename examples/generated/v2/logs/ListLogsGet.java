import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsApi apiInstance = new LogsApi(defaultClient);
        String filterQuery = "@datacenter:us @role:db"; // String | Search query following logs syntax.
        String filterIndex = "main"; // String | For customers with multiple indexes, the indexes to search Defaults to '*' which means all indexes
        OffsetDateTime filterFrom = OffsetDateTime.parse("2019-01-02T09:42:36.320Z"); // OffsetDateTime | Minimum timestamp for requested logs.
        OffsetDateTime filterTo = OffsetDateTime.parse("2019-01-03T09:42:36.320Z"); // OffsetDateTime | Maximum timestamp for requested logs.
        LogsSort sort = LogsSort.fromValue("timestamp"); // LogsSort | Order of logs in results.
        String pageCursor = "eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ=="; // String | List following results with a cursor provided in the previous query.
        Integer pageLimit = 10; // Integer | Maximum number of logs in the response.
        try {
            LogsListResponse result = apiInstance.listLogsGet(new LogsApi.ListLogsGetOptionalParameters()
                .filterQuery(filterQuery)
                .filterIndex(filterIndex)
                .filterFrom(filterFrom)
                .filterTo(filterTo)
                .sort(sort)
                .pageCursor(pageCursor)
                .pageLimit(pageLimit));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#listLogsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
