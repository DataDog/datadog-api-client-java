// Create a Product Analytics launch returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchCreateData;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchCreateRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchEvent;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchKPI;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchPhase;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchRequestAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchStepsRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchTrackingPlanRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createProductAnalyticsLaunch", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsLaunchCreateRequest body =
        new ProductAnalyticsLaunchCreateRequest()
            .data(
                new ProductAnalyticsLaunchCreateData()
                    .attributes(
                        new ProductAnalyticsLaunchRequestAttributes()
                            .context("Let users apply promo codes at checkout.")
                            .description("Promo codes at checkout.")
                            .kpis(
                                Collections.singletonList(
                                    new ProductAnalyticsLaunchKPI()
                                        .id("7c1e6a52-3a8f-4d4e-9a55-2f1d1c8b6a10")
                                        .title("Checkout conversion rate")))
                            .name("checkout_promo_codes")
                            .phase(ProductAnalyticsLaunchPhase.PLAN)
                            .steps(
                                new ProductAnalyticsLaunchStepsRequest()
                                    .trackingPlan(
                                        new ProductAnalyticsLaunchTrackingPlanRequest()
                                            .events(
                                                Collections.singletonList(
                                                    new ProductAnalyticsLaunchEvent()
                                                        .kpis(
                                                            Collections.singletonList(
                                                                "7c1e6a52-3a8f-4d4e-9a55-2f1d1c8b6a10"))
                                                        .name("promo_code_applied")
                                                        .trigger(
                                                            "The user applies a valid promo code.")
                                                        .views(
                                                            Collections.singletonList(
                                                                "/checkout")))))))
                    .type(ProductAnalyticsLaunchType.LIFTOFF));

    try {
      ProductAnalyticsLaunchResponse result = apiInstance.createProductAnalyticsLaunch(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAnalyticsApi#createProductAnalyticsLaunch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
