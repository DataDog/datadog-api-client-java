// Update exposure SQL model returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsCreateExposureSQLModelV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateExposureSQLModelV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType;
import com.datadog.api.client.v2.model.ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems;
import com.datadog.api.client.v2.model.ExperimentsSQLModelPropertyInput;
import com.datadog.api.client.v2.model.ExperimentsUpdateExposureSQLModelV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsUpdateExposureSQLModelV2RequestDataType;
import com.datadog.api.client.v2.model.ExperimentsUpdateExposureSQLModelV2Response;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    ExperimentsCreateExposureSQLModelV2Request body =
        new ExperimentsCreateExposureSQLModelV2Request()
            .data(
                new ExperimentsCreateExposureSQLModelV2RequestData()
                    .attributes(
                        new ExperimentsUpdateExposureSQLModelV2RequestDataAttributes()
                            .datePartitionColumn(null)
                            .experimentColumn("experiment_id")
                            .name("Exposure events")
                            .properties(
                                Collections.singletonList(
                                    new ExperimentsSQLModelPropertyInput()
                                        .columnName("country")
                                        .columnType(
                                            ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType
                                                .STRING)
                                        .description(null)
                                        .name("country")))
                            .sql(
                                "SELECT user_id, experiment_id, variant, exposed_at, country FROM"
                                    + " analytics.exposures")
                            .subjectTypes(
                                Collections.singletonList(
                                    new ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems()
                                        .columnName("user_id")
                                        .subjectTypeId("550e8400-e29b-41d4-a716-446655440010")))
                            .timestampColumn("exposed_at")
                            .variantColumn("variant"))
                    .type(ExperimentsUpdateExposureSQLModelV2RequestDataType.EXPOSURE_SQL_MODELS));

    try {
      ExperimentsUpdateExposureSQLModelV2Response result =
          apiInstance.updateExposureSQLModel(
              UUID.fromString("550e8400-e29b-41d4-a716-446655440000"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#updateExposureSQLModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
