/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A saved filter error containing at least one JSON:API error object. */
@JsonPropertyOrder({SavedFilterJSONAPIErrorResponse.JSON_PROPERTY_ERRORS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SavedFilterJSONAPIErrorResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<JSONAPIErrorItem> errors = new ArrayList<>();

  public SavedFilterJSONAPIErrorResponse() {}

  @JsonCreator
  public SavedFilterJSONAPIErrorResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ERRORS) List<JSONAPIErrorItem> errors) {
    this.errors = errors;
    for (JSONAPIErrorItem item : errors) {
      this.unparsed |= item.unparsed;
    }
  }

  public SavedFilterJSONAPIErrorResponse errors(List<JSONAPIErrorItem> errors) {
    this.errors = errors;
    for (JSONAPIErrorItem item : errors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SavedFilterJSONAPIErrorResponse addErrorsItem(JSONAPIErrorItem errorsItem) {
    this.errors.add(errorsItem);
    this.unparsed |= errorsItem.unparsed;
    return this;
  }

  /**
   * The error details.
   *
   * @return errors
   */
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<JSONAPIErrorItem> getErrors() {
    return errors;
  }

  public void setErrors(List<JSONAPIErrorItem> errors) {
    this.errors = errors;
    if (errors != null) {
      for (JSONAPIErrorItem item : errors) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this SavedFilterJSONAPIErrorResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedFilterJSONAPIErrorResponse savedFilterJsonapiErrorResponse =
        (SavedFilterJSONAPIErrorResponse) o;
    return Objects.equals(this.errors, savedFilterJsonapiErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedFilterJSONAPIErrorResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
