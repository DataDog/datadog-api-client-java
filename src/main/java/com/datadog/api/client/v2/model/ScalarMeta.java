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
   * <p>Metadata for the resulting numerical values.</p>
 */
@JsonPropertyOrder({
  ScalarMeta.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScalarMeta {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_UNIT = "unit";
  private List<Unit> unit = null;

  public ScalarMeta unit(List<Unit> unit) {
    this.unit = unit;
    for (Unit item : unit) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ScalarMeta addUnitItem(Unit unitItem) {
    if (this.unit == null) {
      this.unit = new ArrayList<>();
    }
    this.unit.add(unitItem);
    this.unparsed |= unitItem.unparsed;
    return this;
  }

  /**
   * <p>Detailed information about the unit.
   * First element describes the "primary unit" (for example, <code>bytes</code> in <code>bytes per second</code>).
   * The second element describes the "per unit" (for example, <code>second</code> in <code>bytes per second</code>).
   * If the second element is not present, the API returns null.</p>
   * @return unit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UNIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<Unit> getUnit() {
        return unit;
      }
  public void setUnit(List<Unit> unit) {
    this.unit = unit;
  }

  /**
   * Return true if this ScalarMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalarMeta scalarMeta = (ScalarMeta) o;
    return Objects.equals(this.unit, scalarMeta.unit);
  }


  @Override
  public int hashCode() {
    return Objects.hash(unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalarMeta {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("}");
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
