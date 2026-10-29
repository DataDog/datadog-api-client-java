// Get service repository information returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.model.ServiceRepositoryInfoDataType;
import com.datadog.api.client.v2.model.ServiceRepositoryInfoRequest;
import com.datadog.api.client.v2.model.ServiceRepositoryInfoRequestAttributes;
import com.datadog.api.client.v2.model.ServiceRepositoryInfoRequestData;
import com.datadog.api.client.v2.model.ServiceRepositoryInfoResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getServiceRepositoryInfo", true);
    RumApi apiInstance = new RumApi(defaultClient);

    ServiceRepositoryInfoRequest body =
        new ServiceRepositoryInfoRequest()
            .data(
                new ServiceRepositoryInfoRequestData()
                    .attributes(
                        new ServiceRepositoryInfoRequestAttributes()
                            .debugId(UUID.fromString("00000000-0000-4000-8000-000000000001")))
                    .type(ServiceRepositoryInfoDataType.SERVICE_REPOSITORY_INFO));

    try {
      ServiceRepositoryInfoResponse result = apiInstance.getServiceRepositoryInfo(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#getServiceRepositoryInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
