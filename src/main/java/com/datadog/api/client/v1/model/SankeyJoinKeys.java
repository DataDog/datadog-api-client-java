/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Join keys. */
@JsonPropertyOrder({SankeyJoinKeys.JSON_PROPERTY_PRIMARY, SankeyJoinKeys.JSON_PROPERTY_SECONDARY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SankeyJoinKeys {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private String primary;

  public static final String JSON_PROPERTY_SECONDARY = "secondary";
  private List<String> secondary = null;

  public SankeyJoinKeys() {}

  @JsonCreator
  public SankeyJoinKeys(
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIMARY) String primary) {
    this.primary = primary;
  }

  public SankeyJoinKeys primary(String primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Primary join key.
   *
   * @return primary
   */
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrimary() {
    return primary;
  }

  public void setPrimary(String primary) {
    this.primary = primary;
  }

  public SankeyJoinKeys secondary(List<String> secondary) {
    this.secondary = secondary;
    return this;
  }

  public SankeyJoinKeys addSecondaryItem(String secondaryItem) {
    if (this.secondary == null) {
      this.secondary = new ArrayList<>();
    }
    this.secondary.add(secondaryItem);
    return this;
  }

  /**
   * Secondary join keys.
   *
   * @return secondary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSecondary() {
    return secondary;
  }

  public void setSecondary(List<String> secondary) {
    this.secondary = secondary;
  }

  /** Return true if this SankeyJoinKeys object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SankeyJoinKeys sankeyJoinKeys = (SankeyJoinKeys) o;
    return Objects.equals(this.primary, sankeyJoinKeys.primary)
        && Objects.equals(this.secondary, sankeyJoinKeys.secondary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, secondary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SankeyJoinKeys {\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
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
