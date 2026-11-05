// Update a GCP Action Connection with a versioned AWS Secrets Manager reference

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.ActionConnectionAWSSecretsManager;
import com.datadog.api.client.v2.model.ActionConnectionAWSSecretsManagerReference;
import com.datadog.api.client.v2.model.ActionConnectionAWSSecretsManagerType;
import com.datadog.api.client.v2.model.ActionConnectionAttributesUpdate;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionDataUpdate;
import com.datadog.api.client.v2.model.ActionConnectionIntegrationUpdate;
import com.datadog.api.client.v2.model.GCPCredentialsUpdate;
import com.datadog.api.client.v2.model.GCPIntegrationType;
import com.datadog.api.client.v2.model.GCPIntegrationUpdate;
import com.datadog.api.client.v2.model.GCPServiceAccountCredentialType;
import com.datadog.api.client.v2.model.GCPServiceAccountUpdate;
import com.datadog.api.client.v2.model.GCPServiceAccountUpdatePrivateKey;
import com.datadog.api.client.v2.model.GCPServiceAccountUpdateServiceAccountEmail;
import com.datadog.api.client.v2.model.UpdateActionConnectionRequest;
import com.datadog.api.client.v2.model.UpdateActionConnectionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    // there is a valid "gcp_action_connection" in the system
    String GCP_ACTION_CONNECTION_DATA_ID = System.getenv("GCP_ACTION_CONNECTION_DATA_ID");

    // there is a valid "action_connection" in the system
    String ACTION_CONNECTION_DATA_ID = System.getenv("ACTION_CONNECTION_DATA_ID");

    UpdateActionConnectionRequest body =
        new UpdateActionConnectionRequest()
            .data(
                new ActionConnectionDataUpdate()
                    .type(ActionConnectionDataType.ACTION_CONNECTION)
                    .attributes(
                        new ActionConnectionAttributesUpdate()
                            .externalSecretsManager(
                                new ActionConnectionAWSSecretsManager()
                                    .type(ActionConnectionAWSSecretsManagerType.AWS_SECRETS_MANAGER)
                                    .connectionId(ACTION_CONNECTION_DATA_ID)
                                    .region("us-east-1"))
                            .integration(
                                new ActionConnectionIntegrationUpdate(
                                    new GCPIntegrationUpdate()
                                        .type(GCPIntegrationType.GCP)
                                        .credentials(
                                            new GCPCredentialsUpdate(
                                                new GCPServiceAccountUpdate()
                                                    .type(
                                                        GCPServiceAccountCredentialType
                                                            .GCPSERVICEACCOUNT)
                                                    .privateKey(
                                                        new GCPServiceAccountUpdatePrivateKey(
                                                            new ActionConnectionAWSSecretsManagerReference()
                                                                .type(
                                                                    ActionConnectionAWSSecretsManagerType
                                                                        .AWS_SECRETS_MANAGER)
                                                                .secretId(
                                                                    "example/gcp/service-account")
                                                                .key("private_key")
                                                                .versionStage("AWSCURRENT")))
                                                    .serviceAccountEmail(
                                                        new GCPServiceAccountUpdateServiceAccountEmail(
                                                            new ActionConnectionAWSSecretsManagerReference()
                                                                .type(
                                                                    ActionConnectionAWSSecretsManagerType
                                                                        .AWS_SECRETS_MANAGER)
                                                                .secretId(
                                                                    "example/gcp/service-account")
                                                                .key("client_email")))))))));

    try {
      UpdateActionConnectionResponse result =
          apiInstance.updateActionConnection(GCP_ACTION_CONNECTION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#updateActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
