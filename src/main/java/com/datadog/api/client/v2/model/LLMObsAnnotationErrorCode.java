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
   * <p>Stable error code. <code>permission_denied</code> indicates the item was rejected by queue access rules.</p>
 */
@JsonSerialize(using = LLMObsAnnotationErrorCode.LLMObsAnnotationErrorCodeSerializer.class)
public class LLMObsAnnotationErrorCode extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("permission_denied"));

  public static final LLMObsAnnotationErrorCode PERMISSION_DENIED = new LLMObsAnnotationErrorCode("permission_denied");


  LLMObsAnnotationErrorCode(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsAnnotationErrorCodeSerializer extends StdSerializer<LLMObsAnnotationErrorCode> {
      public LLMObsAnnotationErrorCodeSerializer(Class<LLMObsAnnotationErrorCode> t) {
          super(t);
      }

      public LLMObsAnnotationErrorCodeSerializer() {
          this(null);
      }

      @Override
      public void serialize(LLMObsAnnotationErrorCode value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static LLMObsAnnotationErrorCode fromValue(String value) {
    return new LLMObsAnnotationErrorCode(value);
  }
}
