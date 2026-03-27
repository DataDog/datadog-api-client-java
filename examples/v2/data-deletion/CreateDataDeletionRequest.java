// Creates a data deletion request returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DataDeletionApi;
import com.datadog.api.client.v2.model.CreateDataDeletionRequestBody;
import com.datadog.api.client.v2.model.CreateDataDeletionRequestBodyAttributes;
import com.datadog.api.client.v2.model.CreateDataDeletionRequestBodyData;
import com.datadog.api.client.v2.model.CreateDataDeletionRequestBodyDataType;
import com.datadog.api.client.v2.model.CreateDataDeletionResponseBody;
import java.util.Arrays;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createDataDeletionRequest", true);
    DataDeletionApi apiInstance = new DataDeletionApi(defaultClient);

    CreateDataDeletionRequestBody body =
        new CreateDataDeletionRequestBody()
            .data(
                new CreateDataDeletionRequestBodyData()
                    .attributes(
                        new CreateDataDeletionRequestBodyAttributes()
                            .from(1672527600000L)
                            .indexes(Arrays.asList("test-index", "test-index-2"))
                            .query(
                                Map.ofEntries(
                                    Map.entry("host", "abc"), Map.entry("service", "xyz")))
                            .to(1704063600000L))
                    .type(CreateDataDeletionRequestBodyDataType.CREATE_DELETION_REQ));

    try {
      CreateDataDeletionResponseBody result = apiInstance.createDataDeletionRequest("logs", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDeletionApi#createDataDeletionRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
