// Upgrade hosts returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetDeploymentPackage;
import com.datadog.api.client.v2.model.FleetDeploymentPackageUpgradeAttributes;
import com.datadog.api.client.v2.model.FleetDeploymentPackageUpgradeCreate;
import com.datadog.api.client.v2.model.FleetDeploymentPackageUpgradeCreateRequest;
import com.datadog.api.client.v2.model.FleetDeploymentResourceType;
import com.datadog.api.client.v2.model.FleetDeploymentResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createFleetDeploymentUpgrade", true);
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    FleetDeploymentPackageUpgradeCreateRequest body =
        new FleetDeploymentPackageUpgradeCreateRequest()
            .data(
                new FleetDeploymentPackageUpgradeCreate()
                    .attributes(
                        new FleetDeploymentPackageUpgradeAttributes()
                            .filterQuery("env:prod AND service:web")
                            .targetPackages(
                                Collections.singletonList(
                                    new FleetDeploymentPackage()
                                        .name("datadog-agent")
                                        .version("7.52.0"))))
                    .type(FleetDeploymentResourceType.DEPLOYMENT));

    try {
      FleetDeploymentResponse result = apiInstance.createFleetDeploymentUpgrade(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#createFleetDeploymentUpgrade");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
