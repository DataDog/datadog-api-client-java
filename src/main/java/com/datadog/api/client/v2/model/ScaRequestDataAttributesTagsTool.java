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
import java.util.UUID;
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
   * <p>Tool metadata included in SCA tags.</p>
 */
@JsonPropertyOrder({
  ScaRequestDataAttributesTagsTool.JSON_PROPERTY_GENERATOR
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScaRequestDataAttributesTagsTool {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_GENERATOR = "generator";
  private ScaRequestDataAttributesTagsToolGenerator generator;

  public ScaRequestDataAttributesTagsTool generator(ScaRequestDataAttributesTagsToolGenerator generator) {
    this.generator = generator;
    this.unparsed |= generator.unparsed;
    return this;
  }

  /**
   * <p>Metadata about the tool that generated the SCA tags.</p>
   * @return generator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GENERATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ScaRequestDataAttributesTagsToolGenerator getGenerator() {
        return generator;
      }
  public void setGenerator(ScaRequestDataAttributesTagsToolGenerator generator) {
    this.generator = generator;
    if (generator != null) {
      this.unparsed |= generator.unparsed;
    }
  }

  /**
   * Return true if this ScaRequestDataAttributesTagsTool object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaRequestDataAttributesTagsTool scaRequestDataAttributesTagsTool = (ScaRequestDataAttributesTagsTool) o;
    return Objects.equals(this.generator, scaRequestDataAttributesTagsTool.generator);
  }


  @Override
  public int hashCode() {
    return Objects.hash(generator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaRequestDataAttributesTagsTool {\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append('}');
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
