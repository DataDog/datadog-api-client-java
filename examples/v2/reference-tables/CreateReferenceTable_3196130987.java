// Create reference table with upload returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ReferenceTablesApi;
import com.datadog.api.client.v2.model.TableResultV2;
import com.datadog.api.client.v2.model.CreateTableRequest;
import com.datadog.api.client.v2.model.CreateTableRequestData;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesFileMetadata;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesFileMetadataLocalFile;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesSchema;
import com.datadog.api.client.v2.model.CreateTableRequestDataAttributesSchemaFieldsItems;
import com.datadog.api.client.v2.model.CreateTableRequestDataType;
import com.datadog.api.client.v2.model.ReferenceTableCreateSourceType;
import com.datadog.api.client.v2.model.ReferenceTableSchemaFieldType;
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
    ReferenceTablesApi apiInstance = new ReferenceTablesApi(defaultClient);

    CreateTableRequest body = new CreateTableRequest()
.data(new CreateTableRequestData()
.attributes(new CreateTableRequestDataAttributes()
.description("Test reference table created via BDD test Example-Reference-Table")
.source(ReferenceTableCreateSourceType.LOCAL_FILE)
.fileMetadata(new CreateTableRequestDataAttributesFileMetadata(
new CreateTableRequestDataAttributesFileMetadataLocalFile()
.uploadId("test-upload-id-Example-Reference-Table")))
.schema(new CreateTableRequestDataAttributesSchema()
.fields(Arrays.asList(new CreateTableRequestDataAttributesSchemaFieldsItems()
.name("id")
.type(ReferenceTableSchemaFieldType.STRING), new CreateTableRequestDataAttributesSchemaFieldsItems()
.name("name")
.type(ReferenceTableSchemaFieldType.STRING), new CreateTableRequestDataAttributesSchemaFieldsItems()
.name("value")
.type(ReferenceTableSchemaFieldType.INT32)))
.primaryKeys(Collections.singletonList("id")))
.tableName("test_reference_table_Example-Reference-Table")
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