// Create a Statuspage URL setting returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatuspageIntegrationApi;
import com.datadog.api.client.v2.model.StatuspageUrlSettingCreateAttributes;
import com.datadog.api.client.v2.model.StatuspageUrlSettingCreateData;
import com.datadog.api.client.v2.model.StatuspageUrlSettingCreateRequest;
import com.datadog.api.client.v2.model.StatuspageUrlSettingResponse;
import com.datadog.api.client.v2.model.StatuspageUrlSettingType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatuspageIntegrationApi apiInstance = new StatuspageIntegrationApi(defaultClient);

    StatuspageUrlSettingCreateRequest body =
        new StatuspageUrlSettingCreateRequest()
            .data(
                new StatuspageUrlSettingCreateData()
                    .attributes(
                        new StatuspageUrlSettingCreateAttributes()
                            .customTags("team:collaboration-integrations,env:prod")
                            .url("https://example.statuspage.io"))
                    .type(StatuspageUrlSettingType.STATUSPAGE_URL_SETTING));

    try {
      StatuspageUrlSettingResponse result = apiInstance.createStatuspageUrlSetting(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling StatuspageIntegrationApi#createStatuspageUrlSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
