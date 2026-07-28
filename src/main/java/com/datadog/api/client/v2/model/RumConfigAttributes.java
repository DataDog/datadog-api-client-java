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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of the RUM configuration. */
@JsonPropertyOrder({
  RumConfigAttributes.JSON_PROPERTY_DISABLED,
  RumConfigAttributes.JSON_PROPERTY_ENFORCED_APPLICATION_TAGS,
  RumConfigAttributes.JSON_PROPERTY_ENFORCED_APPLICATION_TAGS_UPDATED_AT,
  RumConfigAttributes.JSON_PROPERTY_ENFORCED_APPLICATION_TAGS_UPDATED_BY,
  RumConfigAttributes.JSON_PROPERTY_OOTB_METRICS_VERSION,
  RumConfigAttributes.JSON_PROPERTY_OOTB_METRICS_VERSION_INSTALLED_AT,
  RumConfigAttributes.JSON_PROPERTY_RETENTION_FILTERS_ENABLED,
  RumConfigAttributes.JSON_PROPERTY_RETENTION_FILTERS_ENABLED_UPDATED_AT,
  RumConfigAttributes.JSON_PROPERTY_RETENTION_FILTERS_ENABLED_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumConfigAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_ENFORCED_APPLICATION_TAGS = "enforced_application_tags";
  private Boolean enforcedApplicationTags;

  public static final String JSON_PROPERTY_ENFORCED_APPLICATION_TAGS_UPDATED_AT =
      "enforced_application_tags_updated_at";
  private OffsetDateTime enforcedApplicationTagsUpdatedAt;

  public static final String JSON_PROPERTY_ENFORCED_APPLICATION_TAGS_UPDATED_BY =
      "enforced_application_tags_updated_by";
  private String enforcedApplicationTagsUpdatedBy;

  public static final String JSON_PROPERTY_OOTB_METRICS_VERSION = "ootb_metrics_version";
  private Long ootbMetricsVersion;

  public static final String JSON_PROPERTY_OOTB_METRICS_VERSION_INSTALLED_AT =
      "ootb_metrics_version_installed_at";
  private OffsetDateTime ootbMetricsVersionInstalledAt;

  public static final String JSON_PROPERTY_RETENTION_FILTERS_ENABLED = "retention_filters_enabled";
  private Boolean retentionFiltersEnabled;

  public static final String JSON_PROPERTY_RETENTION_FILTERS_ENABLED_UPDATED_AT =
      "retention_filters_enabled_updated_at";
  private OffsetDateTime retentionFiltersEnabledUpdatedAt;

  public static final String JSON_PROPERTY_RETENTION_FILTERS_ENABLED_UPDATED_BY =
      "retention_filters_enabled_updated_by";
  private String retentionFiltersEnabledUpdatedBy;

  public RumConfigAttributes() {}

  @JsonCreator
  public RumConfigAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENFORCED_APPLICATION_TAGS)
          Boolean enforcedApplicationTags,
      @JsonProperty(required = true, value = JSON_PROPERTY_RETENTION_FILTERS_ENABLED)
          Boolean retentionFiltersEnabled) {
    this.enforcedApplicationTags = enforcedApplicationTags;
    this.retentionFiltersEnabled = retentionFiltersEnabled;
  }

  public RumConfigAttributes disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Whether the RUM configuration is disabled for the organization.
   *
   * @return disabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public RumConfigAttributes enforcedApplicationTags(Boolean enforcedApplicationTags) {
    this.enforcedApplicationTags = enforcedApplicationTags;
    return this;
  }

  /**
   * Whether application tags are enforced for the RUM applications in the organization.
   *
   * @return enforcedApplicationTags
   */
  @JsonProperty(JSON_PROPERTY_ENFORCED_APPLICATION_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnforcedApplicationTags() {
    return enforcedApplicationTags;
  }

  public void setEnforcedApplicationTags(Boolean enforcedApplicationTags) {
    this.enforcedApplicationTags = enforcedApplicationTags;
  }

  public RumConfigAttributes enforcedApplicationTagsUpdatedAt(
      OffsetDateTime enforcedApplicationTagsUpdatedAt) {
    this.enforcedApplicationTagsUpdatedAt = enforcedApplicationTagsUpdatedAt;
    return this;
  }

  /**
   * Timestamp of when the enforced application tags setting was last updated.
   *
   * @return enforcedApplicationTagsUpdatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCED_APPLICATION_TAGS_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEnforcedApplicationTagsUpdatedAt() {
    return enforcedApplicationTagsUpdatedAt;
  }

  public void setEnforcedApplicationTagsUpdatedAt(OffsetDateTime enforcedApplicationTagsUpdatedAt) {
    this.enforcedApplicationTagsUpdatedAt = enforcedApplicationTagsUpdatedAt;
  }

  public RumConfigAttributes enforcedApplicationTagsUpdatedBy(
      String enforcedApplicationTagsUpdatedBy) {
    this.enforcedApplicationTagsUpdatedBy = enforcedApplicationTagsUpdatedBy;
    return this;
  }

  /**
   * Handle of the user who last updated the enforced application tags setting.
   *
   * @return enforcedApplicationTagsUpdatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCED_APPLICATION_TAGS_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnforcedApplicationTagsUpdatedBy() {
    return enforcedApplicationTagsUpdatedBy;
  }

  public void setEnforcedApplicationTagsUpdatedBy(String enforcedApplicationTagsUpdatedBy) {
    this.enforcedApplicationTagsUpdatedBy = enforcedApplicationTagsUpdatedBy;
  }

  public RumConfigAttributes ootbMetricsVersion(Long ootbMetricsVersion) {
    this.ootbMetricsVersion = ootbMetricsVersion;
    return this;
  }

  /**
   * Version of the out-of-the-box metrics installed for the organization.
   *
   * @return ootbMetricsVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OOTB_METRICS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOotbMetricsVersion() {
    return ootbMetricsVersion;
  }

  public void setOotbMetricsVersion(Long ootbMetricsVersion) {
    this.ootbMetricsVersion = ootbMetricsVersion;
  }

  public RumConfigAttributes ootbMetricsVersionInstalledAt(
      OffsetDateTime ootbMetricsVersionInstalledAt) {
    this.ootbMetricsVersionInstalledAt = ootbMetricsVersionInstalledAt;
    return this;
  }

  /**
   * Timestamp of when the out-of-the-box metrics version was installed.
   *
   * @return ootbMetricsVersionInstalledAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OOTB_METRICS_VERSION_INSTALLED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getOotbMetricsVersionInstalledAt() {
    return ootbMetricsVersionInstalledAt;
  }

  public void setOotbMetricsVersionInstalledAt(OffsetDateTime ootbMetricsVersionInstalledAt) {
    this.ootbMetricsVersionInstalledAt = ootbMetricsVersionInstalledAt;
  }

  public RumConfigAttributes retentionFiltersEnabled(Boolean retentionFiltersEnabled) {
    this.retentionFiltersEnabled = retentionFiltersEnabled;
    return this;
  }

  /**
   * Whether retention filters are enabled for the organization.
   *
   * @return retentionFiltersEnabled
   */
  @JsonProperty(JSON_PROPERTY_RETENTION_FILTERS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRetentionFiltersEnabled() {
    return retentionFiltersEnabled;
  }

  public void setRetentionFiltersEnabled(Boolean retentionFiltersEnabled) {
    this.retentionFiltersEnabled = retentionFiltersEnabled;
  }

  public RumConfigAttributes retentionFiltersEnabledUpdatedAt(
      OffsetDateTime retentionFiltersEnabledUpdatedAt) {
    this.retentionFiltersEnabledUpdatedAt = retentionFiltersEnabledUpdatedAt;
    return this;
  }

  /**
   * Timestamp of when the retention filters setting was last updated.
   *
   * @return retentionFiltersEnabledUpdatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTION_FILTERS_ENABLED_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getRetentionFiltersEnabledUpdatedAt() {
    return retentionFiltersEnabledUpdatedAt;
  }

  public void setRetentionFiltersEnabledUpdatedAt(OffsetDateTime retentionFiltersEnabledUpdatedAt) {
    this.retentionFiltersEnabledUpdatedAt = retentionFiltersEnabledUpdatedAt;
  }

  public RumConfigAttributes retentionFiltersEnabledUpdatedBy(
      String retentionFiltersEnabledUpdatedBy) {
    this.retentionFiltersEnabledUpdatedBy = retentionFiltersEnabledUpdatedBy;
    return this;
  }

  /**
   * Handle of the user or job who last updated the retention filters setting.
   *
   * @return retentionFiltersEnabledUpdatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTION_FILTERS_ENABLED_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRetentionFiltersEnabledUpdatedBy() {
    return retentionFiltersEnabledUpdatedBy;
  }

  public void setRetentionFiltersEnabledUpdatedBy(String retentionFiltersEnabledUpdatedBy) {
    this.retentionFiltersEnabledUpdatedBy = retentionFiltersEnabledUpdatedBy;
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
   * @return RumConfigAttributes
   */
  @JsonAnySetter
  public RumConfigAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumConfigAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumConfigAttributes rumConfigAttributes = (RumConfigAttributes) o;
    return Objects.equals(this.disabled, rumConfigAttributes.disabled)
        && Objects.equals(this.enforcedApplicationTags, rumConfigAttributes.enforcedApplicationTags)
        && Objects.equals(
            this.enforcedApplicationTagsUpdatedAt,
            rumConfigAttributes.enforcedApplicationTagsUpdatedAt)
        && Objects.equals(
            this.enforcedApplicationTagsUpdatedBy,
            rumConfigAttributes.enforcedApplicationTagsUpdatedBy)
        && Objects.equals(this.ootbMetricsVersion, rumConfigAttributes.ootbMetricsVersion)
        && Objects.equals(
            this.ootbMetricsVersionInstalledAt, rumConfigAttributes.ootbMetricsVersionInstalledAt)
        && Objects.equals(this.retentionFiltersEnabled, rumConfigAttributes.retentionFiltersEnabled)
        && Objects.equals(
            this.retentionFiltersEnabledUpdatedAt,
            rumConfigAttributes.retentionFiltersEnabledUpdatedAt)
        && Objects.equals(
            this.retentionFiltersEnabledUpdatedBy,
            rumConfigAttributes.retentionFiltersEnabledUpdatedBy)
        && Objects.equals(this.additionalProperties, rumConfigAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        disabled,
        enforcedApplicationTags,
        enforcedApplicationTagsUpdatedAt,
        enforcedApplicationTagsUpdatedBy,
        ootbMetricsVersion,
        ootbMetricsVersionInstalledAt,
        retentionFiltersEnabled,
        retentionFiltersEnabledUpdatedAt,
        retentionFiltersEnabledUpdatedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumConfigAttributes {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    enforcedApplicationTags: ")
        .append(toIndentedString(enforcedApplicationTags))
        .append("\n");
    sb.append("    enforcedApplicationTagsUpdatedAt: ")
        .append(toIndentedString(enforcedApplicationTagsUpdatedAt))
        .append("\n");
    sb.append("    enforcedApplicationTagsUpdatedBy: ")
        .append(toIndentedString(enforcedApplicationTagsUpdatedBy))
        .append("\n");
    sb.append("    ootbMetricsVersion: ").append(toIndentedString(ootbMetricsVersion)).append("\n");
    sb.append("    ootbMetricsVersionInstalledAt: ")
        .append(toIndentedString(ootbMetricsVersionInstalledAt))
        .append("\n");
    sb.append("    retentionFiltersEnabled: ")
        .append(toIndentedString(retentionFiltersEnabled))
        .append("\n");
    sb.append("    retentionFiltersEnabledUpdatedAt: ")
        .append(toIndentedString(retentionFiltersEnabledUpdatedAt))
        .append("\n");
    sb.append("    retentionFiltersEnabledUpdatedBy: ")
        .append(toIndentedString(retentionFiltersEnabledUpdatedBy))
        .append("\n");
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
