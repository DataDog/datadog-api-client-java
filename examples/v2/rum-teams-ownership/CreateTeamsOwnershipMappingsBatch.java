// Bulk create and remove teams ownership mappings returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumTeamsOwnershipApi;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingBatchOperation;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingBatchOperationData;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingBatchOperationDataAttributes;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingBatchOperationOp;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingBatchRequest;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingBatchResponse;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingType;
import com.datadog.api.client.v2.model.TeamsOwnershipMatchType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumTeamsOwnershipApi apiInstance = new RumTeamsOwnershipApi(defaultClient);

    TeamsOwnershipMappingBatchRequest body =
        new TeamsOwnershipMappingBatchRequest()
            .atomicOperations(
                Collections.singletonList(
                    new TeamsOwnershipMappingBatchOperation()
                        .op(TeamsOwnershipMappingBatchOperationOp.ADD)
                        .data(
                            new TeamsOwnershipMappingBatchOperationData()
                                .type(TeamsOwnershipMappingType.TEAMS_OWNERSHIP_MAPPINGS)
                                .attributes(
                                    new TeamsOwnershipMappingBatchOperationDataAttributes()
                                        .teamHandle("team-rum")
                                        .viewName("/checkout-examplerumteamsownership")
                                        .service("web-checkout-examplerumteamsownership")
                                        .matchType(TeamsOwnershipMatchType.EXACT)))));

    try {
      TeamsOwnershipMappingBatchResponse result =
          apiInstance.createTeamsOwnershipMappingsBatch(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumTeamsOwnershipApi#createTeamsOwnershipMappingsBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
