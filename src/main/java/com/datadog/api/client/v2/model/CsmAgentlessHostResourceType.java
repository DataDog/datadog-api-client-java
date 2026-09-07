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
   * <p>The type of cloud resource for an agentless host.</p>
 */
@JsonSerialize(using = CsmAgentlessHostResourceType.CsmAgentlessHostResourceTypeSerializer.class)
public class CsmAgentlessHostResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("aws_ec2_instance", "azure_virtual_machine_instance", "gcp_compute_instance", "oci_instance"));

  public static final CsmAgentlessHostResourceType AWS_EC2_INSTANCE = new CsmAgentlessHostResourceType("aws_ec2_instance");
  public static final CsmAgentlessHostResourceType AZURE_VIRTUAL_MACHINE_INSTANCE = new CsmAgentlessHostResourceType("azure_virtual_machine_instance");
  public static final CsmAgentlessHostResourceType GCP_COMPUTE_INSTANCE = new CsmAgentlessHostResourceType("gcp_compute_instance");
  public static final CsmAgentlessHostResourceType OCI_INSTANCE = new CsmAgentlessHostResourceType("oci_instance");


  CsmAgentlessHostResourceType(String value) {
    super(value, allowedValues);
  }

  public static class CsmAgentlessHostResourceTypeSerializer extends StdSerializer<CsmAgentlessHostResourceType> {
      public CsmAgentlessHostResourceTypeSerializer(Class<CsmAgentlessHostResourceType> t) {
          super(t);
      }

      public CsmAgentlessHostResourceTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(CsmAgentlessHostResourceType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static CsmAgentlessHostResourceType fromValue(String value) {
    return new CsmAgentlessHostResourceType(value);
  }
}
