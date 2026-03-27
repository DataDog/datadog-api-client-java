// Delete AWS CCM config returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteAWSAccountCCMConfig", true);
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    try {
      apiInstance.deleteAWSAccountCCMConfig("aws_account_config_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#deleteAWSAccountCCMConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
