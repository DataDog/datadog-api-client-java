/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  UnifiedIssueStreamQuery.JSON_PROPERTY_ASSIGNEE_UUIDS,
  UnifiedIssueStreamQuery.JSON_PROPERTY_CODE_GEN_FIX_STATES,
  UnifiedIssueStreamQuery.JSON_PROPERTY_CROSS_ORG_UUIDS,
  UnifiedIssueStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  UnifiedIssueStreamQuery.JSON_PROPERTY_INDEXES,
  UnifiedIssueStreamQuery.JSON_PROPERTY_INVESTIGATION,
  UnifiedIssueStreamQuery.JSON_PROPERTY_MUTED,
  UnifiedIssueStreamQuery.JSON_PROPERTY_PERSONA,
  UnifiedIssueStreamQuery.JSON_PROPERTY_QUERY_STRING,
  UnifiedIssueStreamQuery.JSON_PROPERTY_SORT,
  UnifiedIssueStreamQuery.JSON_PROPERTY_STATES,
  UnifiedIssueStreamQuery.JSON_PROPERTY_SUSPECTED_CAUSES,
  UnifiedIssueStreamQuery.JSON_PROPERTY_TEAM_HANDLES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UnifiedIssueStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE_UUIDS = "assignee_uuids";
  private List<String> assigneeUuids = null;

  public static final String JSON_PROPERTY_CODE_GEN_FIX_STATES = "code_gen_fix_states";
  private List<String> codeGenFixStates = null;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private UnifiedIssueStreamQueryDataSource dataSource;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_INVESTIGATION = "investigation";
  private UnifiedIssueStreamQueryInvestigation investigation;

  public static final String JSON_PROPERTY_MUTED = "muted";
  private Boolean muted;

  public static final String JSON_PROPERTY_PERSONA = "persona";
  private IssueStreamPersona persona;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private IssueStreamSort sort;

  public static final String JSON_PROPERTY_STATES = "states";
  private List<IssueStreamState> states = null;

  public static final String JSON_PROPERTY_SUSPECTED_CAUSES = "suspected_causes";
  private List<String> suspectedCauses = null;

  public static final String JSON_PROPERTY_TEAM_HANDLES = "team_handles";
  private List<String> teamHandles = null;

  public UnifiedIssueStreamQuery() {}

  @JsonCreator
  public UnifiedIssueStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          UnifiedIssueStreamQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public UnifiedIssueStreamQuery assigneeUuids(List<String> assigneeUuids) {
    this.assigneeUuids = assigneeUuids;
    return this;
  }

  public UnifiedIssueStreamQuery addAssigneeUuidsItem(String assigneeUuidsItem) {
    if (this.assigneeUuids == null) {
      this.assigneeUuids = new ArrayList<>();
    }
    this.assigneeUuids.add(assigneeUuidsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public UnifiedIssueStreamQuery codeGenFixStates(List<String> codeGenFixStates) {
    this.codeGenFixStates = codeGenFixStates;
    return this;
  }

  public UnifiedIssueStreamQuery addCodeGenFixStatesItem(String codeGenFixStatesItem) {
    if (this.codeGenFixStates == null) {
      this.codeGenFixStates = new ArrayList<>();
    }
    this.codeGenFixStates.add(codeGenFixStatesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return codeGenFixStates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_GEN_FIX_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCodeGenFixStates() {
    return codeGenFixStates;
  }

  public void setCodeGenFixStates(List<String> codeGenFixStates) {
    this.codeGenFixStates = codeGenFixStates;
  }

  public UnifiedIssueStreamQuery crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public UnifiedIssueStreamQuery addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return crossOrgUuids
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_ORG_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCrossOrgUuids() {
    return crossOrgUuids;
  }

  public void setCrossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
  }

  public UnifiedIssueStreamQuery dataSource(UnifiedIssueStreamQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UnifiedIssueStreamQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(UnifiedIssueStreamQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public UnifiedIssueStreamQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public UnifiedIssueStreamQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public UnifiedIssueStreamQuery investigation(UnifiedIssueStreamQueryInvestigation investigation) {
    this.investigation = investigation;
    this.unparsed |= investigation.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return investigation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVESTIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UnifiedIssueStreamQueryInvestigation getInvestigation() {
    return investigation;
  }

  public void setInvestigation(UnifiedIssueStreamQueryInvestigation investigation) {
    this.investigation = investigation;
    if (investigation != null) {
      this.unparsed |= investigation.unparsed;
    }
  }

  public UnifiedIssueStreamQuery muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return muted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  public UnifiedIssueStreamQuery persona(IssueStreamPersona persona) {
    this.persona = persona;
    this.unparsed |= !persona.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return persona
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERSONA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssueStreamPersona getPersona() {
    return persona;
  }

  public void setPersona(IssueStreamPersona persona) {
    if (!persona.isValid()) {
      this.unparsed = true;
    }
    this.persona = persona;
  }

  public UnifiedIssueStreamQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public UnifiedIssueStreamQuery sort(IssueStreamSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssueStreamSort getSort() {
    return sort;
  }

  public void setSort(IssueStreamSort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public UnifiedIssueStreamQuery states(List<IssueStreamState> states) {
    this.states = states;
    return this;
  }

  public UnifiedIssueStreamQuery addStatesItem(IssueStreamState statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    this.unparsed |= !statesItem.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return states
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IssueStreamState> getStates() {
    return states;
  }

  public void setStates(List<IssueStreamState> states) {
    this.states = states;
  }

  public UnifiedIssueStreamQuery suspectedCauses(List<String> suspectedCauses) {
    this.suspectedCauses = suspectedCauses;
    return this;
  }

  public UnifiedIssueStreamQuery addSuspectedCausesItem(String suspectedCausesItem) {
    if (this.suspectedCauses == null) {
      this.suspectedCauses = new ArrayList<>();
    }
    this.suspectedCauses.add(suspectedCausesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public UnifiedIssueStreamQuery teamHandles(List<String> teamHandles) {
    this.teamHandles = teamHandles;
    return this;
  }

  public UnifiedIssueStreamQuery addTeamHandlesItem(String teamHandlesItem) {
    if (this.teamHandles == null) {
      this.teamHandles = new ArrayList<>();
    }
    this.teamHandles.add(teamHandlesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  /** Return true if this UnifiedIssueStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnifiedIssueStreamQuery unifiedIssueStreamQuery = (UnifiedIssueStreamQuery) o;
    return Objects.equals(this.assigneeUuids, unifiedIssueStreamQuery.assigneeUuids)
        && Objects.equals(this.codeGenFixStates, unifiedIssueStreamQuery.codeGenFixStates)
        && Objects.equals(this.crossOrgUuids, unifiedIssueStreamQuery.crossOrgUuids)
        && Objects.equals(this.dataSource, unifiedIssueStreamQuery.dataSource)
        && Objects.equals(this.indexes, unifiedIssueStreamQuery.indexes)
        && Objects.equals(this.investigation, unifiedIssueStreamQuery.investigation)
        && Objects.equals(this.muted, unifiedIssueStreamQuery.muted)
        && Objects.equals(this.persona, unifiedIssueStreamQuery.persona)
        && Objects.equals(this.queryString, unifiedIssueStreamQuery.queryString)
        && Objects.equals(this.sort, unifiedIssueStreamQuery.sort)
        && Objects.equals(this.states, unifiedIssueStreamQuery.states)
        && Objects.equals(this.suspectedCauses, unifiedIssueStreamQuery.suspectedCauses)
        && Objects.equals(this.teamHandles, unifiedIssueStreamQuery.teamHandles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assigneeUuids,
        codeGenFixStates,
        crossOrgUuids,
        dataSource,
        indexes,
        investigation,
        muted,
        persona,
        queryString,
        sort,
        states,
        suspectedCauses,
        teamHandles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnifiedIssueStreamQuery {\n");
    sb.append("    assigneeUuids: ").append(toIndentedString(assigneeUuids)).append("\n");
    sb.append("    codeGenFixStates: ").append(toIndentedString(codeGenFixStates)).append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    investigation: ").append(toIndentedString(investigation)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    suspectedCauses: ").append(toIndentedString(suspectedCauses)).append("\n");
    sb.append("    teamHandles: ").append(toIndentedString(teamHandles)).append("\n");
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
