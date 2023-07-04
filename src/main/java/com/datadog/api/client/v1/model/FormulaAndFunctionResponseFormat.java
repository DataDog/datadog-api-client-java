/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
 * Timeseries, scalar, or event list response. Event list response formats are supported by Geomap
 * widgets.
 */
@JsonSerialize(
    using = FormulaAndFunctionResponseFormat.FormulaAndFunctionResponseFormatSerializer.class)
public class FormulaAndFunctionResponseFormat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timeseries", "scalar", "event_list"));

  public static final FormulaAndFunctionResponseFormat TIMESERIES =
      new FormulaAndFunctionResponseFormat("timeseries");
  public static final FormulaAndFunctionResponseFormat SCALAR =
      new FormulaAndFunctionResponseFormat("scalar");
  public static final FormulaAndFunctionResponseFormat EVENT_LIST =
      new FormulaAndFunctionResponseFormat("event_list");

  FormulaAndFunctionResponseFormat(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionResponseFormatSerializer
      extends StdSerializer<FormulaAndFunctionResponseFormat> {
    public FormulaAndFunctionResponseFormatSerializer(Class<FormulaAndFunctionResponseFormat> t) {
      super(t);
    }

    public FormulaAndFunctionResponseFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionResponseFormat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionResponseFormat fromValue(String value) {
    return new FormulaAndFunctionResponseFormat(value);
  }
}
