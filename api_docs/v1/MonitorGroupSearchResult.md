# MonitorGroupSearchResult

A single monitor group search result.

## Properties

| Name                | Type                     | Description                                              | Notes                 |
| ------------------- | ------------------------ | -------------------------------------------------------- | --------------------- |
| **group**           | **String**               | The name of the group.                                   | [optional] [readonly] |
| **groupTags**       | **List&lt;String&gt;**   | The list of tags of the monitor group.                   | [optional] [readonly] |
| **lastNodataTs**    | **Long**                 | Latest timestamp the monitor group was in NO_DATA state. | [optional] [readonly] |
| **lastTriggeredTs** | **Long**                 | Latest timestamp the monitor group triggered.            | [optional] [readonly] |
| **monitorId**       | **Long**                 | The ID of the monitor.                                   | [optional] [readonly] |
| **monitorName**     | **String**               | The name of the monitor.                                 | [optional] [readonly] |
| **status**          | **MonitorOverallStates** |                                                          | [optional]            |
