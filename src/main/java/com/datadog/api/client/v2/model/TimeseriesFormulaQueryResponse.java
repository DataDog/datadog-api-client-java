/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * A message containing one response to a timeseries query made with timeseries formula query
 * request.
 */
@JsonPropertyOrder({
  TimeseriesFormulaQueryResponse.JSON_PROPERTY_DATA,
  TimeseriesFormulaQueryResponse.JSON_PROPERTY_ERRORS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesFormulaQueryResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private TimeseriesResponse data;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private String errors;

  public TimeseriesFormulaQueryResponse data(TimeseriesResponse data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * A message containing the response to a timeseries query.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeseriesResponse getData() {
    return data;
  }

  public void setData(TimeseriesResponse data) {
    this.data = data;
  }

  public TimeseriesFormulaQueryResponse errors(String errors) {
    this.errors = errors;
    return this;
  }

  /**
   * The error generated by the request.
   *
   * @return errors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrors() {
    return errors;
  }

  public void setErrors(String errors) {
    this.errors = errors;
  }

  /** Return true if this TimeseriesFormulaQueryResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesFormulaQueryResponse timeseriesFormulaQueryResponse =
        (TimeseriesFormulaQueryResponse) o;
    return Objects.equals(this.data, timeseriesFormulaQueryResponse.data)
        && Objects.equals(this.errors, timeseriesFormulaQueryResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesFormulaQueryResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
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
