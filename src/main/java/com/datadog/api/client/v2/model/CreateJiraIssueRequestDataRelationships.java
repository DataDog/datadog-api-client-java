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

/** Relationships of the Jira issue to create. */
@JsonPropertyOrder({CreateJiraIssueRequestDataRelationships.JSON_PROPERTY_CASE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateJiraIssueRequestDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASE = "case";
  private CreateJiraIssueRequestDataRelationshipsCase _case;

  public CreateJiraIssueRequestDataRelationships() {}

  @JsonCreator
  public CreateJiraIssueRequestDataRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_CASE)
          CreateJiraIssueRequestDataRelationshipsCase _case) {
    this._case = _case;
    this.unparsed |= _case.unparsed;
  }

  public CreateJiraIssueRequestDataRelationships _case(
      CreateJiraIssueRequestDataRelationshipsCase _case) {
    this._case = _case;
    this.unparsed |= _case.unparsed;
    return this;
  }

  /**
   * Case linked to the Jira issue.
   *
   * @return _case
   */
  @JsonProperty(JSON_PROPERTY_CASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CreateJiraIssueRequestDataRelationshipsCase getCase() {
    return _case;
  }

  public void setCase(CreateJiraIssueRequestDataRelationshipsCase _case) {
    this._case = _case;
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
   * @return CreateJiraIssueRequestDataRelationships
   */
  @JsonAnySetter
  public CreateJiraIssueRequestDataRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateJiraIssueRequestDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateJiraIssueRequestDataRelationships createJiraIssueRequestDataRelationships =
        (CreateJiraIssueRequestDataRelationships) o;
    return Objects.equals(this._case, createJiraIssueRequestDataRelationships._case)
        && Objects.equals(
            this.additionalProperties,
            createJiraIssueRequestDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_case, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateJiraIssueRequestDataRelationships {\n");
    sb.append("    _case: ").append(toIndentedString(_case)).append("\n");
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
