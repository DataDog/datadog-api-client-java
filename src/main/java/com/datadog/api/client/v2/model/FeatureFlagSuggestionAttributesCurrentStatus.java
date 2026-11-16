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
 * The legacy review status. Use <code>lifecycle_status</code> to distinguish approval from
 * application.
 */
@JsonSerialize(
    using =
        FeatureFlagSuggestionAttributesCurrentStatus
            .FeatureFlagSuggestionAttributesCurrentStatusSerializer.class)
public class FeatureFlagSuggestionAttributesCurrentStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pending", "approved", "rejected"));

  public static final FeatureFlagSuggestionAttributesCurrentStatus PENDING =
      new FeatureFlagSuggestionAttributesCurrentStatus("pending");
  public static final FeatureFlagSuggestionAttributesCurrentStatus APPROVED =
      new FeatureFlagSuggestionAttributesCurrentStatus("approved");
  public static final FeatureFlagSuggestionAttributesCurrentStatus REJECTED =
      new FeatureFlagSuggestionAttributesCurrentStatus("rejected");

  FeatureFlagSuggestionAttributesCurrentStatus(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagSuggestionAttributesCurrentStatusSerializer
      extends StdSerializer<FeatureFlagSuggestionAttributesCurrentStatus> {
    public FeatureFlagSuggestionAttributesCurrentStatusSerializer(
        Class<FeatureFlagSuggestionAttributesCurrentStatus> t) {
      super(t);
    }

    public FeatureFlagSuggestionAttributesCurrentStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagSuggestionAttributesCurrentStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagSuggestionAttributesCurrentStatus fromValue(String value) {
    return new FeatureFlagSuggestionAttributesCurrentStatus(value);
  }
}
