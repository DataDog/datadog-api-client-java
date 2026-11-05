/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Catalog pricing configuration with optional manual rate overrides. */
@JsonPropertyOrder({
  AiGatewayModelPricingCatalogRequestConfig.JSON_PROPERTY_OVERRIDES,
  AiGatewayModelPricingCatalogRequestConfig.JSON_PROPERTY_SOURCE,
  AiGatewayModelPricingCatalogRequestConfig.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelPricingCatalogRequestConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OVERRIDES = "overrides";
  private AiGatewayModelPricingRates overrides;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private AiGatewayModelPricingCatalogRequestSource source;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public AiGatewayModelPricingCatalogRequestConfig() {}

  @JsonCreator
  public AiGatewayModelPricingCatalogRequestConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          AiGatewayModelPricingCatalogRequestSource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.source = source;
    this.unparsed |= source.unparsed;
    this.version = version;
  }

  public AiGatewayModelPricingCatalogRequestConfig overrides(AiGatewayModelPricingRates overrides) {
    this.overrides = overrides;
    this.unparsed |= overrides.unparsed;
    return this;
  }

  /**
   * Pricing rates for a model.
   *
   * @return overrides
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelPricingRates getOverrides() {
    return overrides;
  }

  public void setOverrides(AiGatewayModelPricingRates overrides) {
    this.overrides = overrides;
    if (overrides != null) {
      this.unparsed |= overrides.unparsed;
    }
  }

  public AiGatewayModelPricingCatalogRequestConfig source(
      AiGatewayModelPricingCatalogRequestSource source) {
    this.source = source;
    this.unparsed |= source.unparsed;
    return this;
  }

  /**
   * Source for a catalog pricing configuration.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelPricingCatalogRequestSource getSource() {
    return source;
  }

  public void setSource(AiGatewayModelPricingCatalogRequestSource source) {
    this.source = source;
    if (source != null) {
      this.unparsed |= source.unparsed;
    }
  }

  public AiGatewayModelPricingCatalogRequestConfig version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Pricing configuration version. The only supported version is <code>1</code>. minimum: 1
   * maximum: 1
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

  /** Return true if this AiGatewayModelPricingCatalogRequestConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelPricingCatalogRequestConfig aiGatewayModelPricingCatalogRequestConfig =
        (AiGatewayModelPricingCatalogRequestConfig) o;
    return Objects.equals(this.overrides, aiGatewayModelPricingCatalogRequestConfig.overrides)
        && Objects.equals(this.source, aiGatewayModelPricingCatalogRequestConfig.source)
        && Objects.equals(this.version, aiGatewayModelPricingCatalogRequestConfig.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrides, source, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelPricingCatalogRequestConfig {\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
