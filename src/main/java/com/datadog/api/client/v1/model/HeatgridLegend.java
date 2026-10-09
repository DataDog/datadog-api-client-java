/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Legend configuration for the heatgrid widget. */
@JsonPropertyOrder({HeatgridLegend.JSON_PROPERTY_SHOW_CAPTION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridLegend {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SHOW_CAPTION = "show_caption";
  private Boolean showCaption;

  public HeatgridLegend showCaption(Boolean showCaption) {
    this.showCaption = showCaption;
    return this;
  }

  /**
   * Whether to display the legend caption.
   *
   * @return showCaption
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_CAPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowCaption() {
    return showCaption;
  }

  public void setShowCaption(Boolean showCaption) {
    this.showCaption = showCaption;
  }

  /** Return true if this HeatgridLegend object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridLegend heatgridLegend = (HeatgridLegend) o;
    return Objects.equals(this.showCaption, heatgridLegend.showCaption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showCaption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridLegend {\n");
    sb.append("    showCaption: ").append(toIndentedString(showCaption)).append("\n");
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
