// Update ownership settings for the org returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmOwnershipApi;
import com.datadog.api.client.v2.model.OwnershipConfidenceLevel;
import com.datadog.api.client.v2.model.OwnershipSettingsRequest;
import com.datadog.api.client.v2.model.OwnershipSettingsRequestAttributes;
import com.datadog.api.client.v2.model.OwnershipSettingsRequestData;
import com.datadog.api.client.v2.model.OwnershipSettingsResponse;
import com.datadog.api.client.v2.model.OwnershipSettingsType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.postOwnershipSettings", true);
    CsmOwnershipApi apiInstance = new CsmOwnershipApi(defaultClient);

    OwnershipSettingsRequest body =
        new OwnershipSettingsRequest()
            .data(
                new OwnershipSettingsRequestData()
                    .attributes(
                        new OwnershipSettingsRequestAttributes()
                            .autoTag(true)
                            .confidenceLevel(OwnershipConfidenceLevel.HIGH))
                    .type(OwnershipSettingsType.OWNERSHIP_SETTINGS));

    try {
      OwnershipSettingsResponse result = apiInstance.postOwnershipSettings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmOwnershipApi#postOwnershipSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
