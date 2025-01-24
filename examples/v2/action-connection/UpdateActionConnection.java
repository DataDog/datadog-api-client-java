// Update an existing Action Connection returns "Successfully updated an Action Connection."
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.AWSAssumeRoleType;
import com.datadog.api.client.v2.model.AWSAssumeRoleUpdate;
import com.datadog.api.client.v2.model.AWSCredentialsUpdate;
import com.datadog.api.client.v2.model.AWSIntegrationType;
import com.datadog.api.client.v2.model.AWSIntegrationUpdate;
import com.datadog.api.client.v2.model.ActionConnectionAttributesUpdate;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionDataUpdate;
import com.datadog.api.client.v2.model.ActionConnectionIntegrationUpdate;
import com.datadog.api.client.v2.model.UpdateActionConnectionRequest;
import com.datadog.api.client.v2.model.UpdateActionConnectionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    UpdateActionConnectionRequest body =
        new UpdateActionConnectionRequest()
            .data(
                new ActionConnectionDataUpdate()
                    .attributes(
                        new ActionConnectionAttributesUpdate()
                            .integration(
                                new ActionConnectionIntegrationUpdate(
                                    new AWSIntegrationUpdate()
                                        .credentials(
                                            new AWSCredentialsUpdate(
                                                new AWSAssumeRoleUpdate()
                                                    .accountId("111222333444")
                                                    .role("my-role")
                                                    .type(AWSAssumeRoleType.AWSASSUMEROLE)))
                                        .type(AWSIntegrationType.AWS)))
                            .name("My AWS Connection"))
                    .type(ActionConnectionDataType.ACTION_CONNECTION));

    try {
      UpdateActionConnectionResponse result =
          apiInstance.updateActionConnection("connection_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#updateActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
