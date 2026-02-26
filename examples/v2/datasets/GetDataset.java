// Get a single dataset by ID returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DatasetsApi;
import com.datadog.api.client.v2.model.DatasetResponseSingle;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getDataset", true);
    DatasetsApi apiInstance = new DatasetsApi(defaultClient);

    // there is a valid "dataset" in the system
    String DATASET_DATA_ID = System.getenv("DATASET_DATA_ID");

    try {
      DatasetResponseSingle result = apiInstance.getDataset(DATASET_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#getDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}