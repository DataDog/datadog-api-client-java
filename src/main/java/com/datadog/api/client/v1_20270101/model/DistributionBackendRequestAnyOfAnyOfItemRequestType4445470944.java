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
        DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944
            .DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944Serializer.class)
public class DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("histogram"));

  public static final DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944 HISTOGRAM =
      new DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944("histogram");

  DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944(String value) {
    super(value, allowedValues);
  }

  public static class DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944Serializer
      extends StdSerializer<DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944> {
    public DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944Serializer(
        Class<DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944> t) {
      super(t);
    }

    public DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944 fromValue(
      String value) {
    return new DistributionBackendRequestAnyOfAnyOfItemRequestType4445470944(value);
  }
}
