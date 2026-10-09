/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(
    using =
        ObservabilityPipelineAzureDataExplorerDestinationAuth
            .ObservabilityPipelineAzureDataExplorerDestinationAuthDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineAzureDataExplorerDestinationAuth
            .ObservabilityPipelineAzureDataExplorerDestinationAuthSerializer.class)
public class ObservabilityPipelineAzureDataExplorerDestinationAuth extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineAzureDataExplorerDestinationAuth.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineAzureDataExplorerDestinationAuthSerializer
      extends StdSerializer<ObservabilityPipelineAzureDataExplorerDestinationAuth> {
    public ObservabilityPipelineAzureDataExplorerDestinationAuthSerializer(
        Class<ObservabilityPipelineAzureDataExplorerDestinationAuth> t) {
      super(t);
    }

    public ObservabilityPipelineAzureDataExplorerDestinationAuthSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAzureDataExplorerDestinationAuth value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineAzureDataExplorerDestinationAuthDeserializer
      extends StdDeserializer<ObservabilityPipelineAzureDataExplorerDestinationAuth> {
    public ObservabilityPipelineAzureDataExplorerDestinationAuthDeserializer() {
      this(ObservabilityPipelineAzureDataExplorerDestinationAuth.class);
    }

    public ObservabilityPipelineAzureDataExplorerDestinationAuthDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineAzureDataExplorerDestinationAuth deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class.equals(
                Integer.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class.equals(
                Long.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class.equals(
                Float.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class.equals(
                Double.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class.equals(
                Boolean.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class.equals(
                            Integer.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class.equals(
                            Float.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli'",
            e);
      }

      // deserialize ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class.equals(
                Integer.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class.equals(
                Long.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class.equals(
                Float.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class.equals(
                Double.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class.equals(
                Boolean.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class.equals(
                            Integer.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class.equals(
                            Float.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret'",
            e);
      }

      // deserialize ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class.equals(
                Integer.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class.equals(
                Long.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class.equals(
                Float.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class.equals(
                Double.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class.equals(
                Boolean.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class
                            .equals(Integer.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
                            .class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class
                            .equals(Float.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
                            .class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class
                        .equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class
                        .equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate'",
            e);
      }

      // deserialize ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class.equals(
                Integer.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class.equals(
                Long.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class.equals(
                Float.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class.equals(
                Double.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class.equals(
                Boolean.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class.equals(
                            Integer.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity
                            .class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class.equals(
                            Float.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity
                            .class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity'",
            e);
      }

      // deserialize
      // ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .class
                .equals(Integer.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .class
                .equals(Long.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .class
                .equals(Float.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .class
                .equals(Double.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .class
                .equals(Boolean.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .class
                .equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                            .class
                            .equals(Integer.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                            .class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                            .class
                            .equals(Float.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                            .class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                        .class
                        .equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                        .class
                        .equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                          .class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion)
                  tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion'",
            e);
      }

      // deserialize ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class.equals(
                Integer.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class.equals(
                Long.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class.equals(
                Float.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class.equals(
                Double.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class.equals(
                Boolean.class)
            || ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class
                            .equals(Integer.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
                            .class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class
                            .equals(Float.class)
                        || ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
                            .class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity'",
            e);
      }

      ObservabilityPipelineAzureDataExplorerDestinationAuth ret =
          new ObservabilityPipelineAzureDataExplorerDestinationAuth();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public ObservabilityPipelineAzureDataExplorerDestinationAuth getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineAzureDataExplorerDestinationAuth cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineAzureDataExplorerDestinationAuth() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuth(
      ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuth(
      ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuth(
      ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuth(
      ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuth(
      ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuth(
      ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli",
        new GenericType<ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli>() {});
    schemas.put(
        "ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret",
        new GenericType<ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret>() {});
    schemas.put(
        "ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate",
        new GenericType<
            ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate>() {});
    schemas.put(
        "ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity",
        new GenericType<ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity>() {});
    schemas.put(
        "ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion",
        new GenericType<
            ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion>() {});
    schemas.put(
        "ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity",
        new GenericType<
            ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity>() {});
    JSON.registerDescendants(
        ObservabilityPipelineAzureDataExplorerDestinationAuth.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineAzureDataExplorerDestinationAuth.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli,
   * ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret,
   * ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate,
   * ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity,
   * ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion,
   * ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be"
            + " ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli,"
            + " ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret,"
            + " ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate,"
            + " ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity,"
            + " ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion,"
            + " ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli,
   * ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret,
   * ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate,
   * ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity,
   * ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion,
   * ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
   *
   * @return The actual instance (ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli,
   *     ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret,
   *     ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate,
   *     ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity,
   *     ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion,
   *     ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli`. If
   * the actual instance is not `ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli`
   */
  public ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli
      getObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli() throws ClassCastException {
    return (ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCli)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret`.
   * If the actual instance is not
   * `ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret`
   */
  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret
      getObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret()
          throws ClassCastException {
    return (ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate`. If the actual
   * instance is not `ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate`
   */
  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
      getObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate()
          throws ClassCastException {
    return (ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity`. If the actual instance
   * is not `ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity`
   */
  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity
      getObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity()
          throws ClassCastException {
    return (ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentity)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion`. If the
   * actual instance is not
   * `ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion`
   */
  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      getObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion()
          throws ClassCastException {
    return (ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity`. If the actual instance
   * is not `ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity`
   */
  public ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
      getObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity()
          throws ClassCastException {
    return (ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity)
        super.getActualInstance();
  }
}
