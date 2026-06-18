// Update a RUM SDK configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRemoteConfigApi;
import com.datadog.api.client.v2.model.RumSdkConfigDynamicOption;
import com.datadog.api.client.v2.model.RumSdkConfigDynamicOptionPair;
import com.datadog.api.client.v2.model.RumSdkConfigDynamicOptionSerializedType;
import com.datadog.api.client.v2.model.RumSdkConfigDynamicOptionStrategy;
import com.datadog.api.client.v2.model.RumSdkConfigMatchOption;
import com.datadog.api.client.v2.model.RumSdkConfigMatchOptionSerializedType;
import com.datadog.api.client.v2.model.RumSdkConfigResponse;
import com.datadog.api.client.v2.model.RumSdkConfigRumUpdateAttributes;
import com.datadog.api.client.v2.model.RumSdkConfigSerializedRegex;
import com.datadog.api.client.v2.model.RumSdkConfigSerializedRegexType;
import com.datadog.api.client.v2.model.RumSdkConfigTracingUrlConfig;
import com.datadog.api.client.v2.model.RumSdkConfigTracingUrlPropagatorType;
import com.datadog.api.client.v2.model.RumSdkConfigType;
import com.datadog.api.client.v2.model.RumSdkConfigUpdateAttributes;
import com.datadog.api.client.v2.model.RumSdkConfigUpdateData;
import com.datadog.api.client.v2.model.RumSdkConfigUpdateRequest;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateRumSdkConfig", true);
    RumRemoteConfigApi apiInstance = new RumRemoteConfigApi(defaultClient);

    RumSdkConfigUpdateRequest body =
        new RumSdkConfigUpdateRequest()
            .data(
                new RumSdkConfigUpdateData()
                    .attributes(
                        new RumSdkConfigUpdateAttributes()
                            .rum(
                                new RumSdkConfigRumUpdateAttributes()
                                    .allowedTracingUrls(
                                        Collections.singletonList(
                                            new RumSdkConfigTracingUrlConfig()
                                                .match(
                                                    new RumSdkConfigMatchOption()
                                                        .rcSerializedType(
                                                            RumSdkConfigMatchOptionSerializedType
                                                                .STRING)
                                                        .value("https://app.datadoghq.com"))
                                                .propagatorTypes(
                                                    Arrays.asList(
                                                        RumSdkConfigTracingUrlPropagatorType
                                                            .DATADOG,
                                                        RumSdkConfigTracingUrlPropagatorType
                                                            .TRACECONTEXT))))
                                    .allowedTrackingOrigins(
                                        Collections.singletonList(
                                            new RumSdkConfigMatchOption()
                                                .rcSerializedType(
                                                    RumSdkConfigMatchOptionSerializedType.STRING)
                                                .value("https://app.datadoghq.com")))
                                    .context(
                                        Collections.singletonList(
                                            new RumSdkConfigDynamicOptionPair()
                                                .key("id")
                                                .value(
                                                    new RumSdkConfigDynamicOption()
                                                        .attribute("data-version")
                                                        .extractor(
                                                            new RumSdkConfigSerializedRegex()
                                                                .rcSerializedType(
                                                                    RumSdkConfigSerializedRegexType
                                                                        .REGEX)
                                                                .value(
                                                                    "^https://app-.*.datadoghq.com"))
                                                        .key("app.version")
                                                        .name("app_version")
                                                        .path("application.version")
                                                        .rcSerializedType(
                                                            RumSdkConfigDynamicOptionSerializedType
                                                                .DYNAMIC)
                                                        .selector("#app-version")
                                                        .strategy(
                                                            RumSdkConfigDynamicOptionStrategy.JS))))
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
                                            new RumSdkConfigDynamicOptionPair()
                                                .key("id")
                                                .value(
                                                    new RumSdkConfigDynamicOption()
                                                        .attribute("data-version")
                                                        .extractor(
                                                            new RumSdkConfigSerializedRegex()
                                                                .rcSerializedType(
                                                                    RumSdkConfigSerializedRegexType
                                                                        .REGEX)
                                                                .value(
                                                                    "^https://app-.*.datadoghq.com"))
                                                        .key("app.version")
                                                        .name("app_version")
                                                        .path("application.version")
                                                        .rcSerializedType(
                                                            RumSdkConfigDynamicOptionSerializedType
                                                                .DYNAMIC)
                                                        .selector("#app-version")
                                                        .strategy(
                                                            RumSdkConfigDynamicOptionStrategy.JS))))
                                    .version(
                                        new RumSdkConfigDynamicOption()
                                            .attribute("data-version")
                                            .extractor(
                                                new RumSdkConfigSerializedRegex()
                                                    .rcSerializedType(
                                                        RumSdkConfigSerializedRegexType.REGEX)
                                                    .value("^https://app-.*.datadoghq.com"))
                                            .key("app.version")
                                            .name("app_version")
                                            .path("application.version")
                                            .rcSerializedType(
                                                RumSdkConfigDynamicOptionSerializedType.DYNAMIC)
                                            .selector("#app-version")
                                            .strategy(RumSdkConfigDynamicOptionStrategy.JS))))
                    .id("abc12345-1234-5678-abcd-ef1234567890")
                    .type(RumSdkConfigType.RUM_SDK_CONFIG));

    try {
      RumSdkConfigResponse result =
          apiInstance.updateRumSdkConfig("abc12345-1234-5678-abcd-ef1234567890", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRemoteConfigApi#updateRumSdkConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
