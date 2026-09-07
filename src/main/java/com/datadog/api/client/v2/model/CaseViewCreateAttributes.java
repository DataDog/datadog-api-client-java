/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes required to create a case view. */
@JsonPropertyOrder({
  CaseViewCreateAttributes.JSON_PROPERTY_NAME,
  CaseViewCreateAttributes.JSON_PROPERTY_NP_RULE_ID,
  CaseViewCreateAttributes.JSON_PROPERTY_PROJECT_ID,
  CaseViewCreateAttributes.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseViewCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NP_RULE_ID = "np_rule_id";
  private String npRuleId;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public CaseViewCreateAttributes() {}

  @JsonCreator
  public CaseViewCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.name = name;
    this.projectId = projectId;
    this.query = query;
  }

  public CaseViewCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the view.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CaseViewCreateAttributes npRuleId(String npRuleId) {
    this.npRuleId = npRuleId;
    return this;
  }

  /**
   * The identifier of a notification rule linked to this view. When set, users subscribed to the
   * view receive alerts for matching cases.
   *
   * @return npRuleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NP_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNpRuleId() {
    return npRuleId;
  }

  public void setNpRuleId(String npRuleId) {
    this.npRuleId = npRuleId;
  }

  public CaseViewCreateAttributes projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The UUID of the project this view belongs to. Views are scoped to a single project.
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public CaseViewCreateAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query used to filter cases in this view.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
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
   * @return CaseViewCreateAttributes
   */
  @JsonAnySetter
  public CaseViewCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseViewCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseViewCreateAttributes caseViewCreateAttributes = (CaseViewCreateAttributes) o;
    return Objects.equals(this.name, caseViewCreateAttributes.name)
        && Objects.equals(this.npRuleId, caseViewCreateAttributes.npRuleId)
        && Objects.equals(this.projectId, caseViewCreateAttributes.projectId)
        && Objects.equals(this.query, caseViewCreateAttributes.query)
        && Objects.equals(this.additionalProperties, caseViewCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, npRuleId, projectId, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseViewCreateAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    npRuleId: ").append(toIndentedString(npRuleId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
