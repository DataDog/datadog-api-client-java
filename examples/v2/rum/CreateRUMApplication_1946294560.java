// Create a new RUM application with Product Scales returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.model.RUMApplicationResponse;
import com.datadog.api.client.v2.model.RUMApplicationCreate;
import com.datadog.api.client.v2.model.RUMApplicationCreateAttributes;
import com.datadog.api.client.v2.model.RUMApplicationCreateRequest;
import com.datadog.api.client.v2.model.RUMApplicationCreateType;
import com.datadog.api.client.v2.model.RUMEventProcessingState;
import com.datadog.api.client.v2.model.RUMProductAnalyticsRetentionState;
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
    RumApi apiInstance = new RumApi(defaultClient);

    RUMApplicationCreateRequest body = new RUMApplicationCreateRequest()
.data(new RUMApplicationCreate()
.attributes(new RUMApplicationCreateAttributes()
.name("test-rum-with-product-scales-5c67ebb32077e1d9")
.type("browser")
.rumEventProcessingState(RUMEventProcessingState.ERROR_FOCUSED_MODE)
.productAnalyticsRetentionState(RUMProductAnalyticsRetentionState.NONE))
.type(RUMApplicationCreateType.RUM_APPLICATION_CREATE));

    try {
      RUMApplicationResponse result = apiInstance.createRUMApplication(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#createRUMApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}