// Create reference table upload returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReferenceTablesApi;
import com.datadog.api.client.v2.model.CreateUploadRequest;
import com.datadog.api.client.v2.model.CreateUploadRequestData;
import com.datadog.api.client.v2.model.CreateUploadRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateUploadRequestDataType;
import com.datadog.api.client.v2.model.CreateUploadResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ReferenceTablesApi apiInstance = new ReferenceTablesApi(defaultClient);

    CreateUploadRequest body =
        new CreateUploadRequest()
            .data(
                new CreateUploadRequestData()
                    .attributes(
                        new CreateUploadRequestDataAttributes()
                            .headers(Arrays.asList("id", "name", "value"))
                            .tableName("test_upload_table_Example-Reference-Table")
                            .partCount(1)
                            .partSize(1024L))
                    .type(CreateUploadRequestDataType.UPLOAD));

    try {
      CreateUploadResponse result = apiInstance.createReferenceTableUpload(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceTablesApi#createReferenceTableUpload");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
