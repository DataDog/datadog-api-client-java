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
 * The <code>splunk_hec</code> destination forwards logs to Splunk using the HTTP Event Collector
 * (HEC).
 */
@JsonPropertyOrder({
  ObservabilityPipelineSplunkHecDestination.JSON_PROPERTY_AUTO_EXTRACT_TIMESTAMP,
  ObservabilityPipelineSplunkHecDestination.JSON_PROPERTY_ENCODING,
  ObservabilityPipelineSplunkHecDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineSplunkHecDestination.JSON_PROPERTY_INDEX,
  ObservabilityPipelineSplunkHecDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineSplunkHecDestination.JSON_PROPERTY_SOURCETYPE,
  ObservabilityPipelineSplunkHecDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSplunkHecDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_EXTRACT_TIMESTAMP = "auto_extract_timestamp";
  private Boolean autoExtractTimestamp;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private ObservabilityPipelineSplunkHecDestinationEncoding encoding;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCETYPE = "sourcetype";
  private String sourcetype;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSplunkHecDestinationType type =
      ObservabilityPipelineSplunkHecDestinationType.SPLUNK_HEC;

  public ObservabilityPipelineSplunkHecDestination() {}

  @JsonCreator
  public ObservabilityPipelineSplunkHecDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineSplunkHecDestinationType type) {
    this.id = id;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineSplunkHecDestination autoExtractTimestamp(
      Boolean autoExtractTimestamp) {
    this.autoExtractTimestamp = autoExtractTimestamp;
    return this;
  }

  /**
   * If <code>true</code>, Splunk tries to extract timestamps from incoming log events. If <code>
   * false</code>, Splunk assigns the time the event was received.
   *
   * @return autoExtractTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_EXTRACT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoExtractTimestamp() {
    return autoExtractTimestamp;
  }

  public void setAutoExtractTimestamp(Boolean autoExtractTimestamp) {
    this.autoExtractTimestamp = autoExtractTimestamp;
  }

  public ObservabilityPipelineSplunkHecDestination encoding(
      ObservabilityPipelineSplunkHecDestinationEncoding encoding) {
    this.encoding = encoding;
    this.unparsed |= !encoding.isValid();
    return this;
  }

  /**
   * Encoding format for log events.
   *
   * @return encoding
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineSplunkHecDestinationEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(ObservabilityPipelineSplunkHecDestinationEncoding encoding) {
    if (!encoding.isValid()) {
      this.unparsed = true;
    }
    this.encoding = encoding;
  }

  public ObservabilityPipelineSplunkHecDestination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used to reference this component in other parts of
   * the pipeline (e.g., as input to downstream components).
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

  public ObservabilityPipelineSplunkHecDestination index(String index) {
    this.index = index;
    return this;
  }

  /**
   * Optional name of the Splunk index where logs are written.
   *
   * @return index
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public ObservabilityPipelineSplunkHecDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineSplunkHecDestination addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineSplunkHecDestination sourcetype(String sourcetype) {
    this.sourcetype = sourcetype;
    return this;
  }

  /**
   * The Splunk sourcetype to assign to log events.
   *
   * @return sourcetype
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCETYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSourcetype() {
    return sourcetype;
  }

  public void setSourcetype(String sourcetype) {
    this.sourcetype = sourcetype;
  }

  public ObservabilityPipelineSplunkHecDestination type(
      ObservabilityPipelineSplunkHecDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. Always <code>splunk_hec</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSplunkHecDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineSplunkHecDestinationType type) {
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
   * @return ObservabilityPipelineSplunkHecDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineSplunkHecDestination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineSplunkHecDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSplunkHecDestination observabilityPipelineSplunkHecDestination =
        (ObservabilityPipelineSplunkHecDestination) o;
    return Objects.equals(
            this.autoExtractTimestamp,
            observabilityPipelineSplunkHecDestination.autoExtractTimestamp)
        && Objects.equals(this.encoding, observabilityPipelineSplunkHecDestination.encoding)
        && Objects.equals(this.id, observabilityPipelineSplunkHecDestination.id)
        && Objects.equals(this.index, observabilityPipelineSplunkHecDestination.index)
        && Objects.equals(this.inputs, observabilityPipelineSplunkHecDestination.inputs)
        && Objects.equals(this.sourcetype, observabilityPipelineSplunkHecDestination.sourcetype)
        && Objects.equals(this.type, observabilityPipelineSplunkHecDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSplunkHecDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoExtractTimestamp, encoding, id, index, inputs, sourcetype, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSplunkHecDestination {\n");
    sb.append("    autoExtractTimestamp: ")
        .append(toIndentedString(autoExtractTimestamp))
        .append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    sourcetype: ").append(toIndentedString(sourcetype)).append("\n");
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
