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

/** Overlay applied on top of the Cloudcraft topology. */
@JsonSerialize(
    using = CloudcraftWidgetDefinitionOverlay.CloudcraftWidgetDefinitionOverlaySerializer.class)
public class CloudcraftWidgetDefinitionOverlay extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "Observability",
              "CloudCost",
              "Security",
              "NDMReachability",
              "Monitors",
              "APM",
              "Default"));

  public static final CloudcraftWidgetDefinitionOverlay OBSERVABILITY =
      new CloudcraftWidgetDefinitionOverlay("Observability");
  public static final CloudcraftWidgetDefinitionOverlay CLOUD_COST =
      new CloudcraftWidgetDefinitionOverlay("CloudCost");
  public static final CloudcraftWidgetDefinitionOverlay SECURITY =
      new CloudcraftWidgetDefinitionOverlay("Security");
  public static final CloudcraftWidgetDefinitionOverlay NDM_REACHABILITY =
      new CloudcraftWidgetDefinitionOverlay("NDMReachability");
  public static final CloudcraftWidgetDefinitionOverlay MONITORS =
      new CloudcraftWidgetDefinitionOverlay("Monitors");
  public static final CloudcraftWidgetDefinitionOverlay APM =
      new CloudcraftWidgetDefinitionOverlay("APM");
  public static final CloudcraftWidgetDefinitionOverlay DEFAULT =
      new CloudcraftWidgetDefinitionOverlay("Default");

  CloudcraftWidgetDefinitionOverlay(String value) {
    super(value, allowedValues);
  }

  public static class CloudcraftWidgetDefinitionOverlaySerializer
      extends StdSerializer<CloudcraftWidgetDefinitionOverlay> {
    public CloudcraftWidgetDefinitionOverlaySerializer(Class<CloudcraftWidgetDefinitionOverlay> t) {
      super(t);
    }

    public CloudcraftWidgetDefinitionOverlaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CloudcraftWidgetDefinitionOverlay value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CloudcraftWidgetDefinitionOverlay fromValue(String value) {
    return new CloudcraftWidgetDefinitionOverlay(value);
  }
}
