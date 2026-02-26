// Add Cloudflare account returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudflareIntegrationApi;
import com.datadog.api.client.v2.model.CloudflareAccountCreateRequest;
import com.datadog.api.client.v2.model.CloudflareAccountCreateRequestAttributes;
import com.datadog.api.client.v2.model.CloudflareAccountCreateRequestData;
import com.datadog.api.client.v2.model.CloudflareAccountResponse;
import com.datadog.api.client.v2.model.CloudflareAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudflareIntegrationApi apiInstance = new CloudflareIntegrationApi(defaultClient);

    CloudflareAccountCreateRequest body =
        new CloudflareAccountCreateRequest()
            .data(
                new CloudflareAccountCreateRequestData()
                    .attributes(
                        new CloudflareAccountCreateRequestAttributes()
                            .apiKey("fakekey")
                            .email("dev@datadoghq.com")
                            .name("examplecloudflareintegration"))
                    .type(CloudflareAccountType.CLOUDFLARE_ACCOUNTS));

    try {
      CloudflareAccountResponse result = apiInstance.createCloudflareAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareIntegrationApi#createCloudflareAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
