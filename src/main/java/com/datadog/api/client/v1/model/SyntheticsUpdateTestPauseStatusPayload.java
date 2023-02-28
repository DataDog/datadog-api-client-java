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
   * <p>Object to start or pause an existing Synthetic test.</p>
 */
@JsonPropertyOrder({
  SyntheticsUpdateTestPauseStatusPayload.JSON_PROPERTY_NEW_STATUS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsUpdateTestPauseStatusPayload {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEW_STATUS = "new_status";
  private SyntheticsTestPauseStatus newStatus;

  public SyntheticsUpdateTestPauseStatusPayload newStatus(SyntheticsTestPauseStatus newStatus) {
    this.newStatus = newStatus;
    this.unparsed |= !newStatus.isValid();
    return this;
  }

  /**
   * <p>Define whether you want to start (<code>live</code>) or pause (<code>paused</code>) a
   * Synthetic test.</p>
   * @return newStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEW_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestPauseStatus getNewStatus() {
        return newStatus;
      }
  public void setNewStatus(SyntheticsTestPauseStatus newStatus) {
    if (!newStatus.isValid()) {
        this.unparsed = true;
    }
    this.newStatus = newStatus;
  }

  /**
   * Return true if this SyntheticsUpdateTestPauseStatusPayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsUpdateTestPauseStatusPayload syntheticsUpdateTestPauseStatusPayload = (SyntheticsUpdateTestPauseStatusPayload) o;
    return Objects.equals(this.newStatus, syntheticsUpdateTestPauseStatusPayload.newStatus);
  }


  @Override
  public int hashCode() {
    return Objects.hash(newStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsUpdateTestPauseStatusPayload {\n");
    sb.append("    newStatus: ").append(toIndentedString(newStatus)).append("\n");
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
