// Query users returns "Successful response with user data" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.QueryResponse;
import com.datadog.api.client.v2.model.QueryUsersRequest;
import com.datadog.api.client.v2.model.QueryUsersRequestData;
import com.datadog.api.client.v2.model.QueryUsersRequestDataAttributes;
import com.datadog.api.client.v2.model.QueryUsersRequestDataAttributesSort;
import com.datadog.api.client.v2.model.QueryUsersRequestDataType;
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
    defaultClient.setUnstableOperationEnabled("v2.queryUsers", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    QueryUsersRequest body = new QueryUsersRequest()
.data(new QueryUsersRequestData()
.attributes(new QueryUsersRequestDataAttributes()
.limit(25L)
.query("user_email:*@techcorp.com AND first_country_code:US AND first_browser_name:Chrome")
.selectColumns(Arrays.asList("user_id", "user_email", "user_name", "user_org_id", "first_country_code", "first_browser_name", "first_device_type", "last_seen"))
.sort(new QueryUsersRequestDataAttributesSort()
.field("first_seen")
.order("DESC"))
.wildcardSearchTerm("john"))
.id("query_users_request")
.type(QueryUsersRequestDataType.QUERY_USERS_REQUEST));

    try {
      QueryResponse result = apiInstance.queryUsers(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumAudienceManagementApi#queryUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}