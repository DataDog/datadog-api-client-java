// Update metric collection returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsMetricCollectionV2DTO;
import com.datadog.api.client.v2.model.ExperimentsPatchMetricCollectionV2Request;
import com.datadog.api.client.v2.model.ExperimentsPatchMetricCollectionV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsPatchMetricCollectionV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsPatchMetricCollectionV2RequestDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "experiment_metric_collection" in the system
    UUID EXPERIMENT_METRIC_COLLECTION_DATA_ID = null;
    try {
      EXPERIMENT_METRIC_COLLECTION_DATA_ID =
          UUID.fromString(System.getenv("EXPERIMENT_METRIC_COLLECTION_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    ExperimentsPatchMetricCollectionV2Request body =
        new ExperimentsPatchMetricCollectionV2Request()
            .data(
                new ExperimentsPatchMetricCollectionV2RequestData()
                    .type(ExperimentsPatchMetricCollectionV2RequestDataType.METRIC_COLLECTIONS)
                    .attributes(
                        new ExperimentsPatchMetricCollectionV2RequestDataAttributes()
                            .name("ex-14bb9543f523edde updated")));

    try {
      ExperimentsMetricCollectionV2DTO result =
          apiInstance.updateMetricCollection(EXPERIMENT_METRIC_COLLECTION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#updateMetricCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
