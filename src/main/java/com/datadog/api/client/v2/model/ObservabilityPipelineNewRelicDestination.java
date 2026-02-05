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

/**
 * The <code>new_relic</code> destination sends logs to the New Relic platform.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineNewRelicDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineNewRelicDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineNewRelicDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineNewRelicDestination.JSON_PROPERTY_REGION,
  ObservabilityPipelineNewRelicDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineNewRelicDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_REGION = "region";
  private ObservabilityPipelineNewRelicDestinationRegion region;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineNewRelicDestinationType type =
      ObservabilityPipelineNewRelicDestinationType.NEW_RELIC;

  public ObservabilityPipelineNewRelicDestination() {}

  @JsonCreator
  public ObservabilityPipelineNewRelicDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION)
          ObservabilityPipelineNewRelicDestinationRegion region,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineNewRelicDestinationType type) {
    this.id = id;
    this.inputs = inputs;
    this.region = region;
    this.unparsed |= !region.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineNewRelicDestination buffer(
      ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    this.unparsed |= buffer.unparsed;
    return this;
  }

  /**
   * Configuration for buffer settings on destination components.
   *
   * @return buffer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUFFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineBufferOptions getBuffer() {
    return buffer;
  }

  public void setBuffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
  }

  public ObservabilityPipelineNewRelicDestination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ObservabilityPipelineNewRelicDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineNewRelicDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of component IDs whose output is used as the <code>input</code> for this component.
   *
   * @return inputs
   */
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public ObservabilityPipelineNewRelicDestination region(
      ObservabilityPipelineNewRelicDestinationRegion region) {
    this.region = region;
    this.unparsed |= !region.isValid();
    return this;
  }

  /**
   * The New Relic region.
   *
   * @return region
   */
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineNewRelicDestinationRegion getRegion() {
    return region;
  }

  public void setRegion(ObservabilityPipelineNewRelicDestinationRegion region) {
    if (!region.isValid()) {
      this.unparsed = true;
    }
    this.region = region;
  }

  public ObservabilityPipelineNewRelicDestination type(
      ObservabilityPipelineNewRelicDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>new_relic</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineNewRelicDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineNewRelicDestinationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineNewRelicDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineNewRelicDestination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineNewRelicDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineNewRelicDestination observabilityPipelineNewRelicDestination =
        (ObservabilityPipelineNewRelicDestination) o;
    return Objects.equals(this.buffer, observabilityPipelineNewRelicDestination.buffer)
        && Objects.equals(this.id, observabilityPipelineNewRelicDestination.id)
        && Objects.equals(this.inputs, observabilityPipelineNewRelicDestination.inputs)
        && Objects.equals(this.region, observabilityPipelineNewRelicDestination.region)
        && Objects.equals(this.type, observabilityPipelineNewRelicDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineNewRelicDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buffer, id, inputs, region, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineNewRelicDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
