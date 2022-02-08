# AuthNMappingAttributes

Attributes of AuthN Mapping.

## Properties

| Name                         | Type               | Description                                                                         | Notes                 |
| ---------------------------- | ------------------ | ----------------------------------------------------------------------------------- | --------------------- |
| **attributeKey**             | **String**         | Key portion of a key/value pair of the attribute sent from the Identity Provider.   | [optional]            |
| **attributeValue**           | **String**         | Value portion of a key/value pair of the attribute sent from the Identity Provider. | [optional]            |
| **createdAt**                | **OffsetDateTime** | Creation time of the AuthN Mapping.                                                 | [optional] [readonly] |
| **modifiedAt**               | **OffsetDateTime** | Time of last AuthN Mapping modification.                                            | [optional] [readonly] |
| **samlAssertionAttributeId** | **Integer**        | The ID of the SAML assertion attribute.                                             | [optional]            |
