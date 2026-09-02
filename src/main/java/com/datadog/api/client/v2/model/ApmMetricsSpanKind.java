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

/** Describes the relationship between the span, its parents, and its children in a trace. */
@JsonSerialize(using = ApmMetricsSpanKind.ApmMetricsSpanKindSerializer.class)
public class ApmMetricsSpanKind extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("consumer", "server", "client", "producer", "internal"));

  public static final ApmMetricsSpanKind CONSUMER = new ApmMetricsSpanKind("consumer");
  public static final ApmMetricsSpanKind SERVER = new ApmMetricsSpanKind("server");
  public static final ApmMetricsSpanKind CLIENT = new ApmMetricsSpanKind("client");
  public static final ApmMetricsSpanKind PRODUCER = new ApmMetricsSpanKind("producer");
  public static final ApmMetricsSpanKind INTERNAL = new ApmMetricsSpanKind("internal");

  ApmMetricsSpanKind(String value) {
    super(value, allowedValues);
  }

  public static class ApmMetricsSpanKindSerializer extends StdSerializer<ApmMetricsSpanKind> {
    public ApmMetricsSpanKindSerializer(Class<ApmMetricsSpanKind> t) {
      super(t);
    }

    public ApmMetricsSpanKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(ApmMetricsSpanKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmMetricsSpanKind fromValue(String value) {
    return new ApmMetricsSpanKind(value);
  }
}
