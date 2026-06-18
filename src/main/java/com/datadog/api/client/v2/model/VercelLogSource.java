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

/** Source of logs that Vercel forwards to Datadog. */
@JsonSerialize(using = VercelLogSource.VercelLogSourceSerializer.class)
public class VercelLogSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("static", "lambda", "edge", "build", "external", "firewall"));

  public static final VercelLogSource STATIC = new VercelLogSource("static");
  public static final VercelLogSource LAMBDA = new VercelLogSource("lambda");
  public static final VercelLogSource EDGE = new VercelLogSource("edge");
  public static final VercelLogSource BUILD = new VercelLogSource("build");
  public static final VercelLogSource EXTERNAL = new VercelLogSource("external");
  public static final VercelLogSource FIREWALL = new VercelLogSource("firewall");

  VercelLogSource(String value) {
    super(value, allowedValues);
  }

  public static class VercelLogSourceSerializer extends StdSerializer<VercelLogSource> {
    public VercelLogSourceSerializer(Class<VercelLogSource> t) {
      super(t);
    }

    public VercelLogSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(VercelLogSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static VercelLogSource fromValue(String value) {
    return new VercelLogSource(value);
  }
}
