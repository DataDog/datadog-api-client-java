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

/** On-demand concurrency cap attributes. */
@JsonPropertyOrder({OnDemandConcurrencyCapAttributes.JSON_PROPERTY_ON_DEMAND_CONCURRENCY_CAP})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnDemandConcurrencyCapAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ON_DEMAND_CONCURRENCY_CAP = "on_demand_concurrency_cap";
  private Double onDemandConcurrencyCap;

  public OnDemandConcurrencyCapAttributes onDemandConcurrencyCap(Double onDemandConcurrencyCap) {
    this.onDemandConcurrencyCap = onDemandConcurrencyCap;
    return this;
  }

  /**
   * Value of the on-demand concurrency cap.
   *
   * @return onDemandConcurrencyCap
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_DEMAND_CONCURRENCY_CAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOnDemandConcurrencyCap() {
    return onDemandConcurrencyCap;
  }

  public void setOnDemandConcurrencyCap(Double onDemandConcurrencyCap) {
    this.onDemandConcurrencyCap = onDemandConcurrencyCap;
  }

  /** Return true if this OnDemandConcurrencyCapAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnDemandConcurrencyCapAttributes onDemandConcurrencyCapAttributes =
        (OnDemandConcurrencyCapAttributes) o;
    return Objects.equals(
        this.onDemandConcurrencyCap, onDemandConcurrencyCapAttributes.onDemandConcurrencyCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onDemandConcurrencyCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnDemandConcurrencyCapAttributes {\n");
    sb.append("    onDemandConcurrencyCap: ")
        .append(toIndentedString(onDemandConcurrencyCap))
        .append("\n");
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
