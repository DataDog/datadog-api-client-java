/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({TimeseriesXAxis.JSON_PROPERTY_DATE_FORMAT, TimeseriesXAxis.JSON_PROPERTY_LABEL})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesXAxis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATE_FORMAT = "date_format";
  private TimeseriesXAxisDateFormat dateFormat;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public TimeseriesXAxis dateFormat(TimeseriesXAxisDateFormat dateFormat) {
    this.dateFormat = dateFormat;
    this.unparsed |= dateFormat.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dateFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeseriesXAxisDateFormat getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(TimeseriesXAxisDateFormat dateFormat) {
    this.dateFormat = dateFormat;
    if (dateFormat != null) {
      this.unparsed |= dateFormat.unparsed;
    }
  }

  public TimeseriesXAxis label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return label
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  /** Return true if this TimeseriesXAxis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesXAxis timeseriesXAxis = (TimeseriesXAxis) o;
    return Objects.equals(this.dateFormat, timeseriesXAxis.dateFormat)
        && Objects.equals(this.label, timeseriesXAxis.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFormat, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesXAxis {\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
