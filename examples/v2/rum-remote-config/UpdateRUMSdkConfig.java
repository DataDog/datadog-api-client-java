// Update a RUM SDK configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRemoteConfigApi;
import com.datadog.api.client.v2.model.RUMSdkConfigDynamicOption;
import com.datadog.api.client.v2.model.RUMSdkConfigDynamicOptionPair;
import com.datadog.api.client.v2.model.RUMSdkConfigDynamicOptionSerializedType;
import com.datadog.api.client.v2.model.RUMSdkConfigDynamicOptionStrategy;
import com.datadog.api.client.v2.model.RUMSdkConfigMatchOption;
import com.datadog.api.client.v2.model.RUMSdkConfigMatchOptionSerializedType;
import com.datadog.api.client.v2.model.RUMSdkConfigRUMUpdateAttributes;
import com.datadog.api.client.v2.model.RUMSdkConfigResponse;
import com.datadog.api.client.v2.model.RUMSdkConfigSerializedRegex;
import com.datadog.api.client.v2.model.RUMSdkConfigSerializedRegexType;
import com.datadog.api.client.v2.model.RUMSdkConfigTracingUrlConfig;
import com.datadog.api.client.v2.model.RUMSdkConfigTracingUrlPropagatorType;
import com.datadog.api.client.v2.model.RUMSdkConfigType;
import com.datadog.api.client.v2.model.RUMSdkConfigUpdateAttributes;
import com.datadog.api.client.v2.model.RUMSdkConfigUpdateData;
import com.datadog.api.client.v2.model.RUMSdkConfigUpdateRequest;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateRUMSdkConfig", true);
    RumRemoteConfigApi apiInstance = new RumRemoteConfigApi(defaultClient);

    RUMSdkConfigUpdateRequest body =
        new RUMSdkConfigUpdateRequest()
            .data(
                new RUMSdkConfigUpdateData()
                    .attributes(
                        new RUMSdkConfigUpdateAttributes()
                            .rum(
                                new RUMSdkConfigRUMUpdateAttributes()
                                    .allowedTracingUrls(
                                        Collections.singletonList(
                                            new RUMSdkConfigTracingUrlConfig()
                                                .match(
                                                    new RUMSdkConfigMatchOption()
                                                        .rcSerializedType(
                                                            RUMSdkConfigMatchOptionSerializedType
                                                                .STRING)
                                                        .value("https://app.datadoghq.com"))
                                                .propagatorTypes(
                                                    Arrays.asList(
                                                        RUMSdkConfigTracingUrlPropagatorType
                                                            .DATADOG,
                                                        RUMSdkConfigTracingUrlPropagatorType
                                                            .TRACECONTEXT))))
                                    .allowedTrackingOrigins(
                                        Collections.singletonList(
                                            new RUMSdkConfigMatchOption()
                                                .rcSerializedType(
                                                    RUMSdkConfigMatchOptionSerializedType.STRING)
                                                .value("https://app.datadoghq.com")))
                                    .context(
                                        Collections.singletonList(
                                            new RUMSdkConfigDynamicOptionPair()
                                                .key("id")
                                                .value(
                                                    new RUMSdkConfigDynamicOption()
                                                        .attribute("data-version")
                                                        .extractor(
                                                            new RUMSdkConfigSerializedRegex()
                                                                .rcSerializedType(
                                                                    RUMSdkConfigSerializedRegexType
                                                                        .REGEX)
                                                                .value(
                                                                    "^https://app-.*.datadoghq.com"))
                                                        .key("app.version")
                                                        .name("app_version")
                                                        .path("application.version")
                                                        .rcSerializedType(
                                                            RUMSdkConfigDynamicOptionSerializedType
                                                                .DYNAMIC)
                                                        .selector("#app-version")
                                                        .strategy(
                                                            RUMSdkConfigDynamicOptionStrategy.JS))))
                                    .defaultPrivacyLevel("mask")
                                    .enablePrivacyForActionName(true)
                                    .env("production")
                                    .service("my-service")
                                    .sessionReplaySampleRate(20L)
                                    .sessionSampleRate(75L)
                                    .traceSampleRate(100L)
                                    .trackSessionAcrossSubdomains(false)
                                    .user(
                                        Collections.singletonList(
                                            new RUMSdkConfigDynamicOptionPair()
                                                .key("id")
                                                .value(
                                                    new RUMSdkConfigDynamicOption()
                                                        .attribute("data-version")
                                                        .extractor(
                                                            new RUMSdkConfigSerializedRegex()
                                                                .rcSerializedType(
                                                                    RUMSdkConfigSerializedRegexType
                                                                        .REGEX)
                                                                .value(
                                                                    "^https://app-.*.datadoghq.com"))
                                                        .key("app.version")
                                                        .name("app_version")
                                                        .path("application.version")
                                                        .rcSerializedType(
                                                            RUMSdkConfigDynamicOptionSerializedType
                                                                .DYNAMIC)
                                                        .selector("#app-version")
                                                        .strategy(
                                                            RUMSdkConfigDynamicOptionStrategy.JS))))
                                    .version(
                                        new RUMSdkConfigDynamicOption()
                                            .attribute("data-version")
                                            .extractor(
                                                new RUMSdkConfigSerializedRegex()
                                                    .rcSerializedType(
                                                        RUMSdkConfigSerializedRegexType.REGEX)
                                                    .value("^https://app-.*.datadoghq.com"))
                                            .key("app.version")
                                            .name("app_version")
                                            .path("application.version")
                                            .rcSerializedType(
                                                RUMSdkConfigDynamicOptionSerializedType.DYNAMIC)
                                            .selector("#app-version")
                                            .strategy(RUMSdkConfigDynamicOptionStrategy.JS))))
                    .id("abc12345-1234-5678-abcd-ef1234567890")
                    .type(RUMSdkConfigType.RUM_SDK_CONFIG));

    try {
      RUMSdkConfigResponse result =
          apiInstance.updateRUMSdkConfig("abc12345-1234-5678-abcd-ef1234567890", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRemoteConfigApi#updateRUMSdkConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
