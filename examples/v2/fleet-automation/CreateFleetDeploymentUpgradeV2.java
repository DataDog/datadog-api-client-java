// Upgrade hosts returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetDeploymentPackage;
import com.datadog.api.client.v2.model.FleetDeploymentPackageUpgradeV2Attributes;
import com.datadog.api.client.v2.model.FleetDeploymentPackageUpgradeV2Create;
import com.datadog.api.client.v2.model.FleetDeploymentPackageUpgradeV2CreateRequest;
import com.datadog.api.client.v2.model.FleetDeploymentResourceType;
import com.datadog.api.client.v2.model.FleetDeploymentV2CreateResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    FleetDeploymentPackageUpgradeV2CreateRequest body =
        new FleetDeploymentPackageUpgradeV2CreateRequest()
            .data(
                new FleetDeploymentPackageUpgradeV2Create()
                    .attributes(
                        new FleetDeploymentPackageUpgradeV2Attributes()
                            .filterQuery("env:prod AND service:example-fleet-automation")
                            .targetPackages(
                                Collections.singletonList(
                                    new FleetDeploymentPackage()
                                        .name("datadog-agent")
                                        .version("7.52.0"))))
                    .type(FleetDeploymentResourceType.DEPLOYMENT));

    try {
      FleetDeploymentV2CreateResponse result = apiInstance.createFleetDeploymentUpgradeV2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling FleetAutomationApi#createFleetDeploymentUpgradeV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
