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

/** Response format for the scalar formula request. Only <code>scalar</code> is supported. */
@JsonSerialize(
    using =
        HostMapWidgetScalarRequestResponseFormat.HostMapWidgetScalarRequestResponseFormatSerializer
            .class)
public class HostMapWidgetScalarRequestResponseFormat extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("scalar"));

  public static final HostMapWidgetScalarRequestResponseFormat SCALAR =
      new HostMapWidgetScalarRequestResponseFormat("scalar");

  HostMapWidgetScalarRequestResponseFormat(String value) {
    super(value, allowedValues);
  }

  public static class HostMapWidgetScalarRequestResponseFormatSerializer
      extends StdSerializer<HostMapWidgetScalarRequestResponseFormat> {
    public HostMapWidgetScalarRequestResponseFormatSerializer(
        Class<HostMapWidgetScalarRequestResponseFormat> t) {
      super(t);
    }

    public HostMapWidgetScalarRequestResponseFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HostMapWidgetScalarRequestResponseFormat value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HostMapWidgetScalarRequestResponseFormat fromValue(String value) {
    return new HostMapWidgetScalarRequestResponseFormat(value);
  }
}
