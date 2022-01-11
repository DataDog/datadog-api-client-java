# MonthlyUsageAttributionBody

Usage Summary by tag for a given organization.

## Properties

| Name                | Type                                                                  | Description                                                                                                                                                                                             | Notes      |
| ------------------- | --------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **month**           | **OffsetDateTime**                                                    | Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM].                                                                                                                                          | [optional] |
| **orgName**         | **String**                                                            | The name of the organization.                                                                                                                                                                           | [optional] |
| **publicId**        | **String**                                                            | The organization public ID.                                                                                                                                                                             | [optional] |
| **tagConfigSource** | **String**                                                            | The source of the usage attribution tag configuration and the selected tags in the format &#x60;&lt;source_org_name&gt;:&lt;selected tag 1&gt;///&lt;selected tag 2&gt;///&lt;selected tag 3&gt;&#x60;. | [optional] |
| **tags**            | **Map&lt;String, List&lt;String&gt;&gt;**                             | Usage Summary by tag name.                                                                                                                                                                              | [optional] |
| **updatedAt**       | **OffsetDateTime**                                                    | Datetime of the most recent update to the usage values.                                                                                                                                                 | [optional] |
| **values**          | [**MonthlyUsageAttributionValues**](MonthlyUsageAttributionValues.md) |                                                                                                                                                                                                         | [optional] |
