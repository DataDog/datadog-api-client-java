# UsageRumSessionsHour

Number of RUM Sessions recorded for each hour for a given organization.

## Properties

| Name                    | Type               | Description                                                                                        | Notes      |
| ----------------------- | ------------------ | -------------------------------------------------------------------------------------------------- | ---------- |
| **hour**                | **OffsetDateTime** | The hour for the usage.                                                                            | [optional] |
| **orgName**             | **String**         | The organization name.                                                                             | [optional] |
| **publicId**            | **String**         | The organization public ID.                                                                        | [optional] |
| **sessionCount**        | **Long**           | Contains the number of RUM Sessions.                                                               | [optional] |
| **sessionCountAndroid** | **Long**           | Contains the number of mobile RUM Sessions on Android (data available beginning December 1, 2020). | [optional] |
| **sessionCountIos**     | **Long**           | Contains the number of mobile RUM Sessions on iOS (data available beginning December 1, 2020).     | [optional] |
