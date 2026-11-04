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

/** Type of the commitments list response resource. */
@JsonSerialize(using = CommitmentsListResponseType.CommitmentsListResponseTypeSerializer.class)
public class CommitmentsListResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("commitments_list_response"));

  public static final CommitmentsListResponseType COMMITMENTS_LIST_RESPONSE =
      new CommitmentsListResponseType("commitments_list_response");

  CommitmentsListResponseType(String value) {
    super(value, allowedValues);
  }

  public static class CommitmentsListResponseTypeSerializer
      extends StdSerializer<CommitmentsListResponseType> {
    public CommitmentsListResponseTypeSerializer(Class<CommitmentsListResponseType> t) {
      super(t);
    }

    public CommitmentsListResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CommitmentsListResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CommitmentsListResponseType fromValue(String value) {
    return new CommitmentsListResponseType(value);
  }
}
