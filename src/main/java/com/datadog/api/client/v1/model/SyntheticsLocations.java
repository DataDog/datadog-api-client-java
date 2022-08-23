/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>List of Synthetics locations.</p>
 */
@JsonPropertyOrder({
  SyntheticsLocations.JSON_PROPERTY_LOCATIONS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsLocations {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<SyntheticsLocation> locations = null;

  public SyntheticsLocations locations(List<SyntheticsLocation> locations) {
    this.locations = locations;
    for (SyntheticsLocation item : locations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsLocations addLocationsItem(SyntheticsLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    this.unparsed |= locationsItem.unparsed;
    return this;
  }

  /**
   * <p>List of Synthetics locations.</p>
   * @return locations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOCATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsLocation> getLocations() {
        return locations;
      }
  public void setLocations(List<SyntheticsLocation> locations) {
    this.locations = locations;
  }

  /**
   * Return true if this SyntheticsLocations object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsLocations syntheticsLocations = (SyntheticsLocations) o;
    return Objects.equals(this.locations, syntheticsLocations.locations);
  }


  @Override
  public int hashCode() {
    return Objects.hash(locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsLocations {\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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
