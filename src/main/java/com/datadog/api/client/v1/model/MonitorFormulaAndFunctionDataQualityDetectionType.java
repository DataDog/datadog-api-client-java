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
 * How a <code>data-jobs alert</code> job duration monitor detects a breach. Must match the <code>
 * .detection()</code> call in the monitor query. Required for job duration monitors.
 */
@JsonSerialize(
    using =
        MonitorFormulaAndFunctionDataQualityDetectionType
            .MonitorFormulaAndFunctionDataQualityDetectionTypeSerializer.class)
public class MonitorFormulaAndFunctionDataQualityDetectionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("static", "anomaly"));

  public static final MonitorFormulaAndFunctionDataQualityDetectionType STATIC =
      new MonitorFormulaAndFunctionDataQualityDetectionType("static");
  public static final MonitorFormulaAndFunctionDataQualityDetectionType ANOMALY =
      new MonitorFormulaAndFunctionDataQualityDetectionType("anomaly");

  MonitorFormulaAndFunctionDataQualityDetectionType(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionDataQualityDetectionTypeSerializer
      extends StdSerializer<MonitorFormulaAndFunctionDataQualityDetectionType> {
    public MonitorFormulaAndFunctionDataQualityDetectionTypeSerializer(
        Class<MonitorFormulaAndFunctionDataQualityDetectionType> t) {
      super(t);
    }

    public MonitorFormulaAndFunctionDataQualityDetectionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorFormulaAndFunctionDataQualityDetectionType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionDataQualityDetectionType fromValue(String value) {
    return new MonitorFormulaAndFunctionDataQualityDetectionType(value);
  }
}
