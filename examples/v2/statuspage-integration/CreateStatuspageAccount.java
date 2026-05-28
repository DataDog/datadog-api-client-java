// Create the Statuspage account returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatuspageIntegrationApi;
import com.datadog.api.client.v2.model.StatuspageAccountCreateAttributes;
import com.datadog.api.client.v2.model.StatuspageAccountCreateData;
import com.datadog.api.client.v2.model.StatuspageAccountCreateRequest;
import com.datadog.api.client.v2.model.StatuspageAccountResponse;
import com.datadog.api.client.v2.model.StatuspageAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatuspageIntegrationApi apiInstance = new StatuspageIntegrationApi(defaultClient);

    StatuspageAccountCreateRequest body =
        new StatuspageAccountCreateRequest()
            .data(
                new StatuspageAccountCreateData()
                    .attributes(
                        new StatuspageAccountCreateAttributes()
                            .apiKey("00000000-0000-0000-0000-000000000000"))
                    .type(StatuspageAccountType.STATUSPAGE_ACCOUNT));

    try {
      StatuspageAccountResponse result = apiInstance.createStatuspageAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatuspageIntegrationApi#createStatuspageAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
