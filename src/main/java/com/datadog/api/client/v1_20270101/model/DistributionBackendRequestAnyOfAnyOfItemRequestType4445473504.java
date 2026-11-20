/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using =
        DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504
            .DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504Serializer.class)
public class DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("histogram"));

  public static final DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504 HISTOGRAM =
      new DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504("histogram");

  DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504(String value) {
    super(value, allowedValues);
  }

  public static class DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504Serializer
      extends StdSerializer<DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504> {
    public DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504Serializer(
        Class<DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504> t) {
      super(t);
    }

    public DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504 fromValue(
      String value) {
    return new DistributionBackendRequestAnyOfAnyOfItemRequestType4445473504(value);
  }
}
