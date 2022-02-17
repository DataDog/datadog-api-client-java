# UsageLogsByRetentionHour

The number of indexed logs for each hour for a given organization broken down by retention period.

## Properties

| Name                             | Type       | Description                                                                          | Notes      |
| -------------------------------- | ---------- | ------------------------------------------------------------------------------------ | ---------- |
| **indexedEventsCount**           | **Long**   | Total logs indexed with this retention period during a given hour.                   | [optional] |
| **liveIndexedEventsCount**       | **Long**   | Live logs indexed with this retention period during a given hour.                    | [optional] |
| **orgName**                      | **String** | The organization name.                                                               | [optional] |
| **publicId**                     | **String** | The organization public ID.                                                          | [optional] |
| **rehydratedIndexedEventsCount** | **Long**   | Rehydrated logs indexed with this retention period during a given hour.              | [optional] |
| **retention**                    | **String** | The retention period in days or \&quot;custom\&quot; for all custom retention usage. | [optional] |
