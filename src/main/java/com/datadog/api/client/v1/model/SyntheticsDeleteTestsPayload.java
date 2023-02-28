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
   * <p>A JSON list of the ID or IDs of the Synthetic tests that you want
   * to delete.</p>
 */
@JsonPropertyOrder({
  SyntheticsDeleteTestsPayload.JSON_PROPERTY_PUBLIC_IDS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsDeleteTestsPayload {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PUBLIC_IDS = "public_ids";
  private List<String> publicIds = null;

  public SyntheticsDeleteTestsPayload publicIds(List<String> publicIds) {
    this.publicIds = publicIds;
    return this;
  }
  public SyntheticsDeleteTestsPayload addPublicIdsItem(String publicIdsItem) {
    if (this.publicIds == null) {
      this.publicIds = new ArrayList<>();
    }
    this.publicIds.add(publicIdsItem);
    return this;
  }

  /**
   * <p>An array of Synthetic test IDs you want to delete.</p>
   * @return publicIds
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_IDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getPublicIds() {
        return publicIds;
      }
  public void setPublicIds(List<String> publicIds) {
    this.publicIds = publicIds;
  }

  /**
   * Return true if this SyntheticsDeleteTestsPayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDeleteTestsPayload syntheticsDeleteTestsPayload = (SyntheticsDeleteTestsPayload) o;
    return Objects.equals(this.publicIds, syntheticsDeleteTestsPayload.publicIds);
  }


  @Override
  public int hashCode() {
    return Objects.hash(publicIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDeleteTestsPayload {\n");
    sb.append("    publicIds: ").append(toIndentedString(publicIds)).append("\n");
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
