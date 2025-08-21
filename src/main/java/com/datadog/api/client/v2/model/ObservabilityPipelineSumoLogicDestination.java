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

/** The <code>sumo_logic</code> destination forwards logs to Sumo Logic. */
@JsonPropertyOrder({
  ObservabilityPipelineSumoLogicDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineSumoLogicDestination.JSON_PROPERTY_ENCODING,
  ObservabilityPipelineSumoLogicDestination.JSON_PROPERTY_HEADER_CUSTOM_FIELDS,
  ObservabilityPipelineSumoLogicDestination.JSON_PROPERTY_HEADER_HOST_NAME,
  ObservabilityPipelineSumoLogicDestination.JSON_PROPERTY_HEADER_SOURCE_CATEGORY,
  ObservabilityPipelineSumoLogicDestination.JSON_PROPERTY_HEADER_SOURCE_NAME,
  ObservabilityPipelineSumoLogicDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineSumoLogicDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineSumoLogicDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSumoLogicDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private ObservabilityPipelineSumoLogicDestinationEncoding encoding;

  public static final String JSON_PROPERTY_HEADER_CUSTOM_FIELDS = "header_custom_fields";
  private List<ObservabilityPipelineSumoLogicDestinationHeaderCustomFieldsItem> headerCustomFields =
      null;

  public static final String JSON_PROPERTY_HEADER_HOST_NAME = "header_host_name";
  private String headerHostName;

  public static final String JSON_PROPERTY_HEADER_SOURCE_CATEGORY = "header_source_category";
  private String headerSourceCategory;

  public static final String JSON_PROPERTY_HEADER_SOURCE_NAME = "header_source_name";
  private String headerSourceName;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSumoLogicDestinationType type =
      ObservabilityPipelineSumoLogicDestinationType.SUMO_LOGIC;

  public ObservabilityPipelineSumoLogicDestination() {}

  @JsonCreator
  public ObservabilityPipelineSumoLogicDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineSumoLogicDestinationType type) {
    this.id = id;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineSumoLogicDestination buffer(
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

  public ObservabilityPipelineSumoLogicDestination encoding(
      ObservabilityPipelineSumoLogicDestinationEncoding encoding) {
    this.encoding = encoding;
    this.unparsed |= !encoding.isValid();
    return this;
  }

  /**
   * The output encoding format.
   *
   * @return encoding
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineSumoLogicDestinationEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(ObservabilityPipelineSumoLogicDestinationEncoding encoding) {
    if (!encoding.isValid()) {
      this.unparsed = true;
    }
    this.encoding = encoding;
  }

  public ObservabilityPipelineSumoLogicDestination headerCustomFields(
      List<ObservabilityPipelineSumoLogicDestinationHeaderCustomFieldsItem> headerCustomFields) {
    this.headerCustomFields = headerCustomFields;
    for (ObservabilityPipelineSumoLogicDestinationHeaderCustomFieldsItem item :
        headerCustomFields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineSumoLogicDestination addHeaderCustomFieldsItem(
      ObservabilityPipelineSumoLogicDestinationHeaderCustomFieldsItem headerCustomFieldsItem) {
    if (this.headerCustomFields == null) {
      this.headerCustomFields = new ArrayList<>();
    }
    this.headerCustomFields.add(headerCustomFieldsItem);
    this.unparsed |= headerCustomFieldsItem.unparsed;
    return this;
  }

  /**
   * A list of custom headers to include in the request to Sumo Logic.
   *
   * @return headerCustomFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ObservabilityPipelineSumoLogicDestinationHeaderCustomFieldsItem>
      getHeaderCustomFields() {
    return headerCustomFields;
  }

  public void setHeaderCustomFields(
      List<ObservabilityPipelineSumoLogicDestinationHeaderCustomFieldsItem> headerCustomFields) {
    this.headerCustomFields = headerCustomFields;
  }

  public ObservabilityPipelineSumoLogicDestination headerHostName(String headerHostName) {
    this.headerHostName = headerHostName;
    return this;
  }

  /**
   * Optional override for the host name header.
   *
   * @return headerHostName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER_HOST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHeaderHostName() {
    return headerHostName;
  }

  public void setHeaderHostName(String headerHostName) {
    this.headerHostName = headerHostName;
  }

  public ObservabilityPipelineSumoLogicDestination headerSourceCategory(
      String headerSourceCategory) {
    this.headerSourceCategory = headerSourceCategory;
    return this;
  }

  /**
   * Optional override for the source category header.
   *
   * @return headerSourceCategory
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER_SOURCE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHeaderSourceCategory() {
    return headerSourceCategory;
  }

  public void setHeaderSourceCategory(String headerSourceCategory) {
    this.headerSourceCategory = headerSourceCategory;
  }

  public ObservabilityPipelineSumoLogicDestination headerSourceName(String headerSourceName) {
    this.headerSourceName = headerSourceName;
    return this;
  }

  /**
   * Optional override for the source name header.
   *
   * @return headerSourceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHeaderSourceName() {
    return headerSourceName;
  }

  public void setHeaderSourceName(String headerSourceName) {
    this.headerSourceName = headerSourceName;
  }

  public ObservabilityPipelineSumoLogicDestination id(String id) {
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

  public ObservabilityPipelineSumoLogicDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineSumoLogicDestination addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineSumoLogicDestination type(
      ObservabilityPipelineSumoLogicDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>sumo_logic</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSumoLogicDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineSumoLogicDestinationType type) {
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
   * @return ObservabilityPipelineSumoLogicDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineSumoLogicDestination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineSumoLogicDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSumoLogicDestination observabilityPipelineSumoLogicDestination =
        (ObservabilityPipelineSumoLogicDestination) o;
    return Objects.equals(this.buffer, observabilityPipelineSumoLogicDestination.buffer)
        && Objects.equals(this.encoding, observabilityPipelineSumoLogicDestination.encoding)
        && Objects.equals(
            this.headerCustomFields, observabilityPipelineSumoLogicDestination.headerCustomFields)
        && Objects.equals(
            this.headerHostName, observabilityPipelineSumoLogicDestination.headerHostName)
        && Objects.equals(
            this.headerSourceCategory,
            observabilityPipelineSumoLogicDestination.headerSourceCategory)
        && Objects.equals(
            this.headerSourceName, observabilityPipelineSumoLogicDestination.headerSourceName)
        && Objects.equals(this.id, observabilityPipelineSumoLogicDestination.id)
        && Objects.equals(this.inputs, observabilityPipelineSumoLogicDestination.inputs)
        && Objects.equals(this.type, observabilityPipelineSumoLogicDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSumoLogicDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        buffer,
        encoding,
        headerCustomFields,
        headerHostName,
        headerSourceCategory,
        headerSourceName,
        id,
        inputs,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSumoLogicDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    headerCustomFields: ").append(toIndentedString(headerCustomFields)).append("\n");
    sb.append("    headerHostName: ").append(toIndentedString(headerHostName)).append("\n");
    sb.append("    headerSourceCategory: ")
        .append(toIndentedString(headerSourceCategory))
        .append("\n");
    sb.append("    headerSourceName: ").append(toIndentedString(headerSourceName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
