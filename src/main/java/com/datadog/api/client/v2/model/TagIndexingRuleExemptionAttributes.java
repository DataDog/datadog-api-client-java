/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a tag indexing rule exemption. */
@JsonPropertyOrder({
  TagIndexingRuleExemptionAttributes.JSON_PROPERTY_CREATED_AT,
  TagIndexingRuleExemptionAttributes.JSON_PROPERTY_CREATED_BY_HANDLE,
  TagIndexingRuleExemptionAttributes.JSON_PROPERTY_ESTIMATED_CHANGE_IN_VOLUME,
  TagIndexingRuleExemptionAttributes.JSON_PROPERTY_KIND,
  TagIndexingRuleExemptionAttributes.JSON_PROPERTY_MISSING_INDEXED_TAGS,
  TagIndexingRuleExemptionAttributes.JSON_PROPERTY_REASON,
  TagIndexingRuleExemptionAttributes.JSON_PROPERTY_VOLUME_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagIndexingRuleExemptionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY_HANDLE = "created_by_handle";
  private String createdByHandle;

  public static final String JSON_PROPERTY_ESTIMATED_CHANGE_IN_VOLUME =
      "estimated_change_in_volume";
  private JsonNullable<Long> estimatedChangeInVolume = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_MISSING_INDEXED_TAGS = "missing_indexed_tags";
  private List<String> missingIndexedTags = null;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_VOLUME_STATUS = "volume_status";
  private TagIndexingRuleExemptionVolumeStatus volumeStatus;

  /**
   * Timestamp when the exemption was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Handle of the user who created the exemption.
   *
   * @return createdByHandle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedByHandle() {
    return createdByHandle;
  }

  /**
   * Estimated change in indexed cardinality or points if the exemption is removed and the matching
   * tag indexing rule applies to the metric. A negative value indicates a reduction in indexed
   * volume, a positive value indicates an increase, and zero indicates no change. A <code>null
   * </code> value indicates that the estimate is unavailable.
   *
   * @return estimatedChangeInVolume
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getEstimatedChangeInVolume() {

    if (estimatedChangeInVolume == null) {
      estimatedChangeInVolume = JsonNullable.<Long>undefined();
    }
    return estimatedChangeInVolume.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_CHANGE_IN_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getEstimatedChangeInVolume_JsonNullable() {
    return estimatedChangeInVolume;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_CHANGE_IN_VOLUME)
  private void setEstimatedChangeInVolume_JsonNullable(JsonNullable<Long> estimatedChangeInVolume) {
    this.estimatedChangeInVolume = estimatedChangeInVolume;
  }

  public TagIndexingRuleExemptionAttributes kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Discriminates between an explicit exemption (<code>exemption</code>) and a pre-existing legacy
   * tag configuration acting as an implicit exclusion (<code>legacy_tag_configuration</code>).
   *
   * @return kind
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  /**
   * Tag keys used to query this metric in monitors, dashboards, notebooks, and SLOs that the
   * matching rule would remove or not include if the exemption is removed.
   *
   * @return missingIndexedTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MISSING_INDEXED_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMissingIndexedTags() {
    return missingIndexedTags;
  }

  public TagIndexingRuleExemptionAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason the metric is exempt from tag indexing rules.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Indicates whether <code>estimated_change_in_volume</code> is available and, if not, why. <code>
   * ok</code> indicates a fresh estimate. <code>unindexed_tags</code> indicates that the matching
   * rule uses tags that are not indexed for the metric. <code>unavailable</code> indicates that the
   * estimate is stale, was not computed, or could not be retrieved.
   *
   * @return volumeStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOLUME_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TagIndexingRuleExemptionVolumeStatus getVolumeStatus() {
    return volumeStatus;
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
   * @return TagIndexingRuleExemptionAttributes
   */
  @JsonAnySetter
  public TagIndexingRuleExemptionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TagIndexingRuleExemptionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagIndexingRuleExemptionAttributes tagIndexingRuleExemptionAttributes =
        (TagIndexingRuleExemptionAttributes) o;
    return Objects.equals(this.createdAt, tagIndexingRuleExemptionAttributes.createdAt)
        && Objects.equals(this.createdByHandle, tagIndexingRuleExemptionAttributes.createdByHandle)
        && Objects.equals(
            this.estimatedChangeInVolume,
            tagIndexingRuleExemptionAttributes.estimatedChangeInVolume)
        && Objects.equals(this.kind, tagIndexingRuleExemptionAttributes.kind)
        && Objects.equals(
            this.missingIndexedTags, tagIndexingRuleExemptionAttributes.missingIndexedTags)
        && Objects.equals(this.reason, tagIndexingRuleExemptionAttributes.reason)
        && Objects.equals(this.volumeStatus, tagIndexingRuleExemptionAttributes.volumeStatus)
        && Objects.equals(
            this.additionalProperties, tagIndexingRuleExemptionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdByHandle,
        estimatedChangeInVolume,
        kind,
        missingIndexedTags,
        reason,
        volumeStatus,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagIndexingRuleExemptionAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByHandle: ").append(toIndentedString(createdByHandle)).append("\n");
    sb.append("    estimatedChangeInVolume: ")
        .append(toIndentedString(estimatedChangeInVolume))
        .append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    missingIndexedTags: ").append(toIndentedString(missingIndexedTags)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    volumeStatus: ").append(toIndentedString(volumeStatus)).append("\n");
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
