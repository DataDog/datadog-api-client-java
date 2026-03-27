// Update Cloudflare account returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudflareIntegrationApi;
import com.datadog.api.client.v2.model.CloudflareAccountResponse;
import com.datadog.api.client.v2.model.CloudflareAccountType;
import com.datadog.api.client.v2.model.CloudflareAccountUpdateRequest;
import com.datadog.api.client.v2.model.CloudflareAccountUpdateRequestAttributes;
import com.datadog.api.client.v2.model.CloudflareAccountUpdateRequestData;
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
    CloudflareIntegrationApi apiInstance = new CloudflareIntegrationApi(defaultClient);

    // there is a valid "cloudflare_account" in the system
    String CLOUDFLARE_ACCOUNT_DATA_ID = System.getenv("CLOUDFLARE_ACCOUNT_DATA_ID");

    CloudflareAccountUpdateRequest body = new CloudflareAccountUpdateRequest()
.data(new CloudflareAccountUpdateRequestData()
.attributes(new CloudflareAccountUpdateRequestAttributes()
.apiKey("fakekey")
.email("dev@datadoghq.com")
.zones(Collections.singletonList("zone-id-3")))
.type(CloudflareAccountType.CLOUDFLARE_ACCOUNTS));

    try {
      CloudflareAccountResponse result = apiInstance.updateCloudflareAccount(CLOUDFLARE_ACCOUNT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareIntegrationApi#updateCloudflareAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}