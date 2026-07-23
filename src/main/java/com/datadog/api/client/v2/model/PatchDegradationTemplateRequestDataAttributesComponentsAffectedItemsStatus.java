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

/** The status of the component. */
@JsonSerialize(
    using =
        PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus
            .PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatusSerializer
            .class)
public class PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("operational", "degraded", "partial_outage", "major_outage"));

  public static final PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus
      OPERATIONAL =
          new PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus(
              "operational");
  public static final PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus
      DEGRADED =
          new PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus(
              "degraded");
  public static final PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus
      PARTIAL_OUTAGE =
          new PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus(
              "partial_outage");
  public static final PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus
      MAJOR_OUTAGE =
          new PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus(
              "major_outage");

  PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus(String value) {
    super(value, allowedValues);
  }

  public static
  class PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatusSerializer
      extends StdSerializer<
          PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus> {
    public PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatusSerializer(
        Class<PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus> t) {
      super(t);
    }

    public PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus
      fromValue(String value) {
    return new PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus(value);
  }
}
