// Create an API test with multi subtype returns "OK - Returns the created test details." response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPIStep;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsAPITestConfig;
import com.datadog.api.client.v1.model.SyntheticsAPITestStep;
import com.datadog.api.client.v1.model.SyntheticsAPITestStepSubtype;
import com.datadog.api.client.v1.model.SyntheticsAPITestType;
import com.datadog.api.client.v1.model.SyntheticsAPIWaitStep;
import com.datadog.api.client.v1.model.SyntheticsAPIWaitStepSubtype;
import com.datadog.api.client.v1.model.SyntheticsAssertion;
import com.datadog.api.client.v1.model.SyntheticsAssertionOperator;
import com.datadog.api.client.v1.model.SyntheticsAssertionTarget;
import com.datadog.api.client.v1.model.SyntheticsAssertionTargetValue;
import com.datadog.api.client.v1.model.SyntheticsAssertionTargetValueNumber;
import com.datadog.api.client.v1.model.SyntheticsAssertionType;
import com.datadog.api.client.v1.model.SyntheticsBasicAuth;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthWeb;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthWebType;
import com.datadog.api.client.v1.model.SyntheticsConfigVariable;
import com.datadog.api.client.v1.model.SyntheticsConfigVariableType;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParserType;
import com.datadog.api.client.v1.model.SyntheticsLocalVariableParsingOptionsType;
import com.datadog.api.client.v1.model.SyntheticsParsingOptions;
import com.datadog.api.client.v1.model.SyntheticsTestCallType;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsSubType;
import com.datadog.api.client.v1.model.SyntheticsTestOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsHTTPVersion;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestRequest;
import com.datadog.api.client.v1.model.SyntheticsTestRequestDNSServerPort;
import com.datadog.api.client.v1.model.SyntheticsTestRequestNumericalPort;
import com.datadog.api.client.v1.model.SyntheticsTestRequestPort;
import com.datadog.api.client.v1.model.SyntheticsVariableParser;
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

    SyntheticsAPITest body = new SyntheticsAPITest()
.config(new SyntheticsAPITestConfig()
.configVariables(Collections.singletonList(new SyntheticsConfigVariable()
.example("content-type")
.name("PROPERTY")
.pattern("content-type")
.type(SyntheticsConfigVariableType.TEXT)))
.steps(Arrays.asList(new SyntheticsAPIStep(
new SyntheticsAPITestStep()
.allowFailure(true)
.assertions(Collections.singletonList(new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.IS)
.type(SyntheticsAssertionType.STATUS_CODE)
.target(new SyntheticsAssertionTargetValue(
200.0)))))
.exitIfSucceed(true)
.extractedValues(Collections.singletonList(new SyntheticsParsingOptions()
.field("server")
.name("EXTRACTED_VALUE")
.parser(new SyntheticsVariableParser()
.type(SyntheticsGlobalVariableParserType.RAW))
.type(SyntheticsLocalVariableParsingOptionsType.HTTP_HEADER)
.secure(true)))
.isCritical(true)
.name("request is sent")
.request(new SyntheticsTestRequest()
.method("GET")
.timeout(10.0)
.url("https://datadoghq.com")
.httpVersion(SyntheticsTestOptionsHTTPVersion.HTTP2))
.retry(new SyntheticsTestOptionsRetry()
.count(5L)
.interval(1000.0))
.subtype(SyntheticsAPITestStepSubtype.HTTP)
.extractedValuesFromScript("dd.variable.set('STATUS_CODE', dd.response.statusCode);")), new SyntheticsAPIStep(
new SyntheticsAPIWaitStep()
.name("Wait")
.subtype(SyntheticsAPIWaitStepSubtype.WAIT)
.value(1)), new SyntheticsAPIStep(
new SyntheticsAPITestStep()
.name("GRPC CALL")
.subtype(SyntheticsAPITestStepSubtype.GRPC)
.allowFailure(false)
.isCritical(true)
.retry(new SyntheticsTestOptionsRetry()
.count(0L)
.interval(300.0))
.assertions(Collections.singletonList(new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.LESS_THAN)
.type(SyntheticsAssertionType.RESPONSE_TIME)
.target(new SyntheticsAssertionTargetValue(
1000.0)))))
.request(new SyntheticsTestRequest()
.host("grpcbin.test.k6.io")
.port(new SyntheticsTestRequestPort(
9000L))
.service("grpcbin.GRPCBin")
.method("Index")
.message("{}")
.compressedJsonDescriptor("eJy1lU1z2yAQhv+Lzj74I3ETH506bQ7OZOSm1w4Wa4epBARQppqM/3v5koCJJdvtxCdW77vPssCO3zMKUgHOFu/ZXvBiS6hZho/f8qe7pftYgXphWJrlA8XwxywEvNba+6PhkC2yVcVVswYp0R6ykRYlZ1SCV21SDrxsssPIeS9FJKqGfK2rqnmmSBwhWa2XlKgtaQPiDcRGCUDVfwGD2sKUqKEtc1cSoOrsMlaMOec1sySYCCgUYRSVLv2zSva2u+FQkB0pVkIw8bFuIudOOn3pOaKYVT3Iy97Pd0AYhOx5QcMsnxvRHlnuLf8ETDd3CNtrv2nejkDpRnANCmGkkFn/hsYzpBKE7jVbufgnKnV9HRM9zRPDDKPttYT61n0TdWkAAjggk9AhuxIeaXd69CYTcsGw7cBTakLVbNpRzGEgyWjkSOpMbZXkhGL6oX30R49qt3GoHrap7i0XdD41WQ+2icCNm5p1hmFqnHNlcla0riKmDZ183crDxChjbnurtxHPRE784sVhWvDfGP+SsTKibU3o5NtWHuZFGZOxP6P5VXqIOvaOSec4eYohyd7NslHuJbd1bewds85xYrNxkr2d+5IhFWF3NvaO684xjE2S5ulY+tu64Pna0fCPJgzw6vF5/WucLcYjt5xoq19O3UDptOg/OamJQRaCcPPnMTQ2QDFn+uhPvUfnCrMc99upyQY4Ui9Dlc/YoG3R/v4Cs9YE+g==")
.metadata(Map.ofEntries())
.callType(SyntheticsTestCallType.UNARY))), new SyntheticsAPIStep(
new SyntheticsAPITestStep()
.name("SSL step")
.subtype(SyntheticsAPITestStepSubtype.SSL)
.allowFailure(false)
.isCritical(true)
.retry(new SyntheticsTestOptionsRetry()
.count(0L)
.interval(300.0))
.assertions(Collections.singletonList(new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.IS_IN_MORE_DAYS_THAN)
.type(SyntheticsAssertionType.CERTIFICATE)
.target(new SyntheticsAssertionTargetValue(
10.0)))))
.request(new SyntheticsTestRequest()
.checkCertificateRevocation(true)
.disableAiaIntermediateFetching(true)
.host("example.org")
.port(new SyntheticsTestRequestPort(
443L)))), new SyntheticsAPIStep(
new SyntheticsAPITestStep()
.name("DNS step")
.subtype(SyntheticsAPITestStepSubtype.DNS)
.allowFailure(false)
.isCritical(true)
.retry(new SyntheticsTestOptionsRetry()
.count(0L)
.interval(300.0))
.assertions(Collections.singletonList(new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.LESS_THAN)
.type(SyntheticsAssertionType.RESPONSE_TIME)
.target(new SyntheticsAssertionTargetValue(
1000.0)))))
.request(new SyntheticsTestRequest()
.host("troisdizaines.com")
.dnsServer("8.8.8.8")
.dnsServerPort(new SyntheticsTestRequestDNSServerPort(
"53")))), new SyntheticsAPIStep(
new SyntheticsAPITestStep()
.name("TCP step")
.subtype(SyntheticsAPITestStepSubtype.TCP)
.allowFailure(false)
.isCritical(true)
.retry(new SyntheticsTestOptionsRetry()
.count(0L)
.interval(300.0))
.assertions(Collections.singletonList(new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.LESS_THAN)
.type(SyntheticsAssertionType.RESPONSE_TIME)
.target(new SyntheticsAssertionTargetValue(
1000.0)))))
.request(new SyntheticsTestRequest()
.host("34.95.79.70")
.port(new SyntheticsTestRequestPort(
80L))
.shouldTrackHops(true)
.timeout(32.0))), new SyntheticsAPIStep(
new SyntheticsAPITestStep()
.name("ICMP step")
.subtype(SyntheticsAPITestStepSubtype.ICMP)
.allowFailure(false)
.isCritical(true)
.retry(new SyntheticsTestOptionsRetry()
.count(0L)
.interval(300.0))
.assertions(Collections.singletonList(new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.IS)
.target(new SyntheticsAssertionTargetValue(
0.0))
.type(SyntheticsAssertionType.PACKET_LOSS_PERCENTAGE))))
.request(new SyntheticsTestRequest()
.host("34.95.79.70")
.numberOfPackets(4)
.shouldTrackHops(true)
.timeout(38.0))), new SyntheticsAPIStep(
new SyntheticsAPITestStep()
.name("Websocket step")
.subtype(SyntheticsAPITestStepSubtype.WEBSOCKET)
.allowFailure(false)
.isCritical(true)
.retry(new SyntheticsTestOptionsRetry()
.count(0L)
.interval(300.0))
.assertions(Collections.singletonList(new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.LESS_THAN)
.type(SyntheticsAssertionType.RESPONSE_TIME)
.target(new SyntheticsAssertionTargetValue(
1000.0)))))
.request(new SyntheticsTestRequest()
.url("ws://34.95.79.70/web-socket")
.message("My message")
.isMessageBase64Encoded(true)
.headers(Map.ofEntries(Map.entry("f", "g")))
.basicAuth(new SyntheticsBasicAuth(
new SyntheticsBasicAuthWeb()
.type(SyntheticsBasicAuthWebType.WEB)
.username("user")
.password("password"))))), new SyntheticsAPIStep(
new SyntheticsAPITestStep()
.name("UDP step")
.subtype(SyntheticsAPITestStepSubtype.UDP)
.allowFailure(false)
.isCritical(true)
.retry(new SyntheticsTestOptionsRetry()
.count(0L)
.interval(300.0))
.assertions(Collections.singletonList(new SyntheticsAssertion(
new SyntheticsAssertionTarget()
.operator(SyntheticsAssertionOperator.LESS_THAN)
.type(SyntheticsAssertionType.RESPONSE_TIME)
.target(new SyntheticsAssertionTargetValue(
1000.0)))))
.request(new SyntheticsTestRequest()
.host("8.8.8.8")
.port(new SyntheticsTestRequestPort(
53L))
.message("A image.google.com"))))))
.locations(Collections.singletonList("aws:us-east-2"))
.message("BDD test payload: synthetics_api_test_multi_step_payload.json")
.name("Example-Synthetic")
.options(new SyntheticsTestOptions()
.acceptSelfSigned(false)
.allowInsecure(true)
.followRedirects(true)
.minFailureDuration(10L)
.minLocationFailed(1L)
.monitorName("Example-Synthetic")
.monitorPriority(5)
.retry(new SyntheticsTestOptionsRetry()
.count(3L)
.interval(1000.0))
.tickEvery(60L))
.subtype(SyntheticsTestDetailsSubType.MULTI)
.tags(Collections.singletonList("testing:api"))
.type(SyntheticsAPITestType.API);

    try {
      SyntheticsAPITest result = apiInstance.createSyntheticsAPITest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#createSyntheticsAPITest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}