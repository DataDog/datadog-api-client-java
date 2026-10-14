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

/** Comparison applied by the Datadog entry-point filter. */
@JsonSerialize(
    using =
        ExperimentsDatadogEntryPointFilterOperation
            .ExperimentsDatadogEntryPointFilterOperationSerializer.class)
public class ExperimentsDatadogEntryPointFilterOperation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("eq", "in", "neq", "not_in", "gte", "lte", "gt", "lt"));

  public static final ExperimentsDatadogEntryPointFilterOperation EQ =
      new ExperimentsDatadogEntryPointFilterOperation("eq");
  public static final ExperimentsDatadogEntryPointFilterOperation IN =
      new ExperimentsDatadogEntryPointFilterOperation("in");
  public static final ExperimentsDatadogEntryPointFilterOperation NEQ =
      new ExperimentsDatadogEntryPointFilterOperation("neq");
  public static final ExperimentsDatadogEntryPointFilterOperation NOT_IN =
      new ExperimentsDatadogEntryPointFilterOperation("not_in");
  public static final ExperimentsDatadogEntryPointFilterOperation GTE =
      new ExperimentsDatadogEntryPointFilterOperation("gte");
  public static final ExperimentsDatadogEntryPointFilterOperation LTE =
      new ExperimentsDatadogEntryPointFilterOperation("lte");
  public static final ExperimentsDatadogEntryPointFilterOperation GT =
      new ExperimentsDatadogEntryPointFilterOperation("gt");
  public static final ExperimentsDatadogEntryPointFilterOperation LT =
      new ExperimentsDatadogEntryPointFilterOperation("lt");

  ExperimentsDatadogEntryPointFilterOperation(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsDatadogEntryPointFilterOperationSerializer
      extends StdSerializer<ExperimentsDatadogEntryPointFilterOperation> {
    public ExperimentsDatadogEntryPointFilterOperationSerializer(
        Class<ExperimentsDatadogEntryPointFilterOperation> t) {
      super(t);
    }

    public ExperimentsDatadogEntryPointFilterOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsDatadogEntryPointFilterOperation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsDatadogEntryPointFilterOperation fromValue(String value) {
    return new ExperimentsDatadogEntryPointFilterOperation(value);
  }
}
