// Edit a Data Access Control dataset returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DataAccessControlsApi;
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
    DataAccessControlsApi apiInstance = new DataAccessControlsApi(defaultClient);

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
                                        .filters(Collections.singletonList("@application.id:ABCD"))
                                        .product("logs"))))
                    .type(DatasetType.DATASET));

    try {
      DatasetResponseSingle result =
          apiInstance.updateDataset("0879ce27-29a1-481f-a12e-bc2a48ec9ae1", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAccessControlsApi#updateDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
