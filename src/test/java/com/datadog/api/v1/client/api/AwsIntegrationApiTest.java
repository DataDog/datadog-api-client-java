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
import com.datadog.api.v1.client.model.AWSAccountListResponse;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error404;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AwsIntegrationApi
 */
@Ignore
public class AwsIntegrationApiTest {

    private final AwsIntegrationApi api = new AwsIntegrationApi();

    
    /**
     * Create an AWS Account
     *
     * ### Overview Create the AWS Account with the provided values ### Arguments * **&#x60;account_id&#x60;** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS   integration to learn more about your AWS account ID.  * **&#x60;role_name&#x60;** [*required*]: Your Datadog role delegation name. For more information about you   AWS account Role name, see the Datadog AWS integration configuration info.  * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: If your AWS account is a GovCloud or   China account, enter the corresponding Access Key ID.  * **&#x60;filter_tags&#x60;** [*optional*, *default* &#x3D; **None**]: The array of EC2 tags (in the form key:value)   defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?   (for single characters) and * (for multiple characters) can also be used. Only hosts that match one   of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given   tag can also be excluded by adding ! before the tag.   e.x. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,   see the AWS tagging documentation  * **&#x60;host_tags&#x60;** [*optional*, *default* &#x3D; **None**]: Array of tags (in the form key:value) to add   to all hosts and metrics reporting through this integration.  * **&#x60;account_specific_namespace_rules&#x60;** [*optional*, *default* &#x3D; **None**]: An object (in the form   {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for   specific AWS namespaces for this AWS account only. A list of namespaces can be found at the   /v1/integration/aws/available_namespace_rules endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAWSAccountTest() throws ApiException {
        AWSAccount awSAccount = null;
        AWSAccountCreateResponse response = api.createAWSAccount(awSAccount);

        // TODO: test validations
    }
    
    /**
     * Delete an AWS Account
     *
     * ### Overview Delete the AWS Account matching the specified account_id and role_name parameters ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Delete the AWS account that   matches this account_id.  * **&#x60;role_name&#x60;** [*required*, *default* &#x3D; **None**]: Delete the AWS account that   matches this role_name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAWSAccountTest() throws ApiException {
        AWSAccount awSAccount = null;
        Object response = api.deleteAWSAccount(awSAccount);

        // TODO: test validations
    }
    
    /**
     * Get Installed AWS Accounts
     *
     * ### Overview Get All Installed AWS Accounts ### Arguments * **&#x60;account_id&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this account_id.  * **&#x60;role_name&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this role_name.  * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this access_key_id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAWSAccountsTest() throws ApiException {
        String accountId = null;
        String roleName = null;
        String accessKeyId = null;
        AWSAccountListResponse response = api.getAllAWSAccounts(accountId, roleName, accessKeyId);

        // TODO: test validations
    }
    
    /**
     * Update an AWS Account
     *
     * ### Overview Update the AWS Account based on the provided values ### Arguments * **&#x60;account_id&#x60;** [*required if role_name is specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this account_id.  * **&#x60;role_name&#x60;** [*required if account_id is specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this role_name.  * **&#x60;access_key_id&#x60;** [*required if none of the other two options are specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this access_key_id.  ### Payload * **&#x60;account_id&#x60;** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS   integration to learn more about your AWS account ID.  * **&#x60;role_name&#x60;** [*required*]: Your Datadog role delegation name. For more information about you   AWS account Role name, see the Datadog AWS integration configuration info.  * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: If your AWS account is a GovCloud or   China account, enter the corresponding Access Key ID.  * **&#x60;filter_tags&#x60;** [*optional*, *default* &#x3D; **None**]: The array of EC2 tags (in the form key:value)   defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?   (for single characters) and * (for multiple characters) can also be used. Only hosts that match one   of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given   tag can also be excluded by adding ! before the tag.   e.g. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,   see the AWS tagging documentation.  * **&#x60;host_tags&#x60;** [*optional*, *default* &#x3D; **None**]: Array of tags (in the form key:value) to add   to all hosts and metrics reporting through this integration.  * **&#x60;account_specific_namespace_rules&#x60;** [*optional*, *default* &#x3D; **None**]: An object (in the form   {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for   specific AWS namespaces for this AWS account only. A list of namespaces can be found at the   /v1/integration/aws/available_namespace_rules endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAWSAccountTest() throws ApiException {
        AWSAccount awSAccount = null;
        String accountId = null;
        String roleName = null;
        String accessKeyId = null;
        Object response = api.updateAWSAccount(awSAccount, accountId, roleName, accessKeyId);

        // TODO: test validations
    }
    
}
