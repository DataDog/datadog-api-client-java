// Aggregate cases returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseAggregateGroupBy;
import com.datadog.api.client.v2.model.CaseAggregateRequest;
import com.datadog.api.client.v2.model.CaseAggregateRequestAttributes;
import com.datadog.api.client.v2.model.CaseAggregateRequestData;
import com.datadog.api.client.v2.model.CaseAggregateResourceType;
import com.datadog.api.client.v2.model.CaseAggregateResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.aggregateCases", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseAggregateRequest body =
        new CaseAggregateRequest()
            .data(
                new CaseAggregateRequestData()
                    .attributes(
                        new CaseAggregateRequestAttributes()
                            .groupBy(
                                new CaseAggregateGroupBy()
                                    .groups(Collections.singletonList("status"))
                                    .limit(14))
                            .queryFilter("service:case-api"))
                    .type(CaseAggregateResourceType.AGGREGATE));

    try {
      CaseAggregateResponse result = apiInstance.aggregateCases(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#aggregateCases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
