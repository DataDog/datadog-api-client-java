// List all rule outcomes returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ServiceScorecardsApi;
import com.datadog.api.client.v2.api.ServiceScorecardsApi.ListScorecardOutcomesOptionalParameters;
import com.datadog.api.client.v2.model.OutcomesResponse;
import com.datadog.api.client.v2.model.OutcomesResponseDataItem;
import com.datadog.api.client.PaginationIterable;
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
    defaultClient.setUnstableOperationEnabled("v2.listScorecardOutcomes", true);
    ServiceScorecardsApi apiInstance = new ServiceScorecardsApi(defaultClient);

    try {
      PaginationIterable<OutcomesResponseDataItem> iterable = apiInstance.listScorecardOutcomesWithPagination(new ListScorecardOutcomesOptionalParameters().pageSize(2L).fieldsOutcome("state").filterOutcomeServiceName("my-service"));

      for (OutcomesResponseDataItem item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling ServiceScorecardsApi#listScorecardOutcomesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}