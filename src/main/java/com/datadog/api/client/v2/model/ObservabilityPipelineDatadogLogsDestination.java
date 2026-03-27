/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The <code>datadog_logs</code> destination forwards logs to Datadog Log Management.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineDatadogLogsDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineDatadogLogsDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineDatadogLogsDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineDatadogLogsDestination.JSON_PROPERTY_ROUTES,
  ObservabilityPipelineDatadogLogsDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineDatadogLogsDestination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_ROUTES = "routes";
  private List<ObservabilityPipelineDatadogLogsDestinationRoute> routes = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineDatadogLogsDestinationType type = ObservabilityPipelineDatadogLogsDestinationType.DATADOG_LOGS;

  public ObservabilityPipelineDatadogLogsDestination() {}

  @JsonCreator
  public ObservabilityPipelineDatadogLogsDestination(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineDatadogLogsDestinationType type) {
        this.id = id;
        this.inputs = inputs;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineDatadogLogsDestination buffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    this.unparsed |= buffer.unparsed;
    return this;
  }

  /**
   * <p>Configuration for buffer settings on destination components.</p>
   * @return buffer
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUFFER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineBufferOptions getBuffer() {
        return buffer;
      }
  public void setBuffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
  }
  public ObservabilityPipelineDatadogLogsDestination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier for this component.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ObservabilityPipelineDatadogLogsDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineDatadogLogsDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * <p>A list of component IDs whose output is used as the <code>input</code> for this component.</p>
   * @return inputs
  **/
      @JsonProperty(JSON_PROPERTY_INPUTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getInputs() {
        return inputs;
      }
  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }
  public ObservabilityPipelineDatadogLogsDestination routes(List<ObservabilityPipelineDatadogLogsDestinationRoute> routes) {
    this.routes = routes;
    for (ObservabilityPipelineDatadogLogsDestinationRoute item : routes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ObservabilityPipelineDatadogLogsDestination addRoutesItem(ObservabilityPipelineDatadogLogsDestinationRoute routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<>();
    }
    this.routes.add(routesItem);
    this.unparsed |= routesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of routing rules that forward matching logs to Datadog using dedicated API keys.</p>
   * @return routes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ROUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ObservabilityPipelineDatadogLogsDestinationRoute> getRoutes() {
        return routes;
      }
  public void setRoutes(List<ObservabilityPipelineDatadogLogsDestinationRoute> routes) {
    this.routes = routes;
  }
  public ObservabilityPipelineDatadogLogsDestination type(ObservabilityPipelineDatadogLogsDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The destination type. The value should always be <code>datadog_logs</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineDatadogLogsDestinationType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineDatadogLogsDestinationType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ObservabilityPipelineDatadogLogsDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineDatadogLogsDestination putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ObservabilityPipelineDatadogLogsDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineDatadogLogsDestination observabilityPipelineDatadogLogsDestination = (ObservabilityPipelineDatadogLogsDestination) o;
    return Objects.equals(this.buffer, observabilityPipelineDatadogLogsDestination.buffer) && Objects.equals(this.id, observabilityPipelineDatadogLogsDestination.id) && Objects.equals(this.inputs, observabilityPipelineDatadogLogsDestination.inputs) && Objects.equals(this.routes, observabilityPipelineDatadogLogsDestination.routes) && Objects.equals(this.type, observabilityPipelineDatadogLogsDestination.type) && Objects.equals(this.additionalProperties, observabilityPipelineDatadogLogsDestination.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(buffer,id,inputs,routes,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineDatadogLogsDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
