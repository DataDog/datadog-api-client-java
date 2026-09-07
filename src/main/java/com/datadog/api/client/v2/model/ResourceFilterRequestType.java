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

/** Constant string to identify the request type. */
@JsonSerialize(using = ResourceFilterRequestType.ResourceFilterRequestTypeSerializer.class)
public class ResourceFilterRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("csm_resource_filter"));

  public static final ResourceFilterRequestType CSM_RESOURCE_FILTER =
      new ResourceFilterRequestType("csm_resource_filter");

  ResourceFilterRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ResourceFilterRequestTypeSerializer
      extends StdSerializer<ResourceFilterRequestType> {
    public ResourceFilterRequestTypeSerializer(Class<ResourceFilterRequestType> t) {
      super(t);
    }

    public ResourceFilterRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ResourceFilterRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ResourceFilterRequestType fromValue(String value) {
    return new ResourceFilterRequestType(value);
  }
}
