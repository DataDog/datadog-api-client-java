/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The definition of <code>UpdateRulesetRequestDataAttributesRulesItemsQuery</code> object.</p>
 */
@JsonPropertyOrder({
  UpdateRulesetRequestDataAttributesRulesItemsQuery.JSON_PROPERTY_ADDITION,
  UpdateRulesetRequestDataAttributesRulesItemsQuery.JSON_PROPERTY_CASE_INSENSITIVITY,
  UpdateRulesetRequestDataAttributesRulesItemsQuery.JSON_PROPERTY_IF_NOT_EXISTS,
  UpdateRulesetRequestDataAttributesRulesItemsQuery.JSON_PROPERTY_IF_TAG_EXISTS,
  UpdateRulesetRequestDataAttributesRulesItemsQuery.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateRulesetRequestDataAttributesRulesItemsQuery {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITION = "addition";
  private UpdateRulesetRequestDataAttributesRulesItemsQueryAddition addition;

  public static final String JSON_PROPERTY_CASE_INSENSITIVITY = "case_insensitivity";
  private Boolean caseInsensitivity;

  public static final String JSON_PROPERTY_IF_NOT_EXISTS = "if_not_exists";
  private Boolean ifNotExists;

  public static final String JSON_PROPERTY_IF_TAG_EXISTS = "if_tag_exists";
  private DataAttributesRulesItemsIfTagExists ifTagExists;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public UpdateRulesetRequestDataAttributesRulesItemsQuery() {}

  @JsonCreator
  public UpdateRulesetRequestDataAttributesRulesItemsQuery(
            @JsonProperty(required=true, value=JSON_PROPERTY_ADDITION)UpdateRulesetRequestDataAttributesRulesItemsQueryAddition addition,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)String query) {
        this.addition = addition;
        if (addition != null) {
        this.unparsed |= addition.unparsed;
        }
        this.query = query;
  }
  public UpdateRulesetRequestDataAttributesRulesItemsQuery addition(UpdateRulesetRequestDataAttributesRulesItemsQueryAddition addition) {
    this.addition = addition;
        if (addition != null) {
    this.unparsed |= addition.unparsed;
    }
    return this;
  }

  /**
   * <p>The definition of <code>UpdateRulesetRequestDataAttributesRulesItemsQueryAddition</code> object.</p>
   * @return addition
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ADDITION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public UpdateRulesetRequestDataAttributesRulesItemsQueryAddition getAddition() {
        return addition;
      }
  public void setAddition(UpdateRulesetRequestDataAttributesRulesItemsQueryAddition addition) {
    this.addition = addition;
  }
  public UpdateRulesetRequestDataAttributesRulesItemsQuery caseInsensitivity(Boolean caseInsensitivity) {
    this.caseInsensitivity = caseInsensitivity;
    return this;
  }

  /**
   * <p>The <code>query</code> <code>case_insensitivity</code>.</p>
   * @return caseInsensitivity
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CASE_INSENSITIVITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getCaseInsensitivity() {
        return caseInsensitivity;
      }
  public void setCaseInsensitivity(Boolean caseInsensitivity) {
    this.caseInsensitivity = caseInsensitivity;
  }
  public UpdateRulesetRequestDataAttributesRulesItemsQuery ifNotExists(Boolean ifNotExists) {
    this.ifNotExists = ifNotExists;
    return this;
  }

  /**
   * <p>Deprecated. Use <code>if_tag_exists</code> instead. The <code>query</code> <code>if_not_exists</code>.</p>
   * @return ifNotExists
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IF_NOT_EXISTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIfNotExists() {
        return ifNotExists;
      }
  @Deprecated
  public void setIfNotExists(Boolean ifNotExists) {
    this.ifNotExists = ifNotExists;
  }
  public UpdateRulesetRequestDataAttributesRulesItemsQuery ifTagExists(DataAttributesRulesItemsIfTagExists ifTagExists) {
    this.ifTagExists = ifTagExists;
    this.unparsed |= !ifTagExists.isValid();
    return this;
  }

  /**
   * <p>The behavior when the tag already exists.</p>
   * @return ifTagExists
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IF_TAG_EXISTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DataAttributesRulesItemsIfTagExists getIfTagExists() {
        return ifTagExists;
      }
  public void setIfTagExists(DataAttributesRulesItemsIfTagExists ifTagExists) {
    if (!ifTagExists.isValid()) {
        this.unparsed = true;
    }
    this.ifTagExists = ifTagExists;
  }
  public UpdateRulesetRequestDataAttributesRulesItemsQuery query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The <code>query</code> <code>query</code>.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return UpdateRulesetRequestDataAttributesRulesItemsQuery
   */
  @JsonAnySetter
  public UpdateRulesetRequestDataAttributesRulesItemsQuery putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this UpdateRulesetRequestDataAttributesRulesItemsQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRulesetRequestDataAttributesRulesItemsQuery updateRulesetRequestDataAttributesRulesItemsQuery = (UpdateRulesetRequestDataAttributesRulesItemsQuery) o;
    return Objects.equals(this.addition, updateRulesetRequestDataAttributesRulesItemsQuery.addition) && Objects.equals(this.caseInsensitivity, updateRulesetRequestDataAttributesRulesItemsQuery.caseInsensitivity) && Objects.equals(this.ifNotExists, updateRulesetRequestDataAttributesRulesItemsQuery.ifNotExists) && Objects.equals(this.ifTagExists, updateRulesetRequestDataAttributesRulesItemsQuery.ifTagExists) && Objects.equals(this.query, updateRulesetRequestDataAttributesRulesItemsQuery.query) && Objects.equals(this.additionalProperties, updateRulesetRequestDataAttributesRulesItemsQuery.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(addition,caseInsensitivity,ifNotExists,ifTagExists,query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRulesetRequestDataAttributesRulesItemsQuery {\n");
    sb.append("    addition: ").append(toIndentedString(addition)).append("\n");
    sb.append("    caseInsensitivity: ").append(toIndentedString(caseInsensitivity)).append("\n");
    sb.append("    ifNotExists: ").append(toIndentedString(ifNotExists)).append("\n");
    sb.append("    ifTagExists: ").append(toIndentedString(ifTagExists)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
