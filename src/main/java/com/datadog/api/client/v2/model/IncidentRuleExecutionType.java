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
   * <p>The execution type of an incident rule.</p>
 */
@JsonSerialize(using = IncidentRuleExecutionType.IncidentRuleExecutionTypeSerializer.class)
public class IncidentRuleExecutionType extends ModelEnum<Long> {

  private static final Set<Long> allowedValues = new HashSet<Long>(Arrays.asList(1l, 2l));

  public static final IncidentRuleExecutionType SINGLE_EXECUTION = new IncidentRuleExecutionType(1l);
  public static final IncidentRuleExecutionType MULTI_EXECUTION = new IncidentRuleExecutionType(2l);


  IncidentRuleExecutionType(Long value) {
    super(value, allowedValues);
  }

  public static class IncidentRuleExecutionTypeSerializer extends StdSerializer<IncidentRuleExecutionType> {
      public IncidentRuleExecutionTypeSerializer(Class<IncidentRuleExecutionType> t) {
          super(t);
      }

      public IncidentRuleExecutionTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(IncidentRuleExecutionType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static IncidentRuleExecutionType fromValue(Long value) {
    return new IncidentRuleExecutionType(value);
  }
}
