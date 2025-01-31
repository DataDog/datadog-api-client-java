/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** User locator to find the element. */
@JsonPropertyOrder({
  SyntheticsMobileStepParamsElementUserLocator.JSON_PROPERTY_FAIL_TEST_ON_CANNOT_LOCATE,
  SyntheticsMobileStepParamsElementUserLocator.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsMobileStepParamsElementUserLocator {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAIL_TEST_ON_CANNOT_LOCATE = "failTestOnCannotLocate";
  private Boolean failTestOnCannotLocate;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<SyntheticsMobileStepParamsElementUserLocatorValuesItems> values = null;

  public SyntheticsMobileStepParamsElementUserLocator failTestOnCannotLocate(
      Boolean failTestOnCannotLocate) {
    this.failTestOnCannotLocate = failTestOnCannotLocate;
    return this;
  }

  /**
   * Whether if the test should fail if the element cannot be found.
   *
   * @return failTestOnCannotLocate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAIL_TEST_ON_CANNOT_LOCATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFailTestOnCannotLocate() {
    return failTestOnCannotLocate;
  }

  public void setFailTestOnCannotLocate(Boolean failTestOnCannotLocate) {
    this.failTestOnCannotLocate = failTestOnCannotLocate;
  }

  public SyntheticsMobileStepParamsElementUserLocator values(
      List<SyntheticsMobileStepParamsElementUserLocatorValuesItems> values) {
    this.values = values;
    for (SyntheticsMobileStepParamsElementUserLocatorValuesItems item : values) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsMobileStepParamsElementUserLocator addValuesItem(
      SyntheticsMobileStepParamsElementUserLocatorValuesItems valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    this.unparsed |= valuesItem.unparsed;
    return this;
  }

  /**
   * Values of the user locator.
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsMobileStepParamsElementUserLocatorValuesItems> getValues() {
    return values;
  }

  public void setValues(List<SyntheticsMobileStepParamsElementUserLocatorValuesItems> values) {
    this.values = values;
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
   * @return SyntheticsMobileStepParamsElementUserLocator
   */
  @JsonAnySetter
  public SyntheticsMobileStepParamsElementUserLocator putAdditionalProperty(
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

  /** Return true if this SyntheticsMobileStepParamsElementUserLocator object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsMobileStepParamsElementUserLocator syntheticsMobileStepParamsElementUserLocator =
        (SyntheticsMobileStepParamsElementUserLocator) o;
    return Objects.equals(
            this.failTestOnCannotLocate,
            syntheticsMobileStepParamsElementUserLocator.failTestOnCannotLocate)
        && Objects.equals(this.values, syntheticsMobileStepParamsElementUserLocator.values)
        && Objects.equals(
            this.additionalProperties,
            syntheticsMobileStepParamsElementUserLocator.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failTestOnCannotLocate, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsMobileStepParamsElementUserLocator {\n");
    sb.append("    failTestOnCannotLocate: ")
        .append(toIndentedString(failTestOnCannotLocate))
        .append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
