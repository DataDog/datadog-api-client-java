# UsageCloudSecurityPostureManagementHour

Cloud Security Posture Management usage for a given organization for a given hour.

## Properties

| Name                    | Type               | Description                                                                                   | Notes      |
| ----------------------- | ------------------ | --------------------------------------------------------------------------------------------- | ---------- |
| **aasHostCount**        | **Double**         | The number of Cloud Security Posture Management Azure app services hosts during a given hour. | [optional] |
| **azureHostCount**      | **Double**         | The number of Cloud Security Posture Management Azure hosts during a given hour.              | [optional] |
| **complianceHostCount** | **Double**         | The number of Cloud Security Posture Management hosts during a given hour.                    | [optional] |
| **containerCount**      | **Double**         | The total number of Cloud Security Posture Management containers during a given hour.         | [optional] |
| **hostCount**           | **Double**         | The total number of Cloud Security Posture Management hosts during a given hour.              | [optional] |
| **hour**                | **OffsetDateTime** | The hour for the usage.                                                                       | [optional] |
| **orgName**             | **String**         | The organization name.                                                                        | [optional] |
| **publicId**            | **String**         | The organization public ID.                                                                   | [optional] |
