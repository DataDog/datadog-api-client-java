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
  GetCohortUsersRequestDataAttributes.JSON_PROPERTY_DATA_SOURCE,
  GetCohortUsersRequestDataAttributes.JSON_PROPERTY_DEFINITION,
  GetCohortUsersRequestDataAttributes.JSON_PROPERTY_EXECUTION,
  GetCohortUsersRequestDataAttributes.JSON_PROPERTY_TIME,
  GetCohortUsersRequestDataAttributes.JSON_PROPERTY_USER_SELECTION,
  GetCohortUsersRequestDataAttributes.JSON_PROPERTY_WINDOW_SIZE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetCohortUsersRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private String dataSource;

  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private GetCohortUsersRequestDataAttributesDefinition definition;

  public static final String JSON_PROPERTY_EXECUTION = "execution";
  private Long execution;

  public static final String JSON_PROPERTY_TIME = "time";
  private GetCohortUsersRequestDataAttributesTime time;

  public static final String JSON_PROPERTY_USER_SELECTION = "user_selection";
  private String userSelection;

  public static final String JSON_PROPERTY_WINDOW_SIZE = "window_size";
  private String windowSize;

  public GetCohortUsersRequestDataAttributes dataSource(String dataSource) {
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

  public GetCohortUsersRequestDataAttributes definition(
      GetCohortUsersRequestDataAttributesDefinition definition) {
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
  public GetCohortUsersRequestDataAttributesDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(GetCohortUsersRequestDataAttributesDefinition definition) {
    this.definition = definition;
  }

  public GetCohortUsersRequestDataAttributes execution(Long execution) {
    this.execution = execution;
    return this;
  }

  /**
   * Getexecution
   *
   * @return execution
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExecution() {
    return execution;
  }

  public void setExecution(Long execution) {
    this.execution = execution;
  }

  public GetCohortUsersRequestDataAttributes time(GetCohortUsersRequestDataAttributesTime time) {
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
  public GetCohortUsersRequestDataAttributesTime getTime() {
    return time;
  }

  public void setTime(GetCohortUsersRequestDataAttributesTime time) {
    this.time = time;
  }

  public GetCohortUsersRequestDataAttributes userSelection(String userSelection) {
    this.userSelection = userSelection;
    return this;
  }

  /**
   * GetuserSelection
   *
   * @return userSelection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserSelection() {
    return userSelection;
  }

  public void setUserSelection(String userSelection) {
    this.userSelection = userSelection;
  }

  public GetCohortUsersRequestDataAttributes windowSize(String windowSize) {
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
   * @return GetCohortUsersRequestDataAttributes
   */
  @JsonAnySetter
  public GetCohortUsersRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GetCohortUsersRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCohortUsersRequestDataAttributes getCohortUsersRequestDataAttributes =
        (GetCohortUsersRequestDataAttributes) o;
    return Objects.equals(this.dataSource, getCohortUsersRequestDataAttributes.dataSource)
        && Objects.equals(this.definition, getCohortUsersRequestDataAttributes.definition)
        && Objects.equals(this.execution, getCohortUsersRequestDataAttributes.execution)
        && Objects.equals(this.time, getCohortUsersRequestDataAttributes.time)
        && Objects.equals(this.userSelection, getCohortUsersRequestDataAttributes.userSelection)
        && Objects.equals(this.windowSize, getCohortUsersRequestDataAttributes.windowSize)
        && Objects.equals(
            this.additionalProperties, getCohortUsersRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSource, definition, execution, time, userSelection, windowSize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCohortUsersRequestDataAttributes {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    userSelection: ").append(toIndentedString(userSelection)).append("\n");
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
