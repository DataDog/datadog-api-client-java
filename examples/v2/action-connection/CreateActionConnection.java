// Create a new Action Connection returns "Successfully created an Action Connection." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.AWSAssumeRole;
import com.datadog.api.client.v2.model.AWSAssumeRoleType;
import com.datadog.api.client.v2.model.AWSCredentials;
import com.datadog.api.client.v2.model.AWSIntegration;
import com.datadog.api.client.v2.model.AWSIntegrationType;
import com.datadog.api.client.v2.model.ActionConnectionAttributes;
import com.datadog.api.client.v2.model.ActionConnectionData;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionIntegration;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    CreateActionConnectionRequest body =
        new CreateActionConnectionRequest()
            .data(
                new ActionConnectionData()
                    .attributes(
                        new ActionConnectionAttributes()
                            .integration(
                                new ActionConnectionIntegration(
                                    new AWSIntegration()
                                        .credentials(
                                            new AWSCredentials(
                                                new AWSAssumeRole()
                                                    .accountId("111222333444")
                                                    .role("my-role")
                                                    .type(AWSAssumeRoleType.AWSASSUMEROLE)))
                                        .type(AWSIntegrationType.AWS)))
                            .name("My AWS Connection"))
                    .type(ActionConnectionDataType.ACTION_CONNECTION));

    try {
      CreateActionConnectionResponse result = apiInstance.createActionConnection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#createActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
