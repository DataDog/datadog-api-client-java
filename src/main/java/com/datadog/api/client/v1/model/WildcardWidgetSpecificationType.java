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

/** Type of specification used by the wildcard widget. */
@JsonSerialize(
    using = WildcardWidgetSpecificationType.WildcardWidgetSpecificationTypeSerializer.class)
public class WildcardWidgetSpecificationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("vega", "vega-lite"));

  public static final WildcardWidgetSpecificationType VEGA =
      new WildcardWidgetSpecificationType("vega");
  public static final WildcardWidgetSpecificationType VEGA_LITE =
      new WildcardWidgetSpecificationType("vega-lite");

  WildcardWidgetSpecificationType(String value) {
    super(value, allowedValues);
  }

  public static class WildcardWidgetSpecificationTypeSerializer
      extends StdSerializer<WildcardWidgetSpecificationType> {
    public WildcardWidgetSpecificationTypeSerializer(Class<WildcardWidgetSpecificationType> t) {
      super(t);
    }

    public WildcardWidgetSpecificationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WildcardWidgetSpecificationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WildcardWidgetSpecificationType fromValue(String value) {
    return new WildcardWidgetSpecificationType(value);
  }
}
