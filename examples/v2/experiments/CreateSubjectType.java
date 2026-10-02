// Create subject type returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsCreateSubjectTypeV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateSubjectTypeV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsCreateSubjectTypeV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsSubjectTypeV2DTO;
import com.datadog.api.client.v2.model.ExperimentsSubjectTypeV2DTODataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    ExperimentsCreateSubjectTypeV2Request body =
        new ExperimentsCreateSubjectTypeV2Request()
            .data(
                new ExperimentsCreateSubjectTypeV2RequestData()
                    .type(ExperimentsSubjectTypeV2DTODataType.SUBJECT_TYPES)
                    .attributes(
                        new ExperimentsCreateSubjectTypeV2RequestDataAttributes()
                            .name("ex-14bb9543f523edde")
                            .productAnalyticsAttribute("@account.id")
                            .warehouseColumnNames(Collections.singletonList("account_id"))));

    try {
      ExperimentsSubjectTypeV2DTO result = apiInstance.createSubjectType(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#createSubjectType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
