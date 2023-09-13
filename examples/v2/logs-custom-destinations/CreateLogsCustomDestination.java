// Create a custom destination returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.AzureFallbackDestination;
import com.datadog.api.client.v2.model.AzureFallbackDestinationIntegration;
import com.datadog.api.client.v2.model.AzureFallbackDestinationType;
import com.datadog.api.client.v2.model.CustomDestinationAttributes;
import com.datadog.api.client.v2.model.CustomDestinationCompressionType;
import com.datadog.api.client.v2.model.CustomDestinationCreateData;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequest;
import com.datadog.api.client.v2.model.CustomDestinationFallbackDestination;
import com.datadog.api.client.v2.model.CustomDestinationForwarderDestination;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationType;
import com.datadog.api.client.v2.model.HttpDestination;
import com.datadog.api.client.v2.model.HttpDestinationAuth;
import com.datadog.api.client.v2.model.HttpDestinationBasicAuth;
import com.datadog.api.client.v2.model.HttpDestinationBasicAuthType;
import com.datadog.api.client.v2.model.HttpDestinationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLogsCustomDestination", true);
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    CustomDestinationCreateRequest body =
        new CustomDestinationCreateRequest()
            .data(
                new CustomDestinationCreateData()
                    .attributes(
                        new CustomDestinationAttributes()
                            .bufferMaxBytes(10000000L)
                            .bufferTimeoutSeconds(100L)
                            .compression(CustomDestinationCompressionType.GZIP_COMPRESSION)
                            .enabled(true)
                            .fallbackDestination(
                                new CustomDestinationFallbackDestination(
                                    new AzureFallbackDestination()
                                        .container("container-name")
                                        .integration(
                                            new AzureFallbackDestinationIntegration()
                                                .clientId("aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa")
                                                .tenantId("aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa"))
                                        .storageAccount("account-name")
                                        .type(AzureFallbackDestinationType.AZURE)))
                            .forwarderDestination(
                                new CustomDestinationForwarderDestination(
                                    new HttpDestination()
                                        .auth(
                                            new HttpDestinationAuth(
                                                new HttpDestinationBasicAuth()
                                                    .password("password")
                                                    .type(HttpDestinationBasicAuthType.BASIC)
                                                    .username("username")))
                                        .endpoint("https://example.org/my-intake")
                                        .type(HttpDestinationType.HTTP)))
                            .maxRetryDurationSeconds(100L)
                            .name("my-destination")
                            .query("source:dummy")
                            .version(0L))
                    .type(CustomDestinationType.CUSTOM_DESTINATION));

    try {
      CustomDestinationResponse result = apiInstance.createLogsCustomDestination(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LogsCustomDestinationsApi#createLogsCustomDestination");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
