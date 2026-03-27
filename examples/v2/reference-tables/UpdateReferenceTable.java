// Update reference table returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ReferenceTablesApi;
import com.datadog.api.client.v2.model.PatchTableRequest;
import com.datadog.api.client.v2.model.PatchTableRequestData;
import com.datadog.api.client.v2.model.PatchTableRequestDataAttributes;
import com.datadog.api.client.v2.model.PatchTableRequestDataAttributesFileMetadata;
import com.datadog.api.client.v2.model.PatchTableRequestDataAttributesFileMetadataCloudStorage;
import com.datadog.api.client.v2.model.PatchTableRequestDataAttributesFileMetadataOneOfAccessDetails;
import com.datadog.api.client.v2.model.PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail;
import com.datadog.api.client.v2.model.PatchTableRequestDataAttributesSchema;
import com.datadog.api.client.v2.model.PatchTableRequestDataAttributesSchemaFieldsItems;
import com.datadog.api.client.v2.model.PatchTableRequestDataType;
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

    PatchTableRequest body = new PatchTableRequest()
.data(new PatchTableRequestData()
.attributes(new PatchTableRequestDataAttributes()
.description("this is a cloud table generated via a cloud bucket sync")
.fileMetadata(new PatchTableRequestDataAttributesFileMetadata(
new PatchTableRequestDataAttributesFileMetadataCloudStorage()
.accessDetails(new PatchTableRequestDataAttributesFileMetadataOneOfAccessDetails()
.awsDetail(new PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail()
.awsAccountId("test-account-id")
.awsBucketName("test-bucket")
.filePath("test_rt.csv")))
.syncEnabled(true)))
.schema(new PatchTableRequestDataAttributesSchema()
.fields(Arrays.asList(new PatchTableRequestDataAttributesSchemaFieldsItems()
.name("id")
.type(ReferenceTableSchemaFieldType.INT32), new PatchTableRequestDataAttributesSchemaFieldsItems()
.name("name")
.type(ReferenceTableSchemaFieldType.STRING)))
.primaryKeys(Collections.singletonList("id")))
.tags(Collections.singletonList("test_tag")))
.type(PatchTableRequestDataType.REFERENCE_TABLE));

    try {
      apiInstance.updateReferenceTable("id", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceTablesApi#updateReferenceTable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}