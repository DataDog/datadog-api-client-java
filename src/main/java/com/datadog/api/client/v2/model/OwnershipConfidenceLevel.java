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

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The ownership confidence level.</p>
 */
@JsonSerialize(using = OwnershipConfidenceLevel.OwnershipConfidenceLevelSerializer.class)
public class OwnershipConfidenceLevel extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("high", "medium", "low"));

  public static final OwnershipConfidenceLevel HIGH = new OwnershipConfidenceLevel("high");
  public static final OwnershipConfidenceLevel MEDIUM = new OwnershipConfidenceLevel("medium");
  public static final OwnershipConfidenceLevel LOW = new OwnershipConfidenceLevel("low");


  OwnershipConfidenceLevel(String value) {
    super(value, allowedValues);
  }

  public static class OwnershipConfidenceLevelSerializer extends StdSerializer<OwnershipConfidenceLevel> {
      public OwnershipConfidenceLevelSerializer(Class<OwnershipConfidenceLevel> t) {
          super(t);
      }

      public OwnershipConfidenceLevelSerializer() {
          this(null);
      }

      @Override
      public void serialize(OwnershipConfidenceLevel value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static OwnershipConfidenceLevel fromValue(String value) {
    return new OwnershipConfidenceLevel(value);
  }
}
