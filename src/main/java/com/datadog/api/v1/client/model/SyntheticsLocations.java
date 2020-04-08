/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.SyntheticsLocation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  SyntheticsLocations.JSON_PROPERTY_LOCATIONS
})

public class SyntheticsLocations {
  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<SyntheticsLocation> locations = null;


  public SyntheticsLocations locations(List<SyntheticsLocation> locations) {
    
    this.locations = locations;
    return this;
  }

  public SyntheticsLocations addLocationsItem(SyntheticsLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * TODO.
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticsLocation> getLocations() {
    return locations;
  }


  public void setLocations(List<SyntheticsLocation> locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

