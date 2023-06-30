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

/** Amount of log lines to display */
@JsonSerialize(using = WidgetMessageDisplay.WidgetMessageDisplaySerializer.class)
public class WidgetMessageDisplay extends ModelEnum<String> {

  public static final WidgetMessageDisplay INLINE = new WidgetMessageDisplay("inline");
  public static final WidgetMessageDisplay EXPANDED_MEDIUM =
      new WidgetMessageDisplay("expanded-md");
  public static final WidgetMessageDisplay EXPANDED_LARGE = new WidgetMessageDisplay("expanded-lg");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("inline", "expanded-md", "expanded-lg"));

  WidgetMessageDisplay(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class WidgetMessageDisplaySerializer extends StdSerializer<WidgetMessageDisplay> {
    public WidgetMessageDisplaySerializer(Class<WidgetMessageDisplay> t) {
      super(t);
    }

    public WidgetMessageDisplaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WidgetMessageDisplay value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetMessageDisplay fromValue(String value) {
    return new WidgetMessageDisplay(value);
  }
}
