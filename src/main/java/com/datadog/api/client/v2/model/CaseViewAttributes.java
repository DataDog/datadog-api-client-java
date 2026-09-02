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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a case view, including the filter query and optional notification rule. */
@JsonPropertyOrder({
  CaseViewAttributes.JSON_PROPERTY_CREATED_AT,
  CaseViewAttributes.JSON_PROPERTY_MODIFIED_AT,
  CaseViewAttributes.JSON_PROPERTY_NAME,
  CaseViewAttributes.JSON_PROPERTY_NP_RULE_ID,
  CaseViewAttributes.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseViewAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NP_RULE_ID = "np_rule_id";
  private String npRuleId;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public CaseViewAttributes() {}

  @JsonCreator
  public CaseViewAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.createdAt = createdAt;
    this.name = name;
    this.query = query;
  }

  /**
   * Timestamp when the view was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Timestamp when the view was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public CaseViewAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-readable name for the view, displayed in the Case Management UI.
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

  public CaseViewAttributes npRuleId(String npRuleId) {
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

  public CaseViewAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The search query that determines which cases appear in this view. Uses the same syntax as the
   * Case Management search bar (for example, <code>status:open priority:P1</code>).
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
   * @return CaseViewAttributes
   */
  @JsonAnySetter
  public CaseViewAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseViewAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseViewAttributes caseViewAttributes = (CaseViewAttributes) o;
    return Objects.equals(this.createdAt, caseViewAttributes.createdAt)
        && Objects.equals(this.modifiedAt, caseViewAttributes.modifiedAt)
        && Objects.equals(this.name, caseViewAttributes.name)
        && Objects.equals(this.npRuleId, caseViewAttributes.npRuleId)
        && Objects.equals(this.query, caseViewAttributes.query)
        && Objects.equals(this.additionalProperties, caseViewAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, modifiedAt, name, npRuleId, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseViewAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    npRuleId: ").append(toIndentedString(npRuleId)).append("\n");
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
