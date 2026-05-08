// Update a dataset restriction returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DatasetRestrictionsApi;
import com.datadog.api.client.v2.model.DatasetRestrictionOwnershipMode;
import com.datadog.api.client.v2.model.DatasetRestrictionResponse;
import com.datadog.api.client.v2.model.DatasetRestrictionRestrictionMode;
import com.datadog.api.client.v2.model.DatasetRestrictionUpdateRequest;
import com.datadog.api.client.v2.model.DatasetRestrictionUpdateRequestAttributes;
import com.datadog.api.client.v2.model.DatasetRestrictionUpdateRequestData;
import com.datadog.api.client.v2.model.DatasetRestrictionsType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateDatasetRestriction", true);
    DatasetRestrictionsApi apiInstance = new DatasetRestrictionsApi(defaultClient);

    DatasetRestrictionUpdateRequest body =
        new DatasetRestrictionUpdateRequest()
            .data(
                new DatasetRestrictionUpdateRequestData()
                    .attributes(
                        new DatasetRestrictionUpdateRequestAttributes()
                            .ownershipMode(DatasetRestrictionOwnershipMode.TEAM_TAG_BASED)
                            .restrictionMode(DatasetRestrictionRestrictionMode.DEFAULT_HIDE))
                    .type(DatasetRestrictionsType.DATASET_RESTRICTIONS));

    try {
      DatasetRestrictionResponse result = apiInstance.updateDatasetRestriction("rum", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetRestrictionsApi#updateDatasetRestriction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
