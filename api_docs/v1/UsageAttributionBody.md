

# UsageAttributionBody

Usage Summary by tag usage for a given organization.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**month** | [**OffsetDateTime**](OffsetDateTime.md) | Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM]. |  [optional]
**publicId** | **String** | The organization public ID. |  [optional]
**tags** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Usage Summary by tag names. |  [optional]
**updatedAt** | **String** | Shows the the most recent hour in the current months for all organizations for which all usages were calculated. |  [optional]
**values** | [**UsageAttributionValues**](UsageAttributionValues.md) |  |  [optional]



