

# OrganizationSettings

A JSON array of settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privateWidgetShare** | **Boolean** | Whether or not the organization users can share widgets outside of Datadog. |  [optional]
**saml** | [**OrganizationSettingsSaml**](OrganizationSettingsSaml.md) |  |  [optional]
**samlAutocreateAccessRole** | **AccessRole** |  |  [optional]
**samlAutocreateUsersDomains** | [**OrganizationSettingsSamlAutocreateUsersDomains**](OrganizationSettingsSamlAutocreateUsersDomains.md) |  |  [optional]
**samlCanBeEnabled** | **Boolean** | Whether or not SAML can be enabled for this organization. |  [optional]
**samlIdpEndpoint** | **String** | Identity provider endpoint for SAML authentication. |  [optional]
**samlIdpInitiatedLogin** | [**OrganizationSettingsSamlIdpInitiatedLogin**](OrganizationSettingsSamlIdpInitiatedLogin.md) |  |  [optional]
**samlIdpMetadataUploaded** | **Boolean** | Whether or not a SAML identity provider metadata file was provided to the Datadog organization. |  [optional]
**samlLoginUrl** | **String** | URL for SAML logging. |  [optional]
**samlStrictMode** | [**OrganizationSettingsSamlStrictMode**](OrganizationSettingsSamlStrictMode.md) |  |  [optional]



