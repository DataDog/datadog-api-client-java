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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Model discovered from a provider integration account. */
@JsonPropertyOrder({
  AiGatewayDiscoveredModelAttributes.JSON_PROPERTY_DISPLAY_NAME,
  AiGatewayDiscoveredModelAttributes.JSON_PROPERTY_MODEL_ID_WIRE,
  AiGatewayDiscoveredModelAttributes.JSON_PROPERTY_SUPPORTED_OPERATIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayDiscoveredModelAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_MODEL_ID_WIRE = "model_id_wire";
  private String modelIdWire;

  public static final String JSON_PROPERTY_SUPPORTED_OPERATIONS = "supported_operations";
  private List<AiGatewaySupportedOperation> supportedOperations = new ArrayList<>();

  public AiGatewayDiscoveredModelAttributes() {}

  @JsonCreator
  public AiGatewayDiscoveredModelAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL_ID_WIRE) String modelIdWire,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUPPORTED_OPERATIONS)
          List<AiGatewaySupportedOperation> supportedOperations) {
    this.modelIdWire = modelIdWire;
    this.supportedOperations = supportedOperations;
  }

  public AiGatewayDiscoveredModelAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Human-readable model name.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AiGatewayDiscoveredModelAttributes modelIdWire(String modelIdWire) {
    this.modelIdWire = modelIdWire;
    return this;
  }

  /**
   * Model identifier sent to the provider.
   *
   * @return modelIdWire
   */
  @JsonProperty(JSON_PROPERTY_MODEL_ID_WIRE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModelIdWire() {
    return modelIdWire;
  }

  public void setModelIdWire(String modelIdWire) {
    this.modelIdWire = modelIdWire;
  }

  public AiGatewayDiscoveredModelAttributes supportedOperations(
      List<AiGatewaySupportedOperation> supportedOperations) {
    this.supportedOperations = supportedOperations;
    return this;
  }

  public AiGatewayDiscoveredModelAttributes addSupportedOperationsItem(
      AiGatewaySupportedOperation supportedOperationsItem) {
    this.supportedOperations.add(supportedOperationsItem);
    this.unparsed |= !supportedOperationsItem.isValid();
    return this;
  }

  /**
   * Operations supported by the model.
   *
   * @return supportedOperations
   */
  @JsonProperty(JSON_PROPERTY_SUPPORTED_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewaySupportedOperation> getSupportedOperations() {
    return supportedOperations;
  }

  public void setSupportedOperations(List<AiGatewaySupportedOperation> supportedOperations) {
    this.supportedOperations = supportedOperations;
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
   * @return AiGatewayDiscoveredModelAttributes
   */
  @JsonAnySetter
  public AiGatewayDiscoveredModelAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayDiscoveredModelAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayDiscoveredModelAttributes aiGatewayDiscoveredModelAttributes =
        (AiGatewayDiscoveredModelAttributes) o;
    return Objects.equals(this.displayName, aiGatewayDiscoveredModelAttributes.displayName)
        && Objects.equals(this.modelIdWire, aiGatewayDiscoveredModelAttributes.modelIdWire)
        && Objects.equals(
            this.supportedOperations, aiGatewayDiscoveredModelAttributes.supportedOperations)
        && Objects.equals(
            this.additionalProperties, aiGatewayDiscoveredModelAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, modelIdWire, supportedOperations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayDiscoveredModelAttributes {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    modelIdWire: ").append(toIndentedString(modelIdWire)).append("\n");
    sb.append("    supportedOperations: ")
        .append(toIndentedString(supportedOperations))
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
