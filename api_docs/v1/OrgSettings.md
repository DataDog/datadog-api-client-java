

# OrgSettings

A JSON array of settings.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privateWidgetShare** | **Boolean** | Whether or not the organization users can share widgets outside of Datadog. |  [optional]
**saml** | [**OrgSettingsSaml**](OrgSettingsSaml.md) |  |  [optional]
**samlAutocreateAccessRole** | [**AccessRole**](AccessRole.md) |  |  [optional]
**samlAutocreateUsersDomains** | [**OrgSettingsSamlAutocreateUsersDomains**](OrgSettingsSamlAutocreateUsersDomains.md) |  |  [optional]
**samlCanBeEnabled** | **Boolean** | Whether or not SAML can be enabled for this organization. |  [optional]
**samlIdpEndpoint** | **String** | Identity provider endpoint for SAML authentication. |  [optional]
**samlIdpInitiatedLogin** | [**OrgSettingsSamlIdpInitiatedLogin**](OrgSettingsSamlIdpInitiatedLogin.md) |  |  [optional]
**samlIdpMetadataUploaded** | **Boolean** | Whether or not a SAML identity provider metadata file was provided to the Datadog organization. |  [optional]
**samlLoginUrl** | **String** | URL for SAML loging. |  [optional]
**samlStrictMode** | [**OrgSettingsSamlIdpInitiatedLogin**](OrgSettingsSamlIdpInitiatedLogin.md) |  |  [optional]



