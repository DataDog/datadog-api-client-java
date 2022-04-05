import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.RumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        RumApi apiInstance = new RumApi(defaultClient);
        String filterQuery = "@type:session @application_id:xxxx"; // String | Search query following RUM syntax.
        OffsetDateTime filterFrom = OffsetDateTime.parse("2019-01-02T09:42:36.320Z"); // OffsetDateTime | Minimum timestamp for requested events.
        OffsetDateTime filterTo = OffsetDateTime.parse("2019-01-03T09:42:36.320Z"); // OffsetDateTime | Maximum timestamp for requested events.
        RUMSort sort = RUMSort.fromValue("timestamp"); // RUMSort | Order of events in results.
        String pageCursor = "eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ=="; // String | List following results with a cursor provided in the previous query.
        Integer pageLimit = 10; // Integer | Maximum number of events in the response.
        try {
            RUMEventsResponse result = apiInstance.listRUMEvents(new RumApi.ListRUMEventsOptionalParameters()
                .filterQuery(filterQuery)
                .filterFrom(filterFrom)
                .filterTo(filterTo)
                .sort(sort)
                .pageCursor(pageCursor)
                .pageLimit(pageLimit));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApi#listRUMEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
