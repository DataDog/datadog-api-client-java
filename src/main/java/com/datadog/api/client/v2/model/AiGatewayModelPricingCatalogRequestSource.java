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

/** Source for a catalog pricing configuration. */
@JsonPropertyOrder({
  AiGatewayModelPricingCatalogRequestSource.JSON_PROPERTY_PROVIDER_ID,
  AiGatewayModelPricingCatalogRequestSource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelPricingCatalogRequestSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  private String providerId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AiGatewayModelPricingCatalogRequestSourceType type;

  public AiGatewayModelPricingCatalogRequestSource() {}

  @JsonCreator
  public AiGatewayModelPricingCatalogRequestSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER_ID) String providerId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          AiGatewayModelPricingCatalogRequestSourceType type) {
    this.providerId = providerId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AiGatewayModelPricingCatalogRequestSource providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Pricing catalog provider identifier.
   *
   * @return providerId
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public AiGatewayModelPricingCatalogRequestSource type(
      AiGatewayModelPricingCatalogRequestSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Catalog pricing source type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelPricingCatalogRequestSourceType getType() {
    return type;
  }

  public void setType(AiGatewayModelPricingCatalogRequestSourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this AiGatewayModelPricingCatalogRequestSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelPricingCatalogRequestSource aiGatewayModelPricingCatalogRequestSource =
        (AiGatewayModelPricingCatalogRequestSource) o;
    return Objects.equals(this.providerId, aiGatewayModelPricingCatalogRequestSource.providerId)
        && Objects.equals(this.type, aiGatewayModelPricingCatalogRequestSource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelPricingCatalogRequestSource {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
