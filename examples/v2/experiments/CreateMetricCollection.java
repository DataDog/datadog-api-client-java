// Create metric collection returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricCollectionV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricCollectionV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricCollectionV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsMetricCollectionV2DTO;
import com.datadog.api.client.v2.model.ExperimentsPatchMetricCollectionV2RequestDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    ExperimentsCreateMetricCollectionV2Request body =
        new ExperimentsCreateMetricCollectionV2Request()
            .data(
                new ExperimentsCreateMetricCollectionV2RequestData()
                    .type(ExperimentsPatchMetricCollectionV2RequestDataType.METRIC_COLLECTIONS)
                    .attributes(
                        new ExperimentsCreateMetricCollectionV2RequestDataAttributes()
                            .name("ex-14bb9543f523edde")));

    try {
      ExperimentsMetricCollectionV2DTO result = apiInstance.createMetricCollection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#createMetricCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
