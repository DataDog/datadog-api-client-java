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

/** Resource type of an LLM Observability dataset draft state. */
@JsonSerialize(using = LLMObsDatasetDraftStateType.LLMObsDatasetDraftStateTypeSerializer.class)
public class LLMObsDatasetDraftStateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("draft_state_data"));

  public static final LLMObsDatasetDraftStateType DRAFT_STATE_DATA =
      new LLMObsDatasetDraftStateType("draft_state_data");

  LLMObsDatasetDraftStateType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsDatasetDraftStateTypeSerializer
      extends StdSerializer<LLMObsDatasetDraftStateType> {
    public LLMObsDatasetDraftStateTypeSerializer(Class<LLMObsDatasetDraftStateType> t) {
      super(t);
    }

    public LLMObsDatasetDraftStateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsDatasetDraftStateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsDatasetDraftStateType fromValue(String value) {
    return new LLMObsDatasetDraftStateType(value);
  }
}
