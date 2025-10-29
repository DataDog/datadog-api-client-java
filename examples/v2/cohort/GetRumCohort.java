// Get rum cohort returns "Successful response with cohort analysis data" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CohortApi;
import com.datadog.api.client.v2.model.GetCohortRequest;
import com.datadog.api.client.v2.model.GetCohortRequestData;
import com.datadog.api.client.v2.model.GetCohortRequestDataAttributes;
import com.datadog.api.client.v2.model.GetCohortRequestDataAttributesDefinition;
import com.datadog.api.client.v2.model.GetCohortRequestDataAttributesDefinitionAudienceFilters;
import com.datadog.api.client.v2.model.GetCohortRequestDataAttributesDefinitionAudienceFiltersAccountsItems;
import com.datadog.api.client.v2.model.GetCohortRequestDataAttributesDefinitionAudienceFiltersSegmentsItems;
import com.datadog.api.client.v2.model.GetCohortRequestDataAttributesDefinitionAudienceFiltersUsersItems;
import com.datadog.api.client.v2.model.GetCohortRequestDataAttributesTime;
import com.datadog.api.client.v2.model.GetCohortRequestDataType;
import com.datadog.api.client.v2.model.GetCohortResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getRumCohort", true);
    CohortApi apiInstance = new CohortApi(defaultClient);

    GetCohortRequest body =
        new GetCohortRequest()
            .data(
                new GetCohortRequestData()
                    .attributes(
                        new GetCohortRequestDataAttributes()
                            .definition(
                                new GetCohortRequestDataAttributesDefinition()
                                    .audienceFilters(
                                        new GetCohortRequestDataAttributesDefinitionAudienceFilters()
                                            .accounts(
                                                Collections.singletonList(
                                                    new GetCohortRequestDataAttributesDefinitionAudienceFiltersAccountsItems()
                                                        .name("")))
                                            .segments(
                                                Collections.singletonList(
                                                    new GetCohortRequestDataAttributesDefinitionAudienceFiltersSegmentsItems()
                                                        .name("")
                                                        .segmentId("")))
                                            .users(
                                                Collections.singletonList(
                                                    new GetCohortRequestDataAttributesDefinitionAudienceFiltersUsersItems()
                                                        .name("")))))
                            .time(new GetCohortRequestDataAttributesTime()))
                    .type(GetCohortRequestDataType.COHORT_REQUEST));

    try {
      GetCohortResponse result = apiInstance.getRumCohort(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CohortApi#getRumCohort");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
