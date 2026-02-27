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

/** A template-based query block within a segment data query. */
@JsonPropertyOrder({
  RumSegmentTemplateInstance.JSON_PROPERTY_FROM,
  RumSegmentTemplateInstance.JSON_PROPERTY_PARAMETERS,
  RumSegmentTemplateInstance.JSON_PROPERTY_TEMPLATE_ID,
  RumSegmentTemplateInstance.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSegmentTemplateInstance {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private Map<String, String> parameters = null;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "template_id";
  private String templateId;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public RumSegmentTemplateInstance() {}

  @JsonCreator
  public RumSegmentTemplateInstance(
      @JsonProperty(required = true, value = JSON_PROPERTY_TEMPLATE_ID) String templateId) {
    this.templateId = templateId;
  }

  public RumSegmentTemplateInstance from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * The start of the time range in milliseconds since epoch.
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public RumSegmentTemplateInstance parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public RumSegmentTemplateInstance putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * The template parameters as key-value pairs.
   *
   * @return parameters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public RumSegmentTemplateInstance templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The identifier of the template.
   *
   * @return templateId
   */
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public RumSegmentTemplateInstance to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * The end of the time range in milliseconds since epoch.
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
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
   * @return RumSegmentTemplateInstance
   */
  @JsonAnySetter
  public RumSegmentTemplateInstance putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSegmentTemplateInstance object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSegmentTemplateInstance rumSegmentTemplateInstance = (RumSegmentTemplateInstance) o;
    return Objects.equals(this.from, rumSegmentTemplateInstance.from)
        && Objects.equals(this.parameters, rumSegmentTemplateInstance.parameters)
        && Objects.equals(this.templateId, rumSegmentTemplateInstance.templateId)
        && Objects.equals(this.to, rumSegmentTemplateInstance.to)
        && Objects.equals(
            this.additionalProperties, rumSegmentTemplateInstance.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, parameters, templateId, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSegmentTemplateInstance {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
