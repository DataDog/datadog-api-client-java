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
   * <p>The severity to assign to matched findings. <code>info_none</code> is not supported for the <code>iac_misconfiguration</code>, <code>runtime_code_vulnerability</code>, <code>secret</code>, or <code>static_code_vulnerability</code> finding types.</p>
 */
@JsonSerialize(using = SeverityModifierSeverity.SeverityModifierSeveritySerializer.class)
public class SeverityModifierSeverity extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("info_none", "low", "medium", "high", "critical"));

  public static final SeverityModifierSeverity INFO_NONE = new SeverityModifierSeverity("info_none");
  public static final SeverityModifierSeverity LOW = new SeverityModifierSeverity("low");
  public static final SeverityModifierSeverity MEDIUM = new SeverityModifierSeverity("medium");
  public static final SeverityModifierSeverity HIGH = new SeverityModifierSeverity("high");
  public static final SeverityModifierSeverity CRITICAL = new SeverityModifierSeverity("critical");


  SeverityModifierSeverity(String value) {
    super(value, allowedValues);
  }

  public static class SeverityModifierSeveritySerializer extends StdSerializer<SeverityModifierSeverity> {
      public SeverityModifierSeveritySerializer(Class<SeverityModifierSeverity> t) {
          super(t);
      }

      public SeverityModifierSeveritySerializer() {
          this(null);
      }

      @Override
      public void serialize(SeverityModifierSeverity value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SeverityModifierSeverity fromValue(String value) {
    return new SeverityModifierSeverity(value);
  }
}
