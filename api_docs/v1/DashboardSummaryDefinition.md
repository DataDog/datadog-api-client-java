# DashboardSummaryDefinition

Dashboard definition.

## Properties

| Name             | Type                    | Description                                                                                      | Notes      |
| ---------------- | ----------------------- | ------------------------------------------------------------------------------------------------ | ---------- |
| **authorHandle** | **String**              | Identifier of the dashboard author.                                                              | [optional] |
| **createdAt**    | **OffsetDateTime**      | Creation date of the dashboard.                                                                  | [optional] |
| **description**  | **String**              | Description of the dashboard.                                                                    | [optional] |
| **id**           | **String**              | Dashboard identifier.                                                                            | [optional] |
| **isReadOnly**   | **Boolean**             | Whether this dashboard is read-only. If True, only the author and admins can make changes to it. | [optional] |
| **layoutType**   | **DashboardLayoutType** |                                                                                                  | [optional] |
| **modifiedAt**   | **OffsetDateTime**      | Modification date of the dashboard.                                                              | [optional] |
| **title**        | **String**              | Title of the dashboard.                                                                          | [optional] |
| **url**          | **String**              | URL of the dashboard.                                                                            | [optional] |
