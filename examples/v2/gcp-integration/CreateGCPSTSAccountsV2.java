// Create a new entry for your service account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GcpIntegrationApi;
import com.datadog.api.client.v2.model.AccountCreationResponse;
import com.datadog.api.client.v2.model.AttributeMetadata;
import com.datadog.api.client.v2.model.ServiceAccountMetadata;
import com.datadog.api.client.v2.model.ServiceAccountToBeCreatedData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);

    ServiceAccountToBeCreatedData body =
        new ServiceAccountToBeCreatedData()
            .data(
                new ServiceAccountMetadata()
                    .attributes(
                        new AttributeMetadata()
                            .clientEmail(
                                "dd-integration@datadog-staging.iam.gserviceaccount.com")));

    try {
      AccountCreationResponse result = apiInstance.createGCPSTSAccountsV2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GcpIntegrationApi#createGCPSTSAccountsV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
