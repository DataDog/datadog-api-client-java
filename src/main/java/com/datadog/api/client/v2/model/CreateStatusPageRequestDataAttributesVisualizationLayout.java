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

/**
 * The layout of components on the status page. Defaults to <code>list</code>. <code>grid</code>
 * requires <code>visualization_type</code> to be <code>component_name_only</code>; changing <code>
 * visualization_type</code> to any other value resets the layout to <code>list</code>.
 */
@JsonSerialize(
    using =
        CreateStatusPageRequestDataAttributesVisualizationLayout
            .CreateStatusPageRequestDataAttributesVisualizationLayoutSerializer.class)
public class CreateStatusPageRequestDataAttributesVisualizationLayout extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("list", "grid"));

  public static final CreateStatusPageRequestDataAttributesVisualizationLayout LIST =
      new CreateStatusPageRequestDataAttributesVisualizationLayout("list");
  public static final CreateStatusPageRequestDataAttributesVisualizationLayout GRID =
      new CreateStatusPageRequestDataAttributesVisualizationLayout("grid");

  CreateStatusPageRequestDataAttributesVisualizationLayout(String value) {
    super(value, allowedValues);
  }

  public static class CreateStatusPageRequestDataAttributesVisualizationLayoutSerializer
      extends StdSerializer<CreateStatusPageRequestDataAttributesVisualizationLayout> {
    public CreateStatusPageRequestDataAttributesVisualizationLayoutSerializer(
        Class<CreateStatusPageRequestDataAttributesVisualizationLayout> t) {
      super(t);
    }

    public CreateStatusPageRequestDataAttributesVisualizationLayoutSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateStatusPageRequestDataAttributesVisualizationLayout value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CreateStatusPageRequestDataAttributesVisualizationLayout fromValue(String value) {
    return new CreateStatusPageRequestDataAttributesVisualizationLayout(value);
  }
}
