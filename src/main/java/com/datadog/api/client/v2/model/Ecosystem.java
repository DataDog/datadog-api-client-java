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

/** The related vulnerability asset ecosystem. */
@JsonSerialize(using = Ecosystem.EcosystemSerializer.class)
public class Ecosystem extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "PyPI",
              "Maven",
              "NuGet",
              "Npm",
              "RubyGems",
              "Go",
              "Packagist",
              "Ddeb",
              "Rpm",
              "Apk",
              "Windows"));

  public static final Ecosystem PYPI = new Ecosystem("PyPI");
  public static final Ecosystem MAVEN = new Ecosystem("Maven");
  public static final Ecosystem NUGET = new Ecosystem("NuGet");
  public static final Ecosystem NPM = new Ecosystem("Npm");
  public static final Ecosystem RUBYGEMS = new Ecosystem("RubyGems");
  public static final Ecosystem GO = new Ecosystem("Go");
  public static final Ecosystem PACKAGIST = new Ecosystem("Packagist");
  public static final Ecosystem DDEB = new Ecosystem("Ddeb");
  public static final Ecosystem RPM = new Ecosystem("Rpm");
  public static final Ecosystem APK = new Ecosystem("Apk");
  public static final Ecosystem WINDOWS = new Ecosystem("Windows");

  Ecosystem(String value) {
    super(value, allowedValues);
  }

  public static class EcosystemSerializer extends StdSerializer<Ecosystem> {
    public EcosystemSerializer(Class<Ecosystem> t) {
      super(t);
    }

    public EcosystemSerializer() {
      this(null);
    }

    @Override
    public void serialize(Ecosystem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Ecosystem fromValue(String value) {
    return new Ecosystem(value);
  }
}
