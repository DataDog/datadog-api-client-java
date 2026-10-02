// Create metric SQL model returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType;
import com.datadog.api.client.v2.model.ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricSQLModelV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricSQLModelV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricSQLModelV2RequestDataAttributesMeasuresItems;
import com.datadog.api.client.v2.model.ExperimentsMetricSQLModelPropertyInput;
import com.datadog.api.client.v2.model.ExperimentsMetricSQLModelV2DTO;
import com.datadog.api.client.v2.model.ExperimentsUpdateMetricSQLModelV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsUpdateMetricSQLModelV2RequestDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    ExperimentsCreateMetricSQLModelV2Request body =
        new ExperimentsCreateMetricSQLModelV2Request()
            .data(
                new ExperimentsCreateMetricSQLModelV2RequestData()
                    .attributes(
                        new ExperimentsUpdateMetricSQLModelV2RequestDataAttributes()
                            .datePartitionColumn(null)
                            .description(null)
                            .measures(
                                Collections.singletonList(
                                    new ExperimentsCreateMetricSQLModelV2RequestDataAttributesMeasuresItems()
                                        .columnName("revenue")
                                        .columnType(
                                            ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType
                                                .FLOAT)
                                        .description(null)
                                        .name(null)))
                            .name("Order facts")
                            .properties(
                                Collections.singletonList(
                                    new ExperimentsMetricSQLModelPropertyInput()
                                        .columnName("item_type")
                                        .columnType(
                                            ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType
                                                .STRING)
                                        .description(null)
                                        .name("item_type")))
                            .sql(
                                "SELECT user_id, order_id, item_type, revenue, created_at FROM"
                                    + " analytics.orders")
                            .subjectTypes(
                                Collections.singletonList(
                                    new ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems()
                                        .columnName("user_id")
                                        .subjectTypeId("550e8400-e29b-41d4-a716-446655440010")))
                            .timestampColumn("created_at"))
                    .type(ExperimentsUpdateMetricSQLModelV2RequestDataType.METRIC_SQL_MODELS));

    try {
      ExperimentsMetricSQLModelV2DTO result = apiInstance.createMetricSQLModel(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#createMetricSQLModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
