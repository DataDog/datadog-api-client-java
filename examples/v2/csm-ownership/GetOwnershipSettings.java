// Get ownership settings for the org returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmOwnershipApi;
import com.datadog.api.client.v2.model.OwnershipSettingsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getOwnershipSettings", true);
    CsmOwnershipApi apiInstance = new CsmOwnershipApi(defaultClient);

    try {
      OwnershipSettingsResponse result = apiInstance.getOwnershipSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmOwnershipApi#getOwnershipSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
