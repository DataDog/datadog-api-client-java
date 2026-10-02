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

/** Direction of change that represents an improvement for this metric. */
@JsonSerialize(
    using =
        ExperimentsCreateMetricV2RequestDataAttributesDesiredChange
            .ExperimentsCreateMetricV2RequestDataAttributesDesiredChangeSerializer.class)
public class ExperimentsCreateMetricV2RequestDataAttributesDesiredChange extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("METRIC_INCREASES", "METRIC_DECREASES"));

  public static final ExperimentsCreateMetricV2RequestDataAttributesDesiredChange METRIC_INCREASES =
      new ExperimentsCreateMetricV2RequestDataAttributesDesiredChange("METRIC_INCREASES");
  public static final ExperimentsCreateMetricV2RequestDataAttributesDesiredChange METRIC_DECREASES =
      new ExperimentsCreateMetricV2RequestDataAttributesDesiredChange("METRIC_DECREASES");

  ExperimentsCreateMetricV2RequestDataAttributesDesiredChange(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsCreateMetricV2RequestDataAttributesDesiredChangeSerializer
      extends StdSerializer<ExperimentsCreateMetricV2RequestDataAttributesDesiredChange> {
    public ExperimentsCreateMetricV2RequestDataAttributesDesiredChangeSerializer(
        Class<ExperimentsCreateMetricV2RequestDataAttributesDesiredChange> t) {
      super(t);
    }

    public ExperimentsCreateMetricV2RequestDataAttributesDesiredChangeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsCreateMetricV2RequestDataAttributesDesiredChange value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsCreateMetricV2RequestDataAttributesDesiredChange fromValue(
      String value) {
    return new ExperimentsCreateMetricV2RequestDataAttributesDesiredChange(value);
  }
}
