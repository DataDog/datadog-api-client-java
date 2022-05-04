// Upload IdP metadata returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.OrganizationsApi;
import com.datadog.api.v2.client.api.OrganizationsApi.UploadIdPMetadataOptionalParameters;
import java.io.File;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    try {
      apiInstance.uploadIdPMetadata(
          new UploadIdPMetadataOptionalParameters()
              .idpFile(
                  new File("fixtures/organizations/saml_configurations/valid_idp_metadata.xml")));
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#uploadIdPMetadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
