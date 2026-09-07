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
   * <p>Mutable attributes of a tag rule. Each field is optional; omitting a field leaves its
   * current value unchanged. The <code>source</code> of a rule cannot be changed.</p>
 */
@JsonPropertyOrder({
  TagRuleUpdateAttributes.JSON_PROPERTY_ENABLED,
  TagRuleUpdateAttributes.JSON_PROPERTY_NAME,
  TagRuleUpdateAttributes.JSON_PROPERTY_NEGATED,
  TagRuleUpdateAttributes.JSON_PROPERTY_REQUIRED,
  TagRuleUpdateAttributes.JSON_PROPERTY_RULE_TYPE,
  TagRuleUpdateAttributes.JSON_PROPERTY_SCOPE,
  TagRuleUpdateAttributes.JSON_PROPERTY_TAG_KEY,
  TagRuleUpdateAttributes.JSON_PROPERTY_TAG_VALUE_PATTERNS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagRuleUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NEGATED = "negated";
  private Boolean negated;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_RULE_TYPE = "rule_type";
  private TagRuleType ruleType;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_VALUE_PATTERNS = "tag_value_patterns";
  private List<String> tagValuePatterns = null;

  public TagRuleUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the rule is currently enforced.</p>
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
  public TagRuleUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Human-readable name for the tag rule.</p>
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
  public TagRuleUpdateAttributes negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * <p>When <code>true</code>, the rule matches tag values that do NOT match any of the supplied patterns.</p>
   * @return negated
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEGATED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getNegated() {
        return negated;
      }
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }
  public TagRuleUpdateAttributes required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * <p>When <code>true</code>, telemetry without this tag is treated as a violation.</p>
   * @return required
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REQUIRED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getRequired() {
        return required;
      }
  public void setRequired(Boolean required) {
    this.required = required;
  }
  public TagRuleUpdateAttributes ruleType(TagRuleType ruleType) {
    this.ruleType = ruleType;
    this.unparsed |= !ruleType.isValid();
    return this;
  }

  /**
   * <p>How the rule is enforced. <code>blocking</code> rejects telemetry that violates the rule.
   * <code>surfacing</code> only highlights non-compliant telemetry without blocking it.</p>
   * @return ruleType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TagRuleType getRuleType() {
        return ruleType;
      }
  public void setRuleType(TagRuleType ruleType) {
    if (!ruleType.isValid()) {
        this.unparsed = true;
    }
    this.ruleType = ruleType;
  }
  public TagRuleUpdateAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>The scope the rule applies within.</p>
   * @return scope
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getScope() {
        return scope;
      }
  public void setScope(String scope) {
    this.scope = scope;
  }
  public TagRuleUpdateAttributes tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * <p>The tag key that the rule governs.</p>
   * @return tagKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAG_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTagKey() {
        return tagKey;
      }
  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }
  public TagRuleUpdateAttributes tagValuePatterns(List<String> tagValuePatterns) {
    this.tagValuePatterns = tagValuePatterns;
    return this;
  }
  public TagRuleUpdateAttributes addTagValuePatternsItem(String tagValuePatternsItem) {
    if (this.tagValuePatterns == null) {
      this.tagValuePatterns = new ArrayList<>();
    }
    this.tagValuePatterns.add(tagValuePatternsItem);
    return this;
  }

  /**
   * <p>One or more patterns that valid values for the tag key must match.</p>
   * @return tagValuePatterns
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAG_VALUE_PATTERNS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTagValuePatterns() {
        return tagValuePatterns;
      }
  public void setTagValuePatterns(List<String> tagValuePatterns) {
    this.tagValuePatterns = tagValuePatterns;
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
   * @return TagRuleUpdateAttributes
   */
  @JsonAnySetter
  public TagRuleUpdateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this TagRuleUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagRuleUpdateAttributes tagRuleUpdateAttributes = (TagRuleUpdateAttributes) o;
    return Objects.equals(this.enabled, tagRuleUpdateAttributes.enabled) && Objects.equals(this.name, tagRuleUpdateAttributes.name) && Objects.equals(this.negated, tagRuleUpdateAttributes.negated) && Objects.equals(this.required, tagRuleUpdateAttributes.required) && Objects.equals(this.ruleType, tagRuleUpdateAttributes.ruleType) && Objects.equals(this.scope, tagRuleUpdateAttributes.scope) && Objects.equals(this.tagKey, tagRuleUpdateAttributes.tagKey) && Objects.equals(this.tagValuePatterns, tagRuleUpdateAttributes.tagValuePatterns) && Objects.equals(this.additionalProperties, tagRuleUpdateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(enabled,name,negated,required,ruleType,scope,tagKey,tagValuePatterns, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagRuleUpdateAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagValuePatterns: ").append(toIndentedString(tagValuePatterns)).append("\n");
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
