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
   * <p>Test configuration for Synthetics</p>
 */
@JsonPropertyOrder({
  SyntheticsTriggerTest.JSON_PROPERTY_METADATA,
  SyntheticsTriggerTest.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTriggerTest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SyntheticsCIBatchMetadata metadata;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public SyntheticsTriggerTest() {}

  @JsonCreator
  public SyntheticsTriggerTest(
            @JsonProperty(required=true, value=JSON_PROPERTY_PUBLIC_ID)String publicId) {
        this.publicId = publicId;
  }
  public SyntheticsTriggerTest metadata(SyntheticsCIBatchMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>Metadata for the Synthetics tests run.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsCIBatchMetadata getMetadata() {
        return metadata;
      }
  public void setMetadata(SyntheticsCIBatchMetadata metadata) {
    this.metadata = metadata;
  }
  public SyntheticsTriggerTest publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * <p>The public ID of the Synthetics test to trigger.</p>
   * @return publicId
  **/
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPublicId() {
        return publicId;
      }
  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  /**
   * Return true if this SyntheticsTriggerTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTriggerTest syntheticsTriggerTest = (SyntheticsTriggerTest) o;
    return Objects.equals(this.metadata, syntheticsTriggerTest.metadata) && Objects.equals(this.publicId, syntheticsTriggerTest.publicId);
  }


  @Override
  public int hashCode() {
    return Objects.hash(metadata,publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTriggerTest {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
