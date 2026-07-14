/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Updated list stream widget. */
@JsonPropertyOrder({
  ListStreamQuery.JSON_PROPERTY_ASSIGNEE_UUIDS,
  ListStreamQuery.JSON_PROPERTY_CLUSTERING_PATTERN_FIELD_PATH,
  ListStreamQuery.JSON_PROPERTY_COMPUTE,
  ListStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  ListStreamQuery.JSON_PROPERTY_EVENT_SIZE,
  ListStreamQuery.JSON_PROPERTY_GROUP_BY,
  ListStreamQuery.JSON_PROPERTY_INDEXES,
  ListStreamQuery.JSON_PROPERTY_PERSONA,
  ListStreamQuery.JSON_PROPERTY_QUERY_STRING,
  ListStreamQuery.JSON_PROPERTY_SORT,
  ListStreamQuery.JSON_PROPERTY_STATES,
  ListStreamQuery.JSON_PROPERTY_STORAGE,
  ListStreamQuery.JSON_PROPERTY_SUSPECTED_CAUSES,
  ListStreamQuery.JSON_PROPERTY_TEAM_HANDLES,
  ListStreamQuery.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE_UUIDS = "assignee_uuids";
  private List<String> assigneeUuids = null;

  public static final String JSON_PROPERTY_CLUSTERING_PATTERN_FIELD_PATH =
      "clustering_pattern_field_path";
  private String clusteringPatternFieldPath;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<ListStreamComputeItems> compute = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ListStreamSource dataSource = ListStreamSource.LOGS_STREAM;

  public static final String JSON_PROPERTY_EVENT_SIZE = "event_size";
  private WidgetEventSize eventSize;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<ListStreamGroupByItems> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_PERSONA = "persona";
  private ListStreamIssuePersona persona;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private WidgetFieldSort sort;

  public static final String JSON_PROPERTY_STATES = "states";
  private List<ListStreamIssueState> states = null;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private String storage;

  public static final String JSON_PROPERTY_SUSPECTED_CAUSES = "suspected_causes";
  private List<String> suspectedCauses = null;

  public static final String JSON_PROPERTY_TEAM_HANDLES = "team_handles";
  private List<String> teamHandles = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private ListStreamQueryVersion version;

  public ListStreamQuery() {}

  @JsonCreator
  public ListStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE) ListStreamSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public ListStreamQuery assigneeUuids(List<String> assigneeUuids) {
    this.assigneeUuids = assigneeUuids;
    return this;
  }

  public ListStreamQuery addAssigneeUuidsItem(String assigneeUuidsItem) {
    if (this.assigneeUuids == null) {
      this.assigneeUuids = new ArrayList<>();
    }
    this.assigneeUuids.add(assigneeUuidsItem);
    return this;
  }

  /**
   * Filter by assignee UUIDs. Usable only with <code>issue_stream</code>.
   *
   * @return assigneeUuids
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNEE_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAssigneeUuids() {
    return assigneeUuids;
  }

  public void setAssigneeUuids(List<String> assigneeUuids) {
    this.assigneeUuids = assigneeUuids;
  }

  public ListStreamQuery clusteringPatternFieldPath(String clusteringPatternFieldPath) {
    this.clusteringPatternFieldPath = clusteringPatternFieldPath;
    return this;
  }

  /**
   * Specifies the field for logs pattern clustering. Usable only with logs_pattern_stream.
   *
   * @return clusteringPatternFieldPath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTERING_PATTERN_FIELD_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClusteringPatternFieldPath() {
    return clusteringPatternFieldPath;
  }

  public void setClusteringPatternFieldPath(String clusteringPatternFieldPath) {
    this.clusteringPatternFieldPath = clusteringPatternFieldPath;
  }

  public ListStreamQuery compute(List<ListStreamComputeItems> compute) {
    this.compute = compute;
    if (compute != null) {
      for (ListStreamComputeItems item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ListStreamQuery addComputeItem(ListStreamComputeItems computeItem) {
    if (this.compute == null) {
      this.compute = new ArrayList<>();
    }
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * Compute configuration for the List Stream Widget. Compute can be used only with the
   * logs_transaction_stream (from 1 to 5 items) list stream source.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ListStreamComputeItems> getCompute() {
    return compute;
  }

  public void setCompute(List<ListStreamComputeItems> compute) {
    this.compute = compute;
    if (compute != null) {
      for (ListStreamComputeItems item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ListStreamQuery dataSource(ListStreamSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Source from which to query items to display in the stream. apm_issue_stream, rum_issue_stream,
   * and logs_issue_stream are deprecated. Use issue_stream instead.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ListStreamSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ListStreamSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ListStreamQuery eventSize(WidgetEventSize eventSize) {
    this.eventSize = eventSize;
    this.unparsed |= !eventSize.isValid();
    return this;
  }

  /**
   * Size to use to display an event.
   *
   * @return eventSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetEventSize getEventSize() {
    return eventSize;
  }

  public void setEventSize(WidgetEventSize eventSize) {
    if (!eventSize.isValid()) {
      this.unparsed = true;
    }
    this.eventSize = eventSize;
  }

  public ListStreamQuery groupBy(List<ListStreamGroupByItems> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (ListStreamGroupByItems item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ListStreamQuery addGroupByItem(ListStreamGroupByItems groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Group by configuration for the List Stream Widget. Group by can be used only with
   * logs_pattern_stream (up to 4 items) or logs_transaction_stream (one group by item is required)
   * list stream source.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ListStreamGroupByItems> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<ListStreamGroupByItems> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (ListStreamGroupByItems item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ListStreamQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public ListStreamQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * List of indexes.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public ListStreamQuery persona(ListStreamIssuePersona persona) {
    this.persona = persona;
    this.unparsed |= !persona.isValid();
    return this;
  }

  /**
   * Persona filter for the <code>issue_stream</code> data source.
   *
   * @return persona
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERSONA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ListStreamIssuePersona getPersona() {
    return persona;
  }

  public void setPersona(ListStreamIssuePersona persona) {
    if (!persona.isValid()) {
      this.unparsed = true;
    }
    this.persona = persona;
  }

  public ListStreamQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Widget query.
   *
   * @return queryString
   */
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public ListStreamQuery sort(WidgetFieldSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Which column and order to sort by
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetFieldSort getSort() {
    return sort;
  }

  public void setSort(WidgetFieldSort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public ListStreamQuery states(List<ListStreamIssueState> states) {
    this.states = states;
    return this;
  }

  public ListStreamQuery addStatesItem(ListStreamIssueState statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    this.unparsed |= !statesItem.isValid();
    return this;
  }

  /**
   * Filter by issue states. Usable only with <code>issue_stream</code>.
   *
   * @return states
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ListStreamIssueState> getStates() {
    return states;
  }

  public void setStates(List<ListStreamIssueState> states) {
    this.states = states;
  }

  public ListStreamQuery storage(String storage) {
    this.storage = storage;
    return this;
  }

  /**
   * Option for storage location. Feature in Private Beta.
   *
   * @return storage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  public ListStreamQuery suspectedCauses(List<String> suspectedCauses) {
    this.suspectedCauses = suspectedCauses;
    return this;
  }

  public ListStreamQuery addSuspectedCausesItem(String suspectedCausesItem) {
    if (this.suspectedCauses == null) {
      this.suspectedCauses = new ArrayList<>();
    }
    this.suspectedCauses.add(suspectedCausesItem);
    return this;
  }

  /**
   * Filter by suspected causes. Usable only with <code>issue_stream</code>.
   *
   * @return suspectedCauses
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUSPECTED_CAUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSuspectedCauses() {
    return suspectedCauses;
  }

  public void setSuspectedCauses(List<String> suspectedCauses) {
    this.suspectedCauses = suspectedCauses;
  }

  public ListStreamQuery teamHandles(List<String> teamHandles) {
    this.teamHandles = teamHandles;
    return this;
  }

  public ListStreamQuery addTeamHandlesItem(String teamHandlesItem) {
    if (this.teamHandles == null) {
      this.teamHandles = new ArrayList<>();
    }
    this.teamHandles.add(teamHandlesItem);
    return this;
  }

  /**
   * Filter by team handles. Usable only with <code>issue_stream</code>.
   *
   * @return teamHandles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_HANDLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTeamHandles() {
    return teamHandles;
  }

  public void setTeamHandles(List<String> teamHandles) {
    this.teamHandles = teamHandles;
  }

  public ListStreamQuery version(ListStreamQueryVersion version) {
    this.version = version;
    this.unparsed |= !version.isValid();
    return this;
  }

  /**
   * Version of the query for the logs transaction stream widget. When omitted, v1 query behavior is
   * preserved. Set to <code>sequential_query</code> to use v2 behavior. <strong>This feature is in
   * Preview.</strong>
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ListStreamQueryVersion getVersion() {
    return version;
  }

  public void setVersion(ListStreamQueryVersion version) {
    if (!version.isValid()) {
      this.unparsed = true;
    }
    this.version = version;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ListStreamQuery
   */
  @JsonAnySetter
  public ListStreamQuery putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this ListStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListStreamQuery listStreamQuery = (ListStreamQuery) o;
    return Objects.equals(this.assigneeUuids, listStreamQuery.assigneeUuids)
        && Objects.equals(
            this.clusteringPatternFieldPath, listStreamQuery.clusteringPatternFieldPath)
        && Objects.equals(this.compute, listStreamQuery.compute)
        && Objects.equals(this.dataSource, listStreamQuery.dataSource)
        && Objects.equals(this.eventSize, listStreamQuery.eventSize)
        && Objects.equals(this.groupBy, listStreamQuery.groupBy)
        && Objects.equals(this.indexes, listStreamQuery.indexes)
        && Objects.equals(this.persona, listStreamQuery.persona)
        && Objects.equals(this.queryString, listStreamQuery.queryString)
        && Objects.equals(this.sort, listStreamQuery.sort)
        && Objects.equals(this.states, listStreamQuery.states)
        && Objects.equals(this.storage, listStreamQuery.storage)
        && Objects.equals(this.suspectedCauses, listStreamQuery.suspectedCauses)
        && Objects.equals(this.teamHandles, listStreamQuery.teamHandles)
        && Objects.equals(this.version, listStreamQuery.version)
        && Objects.equals(this.additionalProperties, listStreamQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assigneeUuids,
        clusteringPatternFieldPath,
        compute,
        dataSource,
        eventSize,
        groupBy,
        indexes,
        persona,
        queryString,
        sort,
        states,
        storage,
        suspectedCauses,
        teamHandles,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListStreamQuery {\n");
    sb.append("    assigneeUuids: ").append(toIndentedString(assigneeUuids)).append("\n");
    sb.append("    clusteringPatternFieldPath: ")
        .append(toIndentedString(clusteringPatternFieldPath))
        .append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    eventSize: ").append(toIndentedString(eventSize)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    suspectedCauses: ").append(toIndentedString(suspectedCauses)).append("\n");
    sb.append("    teamHandles: ").append(toIndentedString(teamHandles)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
