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
   * <p>Attributes for the update flaky test state response.</p>
 */
@JsonPropertyOrder({
  UpdateFlakyTestsResponseAttributes.JSON_PROPERTY_HAS_ERRORS,
  UpdateFlakyTestsResponseAttributes.JSON_PROPERTY_RESULTS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateFlakyTestsResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAS_ERRORS = "has_errors";
  private Boolean hasErrors;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<UpdateFlakyTestsResponseResult> results = new ArrayList<>();

  public UpdateFlakyTestsResponseAttributes() {}

  @JsonCreator
  public UpdateFlakyTestsResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_HAS_ERRORS)Boolean hasErrors,
            @JsonProperty(required=true, value=JSON_PROPERTY_RESULTS)List<UpdateFlakyTestsResponseResult> results) {
        this.hasErrors = hasErrors;
        this.results = results;
  }
  public UpdateFlakyTestsResponseAttributes hasErrors(Boolean hasErrors) {
    this.hasErrors = hasErrors;
    return this;
  }

  /**
   * <p><code>True</code> if any errors occurred during the update operations. <code>False</code> if all tests succeeded to be updated.</p>
   * @return hasErrors
  **/
      @JsonProperty(JSON_PROPERTY_HAS_ERRORS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getHasErrors() {
        return hasErrors;
      }
  public void setHasErrors(Boolean hasErrors) {
    this.hasErrors = hasErrors;
  }
  public UpdateFlakyTestsResponseAttributes results(List<UpdateFlakyTestsResponseResult> results) {
    this.results = results;
    for (UpdateFlakyTestsResponseResult item : results) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public UpdateFlakyTestsResponseAttributes addResultsItem(UpdateFlakyTestsResponseResult resultsItem) {
    this.results.add(resultsItem);
    this.unparsed |= resultsItem.unparsed;
    return this;
  }

  /**
   * <p>Results of the update operation for each test.</p>
   * @return results
  **/
      @JsonProperty(JSON_PROPERTY_RESULTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<UpdateFlakyTestsResponseResult> getResults() {
        return results;
      }
  public void setResults(List<UpdateFlakyTestsResponseResult> results) {
    this.results = results;
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
   * @return UpdateFlakyTestsResponseAttributes
   */
  @JsonAnySetter
  public UpdateFlakyTestsResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this UpdateFlakyTestsResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFlakyTestsResponseAttributes updateFlakyTestsResponseAttributes = (UpdateFlakyTestsResponseAttributes) o;
    return Objects.equals(this.hasErrors, updateFlakyTestsResponseAttributes.hasErrors) && Objects.equals(this.results, updateFlakyTestsResponseAttributes.results) && Objects.equals(this.additionalProperties, updateFlakyTestsResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(hasErrors,results, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFlakyTestsResponseAttributes {\n");
    sb.append("    hasErrors: ").append(toIndentedString(hasErrors)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
