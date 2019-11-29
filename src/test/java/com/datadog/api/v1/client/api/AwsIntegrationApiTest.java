/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.AWSAccount;
import com.datadog.api.v1.client.model.AWSAccountCreateResponse;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/**
 * API tests for AwsIntegrationApi
 */
public class AwsIntegrationApiTest extends V1ApiTest  {

    private static AwsIntegrationApi api;
    private static LinkedHashSet<AWSAccount> accountsToDelete;

    @BeforeClass
    public static void initApi() {
        api = new AwsIntegrationApi(generalApiClient);
        accountsToDelete = new LinkedHashSet<AWSAccount>();
    }

    @After
    public void removeAccounts() throws ApiException {
        for (AWSAccount account: accountsToDelete) {
            api.deleteAWSAccount(account).execute();
        }
    }

    public void assertAccountIn(AWSAccount accountToAssert, List<AWSAccount> accounts) {
        for(AWSAccount account: accounts) {
            if(account.getAccountId().equals(accountToAssert.getAccountId())) {
                assertEquals(account.getRoleName(), accountToAssert.getRoleName());
                assertEquals(account.getFilterTags(), accountToAssert.getFilterTags());
                assertEquals(account.getAccountSpecificNamespaceRules(), accountToAssert.getAccountSpecificNamespaceRules());
                assertEquals(account.getHostTags(), accountToAssert.getHostTags());
                return;
            }
        }
        fail(String.format("Unable to find account %v in list %v", accountToAssert, accounts));
    }

    /**
     * Create an AWS Account
     *
     * ### Overview Create the AWS Account with the provided values * **&#x60;account_id&#x60;** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS   integration to learn more about your AWS account ID. * **&#x60;role_name&#x60;** [*required*]: Your Datadog role delegation name. For more information about you   AWS account Role name, see the Datadog AWS integration configuration info. * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: If your AWS account is a GovCloud or   China account, enter the corresponding Access Key ID. * **&#x60;filter_tags&#x60;** [*optional*, *default* &#x3D; **None**]: The array of EC2 tags (in the form key:value)   defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?   (for single characters) and * (for multiple characters) can also be used. Only hosts that match one   of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given   tag can also be excluded by adding ! before the tag.   e.x. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,   see the AWS tagging documentation * **&#x60;host_tags&#x60;** [*optional*, *default* &#x3D; **None**]: Array of tags (in the form key:value) to add   to all hosts and metrics reporting through this integration. * **&#x60;account_specific_namespace_rules&#x60;** [*optional*, *default* &#x3D; **None**]: An object (in the form   {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for   specific AWS namespaces for this AWS account only. A list of namespaces can be found at the   /v1/integration/aws/available_namespace_rules endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAWSAccountTest() throws ApiException {
        //Test Creating an AWS Account with just the account_id and role_name
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setAccountId("java_8234563");
        awsAccount.setRoleName("java_testRoleName");

        AWSAccountCreateResponse createResponse = api.createAWSAccount(awsAccount).execute();
        accountsToDelete.add(awsAccount);
        assertNotNull(createResponse.getExternalId());

        //Test Creating an AWS account with all the optional fields too
        AWSAccount awsAccountFull = new AWSAccount();
        Map<String, Boolean> accountSpecificNamespaceRules = new HashMap<String, Boolean>();
        List<String> hostTags = new ArrayList<String>();
        hostTags.add("javaTag:one");
        hostTags.add("java:success");
        accountSpecificNamespaceRules.put("api_gateway", true);
        awsAccountFull.setAccountId("java_1234568");
        awsAccountFull.setRoleName("java_testRoleName");
        awsAccountFull.setHostTags(hostTags);
        awsAccountFull.addFilterTagsItem("dontCollect:java");
        awsAccountFull.setAccountSpecificNamespaceRules(accountSpecificNamespaceRules);
        AWSAccountCreateResponse createResponse2 = api.createAWSAccount(awsAccountFull).execute();
        accountsToDelete.add(awsAccount);
        assertNotNull(createResponse2.getExternalId());
    }

    /**
     * Create an AWS Account with a missing account id
     * Expected to throw an API Exception
     *
     * ### Overview Create the AWS Account with the provided values * **&#x60;account_id&#x60;** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS   integration to learn more about your AWS account ID. * **&#x60;role_name&#x60;** [*required*]: Your Datadog role delegation name. For more information about you   AWS account Role name, see the Datadog AWS integration configuration info. * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: If your AWS account is a GovCloud or   China account, enter the corresponding Access Key ID. * **&#x60;filter_tags&#x60;** [*optional*, *default* &#x3D; **None**]: The array of EC2 tags (in the form key:value)   defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?   (for single characters) and * (for multiple characters) can also be used. Only hosts that match one   of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given   tag can also be excluded by adding ! before the tag.   e.x. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,   see the AWS tagging documentation * **&#x60;host_tags&#x60;** [*optional*, *default* &#x3D; **None**]: Array of tags (in the form key:value) to add   to all hosts and metrics reporting through this integration. * **&#x60;account_specific_namespace_rules&#x60;** [*optional*, *default* &#x3D; **None**]: An object (in the form   {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for   specific AWS namespaces for this AWS account only. A list of namespaces can be found at the   /v1/integration/aws/available_namespace_rules endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test(expected = ApiException.class)
    public void createAWSAccountMissingIDTest() throws ApiException {
        //Test an exception is thrown if you're missing the account_id field
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setRoleName("java_testRoleName");
        api.createAWSAccount(awsAccount).execute();
    }

    /**
     * Create an AWS Account with a missing role name
     * Expected to throw an API Exception
     *
     * ### Overview Create the AWS Account with the provided values * **&#x60;account_id&#x60;** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS   integration to learn more about your AWS account ID. * **&#x60;role_name&#x60;** [*required*]: Your Datadog role delegation name. For more information about you   AWS account Role name, see the Datadog AWS integration configuration info. * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: If your AWS account is a GovCloud or   China account, enter the corresponding Access Key ID. * **&#x60;filter_tags&#x60;** [*optional*, *default* &#x3D; **None**]: The array of EC2 tags (in the form key:value)   defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?   (for single characters) and * (for multiple characters) can also be used. Only hosts that match one   of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given   tag can also be excluded by adding ! before the tag.   e.x. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,   see the AWS tagging documentation * **&#x60;host_tags&#x60;** [*optional*, *default* &#x3D; **None**]: Array of tags (in the form key:value) to add   to all hosts and metrics reporting through this integration. * **&#x60;account_specific_namespace_rules&#x60;** [*optional*, *default* &#x3D; **None**]: An object (in the form   {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for   specific AWS namespaces for this AWS account only. A list of namespaces can be found at the   /v1/integration/aws/available_namespace_rules endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test(expected = ApiException.class)
    public void createAWSAccountMissingRoleNameTest() throws ApiException {
        //Test an exception is thrown if you're missing the role_name field
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setAccountId("java_1234569");
        api.createAWSAccount(awsAccount).execute();
    }

    /**
     * Get Installed AWS Accounts
     *
     * ### Overview Get All Installed AWS Accounts ### ARGUMENTS * **&#x60;account_id&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this account_id.&#39; * **&#x60;role_name&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this role_name.&#39; * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this access_key_id.&#39;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAWSAccountsTest() throws ApiException {
        List<AWSAccount> awsAccounts = new ArrayList<AWSAccount>();
        Map<String, Boolean> accountSpecificNamespaceRules = new HashMap<String, Boolean>();
        List<String> hostTags = new ArrayList<String>();

        accountSpecificNamespaceRules.put("api_gateway", false);
        hostTags.add("java_test_tag:value");

        for (int i=0; i<5; i++) {
            awsAccounts.add(new AWSAccount());
            awsAccounts.get(i).setAccountId(String.format("java_923456%s", i));
            awsAccounts.get(i).setRoleName(String.format("Java Client Role Name_%s", i));
            awsAccounts.get(i).addFilterTagsItem("dontCollect:java");
            awsAccounts.get(i).setHostTags(hostTags);
            awsAccounts.get(i).setAccountSpecificNamespaceRules(accountSpecificNamespaceRules);
            api.createAWSAccount(awsAccounts.get(i)).execute();
            accountsToDelete.add(awsAccounts.get(i));
        }

        List<AWSAccount> awsAllAccounts = api.getAllAWSAccounts().execute().getAccounts();
        assertTrue(awsAllAccounts.size() >= 5);
        for (AWSAccount account: awsAccounts) {
            assertAccountIn(account, awsAllAccounts);
        }
    }

    /**
     * Update an AWS Account
     *
     * ### Overview Update the AWS Account based on the provided values ### ARGUMENTS * **&#x60;account_id&#x60;** [*required if role_name is specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this account_id.&#39; * **&#x60;role_name&#x60;** [*required if account_id is specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this role_name.&#39; * **&#x60;access_key_id&#x60;** [*required if none of the other two options are specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this access_key_id.&#39;  ### Payload * **&#x60;account_id&#x60;** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS   integration to learn more about your AWS account ID. * **&#x60;role_name&#x60;** [*required*]: Your Datadog role delegation name. For more information about you   AWS account Role name, see the Datadog AWS integration configuration info. * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: If your AWS account is a GovCloud or   China account, enter the corresponding Access Key ID. * **&#x60;filter_tags&#x60;** [*optional*, *default* &#x3D; **None**]: The array of EC2 tags (in the form key:value)   defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?   (for single characters) and * (for multiple characters) can also be used. Only hosts that match one   of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given   tag can also be excluded by adding ! before the tag.   e.x. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,   see the AWS tagging documentation * **&#x60;host_tags&#x60;** [*optional*, *default* &#x3D; **None**]: Array of tags (in the form key:value) to add   to all hosts and metrics reporting through this integration. * **&#x60;account_specific_namespace_rules&#x60;** [*optional*, *default* &#x3D; **None**]: An object (in the form   {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for   specific AWS namespaces for this AWS account only. A list of namespaces can be found at the   /v1/integration/aws/available_namespace_rules endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAWSAccountTest() throws ApiException {
        // Object response = api.updateAWSAccount(awSAccount);
        AWSAccount awsAccount = new AWSAccount();
        awsAccount.setAccountId("java_1234565");
        awsAccount.setRoleName("java_testRoleName");

        api.createAWSAccount(awsAccount).execute();
        accountsToDelete.add(awsAccount);

        List<String> hostTags = new ArrayList<String>();
        hostTags.add("javaTag:one");
        hostTags.add("java:success");
        awsAccount.setHostTags(hostTags);

        api.updateAWSAccount(awsAccount).accountId(awsAccount.getAccountId()).roleName(awsAccount.getRoleName()).execute();

        AWSAccount newAccount = api.getAllAWSAccounts().accountId(awsAccount.getAccountId()).roleName(awsAccount.getRoleName()).execute().getAccounts().get(0);
        // collection fields are intialized to null on the objects, but returned as empty list/map by API
        awsAccount.setAccountSpecificNamespaceRules(new HashMap<String, Boolean>());
        awsAccount.setFilterTags(new ArrayList<String>());
        assertEquals(awsAccount, newAccount);
    }

}
