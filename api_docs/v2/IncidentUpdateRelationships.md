# IncidentUpdateRelationships

The incident's relationships for an update request.

## Properties

| Name              | Type                                                                                            | Description | Notes      |
| ----------------- | ----------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **commanderUser** | [**NullableRelationshipToUser**](NullableRelationshipToUser.md)                                 |             | [optional] |
| **integrations**  | [**RelationshipToIncidentIntegrationMetadatas**](RelationshipToIncidentIntegrationMetadatas.md) |             | [optional] |
| **postmortem**    | [**RelationshipToIncidentPostmortem**](RelationshipToIncidentPostmortem.md)                     |             | [optional] |
