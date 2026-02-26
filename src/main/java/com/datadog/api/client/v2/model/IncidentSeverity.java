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
   * <p>The incident severity.</p>
 */
@JsonSerialize(using = IncidentSeverity.IncidentSeveritySerializer.class)
public class IncidentSeverity extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("UNKNOWN", "SEV-0", "SEV-1", "SEV-2", "SEV-3", "SEV-4", "SEV-5"));

  public static final IncidentSeverity UNKNOWN = new IncidentSeverity("UNKNOWN");
  public static final IncidentSeverity SEV_0 = new IncidentSeverity("SEV-0");
  public static final IncidentSeverity SEV_1 = new IncidentSeverity("SEV-1");
  public static final IncidentSeverity SEV_2 = new IncidentSeverity("SEV-2");
  public static final IncidentSeverity SEV_3 = new IncidentSeverity("SEV-3");
  public static final IncidentSeverity SEV_4 = new IncidentSeverity("SEV-4");
  public static final IncidentSeverity SEV_5 = new IncidentSeverity("SEV-5");


  IncidentSeverity(String value) {
    super(value, allowedValues);
  }

  public static class IncidentSeveritySerializer extends StdSerializer<IncidentSeverity> {
      public IncidentSeveritySerializer(Class<IncidentSeverity> t) {
          super(t);
      }

      public IncidentSeveritySerializer() {
          this(null);
      }

      @Override
      public void serialize(IncidentSeverity value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static IncidentSeverity fromValue(String value) {
    return new IncidentSeverity(value);
  }
}
