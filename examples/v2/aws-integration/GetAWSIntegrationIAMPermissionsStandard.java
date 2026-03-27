// Get AWS integration standard IAM permissions returns "AWS integration standard IAM permissions."
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSIntegrationIamPermissionsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    try {
      AWSIntegrationIamPermissionsResponse result =
          apiInstance.getAWSIntegrationIAMPermissionsStandard();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling AwsIntegrationApi#getAWSIntegrationIAMPermissionsStandard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
