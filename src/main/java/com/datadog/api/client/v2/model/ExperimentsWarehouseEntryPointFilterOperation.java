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

/** Comparison applied by the warehouse entry-point filter. */
@JsonSerialize(
    using =
        ExperimentsWarehouseEntryPointFilterOperation
            .ExperimentsWarehouseEntryPointFilterOperationSerializer.class)
public class ExperimentsWarehouseEntryPointFilterOperation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("IS", "IS_NOT"));

  public static final ExperimentsWarehouseEntryPointFilterOperation IS =
      new ExperimentsWarehouseEntryPointFilterOperation("IS");
  public static final ExperimentsWarehouseEntryPointFilterOperation IS_NOT =
      new ExperimentsWarehouseEntryPointFilterOperation("IS_NOT");

  ExperimentsWarehouseEntryPointFilterOperation(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsWarehouseEntryPointFilterOperationSerializer
      extends StdSerializer<ExperimentsWarehouseEntryPointFilterOperation> {
    public ExperimentsWarehouseEntryPointFilterOperationSerializer(
        Class<ExperimentsWarehouseEntryPointFilterOperation> t) {
      super(t);
    }

    public ExperimentsWarehouseEntryPointFilterOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsWarehouseEntryPointFilterOperation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsWarehouseEntryPointFilterOperation fromValue(String value) {
    return new ExperimentsWarehouseEntryPointFilterOperation(value);
  }
}
