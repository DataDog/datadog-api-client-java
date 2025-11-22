/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  GetCohortRequestDataAttributes.JSON_PROPERTY_DATA_SOURCE,
  GetCohortRequestDataAttributes.JSON_PROPERTY_DEFINITION,
  GetCohortRequestDataAttributes.JSON_PROPERTY_ENFORCED_EXECUTION_TYPE,
  GetCohortRequestDataAttributes.JSON_PROPERTY_REQUEST_ID,
  GetCohortRequestDataAttributes.JSON_PROPERTY_TIME,
  GetCohortRequestDataAttributes.JSON_PROPERTY_WINDOW_SIZE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetCohortRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private String dataSource;

  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private GetCohortRequestDataAttributesDefinition definition;

  public static final String JSON_PROPERTY_ENFORCED_EXECUTION_TYPE = "enforced_execution_type";
  private String enforcedExecutionType;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_TIME = "time";
  private GetCohortRequestDataAttributesTime time;

  public static final String JSON_PROPERTY_WINDOW_SIZE = "window_size";
  private String windowSize;

  public GetCohortRequestDataAttributes dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * GetdataSource
   *
   * @return dataSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public GetCohortRequestDataAttributes definition(
      GetCohortRequestDataAttributesDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * Getdefinition
   *
   * @return definition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetCohortRequestDataAttributesDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(GetCohortRequestDataAttributesDefinition definition) {
    this.definition = definition;
  }

  public GetCohortRequestDataAttributes enforcedExecutionType(String enforcedExecutionType) {
    this.enforcedExecutionType = enforcedExecutionType;
    return this;
  }

  /**
   * GetenforcedExecutionType
   *
   * @return enforcedExecutionType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCED_EXECUTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnforcedExecutionType() {
    return enforcedExecutionType;
  }

  public void setEnforcedExecutionType(String enforcedExecutionType) {
    this.enforcedExecutionType = enforcedExecutionType;
  }

  public GetCohortRequestDataAttributes requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * GetrequestId
   *
   * @return requestId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public GetCohortRequestDataAttributes time(GetCohortRequestDataAttributesTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Gettime
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetCohortRequestDataAttributesTime getTime() {
    return time;
  }

  public void setTime(GetCohortRequestDataAttributesTime time) {
    this.time = time;
  }

  public GetCohortRequestDataAttributes windowSize(String windowSize) {
    this.windowSize = windowSize;
    return this;
  }

  /**
   * GetwindowSize
   *
   * @return windowSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINDOW_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWindowSize() {
    return windowSize;
  }

  public void setWindowSize(String windowSize) {
    this.windowSize = windowSize;
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
   * @return GetCohortRequestDataAttributes
   */
  @JsonAnySetter
  public GetCohortRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GetCohortRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCohortRequestDataAttributes getCohortRequestDataAttributes =
        (GetCohortRequestDataAttributes) o;
    return Objects.equals(this.dataSource, getCohortRequestDataAttributes.dataSource)
        && Objects.equals(this.definition, getCohortRequestDataAttributes.definition)
        && Objects.equals(
            this.enforcedExecutionType, getCohortRequestDataAttributes.enforcedExecutionType)
        && Objects.equals(this.requestId, getCohortRequestDataAttributes.requestId)
        && Objects.equals(this.time, getCohortRequestDataAttributes.time)
        && Objects.equals(this.windowSize, getCohortRequestDataAttributes.windowSize)
        && Objects.equals(
            this.additionalProperties, getCohortRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSource,
        definition,
        enforcedExecutionType,
        requestId,
        time,
        windowSize,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCohortRequestDataAttributes {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    enforcedExecutionType: ")
        .append(toIndentedString(enforcedExecutionType))
        .append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    windowSize: ").append(toIndentedString(windowSize)).append("\n");
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
