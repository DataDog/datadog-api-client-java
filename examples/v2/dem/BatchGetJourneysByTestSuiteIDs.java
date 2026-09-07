// Batch get DEM journeys by test suite IDs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DemApi;
import com.datadog.api.client.v2.model.DemBatchGetJourneysAttributes;
import com.datadog.api.client.v2.model.DemBatchGetJourneysData;
import com.datadog.api.client.v2.model.DemBatchGetJourneysRequest;
import com.datadog.api.client.v2.model.DemBatchGetJourneysRequestType;
import com.datadog.api.client.v2.model.DemJourneysListResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DemApi apiInstance = new DemApi(defaultClient);

    DemBatchGetJourneysRequest body =
        new DemBatchGetJourneysRequest()
            .data(
                new DemBatchGetJourneysData()
                    .attributes(
                        new DemBatchGetJourneysAttributes()
                            .testSuiteIds(Arrays.asList("suite-abc123", "suite-def456")))
                    .type(
                        DemBatchGetJourneysRequestType
                            .BATCH_GET_JOURNEYS_BY_TEST_SUITE_IDS_REQUEST));

    try {
      DemJourneysListResponse result = apiInstance.batchGetJourneysByTestSuiteIDs(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemApi#batchGetJourneysByTestSuiteIDs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
