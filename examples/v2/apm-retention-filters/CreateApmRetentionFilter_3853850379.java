// Create a retention filter with trace rate returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ApmRetentionFiltersApi;
import com.datadog.api.client.v2.model.RetentionFilterCreateResponse;
import com.datadog.api.client.v2.model.ApmRetentionFilterType;
import com.datadog.api.client.v2.model.RetentionFilterCreateAttributes;
import com.datadog.api.client.v2.model.RetentionFilterCreateData;
import com.datadog.api.client.v2.model.RetentionFilterCreateRequest;
import com.datadog.api.client.v2.model.RetentionFilterType;
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

    RetentionFilterCreateRequest body = new RetentionFilterCreateRequest()
.data(new RetentionFilterCreateData()
.attributes(new RetentionFilterCreateAttributes()
.enabled(true)
.filter(new SpansFilterCreate()
.query("@http.status_code:200 service:my-service"))
.filterType(RetentionFilterType.SPANS_SAMPLING_PROCESSOR)
.name("my retention filter")
.rate(1.0)
.traceRate(1.0))
.type(ApmRetentionFilterType.apm_retention_filter));

    try {
      RetentionFilterCreateResponse result = apiInstance.createApmRetentionFilter(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApmRetentionFiltersApi#createApmRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}