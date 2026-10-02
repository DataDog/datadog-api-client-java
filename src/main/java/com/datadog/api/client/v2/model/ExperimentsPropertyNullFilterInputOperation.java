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

/** Comparison applied by this filter. */
@JsonSerialize(
    using =
        ExperimentsPropertyNullFilterInputOperation
            .ExperimentsPropertyNullFilterInputOperationSerializer.class)
public class ExperimentsPropertyNullFilterInputOperation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("IS_NULL", "IS_NOT_NULL"));

  public static final ExperimentsPropertyNullFilterInputOperation IS_NULL =
      new ExperimentsPropertyNullFilterInputOperation("IS_NULL");
  public static final ExperimentsPropertyNullFilterInputOperation IS_NOT_NULL =
      new ExperimentsPropertyNullFilterInputOperation("IS_NOT_NULL");

  ExperimentsPropertyNullFilterInputOperation(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsPropertyNullFilterInputOperationSerializer
      extends StdSerializer<ExperimentsPropertyNullFilterInputOperation> {
    public ExperimentsPropertyNullFilterInputOperationSerializer(
        Class<ExperimentsPropertyNullFilterInputOperation> t) {
      super(t);
    }

    public ExperimentsPropertyNullFilterInputOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsPropertyNullFilterInputOperation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsPropertyNullFilterInputOperation fromValue(String value) {
    return new ExperimentsPropertyNullFilterInputOperation(value);
  }
}
