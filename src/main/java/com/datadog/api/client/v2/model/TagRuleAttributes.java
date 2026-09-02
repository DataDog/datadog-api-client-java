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
   * <p>The attributes of a tag rule resource.</p>
 */
@JsonPropertyOrder({
  TagRuleAttributes.JSON_PROPERTY_CREATED_AT,
  TagRuleAttributes.JSON_PROPERTY_CREATED_BY,
  TagRuleAttributes.JSON_PROPERTY_DELETED_AT,
  TagRuleAttributes.JSON_PROPERTY_DELETED_BY,
  TagRuleAttributes.JSON_PROPERTY_ENABLED,
  TagRuleAttributes.JSON_PROPERTY_MODIFIED_AT,
  TagRuleAttributes.JSON_PROPERTY_MODIFIED_BY,
  TagRuleAttributes.JSON_PROPERTY_NAME,
  TagRuleAttributes.JSON_PROPERTY_NEGATED,
  TagRuleAttributes.JSON_PROPERTY_REQUIRED,
  TagRuleAttributes.JSON_PROPERTY_RULE_TYPE,
  TagRuleAttributes.JSON_PROPERTY_SCOPE,
  TagRuleAttributes.JSON_PROPERTY_SOURCE,
  TagRuleAttributes.JSON_PROPERTY_TAG_KEY,
  TagRuleAttributes.JSON_PROPERTY_TAG_VALUE_PATTERNS,
  TagRuleAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagRuleAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<OffsetDateTime> deletedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DELETED_BY = "deleted_by";
  private JsonNullable<String> deletedBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

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

  public static final String JSON_PROPERTY_SOURCE = "source";
  private TagRuleSource source;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_VALUE_PATTERNS = "tag_value_patterns";
  private List<String> tagValuePatterns = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public TagRuleAttributes() {}

  @JsonCreator
  public TagRuleAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_AT)OffsetDateTime createdAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_BY)String createdBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_ENABLED)Boolean enabled,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED_AT)OffsetDateTime modifiedAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED_BY)String modifiedBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_NEGATED)Boolean negated,
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUIRED)Boolean required,
            @JsonProperty(required=true, value=JSON_PROPERTY_RULE_TYPE)TagRuleType ruleType,
            @JsonProperty(required=true, value=JSON_PROPERTY_SCOPE)String scope,
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCE)TagRuleSource source,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAG_KEY)String tagKey,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAG_VALUE_PATTERNS)List<String> tagValuePatterns,
            @JsonProperty(required=true, value=JSON_PROPERTY_VERSION)Long version) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.enabled = enabled;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
        this.name = name;
        this.negated = negated;
        this.required = required;
        this.ruleType = ruleType;
        this.unparsed |= !ruleType.isValid();
        this.scope = scope;
        this.source = source;
        this.unparsed |= !source.isValid();
        this.tagKey = tagKey;
        this.tagValuePatterns = tagValuePatterns;
        this.version = version;
  }
  public TagRuleAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>The RFC 3339 timestamp at which the rule was created.</p>
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
  public TagRuleAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>The identifier of the user who created the rule.</p>
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
  public TagRuleAttributes deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = JsonNullable.<OffsetDateTime>of(deletedAt);
    return this;
  }

  /**
   * <p>The RFC 3339 timestamp at which the rule was soft-deleted. <code>null</code> if the rule has not been deleted. Only present when <code>include_deleted=true</code> is requested.</p>
   * @return deletedAt
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getDeletedAt() {
        return deletedAt.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDeletedAt_JsonNullable() {
    return deletedAt;
  }
  @JsonProperty(JSON_PROPERTY_DELETED_AT)public void setDeletedAt_JsonNullable(JsonNullable<OffsetDateTime> deletedAt) {
    this.deletedAt = deletedAt;
  }
  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = JsonNullable.<OffsetDateTime>of(deletedAt);
  }
  public TagRuleAttributes deletedBy(String deletedBy) {
    this.deletedBy = JsonNullable.<String>of(deletedBy);
    return this;
  }

  /**
   * <p>The identifier of the user who soft-deleted the rule. <code>null</code> if the rule has not been deleted.</p>
   * @return deletedBy
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getDeletedBy() {
        return deletedBy.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DELETED_BY)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDeletedBy_JsonNullable() {
    return deletedBy;
  }
  @JsonProperty(JSON_PROPERTY_DELETED_BY)public void setDeletedBy_JsonNullable(JsonNullable<String> deletedBy) {
    this.deletedBy = deletedBy;
  }
  public void setDeletedBy(String deletedBy) {
    this.deletedBy = JsonNullable.<String>of(deletedBy);
  }
  public TagRuleAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the rule is currently enforced.</p>
   * @return enabled
  **/
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public TagRuleAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>The RFC 3339 timestamp at which the rule was last modified.</p>
   * @return modifiedAt
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public TagRuleAttributes modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * <p>The identifier of the user who last modified the rule.</p>
   * @return modifiedBy
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getModifiedBy() {
        return modifiedBy;
      }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
  public TagRuleAttributes name(String name) {
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
  public TagRuleAttributes negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * <p>When <code>true</code>, the rule matches tag values that do NOT match any of the supplied patterns.</p>
   * @return negated
  **/
      @JsonProperty(JSON_PROPERTY_NEGATED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getNegated() {
        return negated;
      }
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }
  public TagRuleAttributes required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * <p>When <code>true</code>, telemetry without this tag is treated as a violation.</p>
   * @return required
  **/
      @JsonProperty(JSON_PROPERTY_REQUIRED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getRequired() {
        return required;
      }
  public void setRequired(Boolean required) {
    this.required = required;
  }
  public TagRuleAttributes ruleType(TagRuleType ruleType) {
    this.ruleType = ruleType;
    this.unparsed |= !ruleType.isValid();
    return this;
  }

  /**
   * <p>How the rule is enforced. <code>blocking</code> rejects telemetry that violates the rule.
   * <code>surfacing</code> only highlights non-compliant telemetry without blocking it.</p>
   * @return ruleType
  **/
      @JsonProperty(JSON_PROPERTY_RULE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TagRuleType getRuleType() {
        return ruleType;
      }
  public void setRuleType(TagRuleType ruleType) {
    if (!ruleType.isValid()) {
        this.unparsed = true;
    }
    this.ruleType = ruleType;
  }
  public TagRuleAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>The scope the rule applies within.</p>
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
  public TagRuleAttributes source(TagRuleSource source) {
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
  public TagRuleAttributes tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * <p>The tag key that the rule governs.</p>
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
  public TagRuleAttributes tagValuePatterns(List<String> tagValuePatterns) {
    this.tagValuePatterns = tagValuePatterns;
    return this;
  }
  public TagRuleAttributes addTagValuePatternsItem(String tagValuePatternsItem) {
    this.tagValuePatterns.add(tagValuePatternsItem);
    return this;
  }

  /**
   * <p>The patterns that valid values for the tag key must match.</p>
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
  public TagRuleAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * <p>A monotonically increasing version counter that is incremented on each update.</p>
   * @return version
  **/
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getVersion() {
        return version;
      }
  public void setVersion(Long version) {
    this.version = version;
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
   * @return TagRuleAttributes
   */
  @JsonAnySetter
  public TagRuleAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this TagRuleAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagRuleAttributes tagRuleAttributes = (TagRuleAttributes) o;
    return Objects.equals(this.createdAt, tagRuleAttributes.createdAt) && Objects.equals(this.createdBy, tagRuleAttributes.createdBy) && Objects.equals(this.deletedAt, tagRuleAttributes.deletedAt) && Objects.equals(this.deletedBy, tagRuleAttributes.deletedBy) && Objects.equals(this.enabled, tagRuleAttributes.enabled) && Objects.equals(this.modifiedAt, tagRuleAttributes.modifiedAt) && Objects.equals(this.modifiedBy, tagRuleAttributes.modifiedBy) && Objects.equals(this.name, tagRuleAttributes.name) && Objects.equals(this.negated, tagRuleAttributes.negated) && Objects.equals(this.required, tagRuleAttributes.required) && Objects.equals(this.ruleType, tagRuleAttributes.ruleType) && Objects.equals(this.scope, tagRuleAttributes.scope) && Objects.equals(this.source, tagRuleAttributes.source) && Objects.equals(this.tagKey, tagRuleAttributes.tagKey) && Objects.equals(this.tagValuePatterns, tagRuleAttributes.tagValuePatterns) && Objects.equals(this.version, tagRuleAttributes.version) && Objects.equals(this.additionalProperties, tagRuleAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,deletedAt,deletedBy,enabled,modifiedAt,modifiedBy,name,negated,required,ruleType,scope,source,tagKey,tagValuePatterns,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagRuleAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagValuePatterns: ").append(toIndentedString(tagValuePatterns)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
