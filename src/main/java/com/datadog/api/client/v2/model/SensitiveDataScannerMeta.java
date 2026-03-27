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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Meta response containing information about the API. */
@JsonPropertyOrder({
  SensitiveDataScannerMeta.JSON_PROPERTY_COUNT_LIMIT,
  SensitiveDataScannerMeta.JSON_PROPERTY_GROUP_COUNT_LIMIT,
  SensitiveDataScannerMeta.JSON_PROPERTY_HAS_HIGHLIGHT_ENABLED,
  SensitiveDataScannerMeta.JSON_PROPERTY_HAS_MULTI_PASS_ENABLED,
  SensitiveDataScannerMeta.JSON_PROPERTY_IS_PCI_COMPLIANT,
  SensitiveDataScannerMeta.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT_LIMIT = "count_limit";
  private Long countLimit;

  public static final String JSON_PROPERTY_GROUP_COUNT_LIMIT = "group_count_limit";
  private Long groupCountLimit;

  public static final String JSON_PROPERTY_HAS_HIGHLIGHT_ENABLED = "has_highlight_enabled";
  private Boolean hasHighlightEnabled = true;

  public static final String JSON_PROPERTY_HAS_MULTI_PASS_ENABLED = "has_multi_pass_enabled";
  private Boolean hasMultiPassEnabled;

  public static final String JSON_PROPERTY_IS_PCI_COMPLIANT = "is_pci_compliant";
  private Boolean isPciCompliant;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SensitiveDataScannerMeta countLimit(Long countLimit) {
    this.countLimit = countLimit;
    return this;
  }

  /**
   * Maximum number of scanning rules allowed for the org.
   *
   * @return countLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCountLimit() {
    return countLimit;
  }

  public void setCountLimit(Long countLimit) {
    this.countLimit = countLimit;
  }

  public SensitiveDataScannerMeta groupCountLimit(Long groupCountLimit) {
    this.groupCountLimit = groupCountLimit;
    return this;
  }

  /**
   * Maximum number of scanning groups allowed for the org.
   *
   * @return groupCountLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_COUNT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getGroupCountLimit() {
    return groupCountLimit;
  }

  public void setGroupCountLimit(Long groupCountLimit) {
    this.groupCountLimit = groupCountLimit;
  }

  public SensitiveDataScannerMeta hasHighlightEnabled(Boolean hasHighlightEnabled) {
    this.hasHighlightEnabled = hasHighlightEnabled;
    return this;
  }

  /**
   * (Deprecated) Whether or not scanned events are highlighted in Logs or RUM for the org.
   *
   * @return hasHighlightEnabled
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_HIGHLIGHT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasHighlightEnabled() {
    return hasHighlightEnabled;
  }

  @Deprecated
  public void setHasHighlightEnabled(Boolean hasHighlightEnabled) {
    this.hasHighlightEnabled = hasHighlightEnabled;
  }

  public SensitiveDataScannerMeta hasMultiPassEnabled(Boolean hasMultiPassEnabled) {
    this.hasMultiPassEnabled = hasMultiPassEnabled;
    return this;
  }

  /**
   * (Deprecated) Whether or not scanned events have multi-pass enabled.
   *
   * @return hasMultiPassEnabled
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MULTI_PASS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasMultiPassEnabled() {
    return hasMultiPassEnabled;
  }

  @Deprecated
  public void setHasMultiPassEnabled(Boolean hasMultiPassEnabled) {
    this.hasMultiPassEnabled = hasMultiPassEnabled;
  }

  public SensitiveDataScannerMeta isPciCompliant(Boolean isPciCompliant) {
    this.isPciCompliant = isPciCompliant;
    return this;
  }

  /**
   * Whether or not the org is compliant to the payment card industry standard.
   *
   * @return isPciCompliant
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PCI_COMPLIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsPciCompliant() {
    return isPciCompliant;
  }

  public void setIsPciCompliant(Boolean isPciCompliant) {
    this.isPciCompliant = isPciCompliant;
  }

  public SensitiveDataScannerMeta version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the API. minimum: 0
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return SensitiveDataScannerMeta
   */
  @JsonAnySetter
  public SensitiveDataScannerMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SensitiveDataScannerMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerMeta sensitiveDataScannerMeta = (SensitiveDataScannerMeta) o;
    return Objects.equals(this.countLimit, sensitiveDataScannerMeta.countLimit)
        && Objects.equals(this.groupCountLimit, sensitiveDataScannerMeta.groupCountLimit)
        && Objects.equals(this.hasHighlightEnabled, sensitiveDataScannerMeta.hasHighlightEnabled)
        && Objects.equals(this.hasMultiPassEnabled, sensitiveDataScannerMeta.hasMultiPassEnabled)
        && Objects.equals(this.isPciCompliant, sensitiveDataScannerMeta.isPciCompliant)
        && Objects.equals(this.version, sensitiveDataScannerMeta.version)
        && Objects.equals(this.additionalProperties, sensitiveDataScannerMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        countLimit,
        groupCountLimit,
        hasHighlightEnabled,
        hasMultiPassEnabled,
        isPciCompliant,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerMeta {\n");
    sb.append("    countLimit: ").append(toIndentedString(countLimit)).append("\n");
    sb.append("    groupCountLimit: ").append(toIndentedString(groupCountLimit)).append("\n");
    sb.append("    hasHighlightEnabled: ")
        .append(toIndentedString(hasHighlightEnabled))
        .append("\n");
    sb.append("    hasMultiPassEnabled: ")
        .append(toIndentedString(hasMultiPassEnabled))
        .append("\n");
    sb.append("    isPciCompliant: ").append(toIndentedString(isPciCompliant)).append("\n");
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
