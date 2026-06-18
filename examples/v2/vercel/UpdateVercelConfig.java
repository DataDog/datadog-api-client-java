// Update Vercel configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.VercelApi;
import com.datadog.api.client.v2.model.VercelApiKey;
import com.datadog.api.client.v2.model.VercelConfigAttributes;
import com.datadog.api.client.v2.model.VercelEnvironment;
import com.datadog.api.client.v2.model.VercelLogSource;
import com.datadog.api.client.v2.model.VercelLogsConfig;
import com.datadog.api.client.v2.model.VercelTraceConfig;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    VercelApi apiInstance = new VercelApi(defaultClient);

    VercelConfigAttributes body =
        new VercelConfigAttributes()
            .apiKey(new VercelApiKey().id("00000000-0000-0000-0000-000000000001").value(""))
            .logsConfig(
                new VercelLogsConfig()
                    .enabled(true)
                    .environments(Collections.singletonList(VercelEnvironment.PRODUCTION))
                    .logSources(Collections.singletonList(VercelLogSource.LAMBDA))
                    .samplingPercentage(100))
            .traceConfig(
                new VercelTraceConfig()
                    .enabled(true)
                    .isDeprecatedOtel(false)
                    .samplingPercentage(100));

    try {
      apiInstance.updateVercelConfig("icfg_abc123", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling VercelApi#updateVercelConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
