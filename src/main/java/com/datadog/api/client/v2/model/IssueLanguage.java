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
   * <p>Programming language associated with the issue.</p>
 */
@JsonSerialize(using = IssueLanguage.IssueLanguageSerializer.class)
public class IssueLanguage extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("BRIGHTSCRIPT", "C", "C_PLUS_PLUS", "C_SHARP", "CLOJURE", "DOT_NET", "ELIXIR", "ERLANG", "GO", "GROOVY", "HASKELL", "HCL", "JAVA", "JAVASCRIPT", "JVM", "KOTLIN", "OBJECTIVE_C", "PERL", "PHP", "PYTHON", "RUBY", "RUST", "SCALA", "SWIFT", "TERRAFORM", "TYPESCRIPT", "UNKNOWN"));

  public static final IssueLanguage BRIGHTSCRIPT = new IssueLanguage("BRIGHTSCRIPT");
  public static final IssueLanguage C = new IssueLanguage("C");
  public static final IssueLanguage C_PLUS_PLUS = new IssueLanguage("C_PLUS_PLUS");
  public static final IssueLanguage C_SHARP = new IssueLanguage("C_SHARP");
  public static final IssueLanguage CLOJURE = new IssueLanguage("CLOJURE");
  public static final IssueLanguage DOT_NET = new IssueLanguage("DOT_NET");
  public static final IssueLanguage ELIXIR = new IssueLanguage("ELIXIR");
  public static final IssueLanguage ERLANG = new IssueLanguage("ERLANG");
  public static final IssueLanguage GO = new IssueLanguage("GO");
  public static final IssueLanguage GROOVY = new IssueLanguage("GROOVY");
  public static final IssueLanguage HASKELL = new IssueLanguage("HASKELL");
  public static final IssueLanguage HCL = new IssueLanguage("HCL");
  public static final IssueLanguage JAVA = new IssueLanguage("JAVA");
  public static final IssueLanguage JAVASCRIPT = new IssueLanguage("JAVASCRIPT");
  public static final IssueLanguage JVM = new IssueLanguage("JVM");
  public static final IssueLanguage KOTLIN = new IssueLanguage("KOTLIN");
  public static final IssueLanguage OBJECTIVE_C = new IssueLanguage("OBJECTIVE_C");
  public static final IssueLanguage PERL = new IssueLanguage("PERL");
  public static final IssueLanguage PHP = new IssueLanguage("PHP");
  public static final IssueLanguage PYTHON = new IssueLanguage("PYTHON");
  public static final IssueLanguage RUBY = new IssueLanguage("RUBY");
  public static final IssueLanguage RUST = new IssueLanguage("RUST");
  public static final IssueLanguage SCALA = new IssueLanguage("SCALA");
  public static final IssueLanguage SWIFT = new IssueLanguage("SWIFT");
  public static final IssueLanguage TERRAFORM = new IssueLanguage("TERRAFORM");
  public static final IssueLanguage TYPESCRIPT = new IssueLanguage("TYPESCRIPT");
  public static final IssueLanguage UNKNOWN = new IssueLanguage("UNKNOWN");


  IssueLanguage(String value) {
    super(value, allowedValues);
  }

  public static class IssueLanguageSerializer extends StdSerializer<IssueLanguage> {
      public IssueLanguageSerializer(Class<IssueLanguage> t) {
          super(t);
      }

      public IssueLanguageSerializer() {
          this(null);
      }

      @Override
      public void serialize(IssueLanguage value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static IssueLanguage fromValue(String value) {
    return new IssueLanguage(value);
  }
}
