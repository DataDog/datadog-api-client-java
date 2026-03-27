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
   * <p>Programming language</p>
 */
@JsonSerialize(using = Language.LanguageSerializer.class)
public class Language extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("PYTHON", "JAVASCRIPT", "TYPESCRIPT", "JAVA", "GO", "YAML", "RUBY", "CSHARP", "PHP", "KOTLIN", "SWIFT"));

  public static final Language PYTHON = new Language("PYTHON");
  public static final Language JAVASCRIPT = new Language("JAVASCRIPT");
  public static final Language TYPESCRIPT = new Language("TYPESCRIPT");
  public static final Language JAVA = new Language("JAVA");
  public static final Language GO = new Language("GO");
  public static final Language YAML = new Language("YAML");
  public static final Language RUBY = new Language("RUBY");
  public static final Language CSHARP = new Language("CSHARP");
  public static final Language PHP = new Language("PHP");
  public static final Language KOTLIN = new Language("KOTLIN");
  public static final Language SWIFT = new Language("SWIFT");


  Language(String value) {
    super(value, allowedValues);
  }

  public static class LanguageSerializer extends StdSerializer<Language> {
      public LanguageSerializer(Class<Language> t) {
          super(t);
      }

      public LanguageSerializer() {
          this(null);
      }

      @Override
      public void serialize(Language value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static Language fromValue(String value) {
    return new Language(value);
  }
}
