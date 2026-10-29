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

/** The outcome of a live call that has ended. */
@JsonSerialize(using = OnCallPageLiveCallOutcome.OnCallPageLiveCallOutcomeSerializer.class)
public class OnCallPageLiveCallOutcome extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "success_call_answered",
              "failure_no_responder",
              "failure_caller_abandoned",
              "failure_outside_support_hours",
              "failure_internal_error"));

  public static final OnCallPageLiveCallOutcome SUCCESS_CALL_ANSWERED =
      new OnCallPageLiveCallOutcome("success_call_answered");
  public static final OnCallPageLiveCallOutcome FAILURE_NO_RESPONDER =
      new OnCallPageLiveCallOutcome("failure_no_responder");
  public static final OnCallPageLiveCallOutcome FAILURE_CALLER_ABANDONED =
      new OnCallPageLiveCallOutcome("failure_caller_abandoned");
  public static final OnCallPageLiveCallOutcome FAILURE_OUTSIDE_SUPPORT_HOURS =
      new OnCallPageLiveCallOutcome("failure_outside_support_hours");
  public static final OnCallPageLiveCallOutcome FAILURE_INTERNAL_ERROR =
      new OnCallPageLiveCallOutcome("failure_internal_error");

  OnCallPageLiveCallOutcome(String value) {
    super(value, allowedValues);
  }

  public static class OnCallPageLiveCallOutcomeSerializer
      extends StdSerializer<OnCallPageLiveCallOutcome> {
    public OnCallPageLiveCallOutcomeSerializer(Class<OnCallPageLiveCallOutcome> t) {
      super(t);
    }

    public OnCallPageLiveCallOutcomeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnCallPageLiveCallOutcome value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnCallPageLiveCallOutcome fromValue(String value) {
    return new OnCallPageLiveCallOutcome(value);
  }
}
