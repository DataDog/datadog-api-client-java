// Update an existing Action Connection returns "Successfully updated Action Connection" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.UpdateActionConnectionResponse;
import com.datadog.api.client.v2.model.ActionConnectionAttributesUpdate;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionDataUpdate;
import com.datadog.api.client.v2.model.ActionConnectionIntegrationUpdate;
import com.datadog.api.client.v2.model.AWSAssumeRoleType;
import com.datadog.api.client.v2.model.AWSAssumeRoleUpdate;
import com.datadog.api.client.v2.model.AWSCredentialsUpdate;
import com.datadog.api.client.v2.model.AWSIntegrationType;
import com.datadog.api.client.v2.model.AWSIntegrationUpdate;
import com.datadog.api.client.v2.model.UpdateActionConnectionRequest;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    UpdateActionConnectionRequest body = new UpdateActionConnectionRequest()
.data(new ActionConnectionDataUpdate()
.type(ActionConnectionDataType.ACTION_CONNECTION)
.attributes(new ActionConnectionAttributesUpdate()
.name("Cassette Connection")
.integration(new ActionConnectionIntegrationUpdate(
new AWSIntegrationUpdate()
.type(AWSIntegrationType.AWS)
.credentials(new AWSCredentialsUpdate(
new AWSAssumeRoleUpdate()
.type(AWSAssumeRoleType.AWSASSUMEROLE)
.role("MyRoleUpdated")
.accountId("123456789123")))))));

    try {
      UpdateActionConnectionResponse result = apiInstance.updateActionConnection("cb460d51-3c88-4e87-adac-d47131d0423d", body);
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