# DashboardListItem

A dashboard within a list.

## Properties

| Name           | Type                      | Description                                       | Notes                 |
| -------------- | ------------------------- | ------------------------------------------------- | --------------------- |
| **author**     | [**Creator**](Creator.md) |                                                   | [optional]            |
| **created**    | **OffsetDateTime**        | Date of creation of the dashboard.                | [optional] [readonly] |
| **icon**       | **String**                | URL to the icon of the dashboard.                 | [optional] [readonly] |
| **id**         | **String**                | ID of the dashboard.                              |
| **isFavorite** | **Boolean**               | Whether or not the dashboard is in the favorites. | [optional] [readonly] |
| **isReadOnly** | **Boolean**               | Whether or not the dashboard is read only.        | [optional] [readonly] |
| **isShared**   | **Boolean**               | Whether the dashboard is publicly shared or not.  | [optional] [readonly] |
| **modified**   | **OffsetDateTime**        | Date of last edition of the dashboard.            | [optional] [readonly] |
| **popularity** | **Integer**               | Popularity of the dashboard.                      | [optional] [readonly] |
| **title**      | **String**                | Title of the dashboard.                           | [optional] [readonly] |
| **type**       | **DashboardType**         |                                                   |
| **url**        | **String**                | URL path to the dashboard.                        | [optional] [readonly] |
