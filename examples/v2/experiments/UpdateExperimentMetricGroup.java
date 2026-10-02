// Update experiment metric group returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsExperimentMetricGroupMutationV2;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentMetricGroupV2Request;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentMetricGroupV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentMetricGroupV2RequestDataType;
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

    // there is a valid "experiment_metric_group" in the system
    UUID EXPERIMENT_METRIC_GROUP_DATA_ID = null;
    try {
      EXPERIMENT_METRIC_GROUP_DATA_ID =
          UUID.fromString(System.getenv("EXPERIMENT_METRIC_GROUP_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    ExperimentsPatchExperimentMetricGroupV2Request body =
        new ExperimentsPatchExperimentMetricGroupV2Request()
            .data(
                new ExperimentsPatchExperimentMetricGroupV2RequestData()
                    .type(
                        ExperimentsPatchExperimentMetricGroupV2RequestDataType
                            .EXPERIMENT_METRIC_GROUPS)
                    .id(EXPERIMENT_METRIC_GROUP_DATA_ID)
                    .attributes(
                        new ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes()
                            .name("ex-14bb9543f523edde updated")));

    try {
      ExperimentsExperimentMetricGroupMutationV2 result =
          apiInstance.updateExperimentMetricGroup(
              EXPERIMENT_DATA_ID, EXPERIMENT_METRIC_GROUP_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#updateExperimentMetricGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
