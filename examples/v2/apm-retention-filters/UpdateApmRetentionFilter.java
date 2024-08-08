// Update a retention filter returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ApmRetentionFiltersApi;
import com.datadog.api.client.v2.model.RetentionFilterResponse;
import com.datadog.api.client.v2.model.ApmRetentionFilterType;
import com.datadog.api.client.v2.model.RetentionFilterAllType;
import com.datadog.api.client.v2.model.RetentionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.RetentionFilterUpdateData;
import com.datadog.api.client.v2.model.RetentionFilterUpdateRequest;
import com.datadog.api.client.v2.model.SpansFilterCreate;
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

    // there is a valid "retention_filter" in the system
    String RETENTION_FILTER_DATA_ID = System.getenv("RETENTION_FILTER_DATA_ID");

    RetentionFilterUpdateRequest body = new RetentionFilterUpdateRequest()
.data(new RetentionFilterUpdateData()
.attributes(new RetentionFilterUpdateAttributes()
.name("test")
.rate(0.9)
.filter(new SpansFilterCreate()
.query("@_top_level:1 test:service-demo"))
.enabled(true)
.filterType(RetentionFilterAllType.SPANS_SAMPLING_PROCESSOR))
.id("test-id")
.type(ApmRetentionFilterType.apm_retention_filter));

    try {
      RetentionFilterResponse result = apiInstance.updateApmRetentionFilter(RETENTION_FILTER_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApmRetentionFiltersApi#updateApmRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}