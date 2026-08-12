// Patch a deployment event by version returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DoraMetricsApi;
import com.datadog.api.client.v2.model.DORADeploymentPatchByVersionRemediation;
import com.datadog.api.client.v2.model.DORADeploymentPatchByVersionRemediationByVersion;
import com.datadog.api.client.v2.model.DORADeploymentPatchByVersionRequest;
import com.datadog.api.client.v2.model.DORADeploymentPatchByVersionRequestAttributes;
import com.datadog.api.client.v2.model.DORADeploymentPatchByVersionRequestData;
import com.datadog.api.client.v2.model.DORADeploymentPatchRemediationType;
import com.datadog.api.client.v2.model.DORADeploymentPatchRequestDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.patchDORADeploymentByVersion", true);
    DoraMetricsApi apiInstance = new DoraMetricsApi(defaultClient);

    DORADeploymentPatchByVersionRequest body =
        new DORADeploymentPatchByVersionRequest()
            .data(
                new DORADeploymentPatchByVersionRequestData()
                    .attributes(
                        new DORADeploymentPatchByVersionRequestAttributes()
                            .changeFailure(true)
                            .env("production")
                            .remediation(
                                new DORADeploymentPatchByVersionRemediation(
                                    new DORADeploymentPatchByVersionRemediationByVersion()
                                        .type(DORADeploymentPatchRemediationType.ROLLBACK)
                                        .version("v1.2.2")))
                            .service("my-service")
                            .version("v1.2.3"))
                    .type(DORADeploymentPatchRequestDataType.DORA_DEPLOYMENT_PATCH_REQUEST));

    try {
      apiInstance.patchDORADeploymentByVersion(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling DoraMetricsApi#patchDORADeploymentByVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
