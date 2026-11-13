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

/** The policy the bandit serves. Null until the bandit starts. */
@JsonPropertyOrder({
  ExperimentsBanditPolicyV2.JSON_PROPERTY_APPLIED_AT,
  ExperimentsBanditPolicyV2.JSON_PROPERTY_CONFIG_VERSION,
  ExperimentsBanditPolicyV2.JSON_PROPERTY_ID,
  ExperimentsBanditPolicyV2.JSON_PROPERTY_KIND,
  ExperimentsBanditPolicyV2.JSON_PROPERTY_REASON,
  ExperimentsBanditPolicyV2.JSON_PROPERTY_VARIANTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditPolicyV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLIED_AT = "applied_at";
  private OffsetDateTime appliedAt;

  public static final String JSON_PROPERTY_CONFIG_VERSION = "config_version";
  private Long configVersion;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private ExperimentsBanditPolicyKind kind;

  public static final String JSON_PROPERTY_REASON = "reason";
  private ExperimentsBanditPolicyReason reason;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ExperimentsBanditPolicyVariantV2> variants = new ArrayList<>();

  public ExperimentsBanditPolicyV2() {}

  @JsonCreator
  public ExperimentsBanditPolicyV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLIED_AT) OffsetDateTime appliedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG_VERSION) Long configVersion,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) UUID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_KIND) ExperimentsBanditPolicyKind kind,
      @JsonProperty(required = true, value = JSON_PROPERTY_REASON)
          ExperimentsBanditPolicyReason reason,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANTS)
          List<ExperimentsBanditPolicyVariantV2> variants) {
    this.appliedAt = appliedAt;
    this.configVersion = configVersion;
    this.id = id;
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    this.variants = variants;
    for (ExperimentsBanditPolicyVariantV2 item : variants) {
      this.unparsed |= item.unparsed;
    }
  }

  public ExperimentsBanditPolicyV2 appliedAt(OffsetDateTime appliedAt) {
    this.appliedAt = appliedAt;
    return this;
  }

  /**
   * When the policy started being served.
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

  public ExperimentsBanditPolicyV2 configVersion(Long configVersion) {
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

  public ExperimentsBanditPolicyV2 id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The policy ID. Each exposure logs it as <code>bandit.policy_id</code>.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ExperimentsBanditPolicyV2 kind(ExperimentsBanditPolicyKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * WARMUP serves the arms equally. ADAPTIVE serves the initial split or a split from a refresh.
   * FALLBACK serves one variant after the bandit ends.
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

  public ExperimentsBanditPolicyV2 reason(ExperimentsBanditPolicyReason reason) {
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

  public ExperimentsBanditPolicyV2 variants(List<ExperimentsBanditPolicyVariantV2> variants) {
    this.variants = variants;
    for (ExperimentsBanditPolicyVariantV2 item : variants) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsBanditPolicyV2 addVariantsItem(ExperimentsBanditPolicyVariantV2 variantsItem) {
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * Each variant's share of traffic. The probabilities add up to 1.
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
   * @return ExperimentsBanditPolicyV2
   */
  @JsonAnySetter
  public ExperimentsBanditPolicyV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditPolicyV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditPolicyV2 experimentsBanditPolicyV2 = (ExperimentsBanditPolicyV2) o;
    return Objects.equals(this.appliedAt, experimentsBanditPolicyV2.appliedAt)
        && Objects.equals(this.configVersion, experimentsBanditPolicyV2.configVersion)
        && Objects.equals(this.id, experimentsBanditPolicyV2.id)
        && Objects.equals(this.kind, experimentsBanditPolicyV2.kind)
        && Objects.equals(this.reason, experimentsBanditPolicyV2.reason)
        && Objects.equals(this.variants, experimentsBanditPolicyV2.variants)
        && Objects.equals(
            this.additionalProperties, experimentsBanditPolicyV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedAt, configVersion, id, kind, reason, variants, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditPolicyV2 {\n");
    sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
