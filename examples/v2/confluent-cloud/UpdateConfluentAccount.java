// Update Confluent account returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ConfluentCloudApi;
import com.datadog.api.client.v2.model.ConfluentAccountResponse;
import com.datadog.api.client.v2.model.ConfluentAccountType;
import com.datadog.api.client.v2.model.ConfluentAccountUpdateRequest;
import com.datadog.api.client.v2.model.ConfluentAccountUpdateRequestAttributes;
import com.datadog.api.client.v2.model.ConfluentAccountUpdateRequestData;
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
    ConfluentCloudApi apiInstance = new ConfluentCloudApi(defaultClient);

    // there is a valid "confluent_account" in the system
    String CONFLUENT_ACCOUNT_DATA_ATTRIBUTES_API_KEY = System.getenv("CONFLUENT_ACCOUNT_DATA_ATTRIBUTES_API_KEY");
    String CONFLUENT_ACCOUNT_DATA_ID = System.getenv("CONFLUENT_ACCOUNT_DATA_ID");

    ConfluentAccountUpdateRequest body = new ConfluentAccountUpdateRequest()
.data(new ConfluentAccountUpdateRequestData()
.attributes(new ConfluentAccountUpdateRequestAttributes()
.apiKey(CONFLUENT_ACCOUNT_DATA_ATTRIBUTES_API_KEY)
.apiSecret("update-secret")
.tags(Collections.singletonList("updated_tag:val")))
.type(ConfluentAccountType.CONFLUENT_CLOUD_ACCOUNTS));

    try {
      ConfluentAccountResponse result = apiInstance.updateConfluentAccount(CONFLUENT_ACCOUNT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfluentCloudApi#updateConfluentAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}