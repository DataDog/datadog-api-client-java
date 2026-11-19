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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The variant to serve once the bandit stops. */
@JsonPropertyOrder({ExperimentsStopBanditV2RequestDataAttributes.JSON_PROPERTY_SERVED_VARIANT_KEY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsStopBanditV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SERVED_VARIANT_KEY = "served_variant_key";
  private String servedVariantKey;

  public ExperimentsStopBanditV2RequestDataAttributes() {}

  @JsonCreator
  public ExperimentsStopBanditV2RequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVED_VARIANT_KEY)
          String servedVariantKey) {
    this.servedVariantKey = servedVariantKey;
  }

  public ExperimentsStopBanditV2RequestDataAttributes servedVariantKey(String servedVariantKey) {
    this.servedVariantKey = servedVariantKey;
    return this;
  }

  /**
   * Key of the flag variant to serve to everyone once the bandit stops. It can be any of the flag's
   * variants, and overrides the configured fallback.
   *
   * @return servedVariantKey
   */
  @JsonProperty(JSON_PROPERTY_SERVED_VARIANT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServedVariantKey() {
    return servedVariantKey;
  }

  public void setServedVariantKey(String servedVariantKey) {
    this.servedVariantKey = servedVariantKey;
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
   * @return ExperimentsStopBanditV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsStopBanditV2RequestDataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsStopBanditV2RequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsStopBanditV2RequestDataAttributes experimentsStopBanditV2RequestDataAttributes =
        (ExperimentsStopBanditV2RequestDataAttributes) o;
    return Objects.equals(
            this.servedVariantKey, experimentsStopBanditV2RequestDataAttributes.servedVariantKey)
        && Objects.equals(
            this.additionalProperties,
            experimentsStopBanditV2RequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedVariantKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsStopBanditV2RequestDataAttributes {\n");
    sb.append("    servedVariantKey: ").append(toIndentedString(servedVariantKey)).append("\n");
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
