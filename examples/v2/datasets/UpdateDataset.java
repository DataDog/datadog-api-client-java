// Edit a dataset returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DatasetsApi;
import com.datadog.api.client.v2.model.Dataset;
import com.datadog.api.client.v2.model.DatasetAttributes;
import com.datadog.api.client.v2.model.DatasetResponseSingle;
import com.datadog.api.client.v2.model.DatasetUpdateRequest;
import com.datadog.api.client.v2.model.FiltersPerProduct;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DatasetsApi apiInstance = new DatasetsApi(defaultClient);

    DatasetUpdateRequest body =
        new DatasetUpdateRequest()
            .data(
                new Dataset()
                    .attributes(
                        new DatasetAttributes()
                            .createdAt(null)
                            .name("Security Audit Dataset")
                            .principals(
                                Collections.singletonList(
                                    "role:86245fce-0a4e-11f0-92bd-da7ad0900002"))
                            .productFilters(
                                Collections.singletonList(
                                    new FiltersPerProduct()
                                        .filters(Collections.singletonList("@application.id:ABCD"))
                                        .product("logs"))))
                    .id("123e4567-e89b-12d3-a456-426614174000")
                    .type("dataset"));

    try {
      DatasetResponseSingle result = apiInstance.updateDataset("dataset_id", body);
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
