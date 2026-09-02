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

/**
 * Origin of the description. <code>human</code> indicates the description was written by a user,
 * <code>ai_generated</code> was produced by AI, and <code>datadog</code> is a default supplied by
 * Datadog.
 */
@JsonSerialize(using = CostTagDescriptionSource.CostTagDescriptionSourceSerializer.class)
public class CostTagDescriptionSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("human", "ai_generated", "datadog"));

  public static final CostTagDescriptionSource HUMAN = new CostTagDescriptionSource("human");
  public static final CostTagDescriptionSource AI_GENERATED =
      new CostTagDescriptionSource("ai_generated");
  public static final CostTagDescriptionSource DATADOG = new CostTagDescriptionSource("datadog");

  CostTagDescriptionSource(String value) {
    super(value, allowedValues);
  }

  public static class CostTagDescriptionSourceSerializer
      extends StdSerializer<CostTagDescriptionSource> {
    public CostTagDescriptionSourceSerializer(Class<CostTagDescriptionSource> t) {
      super(t);
    }

    public CostTagDescriptionSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostTagDescriptionSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostTagDescriptionSource fromValue(String value) {
    return new CostTagDescriptionSource(value);
  }
}
