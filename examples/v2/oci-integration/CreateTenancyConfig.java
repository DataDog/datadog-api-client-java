// Create tenancy config returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OciIntegrationApi;
import com.datadog.api.client.v2.model.AuthCredentials;
import com.datadog.api.client.v2.model.CreateTenancyConfig;
import com.datadog.api.client.v2.model.CreateTenancyConfigData;
import com.datadog.api.client.v2.model.CreateTenancyConfigDataAttributes;
import com.datadog.api.client.v2.model.CreateTenancyConfigDataType;
import com.datadog.api.client.v2.model.OCILogsConfig;
import com.datadog.api.client.v2.model.OCIMetricsConfig;
import com.datadog.api.client.v2.model.TenancyConfig;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OciIntegrationApi apiInstance = new OciIntegrationApi(defaultClient);

    CreateTenancyConfig body =
        new CreateTenancyConfig()
            .data(
                new CreateTenancyConfigData()
                    .attributes(
                        new CreateTenancyConfigDataAttributes()
                            .authCredentials(
                                new AuthCredentials()
                                    .fingerprint("a7:b5:54:f2:da:a2:d7:b0:ed:f4:79:47:93:64:12:b1")
                                    .privateKey(
                                        """
-----BEGIN PRIVATE KEY-----
MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCmMo2jwJXWTt0y
k+X6biZycflZSwOAP/iNeAZPTWwhYxj9pxDvd5OfiIe+o/7eupk/3q+fRsSaztPn
JwI/JnbQz5IT5miLi/apIozg870FFxjrgRxSGjo7BNH0dLKITc5nLDLBnOEzxR2Y
k9+0dFaiNlcodFULlg75trqbILRSc6jn9Tp9G8C5e9cj+LYQuUu2JwIqhCJqcNcU
t+lRL5odBJhZ85KlugKyUg6LN3VQIdOpTtPBMXYA1oBgDCbe5Rw5yzgnd0KtSFf3
GOmLfR95gQshLfbGavLOTh9ioaOj/2hT9HrsEe1VWgX3m1WibqKiPc4OA4BGGToN
9tzN/t89AgMBAAECggEAVFKD4JherXwX6Ih3f6cRZLGFBJP1s8VBM225LdUnTo07
6b4w7n6p7KBV1xjXwGPGS0yNqG88YxsbEkWNc0Ltt6YJBIW7d0nNHSVFewDPX1zH
rP01xEZAUx9v8uqehl+LoHchTXBuJlkVWgt0zdbU+bo+YG0dlSJOeM4IQZrHQqlQ
e4PNk73rot9NSqiKQFXUroaoVPTkUHb3idpLX60K3MgIBoAm4DpJ6cMItb4hyHv5
pNZhHQbr9Eciz2tj+OhQTYKCrAd0gJgl0tC+6L3kzkmiYE3ceGphqWfI9bX52Y96
wpgAtYi6o8wTykgRLabLc6vSQ9RegWEh7P8iSAvAlQKBgQDX5wJhYeWDdG4uPqLC
X3EtnR3y5zYgOd7cVtMr1DIvXa4I8PSIOC4Wnb/5A1S03dJ2e8GJ/qSbl5R2fsDr
XhjIm/KeBPI9p2dVZM8fPoWppR3SgDaHY5qxAED111DnEZuTMl5BO87QZXurTSiF
fbGsWaVqdVieRAQ3b5DEkC9TSwKBgQDFEFgui7iyPhQaQafsjnVbWyrWF821xjTG
b6Bo4FO97c9pw/tbkpfM+dcOU4SsZL8HjwGBUhUsDsVOX7m/sWRjZqNM5t/VR+52
9ygIPEjNyh0b3aARgn8AQ8n+RZvl1Z2A32KCO3MFzhpVKnv2sdSc1TNHQkuJH/rq
eUAm3El6lwKBgQCK8w+jIOAXRB2NAZ66PbaXRqD5rTg2cUguwmpRsNVDiqTw+DJI
YO+4enoMhspDROeofWlHqGzD/j/8KwN59ys4ILV6YXCNoWltmd17HD/luHCDAyUU
6VOrSqCEF7jnnXtktmvWy+kEUevPiW7kyspIQ8GjzDXmVZvpGZIwDyOGFQKBgGtS
l3PiDFimjnQuRbIDc86pPA8VL6dLpvpbWNVFNtY9abSEU6RvldTATGs0+RCaXZ9U
NtGjTnyMHtCsOZE4nx+zikQbiNOzNR/9QwQZMN1Csc+3R7HBjEEsqhmc92aYjArf
ndqnXeFPee/gD1svRkeTpTWt2U146UJBfrqrRilJAoGAQp7FtEtps5I9xK92AVpD
Hj2p1JNKzLCRtWQ8j4jthKqR0iTQ9SwQyjiAvcKc7HdMaG11gmr5XbmKAzelVC+f
o9kEwoumo8yHVn5Ztp4F2cxaD6+MzSJ/I6WesPyePUD7sPeorXByg1UNOXyzqDub
/aU4/sNo2f8epM9l7QGiCtY=
-----END PRIVATE KEY-----
"""))
                            .configVersion(2L)
                            .homeRegion("us-ashburn-1")
                            .logsConfig(
                                new OCILogsConfig()
                                    .compartmentTagFilters(
                                        Arrays.asList("datadog:true", "env:prod"))
                                    .enabled(true)
                                    .enabledServices(
                                        Collections.singletonList("oacnativeproduction")))
                            .metricsConfig(
                                new OCIMetricsConfig()
                                    .compartmentTagFilters(
                                        Arrays.asList("datadog:true", "env:prod"))
                                    .enabled(true)
                                    .excludedServices(Collections.singletonList("oci_compute")))
                            .resourceCollectionEnabled(true)
                            .userOcid("ocid1.user.test"))
                    .id("ocid1.tenancy.dummy_value")
                    .type(CreateTenancyConfigDataType.OCI_TENANCY));

    try {
      TenancyConfig result = apiInstance.createTenancyConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OciIntegrationApi#createTenancyConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
