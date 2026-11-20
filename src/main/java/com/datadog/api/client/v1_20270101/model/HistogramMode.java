/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = HistogramMode.HistogramModeSerializer.class)
public class HistogramMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("distribution_metric", "pre_binned_metric"));

  public static final HistogramMode DISTRIBUTION_METRIC = new HistogramMode("distribution_metric");
  public static final HistogramMode PRE_BINNED_METRIC = new HistogramMode("pre_binned_metric");

  HistogramMode(String value) {
    super(value, allowedValues);
  }

  public static class HistogramModeSerializer extends StdSerializer<HistogramMode> {
    public HistogramModeSerializer(Class<HistogramMode> t) {
      super(t);
    }

    public HistogramModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(HistogramMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HistogramMode fromValue(String value) {
    return new HistogramMode(value);
  }
}
