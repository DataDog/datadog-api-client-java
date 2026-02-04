// Register a token returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnPremManagementServiceApi;
import com.datadog.api.client.v2.model.OnPremManagementServiceRegisterTokenAttributes;
import com.datadog.api.client.v2.model.OnPremManagementServiceRegisterTokenDataRequest;
import com.datadog.api.client.v2.model.OnPremManagementServiceRegisterTokenRequest;
import com.datadog.api.client.v2.model.OnPremManagementServiceRegisterTokenResponse;
import com.datadog.api.client.v2.model.OnPremManagementServiceRegisterTokenType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.registerOnPremManagementServiceToken", true);
    OnPremManagementServiceApi apiInstance = new OnPremManagementServiceApi(defaultClient);

    OnPremManagementServiceRegisterTokenRequest body =
        new OnPremManagementServiceRegisterTokenRequest()
            .data(
                new OnPremManagementServiceRegisterTokenDataRequest()
                    .attributes(
                        new OnPremManagementServiceRegisterTokenAttributes()
                            .appId(UUID.fromString("9a93d314-ca37-461d-b18e-0587f03c6e2a"))
                            .appVersion(5L)
                            .connectionId(UUID.fromString("2f66ec56-d1f3-4a18-908d-5e8c12dfb3b0"))
                            .queryId(UUID.fromString("8744d459-18aa-405b-821e-df9bb101c01e"))
                            .runnerId("runner-GBUyh2Tm6oKS6ap4kt8Bbx"))
                    .type(OnPremManagementServiceRegisterTokenType.REGISTERTOKENREQUEST));

    try {
      OnPremManagementServiceRegisterTokenResponse result =
          apiInstance.registerOnPremManagementServiceToken(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling OnPremManagementServiceApi#registerOnPremManagementServiceToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
