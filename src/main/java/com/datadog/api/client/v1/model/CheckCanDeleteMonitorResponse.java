/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Response of monitor IDs that can or can't be safely deleted.</p>
 */
@JsonPropertyOrder({
  CheckCanDeleteMonitorResponse.JSON_PROPERTY_DATA,
  CheckCanDeleteMonitorResponse.JSON_PROPERTY_ERRORS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CheckCanDeleteMonitorResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private CheckCanDeleteMonitorResponseData data;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private JsonNullable<Map<String, List<String>>> errors = JsonNullable.<Map<String, List<String>>>undefined();

  public CheckCanDeleteMonitorResponse() {}

  @JsonCreator
  public CheckCanDeleteMonitorResponse(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA)CheckCanDeleteMonitorResponseData data) {
        this.data = data;
        this.unparsed |= data.unparsed;
  }
  public CheckCanDeleteMonitorResponse data(CheckCanDeleteMonitorResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * <p>Wrapper object with the list of monitor IDs.</p>
   * @return data
  **/
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CheckCanDeleteMonitorResponseData getData() {
        return data;
      }
  public void setData(CheckCanDeleteMonitorResponseData data) {
    this.data = data;
  }
  public CheckCanDeleteMonitorResponse errors(Map<String, List<String>> errors) {
    this.errors = JsonNullable.<Map<String, List<String>>>of(errors);
    return this;
  }
  public CheckCanDeleteMonitorResponse putErrorsItem(String key, List<String> errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.<Map<String, List<String>>>of(new HashMap<>());
    }
    try {
      this.errors.get().put(key, errorsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>A mapping of Monitor ID to strings denoting where it's used.</p>
   * @return errors
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Map<String, List<String>> getErrors() {
        return errors.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, List<String>>> getErrors_JsonNullable() {
    return errors;
  }
  @JsonProperty(JSON_PROPERTY_ERRORS)public void setErrors_JsonNullable(JsonNullable<Map<String, List<String>>> errors) {
    this.errors = errors;
  }
  public void setErrors(Map<String, List<String>> errors) {
    this.errors = JsonNullable.<Map<String, List<String>>>of(errors);
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
   * @return CheckCanDeleteMonitorResponse
   */
  @JsonAnySetter
  public CheckCanDeleteMonitorResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this CheckCanDeleteMonitorResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckCanDeleteMonitorResponse checkCanDeleteMonitorResponse = (CheckCanDeleteMonitorResponse) o;
    return Objects.equals(this.data, checkCanDeleteMonitorResponse.data) && Objects.equals(this.errors, checkCanDeleteMonitorResponse.errors) && Objects.equals(this.additionalProperties, checkCanDeleteMonitorResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,errors, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckCanDeleteMonitorResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
