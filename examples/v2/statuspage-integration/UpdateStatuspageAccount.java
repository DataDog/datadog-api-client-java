// Update the Statuspage account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatuspageIntegrationApi;
import com.datadog.api.client.v2.model.StatuspageAccountResponse;
import com.datadog.api.client.v2.model.StatuspageAccountType;
import com.datadog.api.client.v2.model.StatuspageAccountUpdateAttributes;
import com.datadog.api.client.v2.model.StatuspageAccountUpdateData;
import com.datadog.api.client.v2.model.StatuspageAccountUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatuspageIntegrationApi apiInstance = new StatuspageIntegrationApi(defaultClient);

    StatuspageAccountUpdateRequest body =
        new StatuspageAccountUpdateRequest()
            .data(
                new StatuspageAccountUpdateData()
                    .attributes(
                        new StatuspageAccountUpdateAttributes()
                            .apiKey("00000000-0000-0000-0000-000000000000"))
                    .type(StatuspageAccountType.STATUSPAGE_ACCOUNT));

    try {
      StatuspageAccountResponse result = apiInstance.updateStatuspageAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatuspageIntegrationApi#updateStatuspageAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
