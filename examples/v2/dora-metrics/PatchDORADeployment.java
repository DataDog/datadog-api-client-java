// Patch a deployment event returns "Accepted" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DoraMetricsApi;
import com.datadog.api.client.v2.model.DORADeploymentPatchRemediation;
import com.datadog.api.client.v2.model.DORADeploymentPatchRemediationType;
import com.datadog.api.client.v2.model.DORADeploymentPatchRequest;
import com.datadog.api.client.v2.model.DORADeploymentPatchRequestAttributes;
import com.datadog.api.client.v2.model.DORADeploymentPatchRequestData;
import com.datadog.api.client.v2.model.DORADeploymentPatchRequestDataType;
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
    DoraMetricsApi apiInstance = new DoraMetricsApi(defaultClient);

    DORADeploymentPatchRequest body = new DORADeploymentPatchRequest()
.data(new DORADeploymentPatchRequestData()
.attributes(new DORADeploymentPatchRequestAttributes()
.changeFailure(true)
.remediation(new DORADeploymentPatchRemediation()
.id("eG42zNIkVjM")
.type(DORADeploymentPatchRemediationType.ROLLBACK)))
.id("z_RwVLi7v4Y")
.type(DORADeploymentPatchRequestDataType.DORA_DEPLOYMENT_PATCH_REQUEST));

    try {
      apiInstance.patchDORADeployment("deployment_id", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling DoraMetricsApi#patchDORADeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}