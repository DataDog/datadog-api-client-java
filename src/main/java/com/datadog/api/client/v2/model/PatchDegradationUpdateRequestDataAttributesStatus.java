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

/** The status of the degradation update. */
@JsonSerialize(
    using =
        PatchDegradationUpdateRequestDataAttributesStatus
            .PatchDegradationUpdateRequestDataAttributesStatusSerializer.class)
public class PatchDegradationUpdateRequestDataAttributesStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("investigating", "identified", "monitoring"));

  public static final PatchDegradationUpdateRequestDataAttributesStatus INVESTIGATING =
      new PatchDegradationUpdateRequestDataAttributesStatus("investigating");
  public static final PatchDegradationUpdateRequestDataAttributesStatus IDENTIFIED =
      new PatchDegradationUpdateRequestDataAttributesStatus("identified");
  public static final PatchDegradationUpdateRequestDataAttributesStatus MONITORING =
      new PatchDegradationUpdateRequestDataAttributesStatus("monitoring");

  PatchDegradationUpdateRequestDataAttributesStatus(String value) {
    super(value, allowedValues);
  }

  public static class PatchDegradationUpdateRequestDataAttributesStatusSerializer
      extends StdSerializer<PatchDegradationUpdateRequestDataAttributesStatus> {
    public PatchDegradationUpdateRequestDataAttributesStatusSerializer(
        Class<PatchDegradationUpdateRequestDataAttributesStatus> t) {
      super(t);
    }

    public PatchDegradationUpdateRequestDataAttributesStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PatchDegradationUpdateRequestDataAttributesStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PatchDegradationUpdateRequestDataAttributesStatus fromValue(String value) {
    return new PatchDegradationUpdateRequestDataAttributesStatus(value);
  }
}
