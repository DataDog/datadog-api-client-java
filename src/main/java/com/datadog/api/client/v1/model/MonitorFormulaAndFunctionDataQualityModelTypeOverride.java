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

/** Override for the model type used in anomaly detection. */
@JsonSerialize(
    using =
        MonitorFormulaAndFunctionDataQualityModelTypeOverride
            .MonitorFormulaAndFunctionDataQualityModelTypeOverrideSerializer.class)
public class MonitorFormulaAndFunctionDataQualityModelTypeOverride extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("freshness", "percentage", "any"));

  public static final MonitorFormulaAndFunctionDataQualityModelTypeOverride FRESHNESS =
      new MonitorFormulaAndFunctionDataQualityModelTypeOverride("freshness");
  public static final MonitorFormulaAndFunctionDataQualityModelTypeOverride PERCENTAGE =
      new MonitorFormulaAndFunctionDataQualityModelTypeOverride("percentage");
  public static final MonitorFormulaAndFunctionDataQualityModelTypeOverride ANY =
      new MonitorFormulaAndFunctionDataQualityModelTypeOverride("any");

  MonitorFormulaAndFunctionDataQualityModelTypeOverride(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionDataQualityModelTypeOverrideSerializer
      extends StdSerializer<MonitorFormulaAndFunctionDataQualityModelTypeOverride> {
    public MonitorFormulaAndFunctionDataQualityModelTypeOverrideSerializer(
        Class<MonitorFormulaAndFunctionDataQualityModelTypeOverride> t) {
      super(t);
    }

    public MonitorFormulaAndFunctionDataQualityModelTypeOverrideSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorFormulaAndFunctionDataQualityModelTypeOverride value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionDataQualityModelTypeOverride fromValue(String value) {
    return new MonitorFormulaAndFunctionDataQualityModelTypeOverride(value);
  }
}
