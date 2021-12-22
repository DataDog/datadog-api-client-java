# HourlyUsageAttributionBody

The usage for one set of tags for one hour.

## Properties

| Name                | Type                                      | Description                                                                                                                                                                                                  | Notes      |
| ------------------- | ----------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **hour**            | **OffsetDateTime**                        | The hour for the usage.                                                                                                                                                                                      | [optional] |
| **orgName**         | **String**                                | The name of the organization.                                                                                                                                                                                | [optional] |
| **publicId**        | **String**                                | The organization public ID.                                                                                                                                                                                  | [optional] |
| **tagConfigSource** | **String**                                | The source of the usage attribution tag configuration and the selected tags in the format of &#x60;&lt;source_org_name&gt;:::&lt;selected tag 1&gt;///&lt;selected tag 2&gt;///&lt;selected tag 3&gt;&#x60;. | [optional] |
| **tags**            | **Map&lt;String, List&lt;String&gt;&gt;** | Usage Summary by tag name.                                                                                                                                                                                   | [optional] |
| **totalUsageSum**   | **Double**                                | Total product usage for the given tags within the hour.                                                                                                                                                      | [optional] |
| **updatedAt**       | **String**                                | Shows the most recent hour in the current month for all organizations where usages are calculated.                                                                                                           | [optional] |
| **usageType**       | **HourlyUsageAttributionUsageType**       |                                                                                                                                                                                                              | [optional] |
