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

/** Persona for the search. Either track(s) or persona(s) must be specified. */
@JsonSerialize(
    using =
        IssuesSearchRequestDataAttributesPersona.IssuesSearchRequestDataAttributesPersonaSerializer
            .class)
public class IssuesSearchRequestDataAttributesPersona extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ALL", "BROWSER", "MOBILE", "BACKEND"));

  public static final IssuesSearchRequestDataAttributesPersona ALL =
      new IssuesSearchRequestDataAttributesPersona("ALL");
  public static final IssuesSearchRequestDataAttributesPersona BROWSER =
      new IssuesSearchRequestDataAttributesPersona("BROWSER");
  public static final IssuesSearchRequestDataAttributesPersona MOBILE =
      new IssuesSearchRequestDataAttributesPersona("MOBILE");
  public static final IssuesSearchRequestDataAttributesPersona BACKEND =
      new IssuesSearchRequestDataAttributesPersona("BACKEND");

  IssuesSearchRequestDataAttributesPersona(String value) {
    super(value, allowedValues);
  }

  public static class IssuesSearchRequestDataAttributesPersonaSerializer
      extends StdSerializer<IssuesSearchRequestDataAttributesPersona> {
    public IssuesSearchRequestDataAttributesPersonaSerializer(
        Class<IssuesSearchRequestDataAttributesPersona> t) {
      super(t);
    }

    public IssuesSearchRequestDataAttributesPersonaSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IssuesSearchRequestDataAttributesPersona value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssuesSearchRequestDataAttributesPersona fromValue(String value) {
    return new IssuesSearchRequestDataAttributesPersona(value);
  }
}
