/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.GCPAccount;
import org.junit.*;
import static org.junit.Assert.*;


import java.util.List;

/**
 * API tests for GcpIntegrationApi
 */
public class GcpIntegrationApiTest extends V1ApiTest {

    private static GcpIntegrationApi api;
    private static GCPAccount uniqueGCPAccount = new GCPAccount();
    private static GCPAccount uniqueUpdateGCPAccount = new GCPAccount();

    @BeforeClass
    public static void initAPI() {
        api = new GcpIntegrationApi(generalApiClient);
    }

    @Before
    public void setupGCPAccounts() {
        String uniqueProjectID = String.format("go_test-%07d", (now.toInstant().toEpochMilli()) % 10000000);

        uniqueGCPAccount.setProjectId(uniqueProjectID);
        uniqueGCPAccount.setType("service_account");
        uniqueGCPAccount.setPrivateKeyId("fake_private_key_id");
        uniqueGCPAccount.setPrivateKey("fake_key");
        uniqueGCPAccount.setClientEmail("api-test@fake-sandbox.iam.gserviceaccount.com");
        uniqueGCPAccount.setClientId("123456712345671234567");
        uniqueGCPAccount.setAuthUri("fake_uri");
        uniqueGCPAccount.setTokenUri("fake_uri");
        uniqueGCPAccount.setAuthProviderX509CertUrl("fake_uri");
        uniqueGCPAccount.setClientX509CertUrl("fake_uri");
        uniqueGCPAccount.setHostFilters("fake:tag,example:test");
        uniqueGCPAccount.setAutomute(false);

        uniqueUpdateGCPAccount.setProjectId(uniqueProjectID);
        uniqueUpdateGCPAccount.setClientEmail(uniqueGCPAccount.getClientEmail());
        uniqueUpdateGCPAccount.setHostFilters("fake:update,example:update");
        uniqueUpdateGCPAccount.setAutomute(true);
    }

    @After
    public void cleanup() {
        try {
            api.deleteGCPIntegration().body(uniqueGCPAccount).execute();
        } catch (ApiException e) {
            System.out.printf("Couldn't uninstall GCP account %s, may have been removed as part of another test", uniqueGCPAccount);
            e.printStackTrace();
        }
        try {
            api.deleteGCPIntegration().body(uniqueUpdateGCPAccount).execute();
        } catch (ApiException e) {
            System.out.printf("Couldn't uninstall GCP account %s, may have been removed as part of another test", uniqueUpdateGCPAccount);
            e.printStackTrace();
        }
    }

    /**
     * Add a GCP integration to your Datadog account.
     *
     * ### Overview Create a Datadog-GCP integration. ### Arguments * **&#x60;type&#x60;** [*required*, *default* &#x3D; **None**]: The value for service_account found in your JSON service account key. * **&#x60;project_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Google Cloud project ID found in your JSON service account key. * **&#x60;private_key_id&#x60;** [*required*, *default* &#x3D; **None**]: Your private key ID found in your JSON service account key. * **&#x60;private_key&#x60;** [*required*, *default* &#x3D; **None**]: Your private key name found in your JSON service account key. * **&#x60;client_email&#x60;** [*required*, *default* &#x3D; **None**]: Your email found in your JSON service account key. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your ID found in your JSON service account key. * **&#x60;auth_uri&#x60;** [*required*, *default* &#x3D; **None**]: Should be https://accounts.google.com/o/oauth2/auth. * **&#x60;token_uri&#x60;** [*required*, *default* &#x3D; **None**]: Should be https://accounts.google.com/o/oauth2/token. * **&#x60;auth_provider_x509_cert_url&#x60;** [*required*, *default* &#x3D; **None**]: Should be https://www.googleapis.com/oauth2/v1/certs. * **&#x60;client_x509_cert_url&#x60;** [*required*, *default* &#x3D; **None**]: Should be https://www.googleapis.com/robot/v1/metadata/x509/&lt;CLIENT_EMAIL&gt; where &lt;CLIENT_EMAIL&gt; is the email found in your JSON service account key. * **&#x60;host_filters&#x60;** [*optional*, *default* &#x3D; **None**]: Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog. * **&#x60;automute&#x60;** [*optional*, *default* &#x3D; false]: Silence monitors for expected GCE instance shutdowns.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGCPIntegrationTest() throws ApiException {
        Object response = api.createGCPIntegration().body(uniqueGCPAccount).execute();
        assertEquals(response, new java.util.LinkedHashMap<>());
    }
    
    /**
     * List and Delete a GCP Integration from your Datadog account.
     *
     * ### Overview Delete a given Datadog-GCP integration. ### Arguments * **&#x60;project_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Google Cloud project ID to be deleted. * **&#x60;client_email&#x60;** [*required*, *default* &#x3D; **None**]: Your client email associated with the integration to be deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAndDeleteGCPIntegrationTest() throws ApiException {
        // Setup Gcp Account to List
        api.createGCPIntegration().body(uniqueGCPAccount).execute();

        List<GCPAccount> listAccounts = api.listGCPIntegration().execute();
        GCPAccount retrievedAccount = retrieveAccountInList(listAccounts, uniqueGCPAccount.getProjectId());

        assertEquals(retrievedAccount.getClientEmail(), uniqueGCPAccount.getClientEmail());
        assertEquals(retrievedAccount.getHostFilters(), uniqueGCPAccount.getHostFilters());
        // Assert returned list is greater than or equal to 1
        assertTrue(listAccounts.size() >= 1);

        // Test account deletion as well
        api.deleteGCPIntegration().body(uniqueGCPAccount).execute();
        listAccounts = api.listGCPIntegration().execute();
        retrievedAccount = retrieveAccountInList(listAccounts, uniqueGCPAccount.getProjectId());
        assertEquals(new GCPAccount(), retrievedAccount);
    }
    
    /**
     * Update a GCP integration in your Datadog account.
     *
     * ### Overview Update a Datadog-GCP integrations host_filters and/or automute. Requires a project_id and client_email, however these fields cannot be updated. If you need to update these fields please delete and use the create (POST) endpoint. The unspecified fields will keep their original values. ### Arguments * **&#x60;project_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Google Cloud project ID associated with the integration to be updated. * **&#x60;client_email&#x60;** [*required*, *default* &#x3D; **None**]: Your client email associated with the integration to be updated. * **&#x60;host_filters&#x60;** [*optional*, *default* &#x3D; **None**]: Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog. * **&#x60;automute&#x60;** [*optional*, *default* &#x3D; false]: Silence monitors for expected GCE instance shutdowns.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGCPIntegrationTest() throws ApiException {
        // Setup Gcp Account to Update
        api.createGCPIntegration().body(uniqueGCPAccount).execute();
        api.updateGCPIntegration().body(uniqueUpdateGCPAccount).execute();

        List<GCPAccount> listAccounts = api.listGCPIntegration().execute();
        GCPAccount retrievedAccount = retrieveAccountInList(listAccounts, uniqueUpdateGCPAccount.getProjectId());
        assertEquals(retrievedAccount.getAutomute(), true);
        assertEquals(retrievedAccount.getHostFilters(), uniqueUpdateGCPAccount.getHostFilters());
    }

    private GCPAccount retrieveAccountInList(List<GCPAccount> listAccounts, String projectID) {
        GCPAccount retrievedAccount = new GCPAccount();
        for (GCPAccount iterAccount: listAccounts) {
            if (iterAccount.getProjectId().equals(projectID)) {
                retrievedAccount = iterAccount;
            }
        }
        return retrievedAccount;
    }
    
}
