// Update a connection group returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.ConnectionGroupDataAttributesRequest;
import com.datadog.api.client.v2.model.ConnectionGroupDataRequest;
import com.datadog.api.client.v2.model.ConnectionGroupType;
import com.datadog.api.client.v2.model.UpdateConnectionGroupRequest;
import com.datadog.api.client.v2.model.UpdateConnectionGroupResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateConnectionGroup", true);
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    UpdateConnectionGroupRequest body =
        new UpdateConnectionGroupRequest()
            .data(
                new ConnectionGroupDataRequest()
                    .attributes(
                        new ConnectionGroupDataAttributesRequest()
                            .description("An updated test connection group for AWS integrations")
                            .name("My Connection Group Updated"))
                    .type(ConnectionGroupType.CONNECTION_GROUP));

    try {
      UpdateConnectionGroupResponse result =
          apiInstance.updateConnectionGroup("connection_group_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#updateConnectionGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
