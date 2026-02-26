// Query timeseries data across multiple products returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.TimeseriesFormulaQueryResponse;
import com.datadog.api.client.v2.model.FormulaLimit;
import com.datadog.api.client.v2.model.MetricsDataSource;
import com.datadog.api.client.v2.model.MetricsTimeseriesQuery;
import com.datadog.api.client.v2.model.QueryFormula;
import com.datadog.api.client.v2.model.QuerySortOrder;
import com.datadog.api.client.v2.model.TimeseriesFormulaQueryRequest;
import com.datadog.api.client.v2.model.TimeseriesFormulaRequest;
import com.datadog.api.client.v2.model.TimeseriesFormulaRequestAttributes;
import com.datadog.api.client.v2.model.TimeseriesFormulaRequestType;
import com.datadog.api.client.v2.model.TimeseriesQuery;
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
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    TimeseriesFormulaQueryRequest body = new TimeseriesFormulaQueryRequest()
.data(new TimeseriesFormulaRequest()
.attributes(new TimeseriesFormulaRequestAttributes()
.formulas(Collections.singletonList(new QueryFormula()
.formula("a+b")
.limit(new FormulaLimit()
.count(10)
.order(QuerySortOrder.DESC))))
.from(1568899800000L)
.interval(5000L)
.queries(Collections.singletonList(new TimeseriesQuery(
new MetricsTimeseriesQuery()
.dataSource(MetricsDataSource.METRICS)
.query("avg:system.cpu.user{*} by {env}"))))
.to(1568923200000L))
.type(TimeseriesFormulaRequestType.TIMESERIES_REQUEST));

    try {
      TimeseriesFormulaQueryResponse result = apiInstance.queryTimeseriesData(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#queryTimeseriesData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}