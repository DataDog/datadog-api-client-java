# RoleAttributes

Attributes of the role.

## Properties

| Name           | Type               | Description                                                                           | Notes                 |
| -------------- | ------------------ | ------------------------------------------------------------------------------------- | --------------------- |
| **createdAt**  | **OffsetDateTime** | Creation time of the role.                                                            | [optional] [readonly] |
| **modifiedAt** | **OffsetDateTime** | Time of last role modification.                                                       | [optional] [readonly] |
| **name**       | **String**         | The name of the role. The name is neither unique nor a stable identifier of the role. | [optional]            |
| **userCount**  | **Long**           | Number of users with that role.                                                       | [optional] [readonly] |
