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
   * <p>Details of a rule.</p>
 */
@JsonPropertyOrder({
  RuleAttributes.JSON_PROPERTY_CATEGORY,
  RuleAttributes.JSON_PROPERTY_CREATED_AT,
  RuleAttributes.JSON_PROPERTY_CUSTOM,
  RuleAttributes.JSON_PROPERTY_DESCRIPTION,
  RuleAttributes.JSON_PROPERTY_ENABLED,
  RuleAttributes.JSON_PROPERTY_LEVEL,
  RuleAttributes.JSON_PROPERTY_MODIFIED_AT,
  RuleAttributes.JSON_PROPERTY_NAME,
  RuleAttributes.JSON_PROPERTY_OWNER,
  RuleAttributes.JSON_PROPERTY_SCORECARD_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RuleAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private Boolean custom;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Integer level;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_SCORECARD_NAME = "scorecard_name";
  private String scorecardName;

  public RuleAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * <p>The scorecard name to which this rule must belong.</p>
   * @return category
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCategory() {
        return category;
      }
  @Deprecated
  public void setCategory(String category) {
    this.category = category;
  }
  public RuleAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Creation time of the rule outcome.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public RuleAttributes custom(Boolean custom) {
    this.custom = custom;
    return this;
  }

  /**
   * <p>Defines if the rule is a custom rule.</p>
   * @return custom
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getCustom() {
        return custom;
      }
  public void setCustom(Boolean custom) {
    this.custom = custom;
  }
  public RuleAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Explanation of the rule.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public RuleAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>If enabled, the rule is calculated as part of the score.</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public RuleAttributes level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * <p>The maturity level of the rule (1, 2, or 3).</p>
   * minimum: 1
   * maximum: 3
   * @return level
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LEVEL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getLevel() {
        return level;
      }
  public void setLevel(Integer level) {
    this.level = level;
  }
  public RuleAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>Time of the last rule outcome modification.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public RuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the rule.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public RuleAttributes owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * <p>Owner of the rule.</p>
   * @return owner
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OWNER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOwner() {
        return owner;
      }
  public void setOwner(String owner) {
    this.owner = owner;
  }
  public RuleAttributes scorecardName(String scorecardName) {
    this.scorecardName = scorecardName;
    return this;
  }

  /**
   * <p>The scorecard name to which this rule must belong.</p>
   * @return scorecardName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCORECARD_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getScorecardName() {
        return scorecardName;
      }
  public void setScorecardName(String scorecardName) {
    this.scorecardName = scorecardName;
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
   * @return RuleAttributes
   */
  @JsonAnySetter
  public RuleAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RuleAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleAttributes ruleAttributes = (RuleAttributes) o;
    return Objects.equals(this.category, ruleAttributes.category) && Objects.equals(this.createdAt, ruleAttributes.createdAt) && Objects.equals(this.custom, ruleAttributes.custom) && Objects.equals(this.description, ruleAttributes.description) && Objects.equals(this.enabled, ruleAttributes.enabled) && Objects.equals(this.level, ruleAttributes.level) && Objects.equals(this.modifiedAt, ruleAttributes.modifiedAt) && Objects.equals(this.name, ruleAttributes.name) && Objects.equals(this.owner, ruleAttributes.owner) && Objects.equals(this.scorecardName, ruleAttributes.scorecardName) && Objects.equals(this.additionalProperties, ruleAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(category,createdAt,custom,description,enabled,level,modifiedAt,name,owner,scorecardName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    scorecardName: ").append(toIndentedString(scorecardName)).append("\n");
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
