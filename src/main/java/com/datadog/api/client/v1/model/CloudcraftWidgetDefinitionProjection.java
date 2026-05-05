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

/** Projection used to render the Cloudcraft topology. */
@JsonSerialize(
    using =
        CloudcraftWidgetDefinitionProjection.CloudcraftWidgetDefinitionProjectionSerializer.class)
public class CloudcraftWidgetDefinitionProjection extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("isometric", "2d"));

  public static final CloudcraftWidgetDefinitionProjection ISOMETRIC =
      new CloudcraftWidgetDefinitionProjection("isometric");
  public static final CloudcraftWidgetDefinitionProjection TWO_D =
      new CloudcraftWidgetDefinitionProjection("2d");

  CloudcraftWidgetDefinitionProjection(String value) {
    super(value, allowedValues);
  }

  public static class CloudcraftWidgetDefinitionProjectionSerializer
      extends StdSerializer<CloudcraftWidgetDefinitionProjection> {
    public CloudcraftWidgetDefinitionProjectionSerializer(
        Class<CloudcraftWidgetDefinitionProjection> t) {
      super(t);
    }

    public CloudcraftWidgetDefinitionProjectionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CloudcraftWidgetDefinitionProjection value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CloudcraftWidgetDefinitionProjection fromValue(String value) {
    return new CloudcraftWidgetDefinitionProjection(value);
  }
}
