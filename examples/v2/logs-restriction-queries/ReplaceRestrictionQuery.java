// Replace a restriction query returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsRestrictionQueriesApi;
import com.datadog.api.client.v2.model.RestrictionQueryWithoutRelationshipsResponse;
import com.datadog.api.client.v2.model.LogsRestrictionQueriesType;
import com.datadog.api.client.v2.model.RestrictionQueryUpdateAttributes;
import com.datadog.api.client.v2.model.RestrictionQueryUpdateData;
import com.datadog.api.client.v2.model.RestrictionQueryUpdatePayload;
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
    defaultClient.setUnstableOperationEnabled("v2.replaceRestrictionQuery", true);
    LogsRestrictionQueriesApi apiInstance = new LogsRestrictionQueriesApi(defaultClient);

    // there is a valid "restriction_query" in the system
    String RESTRICTION_QUERY_DATA_ID = System.getenv("RESTRICTION_QUERY_DATA_ID");

    RestrictionQueryUpdatePayload body = new RestrictionQueryUpdatePayload()
.data(new RestrictionQueryUpdateData()
.attributes(new RestrictionQueryUpdateAttributes()
.restrictionQuery("env:staging"))
.type(LogsRestrictionQueriesType.LOGS_RESTRICTION_QUERIES));

    try {
      RestrictionQueryWithoutRelationshipsResponse result = apiInstance.replaceRestrictionQuery(RESTRICTION_QUERY_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsRestrictionQueriesApi#replaceRestrictionQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}