# UsageFargateHour

Number of Fargate tasks run and hourly usage.

## Properties

| Name                        | Type               | Description                                            | Notes      |
| --------------------------- | ------------------ | ------------------------------------------------------ | ---------- |
| **avgProfiledFargateTasks** | **Long**           | The average profiled task count for Fargate Profiling. | [optional] |
| **hour**                    | **OffsetDateTime** | The hour for the usage.                                | [optional] |
| **orgName**                 | **String**         | The organization name.                                 | [optional] |
| **publicId**                | **String**         | The organization public ID.                            | [optional] |
| **tasksCount**              | **Long**           | The number of Fargate tasks run.                       | [optional] |
