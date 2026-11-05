// Create a GCP Action Connection with AWS Secrets Manager references

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.ActionConnectionAWSSecretsManager;
import com.datadog.api.client.v2.model.ActionConnectionAWSSecretsManagerReference;
import com.datadog.api.client.v2.model.ActionConnectionAWSSecretsManagerType;
import com.datadog.api.client.v2.model.ActionConnectionAttributes;
import com.datadog.api.client.v2.model.ActionConnectionData;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionIntegration;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;
import com.datadog.api.client.v2.model.GCPCredentials;
import com.datadog.api.client.v2.model.GCPIntegration;
import com.datadog.api.client.v2.model.GCPIntegrationType;
import com.datadog.api.client.v2.model.GCPServiceAccount;
import com.datadog.api.client.v2.model.GCPServiceAccountCredentialType;
import com.datadog.api.client.v2.model.GCPServiceAccountPrivateKey;
import com.datadog.api.client.v2.model.GCPServiceAccountServiceAccountEmail;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    // there is a valid "action_connection" in the system
    String ACTION_CONNECTION_DATA_ID = System.getenv("ACTION_CONNECTION_DATA_ID");

    CreateActionConnectionRequest body =
        new CreateActionConnectionRequest()
            .data(
                new ActionConnectionData()
                    .type(ActionConnectionDataType.ACTION_CONNECTION)
                    .attributes(
                        new ActionConnectionAttributes()
                            .name("GCP Secrets Manager Connection exampleactionconnection")
                            .externalSecretsManager(
                                new ActionConnectionAWSSecretsManager()
                                    .type(ActionConnectionAWSSecretsManagerType.AWS_SECRETS_MANAGER)
                                    .connectionId(ACTION_CONNECTION_DATA_ID)
                                    .region("us-east-1"))
                            .integration(
                                new ActionConnectionIntegration(
                                    new GCPIntegration()
                                        .type(GCPIntegrationType.GCP)
                                        .credentials(
                                            new GCPCredentials(
                                                new GCPServiceAccount()
                                                    .type(
                                                        GCPServiceAccountCredentialType
                                                            .GCPSERVICEACCOUNT)
                                                    .privateKey(
                                                        new GCPServiceAccountPrivateKey(
                                                            new ActionConnectionAWSSecretsManagerReference()
                                                                .type(
                                                                    ActionConnectionAWSSecretsManagerType
                                                                        .AWS_SECRETS_MANAGER)
                                                                .secretId(
                                                                    "example/gcp/service-account")
                                                                .key("private_key")))
                                                    .serviceAccountEmail(
                                                        new GCPServiceAccountServiceAccountEmail(
                                                            new ActionConnectionAWSSecretsManagerReference()
                                                                .type(
                                                                    ActionConnectionAWSSecretsManagerType
                                                                        .AWS_SECRETS_MANAGER)
                                                                .secretId(
                                                                    "example/gcp/service-account")
                                                                .key("client_email")))))))));

    try {
      CreateActionConnectionResponse result = apiInstance.createActionConnection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#createActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
