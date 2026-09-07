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

/**
 * The JSON:API type for unified host facet resources. The value should always be <code>
 * unified_host_facet</code>.
 */
@JsonSerialize(using = CsmUnifiedHostFacetType.CsmUnifiedHostFacetTypeSerializer.class)
public class CsmUnifiedHostFacetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("unified_host_facet"));

  public static final CsmUnifiedHostFacetType UNIFIED_HOST_FACET =
      new CsmUnifiedHostFacetType("unified_host_facet");

  CsmUnifiedHostFacetType(String value) {
    super(value, allowedValues);
  }

  public static class CsmUnifiedHostFacetTypeSerializer
      extends StdSerializer<CsmUnifiedHostFacetType> {
    public CsmUnifiedHostFacetTypeSerializer(Class<CsmUnifiedHostFacetType> t) {
      super(t);
    }

    public CsmUnifiedHostFacetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CsmUnifiedHostFacetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CsmUnifiedHostFacetType fromValue(String value) {
    return new CsmUnifiedHostFacetType(value);
  }
}
