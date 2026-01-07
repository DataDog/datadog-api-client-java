// Send server-side events returns "Request accepted for processing (always 202 empty JSON)."
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsServerSideEventItem;
import com.datadog.api.client.v2.model.ProductAnalyticsServerSideEventItemAccount;
import com.datadog.api.client.v2.model.ProductAnalyticsServerSideEventItemApplication;
import com.datadog.api.client.v2.model.ProductAnalyticsServerSideEventItemEvent;
import com.datadog.api.client.v2.model.ProductAnalyticsServerSideEventItemSession;
import com.datadog.api.client.v2.model.ProductAnalyticsServerSideEventItemType;
import com.datadog.api.client.v2.model.ProductAnalyticsServerSideEventItemUsr;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsServerSideEventItem body =
        new ProductAnalyticsServerSideEventItem()
            .account(new ProductAnalyticsServerSideEventItemAccount().id("account-67890"))
            .application(
                new ProductAnalyticsServerSideEventItemApplication()
                    .id("123abcde-123a-123b-1234-123456789abc"))
            .event(new ProductAnalyticsServerSideEventItemEvent().name("payment.processed"))
            .session(new ProductAnalyticsServerSideEventItemSession().id("session-abcdef"))
            .type(ProductAnalyticsServerSideEventItemType.SERVER)
            .usr(new ProductAnalyticsServerSideEventItemUsr().id("user-12345"));

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
