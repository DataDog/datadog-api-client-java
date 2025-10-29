// Get rum cohort users returns "Successful response with cohort users" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CohortApi;
import com.datadog.api.client.v2.model.GetCohortUsersRequest;
import com.datadog.api.client.v2.model.GetCohortUsersRequestData;
import com.datadog.api.client.v2.model.GetCohortUsersRequestDataAttributes;
import com.datadog.api.client.v2.model.GetCohortUsersRequestDataAttributesDefinition;
import com.datadog.api.client.v2.model.GetCohortUsersRequestDataAttributesDefinitionAudienceFilters;
import com.datadog.api.client.v2.model.GetCohortUsersRequestDataAttributesDefinitionAudienceFiltersAccountsItems;
import com.datadog.api.client.v2.model.GetCohortUsersRequestDataAttributesDefinitionAudienceFiltersSegmentsItems;
import com.datadog.api.client.v2.model.GetCohortUsersRequestDataAttributesDefinitionAudienceFiltersUsersItems;
import com.datadog.api.client.v2.model.GetCohortUsersRequestDataAttributesTime;
import com.datadog.api.client.v2.model.GetCohortUsersRequestDataType;
import com.datadog.api.client.v2.model.GetCohortUsersResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getRumCohortUsers", true);
    CohortApi apiInstance = new CohortApi(defaultClient);

    GetCohortUsersRequest body =
        new GetCohortUsersRequest()
            .data(
                new GetCohortUsersRequestData()
                    .attributes(
                        new GetCohortUsersRequestDataAttributes()
                            .definition(
                                new GetCohortUsersRequestDataAttributesDefinition()
                                    .audienceFilters(
                                        new GetCohortUsersRequestDataAttributesDefinitionAudienceFilters()
                                            .accounts(
                                                Collections.singletonList(
                                                    new GetCohortUsersRequestDataAttributesDefinitionAudienceFiltersAccountsItems()
                                                        .name("")))
                                            .segments(
                                                Collections.singletonList(
                                                    new GetCohortUsersRequestDataAttributesDefinitionAudienceFiltersSegmentsItems()
                                                        .name("")
                                                        .segmentId("")))
                                            .users(
                                                Collections.singletonList(
                                                    new GetCohortUsersRequestDataAttributesDefinitionAudienceFiltersUsersItems()
                                                        .name("")))))
                            .time(new GetCohortUsersRequestDataAttributesTime()))
                    .type(GetCohortUsersRequestDataType.COHORT_USERS_REQUEST));

    try {
      GetCohortUsersResponse result = apiInstance.getRumCohortUsers(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CohortApi#getRumCohortUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
