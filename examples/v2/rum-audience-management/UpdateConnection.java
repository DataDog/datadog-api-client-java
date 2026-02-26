// Update connection returns "Connection updated successfully" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.CreateConnectionRequestDataAttributesFieldsItems;
import com.datadog.api.client.v2.model.UpdateConnectionRequest;
import com.datadog.api.client.v2.model.UpdateConnectionRequestData;
import com.datadog.api.client.v2.model.UpdateConnectionRequestDataAttributes;
import com.datadog.api.client.v2.model.UpdateConnectionRequestDataAttributesFieldsToUpdateItems;
import com.datadog.api.client.v2.model.UpdateConnectionRequestDataType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateConnection", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    UpdateConnectionRequest body =
        new UpdateConnectionRequest()
            .data(
                new UpdateConnectionRequestData()
                    .attributes(
                        new UpdateConnectionRequestDataAttributes()
                            .fieldsToAdd(
                                Collections.singletonList(
                                    new CreateConnectionRequestDataAttributesFieldsItems()
                                        .description("Net Promoter Score from customer surveys")
                                        .displayName("NPS Score")
                                        .groups(Arrays.asList("Satisfaction", "Metrics"))
                                        .id("nps_score")
                                        .sourceName("net_promoter_score")
                                        .type("number")))
                            .fieldsToDelete(Collections.singletonList("old_revenue_field"))
                            .fieldsToUpdate(
                                Collections.singletonList(
                                    new UpdateConnectionRequestDataAttributesFieldsToUpdateItems()
                                        .fieldId("lifetime_value")
                                        .updatedDisplayName("Customer Lifetime Value (`USD`)")
                                        .updatedGroups(Arrays.asList("Financial", "Metrics")))))
                    .id("crm-integration")
                    .type(UpdateConnectionRequestDataType.CONNECTION_ID));

    try {
      apiInstance.updateConnection("users", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumAudienceManagementApi#updateConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
