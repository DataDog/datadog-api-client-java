# Widget

Information about widget. **Note**: The `layout` property is required for widgets in dashboards with `free` `layout_type`. For the **new dashboard layout**, the `layout` property depends on the `reflow_type` of the dashboard. - If `reflow_type` is `fixed`, `layout` is required. - If `reflow_type` is `auto`, `layout` should not be set.

## Properties

| Name           | Type                                        | Description       | Notes      |
| -------------- | ------------------------------------------- | ----------------- | ---------- |
| **definition** | [**WidgetDefinition**](WidgetDefinition.md) |                   |
| **id**         | **Long**                                    | ID of the widget. | [optional] |
| **layout**     | [**WidgetLayout**](WidgetLayout.md)         |                   | [optional] |
