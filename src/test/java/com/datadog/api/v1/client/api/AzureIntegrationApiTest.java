/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.AzureAccount;
import org.junit.*;

import static org.junit.Assert.*;

import java.util.List;

/**
 * API tests for AzureIntegrationApi
 */
public class AzureIntegrationApiTest extends V1ApiTest {

    private static AzureIntegrationApi api;
    private static AzureAccount uniqueAzureAccount = new AzureAccount();
    private static AzureAccount uniqueUpdatedAzureAccount = new AzureAccount();
    private static AzureAccount uniqueUpdatedHostFilters = new AzureAccount();

    @BeforeClass
    public static void initApi() {
        api = new AzureIntegrationApi(generalApiClient);
    }

    @Before
    public void setupAzureAccounts() {
        String uniqueTenantName = String.format("java_test-%07d", (now.toInstant().toEpochMilli()) % 10000000);

        uniqueAzureAccount.setClientId("javatest-1234-5678-9101-3fcbf464test");
        uniqueAzureAccount.setClientSecret("testingx./Sw*g/Y33t..R1cH+hScMDt");
        uniqueAzureAccount.setTenantName(uniqueTenantName);

        uniqueUpdatedAzureAccount.setClientId(uniqueAzureAccount.getClientId());
        uniqueUpdatedAzureAccount.setTenantName(uniqueTenantName);
        uniqueUpdatedAzureAccount.setNewClientId("javatest-1234-5678-9101-3fcbf4update");
        uniqueUpdatedAzureAccount.setNewTenantName("javatest-1234-5678-9101-cc0073update");
        uniqueUpdatedAzureAccount.setHostFilters("filter:foo,test:bar");

        uniqueUpdatedHostFilters.setClientId(uniqueUpdatedAzureAccount.getNewClientId());
        uniqueUpdatedHostFilters.setTenantName(uniqueUpdatedAzureAccount.getNewTenantName());
        uniqueUpdatedHostFilters.setHostFilters("filter:updated,test:updated");
    }

    @After
    public void cleanup() {
        try {
            api.deleteAzureIntegration().body(uniqueAzureAccount).execute();
        } catch (ApiException e) {
            System.out.printf("Couldn't uninstall Azure account %s, may have been removed as part of another test", uniqueAzureAccount);
            e.printStackTrace();
        }
        // Delete Updated Azure Account too
        AzureAccount updatedAccount = new AzureAccount();
        updatedAccount.setClientId(uniqueUpdatedAzureAccount.getNewClientId());
        updatedAccount.setTenantName(uniqueUpdatedAzureAccount.getNewTenantName());
        try {
            api.deleteAzureIntegration().body(updatedAccount).execute();
        } catch (ApiException e) {
            System.out.printf("Couldn't uninstall Azure account %s, may have been removed as part of another test", updatedAccount);
            e.printStackTrace();
        }
    }

    /**
     * Add a Azure integration to your Datadog account.
     *
     * ### Overview Create a Datadog-Azure integration. ### Arguments * **&#x60;tenant_name&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure Active Directory ID. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure web application ID. * **&#x60;client_secret&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure web application secret key. * **&#x60;host_filters&#x60;** [*optional*, *default* &#x3D; **None**]: Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAzureIntegrationTest() throws ApiException {
        Object response = api.createAzureIntegration().body(uniqueAzureAccount).execute();
        assertEquals(response, new java.util.LinkedHashMap<>());
    }
    
    /**
     * List and Delete an Azure Integration from your Datadog account.
     *
     * ### Overview Delete a given Datadog-Azure integration. ### Arguments * **&#x60;tenant_name&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure Active Directory ID. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure web application ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAnddeleteAzureIntegrationTest() throws ApiException {
        // Setup Azure Account to List
        api.createAzureIntegration().body(uniqueAzureAccount).execute();

        List<AzureAccount> listAccounts = api.listAzureIntegration().execute();
        AzureAccount retrievedAccount;
        retrievedAccount = retrieveAccountInList(listAccounts, uniqueAzureAccount.getTenantName());
        assertEquals(uniqueAzureAccount.getClientId(), retrievedAccount.getClientId());
        assertEquals(uniqueAzureAccount.getTenantName(), retrievedAccount.getTenantName());
        assertTrue(listAccounts.size() >= 1);

        // Test account deletion as well
        api.deleteAzureIntegration().body(uniqueAzureAccount).execute();
        listAccounts = api.listAzureIntegration().execute();
        retrievedAccount = retrieveAccountInList(listAccounts, uniqueAzureAccount.getTenantName());
        assertEquals(new AzureAccount(), retrievedAccount);
    }
    
    /**
     * Update an Azure integration to your Datadog account.
     *
     * ### Overview Update an Datadog-Azure integration. Requires an existing tenant_name and client_id. Any other fields supplied will overwrite existing values. To overwrite tenant_name or client_id, use new_tenant_name and new_client_id. To leave a field unchanged, do not supply that field in the payload. ### Arguments * **&#x60;tenant_name&#x60;** [*required*, *default* &#x3D; **None**]: Your existing Azure Active Directory ID. * **&#x60;new_tenant_name&#x60;** [*optional*, *default* &#x3D; **None**]: Your new Azure Active Directory ID. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your existing Azure web application ID. * **&#x60;new_client_id&#x60;** [*optional*, *default* &#x3D; **None**]: Your new Azure web application ID. * **&#x60;client_secret&#x60;** [*optional*, *default* &#x3D; **None**]: Your Azure web application secret key. * **&#x60;host_filters&#x60;** [*optional*, *default* &#x3D; **None**]: Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAzureIntegrationTest() throws ApiException {
        // Create and update an account
        api.createAzureIntegration().body(uniqueAzureAccount).execute();
        api.updateAzureIntegration().body(uniqueUpdatedAzureAccount).execute();

        // List account to ensure update worked.
        List<AzureAccount> listAccounts = api.listAzureIntegration().execute();
        AzureAccount retrievedAccount;
        retrievedAccount = retrieveAccountInList(listAccounts, uniqueUpdatedAzureAccount.getNewTenantName());
        assertEquals(uniqueUpdatedAzureAccount.getNewClientId(), retrievedAccount.getClientId());
        assertEquals(uniqueUpdatedAzureAccount.getNewTenantName(), retrievedAccount.getTenantName());
        assertEquals(uniqueUpdatedAzureAccount.getHostFilters(), retrievedAccount.getHostFilters());

        // Test update host filters endpoint
        api.azureUpdateHostFilters().body(uniqueUpdatedHostFilters).execute();
        listAccounts = api.listAzureIntegration().execute();
        retrievedAccount = retrieveAccountInList(listAccounts, uniqueUpdatedHostFilters.getTenantName());
        assertEquals(uniqueUpdatedHostFilters.getHostFilters(), retrievedAccount.getHostFilters());
    }

    private AzureAccount retrieveAccountInList(List<AzureAccount> listAccounts, String tenantName) {
        AzureAccount retrievedAccount = new AzureAccount();
        for (AzureAccount iterAccount: listAccounts) {
            if (iterAccount.getTenantName().equals(tenantName)) {
                retrievedAccount = iterAccount;
            }
        }
        return retrievedAccount;
    }
}
