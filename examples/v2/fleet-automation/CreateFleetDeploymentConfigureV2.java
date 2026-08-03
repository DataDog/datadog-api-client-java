// Create a configuration deployment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureV2Attributes;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureV2Create;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureV2CreateRequest;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureV2DryRunResponse;
import com.datadog.api.client.v2.model.FleetDeploymentFileOp;
import com.datadog.api.client.v2.model.FleetDeploymentOperation;
import com.datadog.api.client.v2.model.FleetDeploymentResourceType;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    FleetDeploymentConfigureV2CreateRequest body =
        new FleetDeploymentConfigureV2CreateRequest()
            .data(
                new FleetDeploymentConfigureV2Create()
                    .attributes(
                        new FleetDeploymentConfigureV2Attributes()
                            .configOperations(
                                Collections.singletonList(
                                    new FleetDeploymentOperation()
                                        .fileOp(FleetDeploymentFileOp.MERGE_PATCH)
                                        .filePath("/datadog.yaml")
                                        .patch(Map.ofEntries(Map.entry("log_level", "info")))))
                            .dryRun(true)
                            .filterQuery("env:prod AND service:example-fleet-automation"))
                    .type(FleetDeploymentResourceType.DEPLOYMENT));

    try {
      FleetDeploymentConfigureV2DryRunResponse result =
          apiInstance.createFleetDeploymentConfigureV2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling FleetAutomationApi#createFleetDeploymentConfigureV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
