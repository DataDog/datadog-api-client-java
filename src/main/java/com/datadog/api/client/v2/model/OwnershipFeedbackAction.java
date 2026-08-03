/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The feedback action to apply to an inference.</p>
 */
@JsonSerialize(using = OwnershipFeedbackAction.OwnershipFeedbackActionSerializer.class)
public class OwnershipFeedbackAction extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("confirm", "reject", "correct", "persist"));

  public static final OwnershipFeedbackAction CONFIRM = new OwnershipFeedbackAction("confirm");
  public static final OwnershipFeedbackAction REJECT = new OwnershipFeedbackAction("reject");
  public static final OwnershipFeedbackAction CORRECT = new OwnershipFeedbackAction("correct");
  public static final OwnershipFeedbackAction PERSIST = new OwnershipFeedbackAction("persist");


  OwnershipFeedbackAction(String value) {
    super(value, allowedValues);
  }

  public static class OwnershipFeedbackActionSerializer extends StdSerializer<OwnershipFeedbackAction> {
      public OwnershipFeedbackActionSerializer(Class<OwnershipFeedbackAction> t) {
          super(t);
      }

      public OwnershipFeedbackActionSerializer() {
          this(null);
      }

      @Override
      public void serialize(OwnershipFeedbackAction value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static OwnershipFeedbackAction fromValue(String value) {
    return new OwnershipFeedbackAction(value);
  }
}
