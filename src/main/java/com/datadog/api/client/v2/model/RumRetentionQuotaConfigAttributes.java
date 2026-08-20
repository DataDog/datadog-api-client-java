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

/** The RUM retention quota configuration properties. */
@JsonPropertyOrder({
  RumRetentionQuotaConfigAttributes.JSON_PROPERTY_ADAPTIVE,
  RumRetentionQuotaConfigAttributes.JSON_PROPERTY_CUSTOM,
  RumRetentionQuotaConfigAttributes.JSON_PROPERTY_MODE,
  RumRetentionQuotaConfigAttributes.JSON_PROPERTY_ORG_ID,
  RumRetentionQuotaConfigAttributes.JSON_PROPERTY_UPDATED_AT,
  RumRetentionQuotaConfigAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRetentionQuotaConfigAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADAPTIVE = "adaptive";
  private RumRetentionQuotaAdaptiveConfig adaptive;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private RumRetentionQuotaCustomConfig custom;

  public static final String JSON_PROPERTY_MODE = "mode";
  private RumRetentionQuotaMode mode;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private String updatedBy;

  public RumRetentionQuotaConfigAttributes() {}

  @JsonCreator
  public RumRetentionQuotaConfigAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) RumRetentionQuotaMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.orgId = orgId;
  }

  public RumRetentionQuotaConfigAttributes adaptive(RumRetentionQuotaAdaptiveConfig adaptive) {
    this.adaptive = adaptive;
    this.unparsed |= adaptive.unparsed;
    return this;
  }

  /**
   * The configuration used when <code>mode</code> is <code>adaptive</code>.
   *
   * @return adaptive
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADAPTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumRetentionQuotaAdaptiveConfig getAdaptive() {
    return adaptive;
  }

  public void setAdaptive(RumRetentionQuotaAdaptiveConfig adaptive) {
    this.adaptive = adaptive;
    if (adaptive != null) {
      this.unparsed |= adaptive.unparsed;
    }
  }

  public RumRetentionQuotaConfigAttributes custom(RumRetentionQuotaCustomConfig custom) {
    this.custom = custom;
    this.unparsed |= custom.unparsed;
    return this;
  }

  /**
   * The configuration used when <code>mode</code> is <code>custom</code>.
   *
   * @return custom
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumRetentionQuotaCustomConfig getCustom() {
    return custom;
  }

  public void setCustom(RumRetentionQuotaCustomConfig custom) {
    this.custom = custom;
    if (custom != null) {
      this.unparsed |= custom.unparsed;
    }
  }

  public RumRetentionQuotaConfigAttributes mode(RumRetentionQuotaMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * The retention quota mode. <code>custom</code> enforces a fixed session limit, while <code>
   * adaptive</code> dynamically adjusts retention.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumRetentionQuotaMode getMode() {
    return mode;
  }

  public void setMode(RumRetentionQuotaMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public RumRetentionQuotaConfigAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The ID of the organization the retention quota configuration belongs to.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public RumRetentionQuotaConfigAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date the retention quota configuration was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public RumRetentionQuotaConfigAttributes updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * The handle of the user who last updated the retention quota configuration.
   *
   * @return updatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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
   * @return RumRetentionQuotaConfigAttributes
   */
  @JsonAnySetter
  public RumRetentionQuotaConfigAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumRetentionQuotaConfigAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRetentionQuotaConfigAttributes rumRetentionQuotaConfigAttributes =
        (RumRetentionQuotaConfigAttributes) o;
    return Objects.equals(this.adaptive, rumRetentionQuotaConfigAttributes.adaptive)
        && Objects.equals(this.custom, rumRetentionQuotaConfigAttributes.custom)
        && Objects.equals(this.mode, rumRetentionQuotaConfigAttributes.mode)
        && Objects.equals(this.orgId, rumRetentionQuotaConfigAttributes.orgId)
        && Objects.equals(this.updatedAt, rumRetentionQuotaConfigAttributes.updatedAt)
        && Objects.equals(this.updatedBy, rumRetentionQuotaConfigAttributes.updatedBy)
        && Objects.equals(
            this.additionalProperties, rumRetentionQuotaConfigAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptive, custom, mode, orgId, updatedAt, updatedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRetentionQuotaConfigAttributes {\n");
    sb.append("    adaptive: ").append(toIndentedString(adaptive)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
