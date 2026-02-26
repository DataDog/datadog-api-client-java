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

 */
@JsonPropertyOrder({
  CustomRule.JSON_PROPERTY_CREATED_AT,
  CustomRule.JSON_PROPERTY_CREATED_BY,
  CustomRule.JSON_PROPERTY_LAST_REVISION,
  CustomRule.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomRule {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_LAST_REVISION = "last_revision";
  private CustomRuleRevision lastRevision;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CustomRule() {}

  @JsonCreator
  public CustomRule(
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_AT)OffsetDateTime createdAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_BY)String createdBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_LAST_REVISION)CustomRuleRevision lastRevision,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.lastRevision = lastRevision;
        this.unparsed |= lastRevision.unparsed;
        this.name = name;
  }
  public CustomRule createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Creation timestamp</p>
   * @return createdAt
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public CustomRule createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>Creator identifier</p>
   * @return createdBy
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  public CustomRule lastRevision(CustomRuleRevision lastRevision) {
    this.lastRevision = lastRevision;
    this.unparsed |= lastRevision.unparsed;
    return this;
  }

  /**
   * <p>GetlastRevision</p>
   * @return lastRevision
  **/
      @JsonProperty(JSON_PROPERTY_LAST_REVISION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CustomRuleRevision getLastRevision() {
        return lastRevision;
      }
  public void setLastRevision(CustomRuleRevision lastRevision) {
    this.lastRevision = lastRevision;
  }
  public CustomRule name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Rule name</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
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
   * @return CustomRule
   */
  @JsonAnySetter
  public CustomRule putAdditionalProperty(String key, Object value) {
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
   * Return true if this CustomRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRule customRule = (CustomRule) o;
    return Objects.equals(this.createdAt, customRule.createdAt) && Objects.equals(this.createdBy, customRule.createdBy) && Objects.equals(this.lastRevision, customRule.lastRevision) && Objects.equals(this.name, customRule.name) && Objects.equals(this.additionalProperties, customRule.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,lastRevision,name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRule {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastRevision: ").append(toIndentedString(lastRevision)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
