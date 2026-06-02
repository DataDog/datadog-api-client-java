// Update an Opsgenie account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpsgenieIntegrationApi;
import com.datadog.api.client.v2.model.OpsgenieAccountResponse;
import com.datadog.api.client.v2.model.OpsgenieAccountType;
import com.datadog.api.client.v2.model.OpsgenieAccountUpdateAttributes;
import com.datadog.api.client.v2.model.OpsgenieAccountUpdateData;
import com.datadog.api.client.v2.model.OpsgenieAccountUpdateRequest;
import com.datadog.api.client.v2.model.OpsgenieServiceRegionType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OpsgenieIntegrationApi apiInstance = new OpsgenieIntegrationApi(defaultClient);

    OpsgenieAccountUpdateRequest body =
        new OpsgenieAccountUpdateRequest()
            .data(
                new OpsgenieAccountUpdateData()
                    .attributes(
                        new OpsgenieAccountUpdateAttributes()
                            .apiKey("00000000-0000-0000-0000-000000000000")
                            .region(OpsgenieServiceRegionType.US))
                    .id("596da4af-0563-4097-90ff-07230c3f9db3")
                    .type(OpsgenieAccountType.OPSGENIE_ACCOUNT));

    try {
      OpsgenieAccountResponse result = apiInstance.updateOpsgenieAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpsgenieIntegrationApi#updateOpsgenieAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
