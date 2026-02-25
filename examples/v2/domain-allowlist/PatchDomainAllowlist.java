// Sets Domain Allowlist returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DomainAllowlistApi;
import com.datadog.api.client.v2.model.DomainAllowlistResponse;
import com.datadog.api.client.v2.model.DomainAllowlist;
import com.datadog.api.client.v2.model.DomainAllowlistAttributes;
import com.datadog.api.client.v2.model.DomainAllowlistRequest;
import com.datadog.api.client.v2.model.DomainAllowlistType;
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
    DomainAllowlistApi apiInstance = new DomainAllowlistApi(defaultClient);

    DomainAllowlistRequest body = new DomainAllowlistRequest()
.data(new DomainAllowlist()
.attributes(new DomainAllowlistAttributes()
.domains(Collections.singletonList("@static-test-domain.test"))
.enabled(false))
.type(DomainAllowlistType.DOMAIN_ALLOWLIST));

    try {
      DomainAllowlistResponse result = apiInstance.patchDomainAllowlist(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAllowlistApi#patchDomainAllowlist");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}