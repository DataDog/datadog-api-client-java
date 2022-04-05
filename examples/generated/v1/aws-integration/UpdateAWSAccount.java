import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.AwsIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
    AWSAccount body = new AWSAccount(); // AWSAccount | AWS request object
    String accountId =
        "accountId_example"; // String | Only return AWS accounts that matches this `account_id`.
    String roleName =
        "roleName_example"; // String | Only return AWS accounts that match this `role_name`.
                            // Required if `account_id` is specified.
    String accessKeyId =
        "accessKeyId_example"; // String | Only return AWS accounts that matches this
                               // `access_key_id`. Required if none of the other two options are
                               // specified.
    try {
      Object result =
          apiInstance.updateAWSAccount(
              body,
              new AwsIntegrationApi.UpdateAWSAccountOptionalParameters()
                  .accountId(accountId)
                  .roleName(roleName)
                  .accessKeyId(accessKeyId));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#updateAWSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
