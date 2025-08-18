// Edit a dataset returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DatasetsApi;
import com.datadog.api.client.v2.model.DatasetAttributesRequest;
import com.datadog.api.client.v2.model.DatasetRequest;
import com.datadog.api.client.v2.model.DatasetResponseSingle;
import com.datadog.api.client.v2.model.DatasetType;
import com.datadog.api.client.v2.model.DatasetUpdateRequest;
import com.datadog.api.client.v2.model.FiltersPerProduct;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateDataset", true);
    DatasetsApi apiInstance = new DatasetsApi(defaultClient);

    // there is a valid "dataset" in the system
    String DATASET_DATA_ID = System.getenv("DATASET_DATA_ID");

    DatasetUpdateRequest body =
        new DatasetUpdateRequest()
            .data(
                new DatasetRequest()
                    .attributes(
                        new DatasetAttributesRequest()
                            .name("Security Audit Dataset")
                            .principals(
                                Collections.singletonList(
                                    "role:94172442-be03-11e9-a77a-3b7612558ac1"))
                            .productFilters(
                                Collections.singletonList(
                                    new FiltersPerProduct()
                                        .filters(Collections.singletonList("@application.id:1234"))
                                        .product("metrics"))))
                    .type(DatasetType.DATASET));

    try {
      DatasetResponseSingle result = apiInstance.updateDataset(DATASET_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#updateDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
