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

/** The cloud provider of a host resource. */
@JsonSerialize(using = CsmCloudProvider.CsmCloudProviderSerializer.class)
public class CsmCloudProvider extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aws", "gcp", "azure", "oci"));

  public static final CsmCloudProvider AWS = new CsmCloudProvider("aws");
  public static final CsmCloudProvider GCP = new CsmCloudProvider("gcp");
  public static final CsmCloudProvider AZURE = new CsmCloudProvider("azure");
  public static final CsmCloudProvider OCI = new CsmCloudProvider("oci");

  CsmCloudProvider(String value) {
    super(value, allowedValues);
  }

  public static class CsmCloudProviderSerializer extends StdSerializer<CsmCloudProvider> {
    public CsmCloudProviderSerializer(Class<CsmCloudProvider> t) {
      super(t);
    }

    public CsmCloudProviderSerializer() {
      this(null);
    }

    @Override
    public void serialize(CsmCloudProvider value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CsmCloudProvider fromValue(String value) {
    return new CsmCloudProvider(value);
  }
}
