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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes of a tag policy resource. */
@JsonPropertyOrder({
  TagPolicyAttributes.JSON_PROPERTY_CREATED_AT,
  TagPolicyAttributes.JSON_PROPERTY_CREATED_BY,
  TagPolicyAttributes.JSON_PROPERTY_DELETED_AT,
  TagPolicyAttributes.JSON_PROPERTY_DELETED_BY,
  TagPolicyAttributes.JSON_PROPERTY_ENABLED,
  TagPolicyAttributes.JSON_PROPERTY_MODIFIED_AT,
  TagPolicyAttributes.JSON_PROPERTY_MODIFIED_BY,
  TagPolicyAttributes.JSON_PROPERTY_NEGATED,
  TagPolicyAttributes.JSON_PROPERTY_POLICY_NAME,
  TagPolicyAttributes.JSON_PROPERTY_POLICY_TYPE,
  TagPolicyAttributes.JSON_PROPERTY_REQUIRED,
  TagPolicyAttributes.JSON_PROPERTY_SCOPE,
  TagPolicyAttributes.JSON_PROPERTY_SOURCE,
  TagPolicyAttributes.JSON_PROPERTY_TAG_KEY,
  TagPolicyAttributes.JSON_PROPERTY_TAG_VALUE_PATTERNS,
  TagPolicyAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagPolicyAttributes {
  @JsonIgnore public boolean unparsed = false;
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

  public static final String JSON_PROPERTY_NEGATED = "negated";
  private Boolean negated;

  public static final String JSON_PROPERTY_POLICY_NAME = "policy_name";
  private String policyName;

  public static final String JSON_PROPERTY_POLICY_TYPE = "policy_type";
  private TagPolicyType policyType;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private TagPolicySource source;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_VALUE_PATTERNS = "tag_value_patterns";
  private List<String> tagValuePatterns = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public TagPolicyAttributes() {}

  @JsonCreator
  public TagPolicyAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_BY) String modifiedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEGATED) Boolean negated,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_NAME) String policyName,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_TYPE) TagPolicyType policyType,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUIRED) Boolean required,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) String scope,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) TagPolicySource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEY) String tagKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_VALUE_PATTERNS)
          List<String> tagValuePatterns,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.enabled = enabled;
    this.modifiedAt = modifiedAt;
    this.modifiedBy = modifiedBy;
    this.negated = negated;
    this.policyName = policyName;
    this.policyType = policyType;
    this.unparsed |= !policyType.isValid();
    this.required = required;
    this.scope = scope;
    this.source = source;
    this.unparsed |= !source.isValid();
    this.tagKey = tagKey;
    this.tagValuePatterns = tagValuePatterns;
    this.version = version;
  }

  public TagPolicyAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The RFC 3339 timestamp at which the policy was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public TagPolicyAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The identifier of the user who created the policy.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public TagPolicyAttributes deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = JsonNullable.<OffsetDateTime>of(deletedAt);
    return this;
  }

  /**
   * The RFC 3339 timestamp at which the policy was soft-deleted. <code>null</code> if the policy
   * has not been deleted. Only present when <code>include_deleted=true</code> is requested.
   *
   * @return deletedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getDeletedAt() {
    return deletedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDeletedAt_JsonNullable() {
    return deletedAt;
  }

  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  public void setDeletedAt_JsonNullable(JsonNullable<OffsetDateTime> deletedAt) {
    this.deletedAt = deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = JsonNullable.<OffsetDateTime>of(deletedAt);
  }

  public TagPolicyAttributes deletedBy(String deletedBy) {
    this.deletedBy = JsonNullable.<String>of(deletedBy);
    return this;
  }

  /**
   * The identifier of the user who soft-deleted the policy. <code>null</code> if the policy has not
   * been deleted.
   *
   * @return deletedBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDeletedBy() {
    return deletedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDeletedBy_JsonNullable() {
    return deletedBy;
  }

  @JsonProperty(JSON_PROPERTY_DELETED_BY)
  public void setDeletedBy_JsonNullable(JsonNullable<String> deletedBy) {
    this.deletedBy = deletedBy;
  }

  public void setDeletedBy(String deletedBy) {
    this.deletedBy = JsonNullable.<String>of(deletedBy);
  }

  public TagPolicyAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the policy is currently enforced.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public TagPolicyAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The RFC 3339 timestamp at which the policy was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public TagPolicyAttributes modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The identifier of the user who last modified the policy.
   *
   * @return modifiedBy
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public TagPolicyAttributes negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * When <code>true</code>, the policy matches tag values that do NOT match any of the supplied
   * patterns.
   *
   * @return negated
   */
  @JsonProperty(JSON_PROPERTY_NEGATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  public TagPolicyAttributes policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Human-readable name for the tag policy.
   *
   * @return policyName
   */
  @JsonProperty(JSON_PROPERTY_POLICY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public TagPolicyAttributes policyType(TagPolicyType policyType) {
    this.policyType = policyType;
    this.unparsed |= !policyType.isValid();
    return this;
  }

  /**
   * How the policy is enforced. <code>blocking</code> rejects telemetry that violates the policy.
   * <code>surfacing</code> only highlights non-compliant telemetry without blocking it.
   *
   * @return policyType
   */
  @JsonProperty(JSON_PROPERTY_POLICY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TagPolicyType getPolicyType() {
    return policyType;
  }

  public void setPolicyType(TagPolicyType policyType) {
    if (!policyType.isValid()) {
      this.unparsed = true;
    }
    this.policyType = policyType;
  }

  public TagPolicyAttributes required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * When <code>true</code>, telemetry without this tag is treated as a violation.
   *
   * @return required
   */
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public TagPolicyAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope the policy applies within.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public TagPolicyAttributes source(TagPolicySource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * The telemetry source that a tag policy applies to.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TagPolicySource getSource() {
    return source;
  }

  public void setSource(TagPolicySource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public TagPolicyAttributes tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * The tag key that the policy governs.
   *
   * @return tagKey
   */
  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public TagPolicyAttributes tagValuePatterns(List<String> tagValuePatterns) {
    this.tagValuePatterns = tagValuePatterns;
    return this;
  }

  public TagPolicyAttributes addTagValuePatternsItem(String tagValuePatternsItem) {
    this.tagValuePatterns.add(tagValuePatternsItem);
    return this;
  }

  /**
   * The patterns that valid values for the tag key must match.
   *
   * @return tagValuePatterns
   */
  @JsonProperty(JSON_PROPERTY_TAG_VALUE_PATTERNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTagValuePatterns() {
    return tagValuePatterns;
  }

  public void setTagValuePatterns(List<String> tagValuePatterns) {
    this.tagValuePatterns = tagValuePatterns;
  }

  public TagPolicyAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * A monotonically increasing version counter that is incremented on each update.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return TagPolicyAttributes
   */
  @JsonAnySetter
  public TagPolicyAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TagPolicyAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagPolicyAttributes tagPolicyAttributes = (TagPolicyAttributes) o;
    return Objects.equals(this.createdAt, tagPolicyAttributes.createdAt)
        && Objects.equals(this.createdBy, tagPolicyAttributes.createdBy)
        && Objects.equals(this.deletedAt, tagPolicyAttributes.deletedAt)
        && Objects.equals(this.deletedBy, tagPolicyAttributes.deletedBy)
        && Objects.equals(this.enabled, tagPolicyAttributes.enabled)
        && Objects.equals(this.modifiedAt, tagPolicyAttributes.modifiedAt)
        && Objects.equals(this.modifiedBy, tagPolicyAttributes.modifiedBy)
        && Objects.equals(this.negated, tagPolicyAttributes.negated)
        && Objects.equals(this.policyName, tagPolicyAttributes.policyName)
        && Objects.equals(this.policyType, tagPolicyAttributes.policyType)
        && Objects.equals(this.required, tagPolicyAttributes.required)
        && Objects.equals(this.scope, tagPolicyAttributes.scope)
        && Objects.equals(this.source, tagPolicyAttributes.source)
        && Objects.equals(this.tagKey, tagPolicyAttributes.tagKey)
        && Objects.equals(this.tagValuePatterns, tagPolicyAttributes.tagValuePatterns)
        && Objects.equals(this.version, tagPolicyAttributes.version)
        && Objects.equals(this.additionalProperties, tagPolicyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        deletedAt,
        deletedBy,
        enabled,
        modifiedAt,
        modifiedBy,
        negated,
        policyName,
        policyType,
        required,
        scope,
        source,
        tagKey,
        tagValuePatterns,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagPolicyAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
