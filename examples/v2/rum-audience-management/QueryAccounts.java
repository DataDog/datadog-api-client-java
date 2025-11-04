// Query accounts returns "Successful response with account data" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.QueryAccountRequest;
import com.datadog.api.client.v2.model.QueryAccountRequestData;
import com.datadog.api.client.v2.model.QueryAccountRequestDataAttributes;
import com.datadog.api.client.v2.model.QueryAccountRequestDataAttributesSort;
import com.datadog.api.client.v2.model.QueryAccountRequestDataType;
import com.datadog.api.client.v2.model.QueryResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.queryAccounts", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    QueryAccountRequest body =
        new QueryAccountRequest()
            .data(
                new QueryAccountRequestData()
                    .attributes(
                        new QueryAccountRequestDataAttributes()
                            .limit(20L)
                            .query(
                                "plan_type:enterprise AND user_count:>100 AND"
                                    + " subscription_status:active")
                            .selectColumns(
                                Arrays.asList(
                                    "account_id",
                                    "account_name",
                                    "user_count",
                                    "plan_type",
                                    "subscription_status",
                                    "created_at",
                                    "mrr",
                                    "industry"))
                            .sort(
                                new QueryAccountRequestDataAttributesSort()
                                    .field("user_count")
                                    .order("DESC"))
                            .wildcardSearchTerm("tech"))
                    .id("query_account_request")
                    .type(QueryAccountRequestDataType.QUERY_ACCOUNT_REQUEST));

    try {
      QueryResponse result = apiInstance.queryAccounts(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumAudienceManagementApi#queryAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
