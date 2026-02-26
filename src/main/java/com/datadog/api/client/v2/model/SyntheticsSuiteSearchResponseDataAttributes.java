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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Synthetics suite search response data attributes */
@JsonPropertyOrder({
  SyntheticsSuiteSearchResponseDataAttributes.JSON_PROPERTY_SUITES,
  SyntheticsSuiteSearchResponseDataAttributes.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsSuiteSearchResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SUITES = "suites";
  private List<SyntheticsSuite> suites = null;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public SyntheticsSuiteSearchResponseDataAttributes suites(List<SyntheticsSuite> suites) {
    this.suites = suites;
    for (SyntheticsSuite item : suites) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsSuiteSearchResponseDataAttributes addSuitesItem(SyntheticsSuite suitesItem) {
    if (this.suites == null) {
      this.suites = new ArrayList<>();
    }
    this.suites.add(suitesItem);
    this.unparsed |= suitesItem.unparsed;
    return this;
  }

  /**
   * Getsuites
   *
   * @return suites
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUITES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsSuite> getSuites() {
    return suites;
  }

  public void setSuites(List<SyntheticsSuite> suites) {
    this.suites = suites;
  }

  public SyntheticsSuiteSearchResponseDataAttributes total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Gettotal maximum: 2147483647
   *
   * @return total
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
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
   * @return SyntheticsSuiteSearchResponseDataAttributes
   */
  @JsonAnySetter
  public SyntheticsSuiteSearchResponseDataAttributes putAdditionalProperty(
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

  /** Return true if this SyntheticsSuiteSearchResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsSuiteSearchResponseDataAttributes syntheticsSuiteSearchResponseDataAttributes =
        (SyntheticsSuiteSearchResponseDataAttributes) o;
    return Objects.equals(this.suites, syntheticsSuiteSearchResponseDataAttributes.suites)
        && Objects.equals(this.total, syntheticsSuiteSearchResponseDataAttributes.total)
        && Objects.equals(
            this.additionalProperties,
            syntheticsSuiteSearchResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suites, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsSuiteSearchResponseDataAttributes {\n");
    sb.append("    suites: ").append(toIndentedString(suites)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
