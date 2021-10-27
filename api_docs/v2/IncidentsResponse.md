# IncidentsResponse

Response with a list of incidents.

## Properties

| Name         | Type                                                                            | Description                                         | Notes                 |
| ------------ | ------------------------------------------------------------------------------- | --------------------------------------------------- | --------------------- |
| **data**     | [**List&lt;IncidentResponseData&gt;**](IncidentResponseData.md)                 | An array of incidents.                              |
| **included** | [**List&lt;IncidentResponseIncludedItem&gt;**](IncidentResponseIncludedItem.md) | Included related resources that the user requested. | [optional] [readonly] |
| **meta**     | [**IncidentServicesResponseMeta**](IncidentServicesResponseMeta.md)             |                                                     | [optional]            |
