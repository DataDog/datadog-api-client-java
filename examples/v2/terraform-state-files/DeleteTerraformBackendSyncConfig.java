// Delete a Terraform backend sync configuration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TerraformStateFilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TerraformStateFilesApi apiInstance = new TerraformStateFilesApi(defaultClient);

    try {
      apiInstance.deleteTerraformBackendSyncConfig("9007199254740993");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TerraformStateFilesApi#deleteTerraformBackendSyncConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
