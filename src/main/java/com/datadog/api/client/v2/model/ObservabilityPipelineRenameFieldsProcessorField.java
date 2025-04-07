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

/** Defines how to rename a field in log events. */
@JsonPropertyOrder({
  ObservabilityPipelineRenameFieldsProcessorField.JSON_PROPERTY_DESTINATION,
  ObservabilityPipelineRenameFieldsProcessorField.JSON_PROPERTY_PRESERVE_SOURCE,
  ObservabilityPipelineRenameFieldsProcessorField.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineRenameFieldsProcessorField {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private String destination;

  public static final String JSON_PROPERTY_PRESERVE_SOURCE = "preserve_source";
  private Boolean preserveSource;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public ObservabilityPipelineRenameFieldsProcessorField() {}

  @JsonCreator
  public ObservabilityPipelineRenameFieldsProcessorField(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION) String destination,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRESERVE_SOURCE) Boolean preserveSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source) {
    this.destination = destination;
    this.preserveSource = preserveSource;
    this.source = source;
  }

  public ObservabilityPipelineRenameFieldsProcessorField destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * The field name to assign the renamed value to.
   *
   * @return destination
   */
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public ObservabilityPipelineRenameFieldsProcessorField preserveSource(Boolean preserveSource) {
    this.preserveSource = preserveSource;
    return this;
  }

  /**
   * Indicates whether the original field, that is received from the source, should be kept (<code>
   * true</code>) or removed (<code>false</code>) after renaming.
   *
   * @return preserveSource
   */
  @JsonProperty(JSON_PROPERTY_PRESERVE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getPreserveSource() {
    return preserveSource;
  }

  public void setPreserveSource(Boolean preserveSource) {
    this.preserveSource = preserveSource;
  }

  public ObservabilityPipelineRenameFieldsProcessorField source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The original field name in the log event that should be renamed.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
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
   * @return ObservabilityPipelineRenameFieldsProcessorField
   */
  @JsonAnySetter
  public ObservabilityPipelineRenameFieldsProcessorField putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineRenameFieldsProcessorField object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineRenameFieldsProcessorField
        observabilityPipelineRenameFieldsProcessorField =
            (ObservabilityPipelineRenameFieldsProcessorField) o;
    return Objects.equals(
            this.destination, observabilityPipelineRenameFieldsProcessorField.destination)
        && Objects.equals(
            this.preserveSource, observabilityPipelineRenameFieldsProcessorField.preserveSource)
        && Objects.equals(this.source, observabilityPipelineRenameFieldsProcessorField.source)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineRenameFieldsProcessorField.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, preserveSource, source, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineRenameFieldsProcessorField {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    preserveSource: ").append(toIndentedString(preserveSource)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
