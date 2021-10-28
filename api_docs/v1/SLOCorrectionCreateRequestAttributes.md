# SLOCorrectionCreateRequestAttributes

The attribute object associated with the SLO correction to be created.

## Properties

| Name            | Type                      | Description                                                                                 | Notes      |
| --------------- | ------------------------- | ------------------------------------------------------------------------------------------- | ---------- |
| **category**    | **SLOCorrectionCategory** |                                                                                             |
| **description** | **String**                | Description of the correction being made.                                                   | [optional] |
| **duration**    | **Long**                  | Length of time (in seconds) for a specified &#x60;rrule&#x60; recurring SLO correction.     | [optional] |
| **end**         | **Long**                  | Ending time of the correction in epoch seconds.                                             | [optional] |
| **rrule**       | **String**                | Recurrence rules as defined in the iCalendar RFC 5545.                                      | [optional] |
| **sloId**       | **String**                | ID of the SLO that this correction will be applied to.                                      |
| **start**       | **Long**                  | Starting time of the correction in epoch seconds.                                           |
| **timezone**    | **String**                | The timezone to display in the UI for the correction times (defaults to \&quot;UTC\&quot;). | [optional] |
