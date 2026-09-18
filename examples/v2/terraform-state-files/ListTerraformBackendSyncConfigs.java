// List Terraform backend sync configurations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TerraformStateFilesApi;
import com.datadog.api.client.v2.api.TerraformStateFilesApi.ListTerraformBackendSyncConfigsOptionalParameters;
import com.datadog.api.client.v2.model.TerraformBackendListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TerraformStateFilesApi apiInstance = new TerraformStateFilesApi(defaultClient);

    try {
      TerraformBackendListResponse result =
          apiInstance.listTerraformBackendSyncConfigs(
              new ListTerraformBackendSyncConfigsOptionalParameters().accountId("123456789012"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TerraformStateFilesApi#listTerraformBackendSyncConfigs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
