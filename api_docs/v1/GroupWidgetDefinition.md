# GroupWidgetDefinition

The groups widget allows you to keep similar graphs together on your timeboard. Each group has a custom header, can hold one to many graphs, and is collapsible.

## Properties

| Name                | Type                                | Description                                        | Notes      |
| ------------------- | ----------------------------------- | -------------------------------------------------- | ---------- |
| **backgroundColor** | **String**                          | Background color of the group title.               | [optional] |
| **bannerImg**       | **String**                          | URL of image to display as a banner for the group. | [optional] |
| **layoutType**      | **WidgetLayoutType**                |                                                    |
| **showTitle**       | **Boolean**                         | Whether to show the title or not.                  | [optional] |
| **title**           | **String**                          | Title of the widget.                               | [optional] |
| **titleAlign**      | **WidgetTextAlign**                 |                                                    | [optional] |
| **type**            | **GroupWidgetDefinitionType**       |                                                    |
| **widgets**         | [**List&lt;Widget&gt;**](Widget.md) | List of widget groups.                             |
