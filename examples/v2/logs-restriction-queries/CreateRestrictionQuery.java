// Create a restriction query returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsRestrictionQueriesApi;
import com.datadog.api.client.v2.model.LogsRestrictionQueriesType;
import com.datadog.api.client.v2.model.RestrictionQueryCreateAttributes;
import com.datadog.api.client.v2.model.RestrictionQueryCreateData;
import com.datadog.api.client.v2.model.RestrictionQueryCreatePayload;
import com.datadog.api.client.v2.model.RestrictionQueryWithoutRelationshipsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createRestrictionQuery", true);
    LogsRestrictionQueriesApi apiInstance = new LogsRestrictionQueriesApi(defaultClient);

    RestrictionQueryCreatePayload body =
        new RestrictionQueryCreatePayload()
            .data(
                new RestrictionQueryCreateData()
                    .attributes(
                        new RestrictionQueryCreateAttributes().restrictionQuery("env:sandbox"))
                    .type(LogsRestrictionQueriesType.LOGS_RESTRICTION_QUERIES));

    try {
      RestrictionQueryWithoutRelationshipsResponse result =
          apiInstance.createRestrictionQuery(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsRestrictionQueriesApi#createRestrictionQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
