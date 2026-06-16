// List ownership history by owner type returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmOwnershipApi;
import com.datadog.api.client.v2.model.OwnershipHistoryResponse;
import com.datadog.api.client.v2.model.OwnershipOwnerType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listOwnershipHistoryByOwnerType", true);
    CsmOwnershipApi apiInstance = new CsmOwnershipApi(defaultClient);

    try {
      OwnershipHistoryResponse result =
          apiInstance.listOwnershipHistoryByOwnerType("res-1", OwnershipOwnerType.TEAM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmOwnershipApi#listOwnershipHistoryByOwnerType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
