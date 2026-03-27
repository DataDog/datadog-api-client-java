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
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail;
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
                            .fileMetadata(
                                new CreateTableRequestDataAttributesFileMetadata(
                                    new CreateTableRequestDataAttributesFileMetadataCloudStorage()
                                        .accessDetails(
                                            new CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails()
                                                .awsDetail(
                                                    new CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail()
                                                        .awsAccountId("123456789000")
                                                        .awsBucketName("example-data-bucket")
                                                        .filePath("reference-tables/users.csv"))
                                                .azureDetail(
                                                    new CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail()
                                                        .azureClientId(
                                                            "aaaaaaaa-1111-2222-3333-bbbbbbbbbbbb")
                                                        .azureContainerName("reference-data")
                                                        .azureStorageAccountName(
                                                            "examplestorageaccount")
                                                        .azureTenantId(
                                                            "cccccccc-4444-5555-6666-dddddddddddd")
                                                        .filePath("tables/users.csv"))
                                                .gcpDetail(
                                                    new CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail()
                                                        .filePath("data/reference_tables/users.csv")
                                                        .gcpBucketName("example-data-bucket")
                                                        .gcpProjectId("example-gcp-project-12345")
                                                        .gcpServiceAccountEmail(
                                                            "example-service@example-gcp-project-12345.iam.gserviceaccount.com")))
                                        .syncEnabled(false)))
                            .schema(
                                new CreateTableRequestDataAttributesSchema()
                                    .fields(
                                        Collections.singletonList(
                                            new CreateTableRequestDataAttributesSchemaFieldsItems()
                                                .name("field_1")
                                                .type(ReferenceTableSchemaFieldType.STRING)))
                                    .primaryKeys(Collections.singletonList("field_1")))
                            .source(ReferenceTableCreateSourceType.LOCAL_FILE)
                            .tableName("table_1")
                            .tags(Arrays.asList("tag_1", "tag_2")))
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
