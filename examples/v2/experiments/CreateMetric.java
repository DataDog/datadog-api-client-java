// Create metric returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricNumeratorAttributes;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricV2RequestDataAttributesDataSourceType;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricV2RequestDataAttributesDesiredChange;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation;
import com.datadog.api.client.v2.model.ExperimentsDatadogMetricAggregationInput;
import com.datadog.api.client.v2.model.ExperimentsDatadogMetricMeasureInput;
import com.datadog.api.client.v2.model.ExperimentsMetricV2DTO;
import com.datadog.api.client.v2.model.MetricType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    ExperimentsCreateMetricV2Request body =
        new ExperimentsCreateMetricV2Request()
            .data(
                new ExperimentsCreateMetricV2RequestData()
                    .type(MetricType.METRICS)
                    .attributes(
                        new ExperimentsCreateMetricV2RequestDataAttributes(
                            new ExperimentsCreateMetricNumeratorAttributes()
                                .name("ex-14bb9543f523edde")
                                .dataSourceType(
                                    ExperimentsCreateMetricV2RequestDataAttributesDataSourceType
                                        .DATADOG)
                                .desiredChange(
                                    ExperimentsCreateMetricV2RequestDataAttributesDesiredChange
                                        .METRIC_INCREASES)
                                .numeratorAggregation(
                                    new ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation(
                                        new ExperimentsDatadogMetricAggregationInput()
                                            .operation("sum")
                                            .datadogMetricMeasure(
                                                new ExperimentsDatadogMetricMeasureInput()
                                                    .name("ex-14bb9543f523edde view duration")
                                                    .sourceType("PRODUCT_ANALYTICS")
                                                    .sourceSubtype("RUM_VIEWS")
                                                    .columnType("double")
                                                    .columnName("@view.time_spent")))))));

    try {
      ExperimentsMetricV2DTO result = apiInstance.createMetric(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#createMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
