// Update a Statuspage URL setting returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatuspageIntegrationApi;
import com.datadog.api.client.v2.model.StatuspageUrlSettingResponse;
import com.datadog.api.client.v2.model.StatuspageUrlSettingType;
import com.datadog.api.client.v2.model.StatuspageUrlSettingUpdateAttributes;
import com.datadog.api.client.v2.model.StatuspageUrlSettingUpdateData;
import com.datadog.api.client.v2.model.StatuspageUrlSettingUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatuspageIntegrationApi apiInstance = new StatuspageIntegrationApi(defaultClient);

    StatuspageUrlSettingUpdateRequest body =
        new StatuspageUrlSettingUpdateRequest()
            .data(
                new StatuspageUrlSettingUpdateData()
                    .attributes(
                        new StatuspageUrlSettingUpdateAttributes()
                            .customTags("team:collaboration-integrations,env:prod")
                            .url("https://example.statuspage.io"))
                    .id("596da4af-0563-4097-90ff-07230c3f9db3")
                    .type(StatuspageUrlSettingType.STATUSPAGE_URL_SETTING));

    try {
      StatuspageUrlSettingResponse result =
          apiInstance.updateStatuspageUrlSetting("statuspage_url_setting_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling StatuspageIntegrationApi#updateStatuspageUrlSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
