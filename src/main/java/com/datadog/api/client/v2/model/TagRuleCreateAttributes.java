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
   * <p>Attributes that can be supplied when creating a tag rule.</p>
 */
@JsonPropertyOrder({
  TagRuleCreateAttributes.JSON_PROPERTY_ENABLED,
  TagRuleCreateAttributes.JSON_PROPERTY_NAME,
  TagRuleCreateAttributes.JSON_PROPERTY_NEGATED,
  TagRuleCreateAttributes.JSON_PROPERTY_REQUIRED,
  TagRuleCreateAttributes.JSON_PROPERTY_RULE_TYPE,
  TagRuleCreateAttributes.JSON_PROPERTY_SCOPE,
  TagRuleCreateAttributes.JSON_PROPERTY_SOURCE,
  TagRuleCreateAttributes.JSON_PROPERTY_TAG_KEY,
  TagRuleCreateAttributes.JSON_PROPERTY_TAG_VALUE_PATTERNS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagRuleCreateAttributes {
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
  private TagRuleCreateType ruleType;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private TagRuleSource source;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_VALUE_PATTERNS = "tag_value_patterns";
  private List<String> tagValuePatterns = new ArrayList<>();

  public TagRuleCreateAttributes() {}

  @JsonCreator
  public TagRuleCreateAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_RULE_TYPE)TagRuleCreateType ruleType,
            @JsonProperty(required=true, value=JSON_PROPERTY_SCOPE)String scope,
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCE)TagRuleSource source,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAG_KEY)String tagKey,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAG_VALUE_PATTERNS)List<String> tagValuePatterns) {
        this.name = name;
        this.ruleType = ruleType;
        this.unparsed |= !ruleType.isValid();
        this.scope = scope;
        this.source = source;
        this.unparsed |= !source.isValid();
        this.tagKey = tagKey;
        this.tagValuePatterns = tagValuePatterns;
  }
  public TagRuleCreateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the rule is currently enforced. Defaults to <code>true</code> for newly created rules.</p>
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
  public TagRuleCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Human-readable name for the tag rule.</p>
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
  public TagRuleCreateAttributes negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * <p>When <code>true</code>, the rule matches tag values that do NOT match any of the supplied patterns. Defaults to <code>false</code>.</p>
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
  public TagRuleCreateAttributes required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * <p>When <code>true</code>, telemetry without this tag is treated as a violation. Defaults to <code>false</code>.</p>
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
  public TagRuleCreateAttributes ruleType(TagRuleCreateType ruleType) {
    this.ruleType = ruleType;
    this.unparsed |= !ruleType.isValid();
    return this;
  }

  /**
   * <p>The rule type allowed when creating a tag rule. Only <code>surfacing</code> is accepted at
   * creation time.</p>
   * @return ruleType
  **/
      @JsonProperty(JSON_PROPERTY_RULE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TagRuleCreateType getRuleType() {
        return ruleType;
      }
  public void setRuleType(TagRuleCreateType ruleType) {
    if (!ruleType.isValid()) {
        this.unparsed = true;
    }
    this.ruleType = ruleType;
  }
  public TagRuleCreateAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>The scope the rule applies within. Typically an environment, team, or
   * organization-level identifier used to limit where the rule is enforced.</p>
   * @return scope
  **/
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getScope() {
        return scope;
      }
  public void setScope(String scope) {
    this.scope = scope;
  }
  public TagRuleCreateAttributes source(TagRuleSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * <p>The telemetry source that a tag rule applies to.</p>
   * @return source
  **/
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TagRuleSource getSource() {
        return source;
      }
  public void setSource(TagRuleSource source) {
    if (!source.isValid()) {
        this.unparsed = true;
    }
    this.source = source;
  }
  public TagRuleCreateAttributes tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * <p>The tag key that the rule governs (for example, <code>service</code>).</p>
   * @return tagKey
  **/
      @JsonProperty(JSON_PROPERTY_TAG_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTagKey() {
        return tagKey;
      }
  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }
  public TagRuleCreateAttributes tagValuePatterns(List<String> tagValuePatterns) {
    this.tagValuePatterns = tagValuePatterns;
    return this;
  }
  public TagRuleCreateAttributes addTagValuePatternsItem(String tagValuePatternsItem) {
    this.tagValuePatterns.add(tagValuePatternsItem);
    return this;
  }

  /**
   * <p>One or more patterns that valid values for the tag key must match. At least one
   * pattern is required.</p>
   * @return tagValuePatterns
  **/
      @JsonProperty(JSON_PROPERTY_TAG_VALUE_PATTERNS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return TagRuleCreateAttributes
   */
  @JsonAnySetter
  public TagRuleCreateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this TagRuleCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagRuleCreateAttributes tagRuleCreateAttributes = (TagRuleCreateAttributes) o;
    return Objects.equals(this.enabled, tagRuleCreateAttributes.enabled) && Objects.equals(this.name, tagRuleCreateAttributes.name) && Objects.equals(this.negated, tagRuleCreateAttributes.negated) && Objects.equals(this.required, tagRuleCreateAttributes.required) && Objects.equals(this.ruleType, tagRuleCreateAttributes.ruleType) && Objects.equals(this.scope, tagRuleCreateAttributes.scope) && Objects.equals(this.source, tagRuleCreateAttributes.source) && Objects.equals(this.tagKey, tagRuleCreateAttributes.tagKey) && Objects.equals(this.tagValuePatterns, tagRuleCreateAttributes.tagValuePatterns) && Objects.equals(this.additionalProperties, tagRuleCreateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(enabled,name,negated,required,ruleType,scope,source,tagKey,tagValuePatterns, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagRuleCreateAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
