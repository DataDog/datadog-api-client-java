// Create a test suite for a DEM journey returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DemApi;
import com.datadog.api.client.v2.model.DemCreateJourneyTestSuiteAttributes;
import com.datadog.api.client.v2.model.DemCreateJourneyTestSuiteData;
import com.datadog.api.client.v2.model.DemCreateJourneyTestSuiteRequest;
import com.datadog.api.client.v2.model.DemCreateJourneyTestSuiteRequestType;
import com.datadog.api.client.v2.model.DemJourneyTestSuiteResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DemApi apiInstance = new DemApi(defaultClient);

    DemCreateJourneyTestSuiteRequest body =
        new DemCreateJourneyTestSuiteRequest()
            .data(
                new DemCreateJourneyTestSuiteData()
                    .attributes(
                        new DemCreateJourneyTestSuiteAttributes()
                            .includeTestsFromJourneyCoverage(true)
                            .testSuiteName("My Custom Suite"))
                    .type(
                        DemCreateJourneyTestSuiteRequestType
                            .CREATE_TEST_SUITE_FOR_JOURNEY_REQUEST));

    try {
      DemJourneyTestSuiteResponse result =
          apiInstance.createTestSuiteForJourney("journey-abc123", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemApi#createTestSuiteForJourney");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
