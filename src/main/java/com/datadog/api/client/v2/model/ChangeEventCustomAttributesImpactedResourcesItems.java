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
import java.util.Objects;

/** Object representing a uniquely identified resource. */
@JsonPropertyOrder({
  ChangeEventCustomAttributesImpactedResourcesItems.JSON_PROPERTY_NAME,
  ChangeEventCustomAttributesImpactedResourcesItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeEventCustomAttributesImpactedResourcesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ChangeEventCustomAttributesImpactedResourcesItemsType type;

  public ChangeEventCustomAttributesImpactedResourcesItems() {}

  @JsonCreator
  public ChangeEventCustomAttributesImpactedResourcesItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ChangeEventCustomAttributesImpactedResourcesItemsType type) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ChangeEventCustomAttributesImpactedResourcesItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the impacted resource. Limited to 128 characters.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChangeEventCustomAttributesImpactedResourcesItems type(
      ChangeEventCustomAttributesImpactedResourcesItemsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the impacted resource.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ChangeEventCustomAttributesImpactedResourcesItemsType getType() {
    return type;
  }

  public void setType(ChangeEventCustomAttributesImpactedResourcesItemsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ChangeEventCustomAttributesImpactedResourcesItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeEventCustomAttributesImpactedResourcesItems
        changeEventCustomAttributesImpactedResourcesItems =
            (ChangeEventCustomAttributesImpactedResourcesItems) o;
    return Objects.equals(this.name, changeEventCustomAttributesImpactedResourcesItems.name)
        && Objects.equals(this.type, changeEventCustomAttributesImpactedResourcesItems.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeEventCustomAttributesImpactedResourcesItems {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
