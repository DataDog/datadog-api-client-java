// Delete an AWS integration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.AwsIntegrationApi;
import com.datadog.api.client.v1.model.AWSAccountDeleteRequest;

public class DeleteAWSAccount {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSAccountDeleteRequest body =
        new AWSAccountDeleteRequest().accountId("1234567").roleName("DatadogAWSIntegrationRole");

    try {
      apiInstance.deleteAWSAccount(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#deleteAWSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
