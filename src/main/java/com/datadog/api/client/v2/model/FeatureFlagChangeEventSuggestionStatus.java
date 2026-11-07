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

/** The review status of the change request. */
@JsonSerialize(
    using =
        FeatureFlagChangeEventSuggestionStatus.FeatureFlagChangeEventSuggestionStatusSerializer
            .class)
public class FeatureFlagChangeEventSuggestionStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pending", "approved", "rejected"));

  public static final FeatureFlagChangeEventSuggestionStatus PENDING =
      new FeatureFlagChangeEventSuggestionStatus("pending");
  public static final FeatureFlagChangeEventSuggestionStatus APPROVED =
      new FeatureFlagChangeEventSuggestionStatus("approved");
  public static final FeatureFlagChangeEventSuggestionStatus REJECTED =
      new FeatureFlagChangeEventSuggestionStatus("rejected");

  FeatureFlagChangeEventSuggestionStatus(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagChangeEventSuggestionStatusSerializer
      extends StdSerializer<FeatureFlagChangeEventSuggestionStatus> {
    public FeatureFlagChangeEventSuggestionStatusSerializer(
        Class<FeatureFlagChangeEventSuggestionStatus> t) {
      super(t);
    }

    public FeatureFlagChangeEventSuggestionStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagChangeEventSuggestionStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagChangeEventSuggestionStatus fromValue(String value) {
    return new FeatureFlagChangeEventSuggestionStatus(value);
  }
}
