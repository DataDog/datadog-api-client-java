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
import java.util.UUID;

/** A traffic split the bandit served, with the same fields as <code>active_policy</code>. */
@JsonPropertyOrder({
  ExperimentsBanditPolicyHistoryV2DTODataAttributes.JSON_PROPERTY_APPLIED_AT,
  ExperimentsBanditPolicyHistoryV2DTODataAttributes.JSON_PROPERTY_CONFIG_VERSION,
  ExperimentsBanditPolicyHistoryV2DTODataAttributes.JSON_PROPERTY_IS_ACTIVE,
  ExperimentsBanditPolicyHistoryV2DTODataAttributes.JSON_PROPERTY_KIND,
  ExperimentsBanditPolicyHistoryV2DTODataAttributes.JSON_PROPERTY_POLICY_NUMBER,
  ExperimentsBanditPolicyHistoryV2DTODataAttributes.JSON_PROPERTY_REASON,
  ExperimentsBanditPolicyHistoryV2DTODataAttributes.JSON_PROPERTY_REFRESH_ID,
  ExperimentsBanditPolicyHistoryV2DTODataAttributes.JSON_PROPERTY_VARIANTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditPolicyHistoryV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLIED_AT = "applied_at";
  private OffsetDateTime appliedAt;

  public static final String JSON_PROPERTY_CONFIG_VERSION = "config_version";
  private Long configVersion;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_KIND = "kind";
  private ExperimentsBanditPolicyKind kind;

  public static final String JSON_PROPERTY_POLICY_NUMBER = "policy_number";
  private Long policyNumber;

  public static final String JSON_PROPERTY_REASON = "reason";
  private ExperimentsBanditPolicyReason reason;

  public static final String JSON_PROPERTY_REFRESH_ID = "refresh_id";
  private UUID refreshId;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ExperimentsBanditPolicyVariantV2> variants = new ArrayList<>();

  public ExperimentsBanditPolicyHistoryV2DTODataAttributes() {}

  @JsonCreator
  public ExperimentsBanditPolicyHistoryV2DTODataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLIED_AT) OffsetDateTime appliedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG_VERSION) Long configVersion,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ACTIVE) Boolean isActive,
      @JsonProperty(required = true, value = JSON_PROPERTY_KIND) ExperimentsBanditPolicyKind kind,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_NUMBER) Long policyNumber,
      @JsonProperty(required = true, value = JSON_PROPERTY_REASON)
          ExperimentsBanditPolicyReason reason,
      @JsonProperty(required = true, value = JSON_PROPERTY_REFRESH_ID) UUID refreshId,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANTS)
          List<ExperimentsBanditPolicyVariantV2> variants) {
    this.appliedAt = appliedAt;
    this.configVersion = configVersion;
    this.isActive = isActive;
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    this.policyNumber = policyNumber;
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    this.refreshId = refreshId;
    if (refreshId != null) {}
    this.variants = variants;
    for (ExperimentsBanditPolicyVariantV2 item : variants) {
      this.unparsed |= item.unparsed;
    }
  }

  public ExperimentsBanditPolicyHistoryV2DTODataAttributes appliedAt(OffsetDateTime appliedAt) {
    this.appliedAt = appliedAt;
    return this;
  }

  /**
   * When the policy was saved. SDKs pick it up on their next configuration fetch.
   *
   * @return appliedAt
   */
  @JsonProperty(JSON_PROPERTY_APPLIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getAppliedAt() {
    return appliedAt;
  }

  public void setAppliedAt(OffsetDateTime appliedAt) {
    this.appliedAt = appliedAt;
  }

  public ExperimentsBanditPolicyHistoryV2DTODataAttributes configVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  /**
   * The configuration version the policy was made for.
   *
   * @return configVersion
   */
  @JsonProperty(JSON_PROPERTY_CONFIG_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getConfigVersion() {
    return configVersion;
  }

  public void setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
  }

  public ExperimentsBanditPolicyHistoryV2DTODataAttributes isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Whether this is the policy the bandit serves now, the one Get bandit returns as <code>
   * active_policy</code>. A paused bandit keeps serving it, and an ended bandit serves its
   * fallback.
   *
   * @return isActive
   */
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public ExperimentsBanditPolicyHistoryV2DTODataAttributes kind(ExperimentsBanditPolicyKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * <code>WARMUP</code> serves the arms equally. <code>ADAPTIVE</code> serves the initial split or
   * a split from a refresh. <code>FALLBACK</code> serves one variant after the bandit ends.
   *
   * @return kind
   */
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditPolicyKind getKind() {
    return kind;
  }

  public void setKind(ExperimentsBanditPolicyKind kind) {
    if (!kind.isValid()) {
      this.unparsed = true;
    }
    this.kind = kind;
  }

  public ExperimentsBanditPolicyHistoryV2DTODataAttributes policyNumber(Long policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

  /**
   * The policy's place in the bandit's policy history. It follows <code>applied_at</code> and
   * orders policies saved at the same time.
   *
   * @return policyNumber
   */
  @JsonProperty(JSON_PROPERTY_POLICY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(Long policyNumber) {
    this.policyNumber = policyNumber;
  }

  public ExperimentsBanditPolicyHistoryV2DTODataAttributes reason(
      ExperimentsBanditPolicyReason reason) {
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    return this;
  }

  /**
   * Why the policy was applied.
   *
   * @return reason
   */
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditPolicyReason getReason() {
    return reason;
  }

  public void setReason(ExperimentsBanditPolicyReason reason) {
    if (!reason.isValid()) {
      this.unparsed = true;
    }
    this.reason = reason;
  }

  public ExperimentsBanditPolicyHistoryV2DTODataAttributes refreshId(UUID refreshId) {
    this.refreshId = refreshId;
    if (refreshId != null) {}
    return this;
  }

  /**
   * The refresh that proposed the policy. <code>null</code> for policies no refresh proposed, such
   * as the first split and the policy served after the bandit ends.
   *
   * @return refreshId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFRESH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getRefreshId() {
    return refreshId;
  }

  public void setRefreshId(UUID refreshId) {
    this.refreshId = refreshId;
  }

  public ExperimentsBanditPolicyHistoryV2DTODataAttributes variants(
      List<ExperimentsBanditPolicyVariantV2> variants) {
    this.variants = variants;
    for (ExperimentsBanditPolicyVariantV2 item : variants) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsBanditPolicyHistoryV2DTODataAttributes addVariantsItem(
      ExperimentsBanditPolicyVariantV2 variantsItem) {
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * Each variant's share of traffic. The probabilities add up to 1. A variant served as an arm
   * keeps the key the arm had, even if the arm was removed later.
   *
   * @return variants
   */
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsBanditPolicyVariantV2> getVariants() {
    return variants;
  }

  public void setVariants(List<ExperimentsBanditPolicyVariantV2> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsBanditPolicyVariantV2 item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return ExperimentsBanditPolicyHistoryV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsBanditPolicyHistoryV2DTODataAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ExperimentsBanditPolicyHistoryV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditPolicyHistoryV2DTODataAttributes
        experimentsBanditPolicyHistoryV2DtoDataAttributes =
            (ExperimentsBanditPolicyHistoryV2DTODataAttributes) o;
    return Objects.equals(
            this.appliedAt, experimentsBanditPolicyHistoryV2DtoDataAttributes.appliedAt)
        && Objects.equals(
            this.configVersion, experimentsBanditPolicyHistoryV2DtoDataAttributes.configVersion)
        && Objects.equals(this.isActive, experimentsBanditPolicyHistoryV2DtoDataAttributes.isActive)
        && Objects.equals(this.kind, experimentsBanditPolicyHistoryV2DtoDataAttributes.kind)
        && Objects.equals(
            this.policyNumber, experimentsBanditPolicyHistoryV2DtoDataAttributes.policyNumber)
        && Objects.equals(this.reason, experimentsBanditPolicyHistoryV2DtoDataAttributes.reason)
        && Objects.equals(
            this.refreshId, experimentsBanditPolicyHistoryV2DtoDataAttributes.refreshId)
        && Objects.equals(this.variants, experimentsBanditPolicyHistoryV2DtoDataAttributes.variants)
        && Objects.equals(
            this.additionalProperties,
            experimentsBanditPolicyHistoryV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        appliedAt,
        configVersion,
        isActive,
        kind,
        policyNumber,
        reason,
        refreshId,
        variants,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditPolicyHistoryV2DTODataAttributes {\n");
    sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    refreshId: ").append(toIndentedString(refreshId)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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
