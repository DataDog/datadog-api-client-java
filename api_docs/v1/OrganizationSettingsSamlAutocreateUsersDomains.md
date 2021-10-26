# OrganizationSettingsSamlAutocreateUsersDomains

Has two properties, `enabled` (boolean) and `domains`, which is a list of domains without the @ symbol.

## Properties

| Name        | Type                   | Description                                                                 | Notes      |
| ----------- | ---------------------- | --------------------------------------------------------------------------- | ---------- |
| **domains** | **List&lt;String&gt;** | List of domains where the SAML automated user creation is enabled.          | [optional] |
| **enabled** | **Boolean**            | Whether or not the automated user creation based on SAML domain is enabled. | [optional] |
