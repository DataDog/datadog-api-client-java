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
   * <p>A service level objective history response.</p>
 */
@JsonPropertyOrder({
  SLOHistoryResponse.JSON_PROPERTY_DATA,
  SLOHistoryResponse.JSON_PROPERTY_ERRORS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOHistoryResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SLOHistoryResponseData data;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private JsonNullable<List<SLOHistoryResponseError>> errors = JsonNullable.<List<SLOHistoryResponseError>>undefined();

  public SLOHistoryResponse data(SLOHistoryResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * <p>An array of service level objective objects.</p>
   * @return data
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SLOHistoryResponseData getData() {
        return data;
      }
  public void setData(SLOHistoryResponseData data) {
    this.data = data;
  }
  public SLOHistoryResponse errors(List<SLOHistoryResponseError> errors) {
    this.errors = JsonNullable.<List<SLOHistoryResponseError>>of(errors);
    return this;
  }
  public SLOHistoryResponse addErrorsItem(SLOHistoryResponseError errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.<List<SLOHistoryResponseError>>of(new ArrayList<>());
    }
    try {
      this.errors.get().add(errorsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>A list of errors while querying the history data for the service level objective.</p>
   * @return errors
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<SLOHistoryResponseError> getErrors() {
        return errors.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SLOHistoryResponseError>> getErrors_JsonNullable() {
    return errors;
  }
  @JsonProperty(JSON_PROPERTY_ERRORS)public void setErrors_JsonNullable(JsonNullable<List<SLOHistoryResponseError>> errors) {
    this.errors = errors;
  }
  public void setErrors(List<SLOHistoryResponseError> errors) {
    this.errors = JsonNullable.<List<SLOHistoryResponseError>>of(errors);
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
   * @return SLOHistoryResponse
   */
  @JsonAnySetter
  public SLOHistoryResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this SLOHistoryResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistoryResponse sloHistoryResponse = (SLOHistoryResponse) o;
    return Objects.equals(this.data, sloHistoryResponse.data) && Objects.equals(this.errors, sloHistoryResponse.errors) && Objects.equals(this.additionalProperties, sloHistoryResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,errors, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistoryResponse {\n");
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
