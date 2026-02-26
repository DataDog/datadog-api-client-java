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

/** Details of what tests to update and their new attributes. */
@JsonPropertyOrder({
  UpdateFlakyTestsRequestTest.JSON_PROPERTY_ID,
  UpdateFlakyTestsRequestTest.JSON_PROPERTY_NEW_STATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateFlakyTestsRequestTest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NEW_STATE = "new_state";
  private UpdateFlakyTestsRequestTestNewState newState;

  public UpdateFlakyTestsRequestTest() {}

  @JsonCreator
  public UpdateFlakyTestsRequestTest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEW_STATE)
          UpdateFlakyTestsRequestTestNewState newState) {
    this.id = id;
    this.newState = newState;
    this.unparsed |= !newState.isValid();
  }

  public UpdateFlakyTestsRequestTest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the flaky test. This is the same ID returned by the Search flaky tests endpoint and
   * corresponds to the test_fingerprint_fqn field in test run events.
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

  public UpdateFlakyTestsRequestTest newState(UpdateFlakyTestsRequestTestNewState newState) {
    this.newState = newState;
    this.unparsed |= !newState.isValid();
    return this;
  }

  /**
   * The new state to set for the flaky test.
   *
   * @return newState
   */
  @JsonProperty(JSON_PROPERTY_NEW_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UpdateFlakyTestsRequestTestNewState getNewState() {
    return newState;
  }

  public void setNewState(UpdateFlakyTestsRequestTestNewState newState) {
    if (!newState.isValid()) {
      this.unparsed = true;
    }
    this.newState = newState;
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
   * @return UpdateFlakyTestsRequestTest
   */
  @JsonAnySetter
  public UpdateFlakyTestsRequestTest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpdateFlakyTestsRequestTest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFlakyTestsRequestTest updateFlakyTestsRequestTest = (UpdateFlakyTestsRequestTest) o;
    return Objects.equals(this.id, updateFlakyTestsRequestTest.id)
        && Objects.equals(this.newState, updateFlakyTestsRequestTest.newState)
        && Objects.equals(
            this.additionalProperties, updateFlakyTestsRequestTest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, newState, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFlakyTestsRequestTest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    newState: ").append(toIndentedString(newState)).append("\n");
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
