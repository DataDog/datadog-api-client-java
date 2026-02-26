// Create a configuration deployment returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureAttributes;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureCreate;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureCreateRequest;
import com.datadog.api.client.v2.model.FleetDeploymentFileOp;
import com.datadog.api.client.v2.model.FleetDeploymentOperation;
import com.datadog.api.client.v2.model.FleetDeploymentResourceType;
import com.datadog.api.client.v2.model.FleetDeploymentResponse;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createFleetDeploymentConfigure", true);
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    FleetDeploymentConfigureCreateRequest body =
        new FleetDeploymentConfigureCreateRequest()
            .data(
                new FleetDeploymentConfigureCreate()
                    .attributes(
                        new FleetDeploymentConfigureAttributes()
                            .configOperations(
                                Collections.singletonList(
                                    new FleetDeploymentOperation()
                                        .fileOp(FleetDeploymentFileOp.MERGE_PATCH)
                                        .filePath("/datadog.yaml")
                                        .patch(
                                            Map.ofEntries(
                                                Map.entry("apm_config", "{'enabled': True}"),
                                                Map.entry("log_level", "debug"),
                                                Map.entry("logs_enabled", "True")))))
                            .filterQuery("env:prod AND service:web"))
                    .type(FleetDeploymentResourceType.DEPLOYMENT));

    try {
      FleetDeploymentResponse result = apiInstance.createFleetDeploymentConfigure(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling FleetAutomationApi#createFleetDeploymentConfigure");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
