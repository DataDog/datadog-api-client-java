// Add Confluent account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ConfluentCloudApi;
import com.datadog.api.client.v2.model.ConfluentAccountCreateRequest;
import com.datadog.api.client.v2.model.ConfluentAccountCreateRequestAttributes;
import com.datadog.api.client.v2.model.ConfluentAccountCreateRequestData;
import com.datadog.api.client.v2.model.ConfluentAccountResourceAttributes;
import com.datadog.api.client.v2.model.ConfluentAccountResponse;
import com.datadog.api.client.v2.model.ConfluentAccountType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ConfluentCloudApi apiInstance = new ConfluentCloudApi(defaultClient);

    ConfluentAccountCreateRequest body =
        new ConfluentAccountCreateRequest()
            .data(
                new ConfluentAccountCreateRequestData()
                    .attributes(
                        new ConfluentAccountCreateRequestAttributes()
                            .apiKey("TESTAPIKEY123")
                            .apiSecret("test-api-secret-123")
                            .resources(
                                Collections.singletonList(
                                    new ConfluentAccountResourceAttributes()
                                        .enableCustomMetrics(false)
                                        .id("resource-id-123")
                                        .resourceType("kafka")
                                        .tags(Arrays.asList("myTag", "myTag2:myValue"))))
                            .tags(Arrays.asList("myTag", "myTag2:myValue")))
                    .type(ConfluentAccountType.CONFLUENT_CLOUD_ACCOUNTS));

    try {
      ConfluentAccountResponse result = apiInstance.createConfluentAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfluentCloudApi#createConfluentAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
