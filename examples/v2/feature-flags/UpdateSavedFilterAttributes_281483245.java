// Patch a saved filter updates only the description of a saved list

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.PatchSavedFilterAttributes;
import com.datadog.api.client.v2.model.PatchSavedFilterData;
import com.datadog.api.client.v2.model.PatchSavedFilterRequest;
import com.datadog.api.client.v2.model.SavedFilterDataType;
import com.datadog.api.client.v2.model.SavedFilterResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    PatchSavedFilterRequest body =
        new PatchSavedFilterRequest()
            .data(
                new PatchSavedFilterData()
                    .type(SavedFilterDataType.SAVED_FILTERS)
                    .attributes(
                        new PatchSavedFilterAttributes()
                            .description("Updated synthetic test description.")));

    try {
      SavedFilterResponse result =
          apiInstance.updateSavedFilterAttributes(
              UUID.fromString("d8e3a81b-1505-4600-99c6-c563d01d46b1"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#updateSavedFilterAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
