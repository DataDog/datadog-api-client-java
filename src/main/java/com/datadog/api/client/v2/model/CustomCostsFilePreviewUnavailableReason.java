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
 * Reason the content of the Custom Costs file is not returned. Only set when <code>content</code>
 * is omitted.
 */
@JsonSerialize(
    using =
        CustomCostsFilePreviewUnavailableReason.CustomCostsFilePreviewUnavailableReasonSerializer
            .class)
public class CustomCostsFilePreviewUnavailableReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("CHARGE_PERIOD_OUTSIDE_RETENTION_WINDOW"));

  public static final CustomCostsFilePreviewUnavailableReason
      CHARGE_PERIOD_OUTSIDE_RETENTION_WINDOW =
          new CustomCostsFilePreviewUnavailableReason("CHARGE_PERIOD_OUTSIDE_RETENTION_WINDOW");

  CustomCostsFilePreviewUnavailableReason(String value) {
    super(value, allowedValues);
  }

  public static class CustomCostsFilePreviewUnavailableReasonSerializer
      extends StdSerializer<CustomCostsFilePreviewUnavailableReason> {
    public CustomCostsFilePreviewUnavailableReasonSerializer(
        Class<CustomCostsFilePreviewUnavailableReason> t) {
      super(t);
    }

    public CustomCostsFilePreviewUnavailableReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomCostsFilePreviewUnavailableReason value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomCostsFilePreviewUnavailableReason fromValue(String value) {
    return new CustomCostsFilePreviewUnavailableReason(value);
  }
}
