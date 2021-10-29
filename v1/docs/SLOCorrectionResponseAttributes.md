

# SLOCorrectionResponseAttributes

The attribute object associated with the SLO correction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **SLOCorrectionCategory** |  |  [optional]
**creator** | [**Creator**](Creator.md) |  |  [optional]
**description** | **String** | Description of the correction being made. |  [optional]
**duration** | **Long** | Length of time (in seconds) for a specified &#x60;rrule&#x60; recurring SLO correction. |  [optional]
**end** | **Long** | Ending time of the correction in epoch seconds. |  [optional]
**rrule** | **String** | Recurrence rules as defined in the iCalendar RFC 5545. |  [optional]
**sloId** | **String** | ID of the SLO that this correction will be applied to. |  [optional]
**start** | **Long** | Starting time of the correction in epoch seconds. |  [optional]
**timezone** | **String** | The timezone to display in the UI for the correction times (defaults to \&quot;UTC\&quot;). |  [optional]



