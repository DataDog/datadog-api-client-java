// Update a Terraform backend sync configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TerraformStateFilesApi;
import com.datadog.api.client.v2.model.TerraformBackendResponse;
import com.datadog.api.client.v2.model.TerraformBackendType;
import com.datadog.api.client.v2.model.TerraformBackendUpdateAttributes;
import com.datadog.api.client.v2.model.TerraformBackendUpdateData;
import com.datadog.api.client.v2.model.TerraformBackendUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TerraformStateFilesApi apiInstance = new TerraformStateFilesApi(defaultClient);

    TerraformBackendUpdateRequest body =
        new TerraformBackendUpdateRequest()
            .data(
                new TerraformBackendUpdateData()
                    .attributes(
                        new TerraformBackendUpdateAttributes()
                            .bucketNames(Collections.singletonList("terraform-state-bucket")))
                    .id("9007199254740993")
                    .type(TerraformBackendType.TERRAFORM_BACKENDS));

    try {
      TerraformBackendResponse result =
          apiInstance.updateTerraformBackendSyncConfig("9007199254740993", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TerraformStateFilesApi#updateTerraformBackendSyncConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
