// Create a Terraform backend sync configuration returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TerraformStateFilesApi;
import com.datadog.api.client.v2.model.TerraformBackendCreateAttributes;
import com.datadog.api.client.v2.model.TerraformBackendCreateData;
import com.datadog.api.client.v2.model.TerraformBackendCreateRequest;
import com.datadog.api.client.v2.model.TerraformBackendKind;
import com.datadog.api.client.v2.model.TerraformBackendResponse;
import com.datadog.api.client.v2.model.TerraformBackendType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TerraformStateFilesApi apiInstance = new TerraformStateFilesApi(defaultClient);

    TerraformBackendCreateRequest body =
        new TerraformBackendCreateRequest()
            .data(
                new TerraformBackendCreateData()
                    .attributes(
                        new TerraformBackendCreateAttributes()
                            .accountId("123456789012")
                            .backendType(TerraformBackendKind.TERRAFORM)
                            .bucketNames(Collections.singletonList("terraform-state-bucket"))
                            .region("us-east-1"))
                    .type(TerraformBackendType.TERRAFORM_BACKENDS));

    try {
      TerraformBackendResponse result = apiInstance.createTerraformBackendSyncConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TerraformStateFilesApi#createTerraformBackendSyncConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
