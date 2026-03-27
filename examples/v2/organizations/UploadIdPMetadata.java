// Upload IdP metadata returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.OrganizationsApi;
import com.datadog.api.client.v2.api.OrganizationsApi.UploadIdPMetadataOptionalParameters;
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
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    try {
      apiInstance.uploadIdPMetadata(new UploadIdPMetadataOptionalParameters().idpFile(new File("fixtures/organizations/saml_configurations/valid_idp_metadata.xml")));
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#uploadIdPMetadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}