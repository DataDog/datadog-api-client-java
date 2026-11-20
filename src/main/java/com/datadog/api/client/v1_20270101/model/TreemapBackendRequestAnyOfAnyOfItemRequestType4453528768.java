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
        TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768
            .TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768Serializer.class)
public class TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ddsql"));

  public static final TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768 DDSQL =
      new TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768("ddsql");

  TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768(String value) {
    super(value, allowedValues);
  }

  public static class TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768Serializer
      extends StdSerializer<TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768> {
    public TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768Serializer(
        Class<TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768> t) {
      super(t);
    }

    public TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768 fromValue(String value) {
    return new TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768(value);
  }
}
