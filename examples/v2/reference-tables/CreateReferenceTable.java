// Create reference table returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReferenceTablesApi;
import com.datadog.api.client.v2.model.CreateTableRequest;
import com.datadog.api.client.v2.model.CreateTableRequestData;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesFileMetadata;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesFileMetadataCloudStorage;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesSchema;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesSchemaFieldsItems;
import com.datadog.api.client.v2.model.CreateTableRequestDataType;
import com.datadog.api.client.v2.model.ReferenceTableCreateSourceType;
import com.datadog.api.client.v2.model.ReferenceTableSchemaFieldType;
import com.datadog.api.client.v2.model.TableResultV2;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ReferenceTablesApi apiInstance = new ReferenceTablesApi(defaultClient);

    CreateTableRequest body =
        new CreateTableRequest()
            .data(
                new CreateTableRequestData()
                    .attributes(
                        new CreateTableRequestDataAttributes()
                            .description("this is a cloud table generated via a cloud bucket sync")
                            .fileMetadata(
                                new CreateTableRequestDataAttributesFileMetadata(
                                    new CreateTableRequestDataAttributesFileMetadataCloudStorage()
                                        .accessDetails(
                                            new CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails()
                                                .awsDetail(
                                                    new CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail()
                                                        .awsAccountId("test-account-id")
                                                        .awsBucketName("test-bucket")
                                                        .filePath("test_rt.csv")))
                                        .syncEnabled(true)))
                            .schema(
                                new CreateTableRequestDataAttributesSchema()
                                    .fields(
                                        Arrays.asList(
                                            new CreateTableRequestDataAttributesSchemaFieldsItems()
                                                .name("name")
                                                .type(ReferenceTableSchemaFieldType.STRING),
                                            new CreateTableRequestDataAttributesSchemaFieldsItems()
                                                .name("account_id")
                                                .type(ReferenceTableSchemaFieldType.STRING)))
                                    .primaryKeys(Collections.singletonList("account_id")))
                            .source(ReferenceTableCreateSourceType.S3)
                            .tableName("test_reference_table")
                            .tags(Collections.singletonList("test_tag")))
                    .type(CreateTableRequestDataType.REFERENCE_TABLE));

    try {
      TableResultV2 result = apiInstance.createReferenceTable(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceTablesApi#createReferenceTable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
