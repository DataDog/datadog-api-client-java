# UsageCWSHour

Cloud Workload Security usage for a given organization for a given hour.

## Properties

| Name                  | Type               | Description                                                                                                                | Notes      |
| --------------------- | ------------------ | -------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **cwsContainerCount** | **Long**           | The total number of Cloud Workload Security container hours from the start of the given hour’s month until the given hour. | [optional] |
| **cwsHostCount**      | **Long**           | The total number of Cloud Workload Security host hours from the start of the given hour’s month until the given hour.      | [optional] |
| **hour**              | **OffsetDateTime** | The hour for the usage.                                                                                                    | [optional] |
| **orgName**           | **String**         | The organization name.                                                                                                     | [optional] |
| **publicId**          | **String**         | The organization public ID.                                                                                                | [optional] |
