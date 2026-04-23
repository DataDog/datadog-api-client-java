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

/** The status of a flag suggestion. */
@JsonSerialize(using = FlagSuggestionStatus.FlagSuggestionStatusSerializer.class)
public class FlagSuggestionStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pending", "rejected", "approved"));

  public static final FlagSuggestionStatus PENDING = new FlagSuggestionStatus("pending");
  public static final FlagSuggestionStatus REJECTED = new FlagSuggestionStatus("rejected");
  public static final FlagSuggestionStatus APPROVED = new FlagSuggestionStatus("approved");

  FlagSuggestionStatus(String value) {
    super(value, allowedValues);
  }

  public static class FlagSuggestionStatusSerializer extends StdSerializer<FlagSuggestionStatus> {
    public FlagSuggestionStatusSerializer(Class<FlagSuggestionStatus> t) {
      super(t);
    }

    public FlagSuggestionStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FlagSuggestionStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FlagSuggestionStatus fromValue(String value) {
    return new FlagSuggestionStatus(value);
  }
}
