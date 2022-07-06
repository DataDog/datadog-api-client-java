/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Holds search results. */
@JsonPropertyOrder({
  MonitorSearchResult.JSON_PROPERTY_CLASSIFICATION,
  MonitorSearchResult.JSON_PROPERTY_CREATOR,
  MonitorSearchResult.JSON_PROPERTY_ID,
  MonitorSearchResult.JSON_PROPERTY_LAST_TRIGGERED_TS,
  MonitorSearchResult.JSON_PROPERTY_METRICS,
  MonitorSearchResult.JSON_PROPERTY_NAME,
  MonitorSearchResult.JSON_PROPERTY_NOTIFICATIONS,
  MonitorSearchResult.JSON_PROPERTY_ORG_ID,
  MonitorSearchResult.JSON_PROPERTY_QUERY,
  MonitorSearchResult.JSON_PROPERTY_SCOPES,
  MonitorSearchResult.JSON_PROPERTY_STATUS,
  MonitorSearchResult.JSON_PROPERTY_TAGS,
  MonitorSearchResult.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorSearchResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLASSIFICATION = "classification";
  private String classification;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Creator creator;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_LAST_TRIGGERED_TS = "last_triggered_ts";
  private JsonNullable<Long> lastTriggeredTs = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<String> metrics = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<MonitorSearchResultNotification> notifications = null;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private List<String> scopes = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private MonitorOverallStates status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MonitorType type;

  /**
   * Classification of the monitor.
   *
   * @return classification
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClassification() {
    return classification;
  }

  /**
   * Object describing the creator of the shared element.
   *
   * @return creator
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Creator getCreator() {
    return creator;
  }

  /**
   * ID of the monitor.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }

  /**
   * Latest timestamp the monitor triggered.
   *
   * @return lastTriggeredTs
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Long getLastTriggeredTs() {

    if (lastTriggeredTs == null) {
      lastTriggeredTs = JsonNullable.<Long>undefined();
    }
    return lastTriggeredTs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_TRIGGERED_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLastTriggeredTs_JsonNullable() {
    return lastTriggeredTs;
  }

  @JsonProperty(JSON_PROPERTY_LAST_TRIGGERED_TS)
  private void setLastTriggeredTs_JsonNullable(JsonNullable<Long> lastTriggeredTs) {
    this.lastTriggeredTs = lastTriggeredTs;
  }

  /**
   * Metrics used by the monitor.
   *
   * @return metrics
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMetrics() {
    return metrics;
  }

  /**
   * The monitor name.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  /**
   * The notification triggered by the monitor.
   *
   * @return notifications
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorSearchResultNotification> getNotifications() {
    return notifications;
  }

  /**
   * The ID of the organization.
   *
   * @return orgId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOrgId() {
    return orgId;
  }

  public MonitorSearchResult query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The monitor query.
   *
   * @return query
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public MonitorSearchResult scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public MonitorSearchResult addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * The scope(s) to which the downtime applies, for example <code>host:app2</code>. Provide
   * multiple scopes as a comma-separated list, for example <code>env:dev,env:prod</code>. The
   * resulting downtime applies to sources that matches ALL provided scopes (that is <code>
   * env:dev AND env:prod</code>), NOT any of them.
   *
   * @return scopes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  /**
   * The different states your monitor can be in.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorOverallStates getStatus() {
    return status;
  }

  /**
   * Tags associated with the monitor.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public MonitorSearchResult type(MonitorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the monitor. For more information about <code>type</code>, see the <a
   * href="https://docs.datadoghq.com/monitors/guide/monitor_api_options/">monitor options</a> docs.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorType getType() {
    return type;
  }

  public void setType(MonitorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this MonitorSearchResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorSearchResult monitorSearchResult = (MonitorSearchResult) o;
    return Objects.equals(this.classification, monitorSearchResult.classification)
        && Objects.equals(this.creator, monitorSearchResult.creator)
        && Objects.equals(this.id, monitorSearchResult.id)
        && Objects.equals(this.lastTriggeredTs, monitorSearchResult.lastTriggeredTs)
        && Objects.equals(this.metrics, monitorSearchResult.metrics)
        && Objects.equals(this.name, monitorSearchResult.name)
        && Objects.equals(this.notifications, monitorSearchResult.notifications)
        && Objects.equals(this.orgId, monitorSearchResult.orgId)
        && Objects.equals(this.query, monitorSearchResult.query)
        && Objects.equals(this.scopes, monitorSearchResult.scopes)
        && Objects.equals(this.status, monitorSearchResult.status)
        && Objects.equals(this.tags, monitorSearchResult.tags)
        && Objects.equals(this.type, monitorSearchResult.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        classification,
        creator,
        id,
        lastTriggeredTs,
        metrics,
        name,
        notifications,
        orgId,
        query,
        scopes,
        status,
        tags,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorSearchResult {\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastTriggeredTs: ").append(toIndentedString(lastTriggeredTs)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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
