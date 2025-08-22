/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Programming language associated with the issue. */
@JsonSerialize(using = IssueLanguage.IssueLanguageSerializer.class)
public class IssueLanguage extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "javascript",
              "jvm",
              "ruby",
              "typescript",
              "java",
              "kotlin",
              "scala",
              "groovy",
              "clojure",
              "go",
              "python",
              "php",
              "dot_net",
              "c_sharp",
              "c_plus_plus",
              "objective_c",
              "swift",
              "brightscript",
              "c",
              "elixir",
              "erlang",
              "perl",
              "haskell",
              "rust"));

  public static final IssueLanguage JAVASCRIPT = new IssueLanguage("javascript");
  public static final IssueLanguage JVM = new IssueLanguage("jvm");
  public static final IssueLanguage RUBY = new IssueLanguage("ruby");
  public static final IssueLanguage TYPESCRIPT = new IssueLanguage("typescript");
  public static final IssueLanguage JAVA = new IssueLanguage("java");
  public static final IssueLanguage KOTLIN = new IssueLanguage("kotlin");
  public static final IssueLanguage SCALA = new IssueLanguage("scala");
  public static final IssueLanguage GROOVY = new IssueLanguage("groovy");
  public static final IssueLanguage CLOJURE = new IssueLanguage("clojure");
  public static final IssueLanguage GO = new IssueLanguage("go");
  public static final IssueLanguage PYTHON = new IssueLanguage("python");
  public static final IssueLanguage PHP = new IssueLanguage("php");
  public static final IssueLanguage DOT_NET = new IssueLanguage("dot_net");
  public static final IssueLanguage C_SHARP = new IssueLanguage("c_sharp");
  public static final IssueLanguage C_PLUS_PLUS = new IssueLanguage("c_plus_plus");
  public static final IssueLanguage OBJECTIVE_C = new IssueLanguage("objective_c");
  public static final IssueLanguage SWIFT = new IssueLanguage("swift");
  public static final IssueLanguage BRIGHTSCRIPT = new IssueLanguage("brightscript");
  public static final IssueLanguage C = new IssueLanguage("c");
  public static final IssueLanguage ELIXIR = new IssueLanguage("elixir");
  public static final IssueLanguage ERLANG = new IssueLanguage("erlang");
  public static final IssueLanguage PERL = new IssueLanguage("perl");
  public static final IssueLanguage HASKELL = new IssueLanguage("haskell");
  public static final IssueLanguage RUST = new IssueLanguage("rust");

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
    public void serialize(IssueLanguage value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueLanguage fromValue(String value) {
    return new IssueLanguage(value);
  }
}
