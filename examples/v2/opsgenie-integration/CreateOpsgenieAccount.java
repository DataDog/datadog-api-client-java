// Create a new Opsgenie account returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpsgenieIntegrationApi;
import com.datadog.api.client.v2.model.OpsgenieAccountCreateAttributes;
import com.datadog.api.client.v2.model.OpsgenieAccountCreateData;
import com.datadog.api.client.v2.model.OpsgenieAccountCreateRequest;
import com.datadog.api.client.v2.model.OpsgenieAccountResponse;
import com.datadog.api.client.v2.model.OpsgenieAccountType;
import com.datadog.api.client.v2.model.OpsgenieServiceRegionType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OpsgenieIntegrationApi apiInstance = new OpsgenieIntegrationApi(defaultClient);

    OpsgenieAccountCreateRequest body =
        new OpsgenieAccountCreateRequest()
            .data(
                new OpsgenieAccountCreateData()
                    .attributes(
                        new OpsgenieAccountCreateAttributes()
                            .apiKey("00000000-0000-0000-0000-000000000000")
                            .region(OpsgenieServiceRegionType.US))
                    .type(OpsgenieAccountType.OPSGENIE_ACCOUNT));

    try {
      OpsgenieAccountResponse result = apiInstance.createOpsgenieAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpsgenieIntegrationApi#createOpsgenieAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
