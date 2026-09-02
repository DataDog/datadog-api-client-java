/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Restricts which predicted bound the monitor alerts on. <code>UPPER_ONLY</code> alerts only when
   * the measure rises above the upper bound, <code>LOWER_ONLY</code> only when it falls below the
   * lower bound. When unset, the monitor alerts on both.</p>
 */
@JsonSerialize(using = MonitorFormulaAndFunctionDataQualityModelBoundsOverride.MonitorFormulaAndFunctionDataQualityModelBoundsOverrideSerializer.class)
public class MonitorFormulaAndFunctionDataQualityModelBoundsOverride extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("UPPER_ONLY", "LOWER_ONLY"));

  public static final MonitorFormulaAndFunctionDataQualityModelBoundsOverride UPPER_ONLY = new MonitorFormulaAndFunctionDataQualityModelBoundsOverride("UPPER_ONLY");
  public static final MonitorFormulaAndFunctionDataQualityModelBoundsOverride LOWER_ONLY = new MonitorFormulaAndFunctionDataQualityModelBoundsOverride("LOWER_ONLY");


  MonitorFormulaAndFunctionDataQualityModelBoundsOverride(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionDataQualityModelBoundsOverrideSerializer extends StdSerializer<MonitorFormulaAndFunctionDataQualityModelBoundsOverride> {
      public MonitorFormulaAndFunctionDataQualityModelBoundsOverrideSerializer(Class<MonitorFormulaAndFunctionDataQualityModelBoundsOverride> t) {
          super(t);
      }

      public MonitorFormulaAndFunctionDataQualityModelBoundsOverrideSerializer() {
          this(null);
      }

      @Override
      public void serialize(MonitorFormulaAndFunctionDataQualityModelBoundsOverride value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionDataQualityModelBoundsOverride fromValue(String value) {
    return new MonitorFormulaAndFunctionDataQualityModelBoundsOverride(value);
  }
}
