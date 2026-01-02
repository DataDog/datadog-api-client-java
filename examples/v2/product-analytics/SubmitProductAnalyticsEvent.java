// Send server-side events returns "Request accepted for processing (always 202 empty JSON)."
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsAccount;
import com.datadog.api.client.v2.model.ProductAnalyticsApplication;
import com.datadog.api.client.v2.model.ProductAnalyticsEvent;
import com.datadog.api.client.v2.model.ProductAnalyticsEventType;
import com.datadog.api.client.v2.model.ProductAnalyticsServerSideEventItem;
import com.datadog.api.client.v2.model.ProductAnalyticsSession;
import com.datadog.api.client.v2.model.ProductAnalyticsUser;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsServerSideEventItem body =
        new ProductAnalyticsServerSideEventItem()
            .account(new ProductAnalyticsAccount().id("account-67890"))
            .application(
                new ProductAnalyticsApplication().id("123abcde-123a-123b-1234-123456789abc"))
            .event(new ProductAnalyticsEvent().name("payment.processed"))
            .session(new ProductAnalyticsSession().id("session-abcdef"))
            .type(ProductAnalyticsEventType.SERVER)
            .usr(new ProductAnalyticsUser().id("user-12345"));

    try {
      apiInstance.submitProductAnalyticsEvent(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAnalyticsApi#submitProductAnalyticsEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
