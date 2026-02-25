// Create a pipeline with Schema Processor and preserve_source true returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.LogsPipelinesApi;
import com.datadog.api.client.v1.model.LogsPipeline;
import com.datadog.api.client.v1.model.LogsFilter;
import com.datadog.api.client.v1.model.LogsPipeline;
import com.datadog.api.client.v1.model.LogsProcessor;
import com.datadog.api.client.v1.model.LogsSchemaCategoryMapper;
import com.datadog.api.client.v1.model.LogsSchemaCategoryMapperCategory;
import com.datadog.api.client.v1.model.LogsSchemaCategoryMapperFallback;
import com.datadog.api.client.v1.model.LogsSchemaCategoryMapperTargets;
import com.datadog.api.client.v1.model.LogsSchemaCategoryMapperType;
import com.datadog.api.client.v1.model.LogsSchemaData;
import com.datadog.api.client.v1.model.LogsSchemaMapper;
import com.datadog.api.client.v1.model.LogsSchemaProcessor;
import com.datadog.api.client.v1.model.LogsSchemaProcessorType;
import com.datadog.api.client.v1.model.LogsSchemaRemapper;
import com.datadog.api.client.v1.model.LogsSchemaRemapperType;
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
    LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);

    LogsPipeline body = new LogsPipeline()
.filter(new LogsFilter()
.query("source:python"))
.name("testSchemaProcessor")
.processors(Collections.singletonList(new LogsProcessor(
new LogsSchemaProcessor()
.type(LogsSchemaProcessorType.SCHEMA_PROCESSOR)
.isEnabled(true)
.name("Apply OCSF schema for 3001")
.schema(new LogsSchemaData()
.schemaType("ocsf")
.version("1.5.0")
.classUid(3001L)
.className("Account Change")
.profiles(Arrays.asList("cloud", "datetime")))
.mappers(Arrays.asList(new LogsSchemaMapper(
new LogsSchemaCategoryMapper()
.type(LogsSchemaCategoryMapperType.SCHEMA_CATEGORY_MAPPER)
.name("activity_id and activity_name")
.categories(Arrays.asList(new LogsSchemaCategoryMapperCategory()
.filter(new LogsFilter()
.query("@eventName:(*Create*)"))
.name("Create")
.id(1L), new LogsSchemaCategoryMapperCategory()
.filter(new LogsFilter()
.query("@eventName:(ChangePassword OR PasswordUpdated)"))
.name("Password Change")
.id(3L), new LogsSchemaCategoryMapperCategory()
.filter(new LogsFilter()
.query("@eventName:(*Attach*)"))
.name("Attach Policy")
.id(7L), new LogsSchemaCategoryMapperCategory()
.filter(new LogsFilter()
.query("@eventName:(*Detach* OR *Remove*)"))
.name("Detach Policy")
.id(8L), new LogsSchemaCategoryMapperCategory()
.filter(new LogsFilter()
.query("@eventName:(*Delete*)"))
.name("Delete")
.id(6L), new LogsSchemaCategoryMapperCategory()
.filter(new LogsFilter()
.query("@eventName:*"))
.name("Other")
.id(99L)))
.targets(new LogsSchemaCategoryMapperTargets()
.name("ocsf.activity_name")
.id("ocsf.activity_id"))
.fallback(new LogsSchemaCategoryMapperFallback()
.values(Map.ofEntries(Map.entry("ocsf.activity_id", "99"),Map.entry("ocsf.activity_name", "Other")))
.sources(Map.ofEntries(Map.entry("ocsf.activity_name", Collections.singletonList("eventName")))))), new LogsSchemaMapper(
new LogsSchemaCategoryMapper()
.type(LogsSchemaCategoryMapperType.SCHEMA_CATEGORY_MAPPER)
.name("status")
.categories(Arrays.asList(new LogsSchemaCategoryMapperCategory()
.filter(new LogsFilter()
.query("-@errorCode:*"))
.id(1L)
.name("Success"), new LogsSchemaCategoryMapperCategory()
.filter(new LogsFilter()
.query("@errorCode:*"))
.id(2L)
.name("Failure")))
.targets(new LogsSchemaCategoryMapperTargets()
.id("ocsf.status_id")
.name("ocsf.status"))), new LogsSchemaMapper(
new LogsSchemaCategoryMapper()
.type(LogsSchemaCategoryMapperType.SCHEMA_CATEGORY_MAPPER)
.name("Set default severity")
.categories(Collections.singletonList(new LogsSchemaCategoryMapperCategory()
.filter(new LogsFilter()
.query("@eventName:*"))
.name("Informational")
.id(1L)))
.targets(new LogsSchemaCategoryMapperTargets()
.name("ocsf.severity")
.id("ocsf.severity_id"))), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map userIdentity to ocsf.user.uid")
.sources(Arrays.asList("userIdentity.principalId", "responseElements.role.roleId", "responseElements.user.userId"))
.target("ocsf.user.uid")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map userName to ocsf.user.name")
.sources(Arrays.asList("requestParameters.userName", "responseElements.role.roleName", "requestParameters.roleName", "responseElements.user.userName"))
.target("ocsf.user.name")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map api to ocsf.api")
.sources(Collections.singletonList("api"))
.target("ocsf.api")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map user to ocsf.user")
.sources(Collections.singletonList("user"))
.target("ocsf.user")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map actor to ocsf.actor")
.sources(Collections.singletonList("actor"))
.target("ocsf.actor")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map cloud to ocsf.cloud")
.sources(Collections.singletonList("cloud"))
.target("ocsf.cloud")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map http_request to ocsf.http_request")
.sources(Collections.singletonList("http_request"))
.target("ocsf.http_request")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map metadata to ocsf.metadata")
.sources(Collections.singletonList("metadata"))
.target("ocsf.metadata")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map time to ocsf.time")
.sources(Collections.singletonList("time"))
.target("ocsf.time")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map src_endpoint to ocsf.src_endpoint")
.sources(Collections.singletonList("src_endpoint"))
.target("ocsf.src_endpoint")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map severity to ocsf.severity")
.sources(Collections.singletonList("severity"))
.target("ocsf.severity")
.preserveSource(true)), new LogsSchemaMapper(
new LogsSchemaRemapper()
.type(LogsSchemaRemapperType.SCHEMA_REMAPPER)
.name("Map severity_id to ocsf.severity_id")
.sources(Collections.singletonList("severity_id"))
.target("ocsf.severity_id")
.preserveSource(true)))))));

    try {
      LogsPipeline result = apiInstance.createLogsPipeline(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsPipelinesApi#createLogsPipeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}