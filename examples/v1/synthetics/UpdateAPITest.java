// Edit an API test returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITestConfig;
import com.datadog.api.client.v1.model.SyntheticsAPITestType;
import com.datadog.api.client.v1.model.SyntheticsAssertion;
import com.datadog.api.client.v1.model.SyntheticsAssertionJSONPathOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionJSONPathTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionJSONPathTargetTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionJSONSchemaMetaSchema;
import com.datadog.api.client.v1.model.SyntheticsAssertionJSONSchemaOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionJSONSchemaTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionJSONSchemaTargetTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionTargetValue;
import com.datadog.api.client.v1.model.SyntheticsAssertionTargetValueNumber;
import com.datadog.api.client.v1.model.SyntheticsAssertionType;
import com.datadog.api.client.v1.model.SyntheticsConfigVariable;
import com.datadog.api.client.v1.model.SyntheticsConfigVariableType;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestPauseStatus;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import com.datadog.api.client.v1.model.SyntheticsTestRequestCertificate;
import com.datadog.api.client.v1.model.SyntheticsTestRequestCertificateItem;
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
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "synthetics_api_test" in the system
    String SYNTHETICS_API_TEST_PUBLIC_ID = System.getenv("SYNTHETICS_API_TEST_PUBLIC_ID");

    SyntheticsAPITest body = new SyntheticsAPITest()
.config(new SyntheticsAPITestConfig()
.assertions(Arrays.asList(new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.IS)
.property("{{ PROPERTY }}")
.target(new SyntheticsAssertionTargetValue(
"text/html"))
.type(SyntheticsAssertionType.HEADER)), new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.LESS_THAN)
.target(new SyntheticsAssertionTargetValue(
2000.0))
.type(SyntheticsAssertionType.RESPONSE_TIME)), new SyntheticsAssertion(
new SyntheticsAssertionJSONPathTarget()
.operator(SyntheticsAssertionJSONPathOperator.VALIDATES_JSON_PATH)
.target(new SyntheticsAssertionJSONPathTargetTarget()
.jsonPath("topKey")
.operator("isNot")
.targetValue(new SyntheticsAssertionTargetValue(
"0")))
.type(SyntheticsAssertionType.BODY)), new SyntheticsAssertion(
new SyntheticsAssertionJSONSchemaTarget()
.operator(SyntheticsAssertionJSONSchemaOperator.VALIDATES_JSON_SCHEMA)
.target(new SyntheticsAssertionJSONSchemaTargetTarget()
.metaSchema(SyntheticsAssertionJSONSchemaMetaSchema.DRAFT_07)
.jsonSchema("""
{"type": "object", "properties":{"slideshow":{"type":"object"}}}
"""))
.type(SyntheticsAssertionType.BODY))))
.configVariables(Collections.singletonList(new SyntheticsConfigVariable()
.example("content-type")
.name("PROPERTY")
.pattern("content-type")
.type(SyntheticsConfigVariableType.TEXT)))
.request(new SyntheticsTestRequest()
.certificate(new SyntheticsTestRequestCertificate()
.cert(new SyntheticsTestRequestCertificateItem()
.filename("cert-filename")
.updatedAt("2020-10-16T09:23:24.857Z"))
.key(new SyntheticsTestRequestCertificateItem()
.filename("key-filename")
.updatedAt("2020-10-16T09:23:24.857Z")))
.headers(Map.ofEntries(Map.entry("unique", "examplesynthetic")))
.method("GET")
.timeout(10.0)
.url("https://datadoghq.com")))
.locations(Collections.singletonList("aws:us-east-2"))
.message("BDD test payload: synthetics_api_test_payload.json")
.name("Example-Synthetic-updated")
.options(new SyntheticsTestOptions()
.acceptSelfSigned(false)
.allowInsecure(true)
.followRedirects(true)
.minFailureDuration(10L)
.minLocationFailed(1L)
.monitorName("Test-TestSyntheticsAPITestLifecycle-1623076664")
.monitorPriority(5)
.retry(new SyntheticsTestOptionsRetry()
.count(3L)
.interval(10.0))
.tickEvery(60L))
.status(SyntheticsTestPauseStatus.LIVE)
.subtype(SyntheticsTestDetailsSubType.HTTP)
.tags(Collections.singletonList("testing:api"))
.type(SyntheticsAPITestType.API);

    try {
      SyntheticsAPITest result = apiInstance.updateAPITest(SYNTHETICS_API_TEST_PUBLIC_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updateAPITest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}