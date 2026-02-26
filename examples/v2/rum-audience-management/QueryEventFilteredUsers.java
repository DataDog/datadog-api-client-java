// Query event filtered users returns "Successful response with filtered user data" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.QueryResponse;
import com.datadog.api.client.v2.model.QueryEventFilteredUsersRequest;
import com.datadog.api.client.v2.model.QueryEventFilteredUsersRequestData;
import com.datadog.api.client.v2.model.QueryEventFilteredUsersRequestDataAttributes;
import com.datadog.api.client.v2.model.QueryEventFilteredUsersRequestDataAttributesEventQuery;
import com.datadog.api.client.v2.model.QueryEventFilteredUsersRequestDataAttributesEventQueryTimeFrame;
import com.datadog.api.client.v2.model.QueryEventFilteredUsersRequestDataType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.queryEventFilteredUsers", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    QueryEventFilteredUsersRequest body = new QueryEventFilteredUsersRequest()
.data(new QueryEventFilteredUsersRequestData()
.attributes(new QueryEventFilteredUsersRequestDataAttributes()
.eventQuery(new QueryEventFilteredUsersRequestDataAttributesEventQuery()
.query("@type:view AND @view.loading_time:>3000 AND @application.name:ecommerce-platform")
.timeFrame(new QueryEventFilteredUsersRequestDataAttributesEventQueryTimeFrame()
.end(1761309676L)
.start(1760100076L)))
.includeRowCount(true)
.limit(25L)
.query("user_org_id:5001 AND first_country_code:US AND first_browser_name:Chrome")
.selectColumns(Arrays.asList("user_id", "user_email", "first_country_code", "first_browser_name", "events_count", "session_count", "error_count", "avg_loading_time")))
.id("query_event_filtered_users_request")
.type(QueryEventFilteredUsersRequestDataType.QUERY_EVENT_FILTERED_USERS_REQUEST));

    try {
      QueryResponse result = apiInstance.queryEventFilteredUsers(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumAudienceManagementApi#queryEventFilteredUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}