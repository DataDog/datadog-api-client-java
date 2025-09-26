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

/** The definition of <code>CreateRulesetRequestDataAttributesRulesItemsQuery</code> object. */
@JsonPropertyOrder({
  CreateRulesetRequestDataAttributesRulesItemsQuery.JSON_PROPERTY_ADDITION,
  CreateRulesetRequestDataAttributesRulesItemsQuery.JSON_PROPERTY_CASE_INSENSITIVITY,
  CreateRulesetRequestDataAttributesRulesItemsQuery.JSON_PROPERTY_IF_NOT_EXISTS,
  CreateRulesetRequestDataAttributesRulesItemsQuery.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateRulesetRequestDataAttributesRulesItemsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITION = "addition";
  private CreateRulesetRequestDataAttributesRulesItemsQueryAddition addition;

  public static final String JSON_PROPERTY_CASE_INSENSITIVITY = "case_insensitivity";
  private Boolean caseInsensitivity;

  public static final String JSON_PROPERTY_IF_NOT_EXISTS = "if_not_exists";
  private Boolean ifNotExists;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public CreateRulesetRequestDataAttributesRulesItemsQuery() {}

  @JsonCreator
  public CreateRulesetRequestDataAttributesRulesItemsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_ADDITION)
          CreateRulesetRequestDataAttributesRulesItemsQueryAddition addition,
      @JsonProperty(required = true, value = JSON_PROPERTY_IF_NOT_EXISTS) Boolean ifNotExists,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.addition = addition;
    if (addition != null) {
      this.unparsed |= addition.unparsed;
    }
    this.ifNotExists = ifNotExists;
    this.query = query;
  }

  public CreateRulesetRequestDataAttributesRulesItemsQuery addition(
      CreateRulesetRequestDataAttributesRulesItemsQueryAddition addition) {
    this.addition = addition;
    if (addition != null) {
      this.unparsed |= addition.unparsed;
    }
    return this;
  }

  /**
   * The definition of <code>CreateRulesetRequestDataAttributesRulesItemsQueryAddition</code>
   * object.
   *
   * @return addition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CreateRulesetRequestDataAttributesRulesItemsQueryAddition getAddition() {
    return addition;
  }

  public void setAddition(CreateRulesetRequestDataAttributesRulesItemsQueryAddition addition) {
    this.addition = addition;
  }

  public CreateRulesetRequestDataAttributesRulesItemsQuery caseInsensitivity(
      Boolean caseInsensitivity) {
    this.caseInsensitivity = caseInsensitivity;
    return this;
  }

  /**
   * The <code>query</code> <code>case_insensitivity</code>.
   *
   * @return caseInsensitivity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CASE_INSENSITIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCaseInsensitivity() {
    return caseInsensitivity;
  }

  public void setCaseInsensitivity(Boolean caseInsensitivity) {
    this.caseInsensitivity = caseInsensitivity;
  }

  public CreateRulesetRequestDataAttributesRulesItemsQuery ifNotExists(Boolean ifNotExists) {
    this.ifNotExists = ifNotExists;
    return this;
  }

  /**
   * The <code>query</code> <code>if_not_exists</code>.
   *
   * @return ifNotExists
   */
  @JsonProperty(JSON_PROPERTY_IF_NOT_EXISTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIfNotExists() {
    return ifNotExists;
  }

  public void setIfNotExists(Boolean ifNotExists) {
    this.ifNotExists = ifNotExists;
  }

  public CreateRulesetRequestDataAttributesRulesItemsQuery query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The <code>query</code> <code>query</code>.
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
   * @return CreateRulesetRequestDataAttributesRulesItemsQuery
   */
  @JsonAnySetter
  public CreateRulesetRequestDataAttributesRulesItemsQuery putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this CreateRulesetRequestDataAttributesRulesItemsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRulesetRequestDataAttributesRulesItemsQuery
        createRulesetRequestDataAttributesRulesItemsQuery =
            (CreateRulesetRequestDataAttributesRulesItemsQuery) o;
    return Objects.equals(this.addition, createRulesetRequestDataAttributesRulesItemsQuery.addition)
        && Objects.equals(
            this.caseInsensitivity,
            createRulesetRequestDataAttributesRulesItemsQuery.caseInsensitivity)
        && Objects.equals(
            this.ifNotExists, createRulesetRequestDataAttributesRulesItemsQuery.ifNotExists)
        && Objects.equals(this.query, createRulesetRequestDataAttributesRulesItemsQuery.query)
        && Objects.equals(
            this.additionalProperties,
            createRulesetRequestDataAttributesRulesItemsQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addition, caseInsensitivity, ifNotExists, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRulesetRequestDataAttributesRulesItemsQuery {\n");
    sb.append("    addition: ").append(toIndentedString(addition)).append("\n");
    sb.append("    caseInsensitivity: ").append(toIndentedString(caseInsensitivity)).append("\n");
    sb.append("    ifNotExists: ").append(toIndentedString(ifNotExists)).append("\n");
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
