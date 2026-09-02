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

/** Function applied to the measure before it is compared against the predicted bounds. */
@JsonSerialize(
    using =
        MonitorFormulaAndFunctionDataQualityDiffFunction
            .MonitorFormulaAndFunctionDataQualityDiffFunctionSerializer.class)
public class MonitorFormulaAndFunctionDataQualityDiffFunction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("DIFF", "DIFF_PERCENT"));

  public static final MonitorFormulaAndFunctionDataQualityDiffFunction DIFF =
      new MonitorFormulaAndFunctionDataQualityDiffFunction("DIFF");
  public static final MonitorFormulaAndFunctionDataQualityDiffFunction DIFF_PERCENT =
      new MonitorFormulaAndFunctionDataQualityDiffFunction("DIFF_PERCENT");

  MonitorFormulaAndFunctionDataQualityDiffFunction(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionDataQualityDiffFunctionSerializer
      extends StdSerializer<MonitorFormulaAndFunctionDataQualityDiffFunction> {
    public MonitorFormulaAndFunctionDataQualityDiffFunctionSerializer(
        Class<MonitorFormulaAndFunctionDataQualityDiffFunction> t) {
      super(t);
    }

    public MonitorFormulaAndFunctionDataQualityDiffFunctionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorFormulaAndFunctionDataQualityDiffFunction value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionDataQualityDiffFunction fromValue(String value) {
    return new MonitorFormulaAndFunctionDataQualityDiffFunction(value);
  }
}
