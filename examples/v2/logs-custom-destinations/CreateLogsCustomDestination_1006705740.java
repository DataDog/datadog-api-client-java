// Create a Google Security Operations custom destination returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestinationAttributeTagsRestrictionListType;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequest;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequestAttributes;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequestDefinition;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestination;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestinationGoogleSecurityOperations;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestinationGoogleSecurityOperationsType;
import com.datadog.api.client.v2.model.CustomDestinationGoogleSecurityOperationsDestinationAuth;
import com.datadog.api.client.v2.model.CustomDestinationGoogleSecurityOperationsDestinationAuthType;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    CustomDestinationCreateRequest body =
        new CustomDestinationCreateRequest()
            .data(
                new CustomDestinationCreateRequestDefinition()
                    .attributes(
                        new CustomDestinationCreateRequestAttributes()
                            .enabled(false)
                            .forwardTags(false)
                            .forwardTagsRestrictionList(Arrays.asList("datacenter", "host"))
                            .forwardTagsRestrictionListType(
                                CustomDestinationAttributeTagsRestrictionListType.ALLOW_LIST)
                            .forwarderDestination(
                                new CustomDestinationForwardDestination(
                                    new CustomDestinationForwardDestinationGoogleSecurityOperations()
                                        .type(
                                            CustomDestinationForwardDestinationGoogleSecurityOperationsType
                                                .GOOGLE_SECURITY_OPERATIONS)
                                        .customerId("123-456-7890")
                                        .regionalEndpoint(
                                            "https://malachiteingestion-pa.googleapis.com")
                                        .namespace("google-security-operations-namespace")
                                        .auth(
                                            new CustomDestinationGoogleSecurityOperationsDestinationAuth()
                                                .type(
                                                    CustomDestinationGoogleSecurityOperationsDestinationAuthType
                                                        .GCP_PRIVATE_KEY)
                                                .projectId("gcp-project")
                                                .privateKeyId("abc12345678")
                                                .clientEmail("client@example.com")
                                                .clientId("def123456")
                                                .privateKey(
                                                    """
-----BEGIN PRIVATE KEY-----
MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBK...
-----END PRIVATE KEY-----

"""))))
                            .name("Nginx logs")
                            .query("source:nginx"))
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
