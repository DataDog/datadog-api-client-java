// Create experiment metric group returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentMetricGroupV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentMetricGroupV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentMetricGroupV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentMetricGroupV2RequestDataAttributesMetricsItems;
import com.datadog.api.client.v2.model.ExperimentsExperimentMetricGroupMutationV2;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentMetricGroupV2RequestDataType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "experiment" in the system
    UUID EXPERIMENT_DATA_ID = null;
    try {
      EXPERIMENT_DATA_ID = UUID.fromString(System.getenv("EXPERIMENT_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "experiment_metric" in the system
    UUID EXPERIMENT_METRIC_DATA_ID = null;
    try {
      EXPERIMENT_METRIC_DATA_ID = UUID.fromString(System.getenv("EXPERIMENT_METRIC_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    ExperimentsCreateExperimentMetricGroupV2Request body =
        new ExperimentsCreateExperimentMetricGroupV2Request()
            .data(
                new ExperimentsCreateExperimentMetricGroupV2RequestData()
                    .type(
                        ExperimentsPatchExperimentMetricGroupV2RequestDataType
                            .EXPERIMENT_METRIC_GROUPS)
                    .attributes(
                        new ExperimentsCreateExperimentMetricGroupV2RequestDataAttributes()
                            .name("ex-14bb9543f523edde")
                            .metrics(
                                Collections.singletonList(
                                    new ExperimentsCreateExperimentMetricGroupV2RequestDataAttributesMetricsItems()
                                        .metricId(EXPERIMENT_METRIC_DATA_ID)))));

    try {
      ExperimentsExperimentMetricGroupMutationV2 result =
          apiInstance.createExperimentMetricGroup(EXPERIMENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#createExperimentMetricGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
