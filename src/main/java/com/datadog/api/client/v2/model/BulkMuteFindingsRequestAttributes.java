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

/** The mute properties to be updated. */
@JsonPropertyOrder({BulkMuteFindingsRequestAttributes.JSON_PROPERTY_MUTE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BulkMuteFindingsRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MUTE = "mute";
  private BulkMuteFindingsRequestProperties mute;

  public BulkMuteFindingsRequestAttributes() {}

  @JsonCreator
  public BulkMuteFindingsRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_MUTE)
          BulkMuteFindingsRequestProperties mute) {
    this.mute = mute;
    this.unparsed |= mute.unparsed;
  }

  public BulkMuteFindingsRequestAttributes mute(BulkMuteFindingsRequestProperties mute) {
    this.mute = mute;
    this.unparsed |= mute.unparsed;
    return this;
  }

  /**
   * Object containing the new mute properties of the findings.
   *
   * @return mute
   */
  @JsonProperty(JSON_PROPERTY_MUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BulkMuteFindingsRequestProperties getMute() {
    return mute;
  }

  public void setMute(BulkMuteFindingsRequestProperties mute) {
    this.mute = mute;
  }

  /** Return true if this BulkMuteFindingsRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkMuteFindingsRequestAttributes bulkMuteFindingsRequestAttributes =
        (BulkMuteFindingsRequestAttributes) o;
    return Objects.equals(this.mute, bulkMuteFindingsRequestAttributes.mute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkMuteFindingsRequestAttributes {\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
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
