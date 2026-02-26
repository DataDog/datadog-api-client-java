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

/** Result of updating a single flaky test state. */
@JsonPropertyOrder({
  UpdateFlakyTestsResponseResult.JSON_PROPERTY_ERROR,
  UpdateFlakyTestsResponseResult.JSON_PROPERTY_ID,
  UpdateFlakyTestsResponseResult.JSON_PROPERTY_SUCCESS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateFlakyTestsResponseResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public UpdateFlakyTestsResponseResult() {}

  @JsonCreator
  public UpdateFlakyTestsResponseResult(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUCCESS) Boolean success) {
    this.id = id;
    this.success = success;
  }

  public UpdateFlakyTestsResponseResult error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error message if the update failed.
   *
   * @return error
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public UpdateFlakyTestsResponseResult id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the flaky test from the request. This is the same ID returned by the Search flaky
   * tests endpoint and corresponds to the test_fingerprint_fqn field in test run events.
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

  public UpdateFlakyTestsResponseResult success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * <code>True</code> if the update was successful, <code>False</code> if there were any errors.
   *
   * @return success
   */
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
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
   * @return UpdateFlakyTestsResponseResult
   */
  @JsonAnySetter
  public UpdateFlakyTestsResponseResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpdateFlakyTestsResponseResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFlakyTestsResponseResult updateFlakyTestsResponseResult =
        (UpdateFlakyTestsResponseResult) o;
    return Objects.equals(this.error, updateFlakyTestsResponseResult.error)
        && Objects.equals(this.id, updateFlakyTestsResponseResult.id)
        && Objects.equals(this.success, updateFlakyTestsResponseResult.success)
        && Objects.equals(
            this.additionalProperties, updateFlakyTestsResponseResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, id, success, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFlakyTestsResponseResult {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
