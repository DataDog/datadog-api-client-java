// Re-order retention filters returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ApmRetentionFiltersApi;
import com.datadog.api.client.v2.model.ApmRetentionFilterType;
import com.datadog.api.client.v2.model.ReorderRetentionFiltersRequest;
import com.datadog.api.client.v2.model.RetentionFilterWithoutAttributes;
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
    ApmRetentionFiltersApi apiInstance = new ApmRetentionFiltersApi(defaultClient);

    ReorderRetentionFiltersRequest body = new ReorderRetentionFiltersRequest()
.data(Arrays.asList(new RetentionFilterWithoutAttributes()
.id("jdZrilSJQLqzb6Cu7aub9Q")
.type(ApmRetentionFilterType.apm_retention_filter), new RetentionFilterWithoutAttributes()
.id("7RBOb7dLSYWI01yc3pIH8w")
.type(ApmRetentionFilterType.apm_retention_filter)));

    try {
      apiInstance.reorderApmRetentionFilters(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApmRetentionFiltersApi#reorderApmRetentionFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}