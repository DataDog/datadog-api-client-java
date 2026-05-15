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
@JsonDeserialize(using = CommitmentsListItem.CommitmentsListItemDeserializer.class)
@JsonSerialize(using = CommitmentsListItem.CommitmentsListItemSerializer.class)
public class CommitmentsListItem extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(CommitmentsListItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CommitmentsListItemSerializer extends StdSerializer<CommitmentsListItem> {
    public CommitmentsListItemSerializer(Class<CommitmentsListItem> t) {
      super(t);
    }

    public CommitmentsListItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CommitmentsListItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CommitmentsListItemDeserializer extends StdDeserializer<CommitmentsListItem> {
    public CommitmentsListItemDeserializer() {
      this(CommitmentsListItem.class);
    }

    public CommitmentsListItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CommitmentsListItem deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CommitmentsAwsEC2RICommitment
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CommitmentsAwsEC2RICommitment.class.equals(Integer.class)
            || CommitmentsAwsEC2RICommitment.class.equals(Long.class)
            || CommitmentsAwsEC2RICommitment.class.equals(Float.class)
            || CommitmentsAwsEC2RICommitment.class.equals(Double.class)
            || CommitmentsAwsEC2RICommitment.class.equals(Boolean.class)
            || CommitmentsAwsEC2RICommitment.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CommitmentsAwsEC2RICommitment.class.equals(Integer.class)
                        || CommitmentsAwsEC2RICommitment.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CommitmentsAwsEC2RICommitment.class.equals(Float.class)
                        || CommitmentsAwsEC2RICommitment.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CommitmentsAwsEC2RICommitment.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CommitmentsAwsEC2RICommitment.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CommitmentsAwsEC2RICommitment.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CommitmentsAwsEC2RICommitment) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CommitmentsAwsEC2RICommitment'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CommitmentsAwsEC2RICommitment'", e);
      }

      // deserialize CommitmentsAwsRDSRICommitment
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CommitmentsAwsRDSRICommitment.class.equals(Integer.class)
            || CommitmentsAwsRDSRICommitment.class.equals(Long.class)
            || CommitmentsAwsRDSRICommitment.class.equals(Float.class)
            || CommitmentsAwsRDSRICommitment.class.equals(Double.class)
            || CommitmentsAwsRDSRICommitment.class.equals(Boolean.class)
            || CommitmentsAwsRDSRICommitment.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CommitmentsAwsRDSRICommitment.class.equals(Integer.class)
                        || CommitmentsAwsRDSRICommitment.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CommitmentsAwsRDSRICommitment.class.equals(Float.class)
                        || CommitmentsAwsRDSRICommitment.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CommitmentsAwsRDSRICommitment.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CommitmentsAwsRDSRICommitment.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CommitmentsAwsRDSRICommitment.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CommitmentsAwsRDSRICommitment) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CommitmentsAwsRDSRICommitment'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CommitmentsAwsRDSRICommitment'", e);
      }

      // deserialize CommitmentsAwsElasticacheRICommitment
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CommitmentsAwsElasticacheRICommitment.class.equals(Integer.class)
            || CommitmentsAwsElasticacheRICommitment.class.equals(Long.class)
            || CommitmentsAwsElasticacheRICommitment.class.equals(Float.class)
            || CommitmentsAwsElasticacheRICommitment.class.equals(Double.class)
            || CommitmentsAwsElasticacheRICommitment.class.equals(Boolean.class)
            || CommitmentsAwsElasticacheRICommitment.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CommitmentsAwsElasticacheRICommitment.class.equals(Integer.class)
                        || CommitmentsAwsElasticacheRICommitment.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CommitmentsAwsElasticacheRICommitment.class.equals(Float.class)
                        || CommitmentsAwsElasticacheRICommitment.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CommitmentsAwsElasticacheRICommitment.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CommitmentsAwsElasticacheRICommitment.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(CommitmentsAwsElasticacheRICommitment.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CommitmentsAwsElasticacheRICommitment) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CommitmentsAwsElasticacheRICommitment'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CommitmentsAwsElasticacheRICommitment'",
            e);
      }

      // deserialize CommitmentsAwsSPCommitment
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CommitmentsAwsSPCommitment.class.equals(Integer.class)
            || CommitmentsAwsSPCommitment.class.equals(Long.class)
            || CommitmentsAwsSPCommitment.class.equals(Float.class)
            || CommitmentsAwsSPCommitment.class.equals(Double.class)
            || CommitmentsAwsSPCommitment.class.equals(Boolean.class)
            || CommitmentsAwsSPCommitment.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CommitmentsAwsSPCommitment.class.equals(Integer.class)
                        || CommitmentsAwsSPCommitment.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CommitmentsAwsSPCommitment.class.equals(Float.class)
                        || CommitmentsAwsSPCommitment.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CommitmentsAwsSPCommitment.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CommitmentsAwsSPCommitment.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CommitmentsAwsSPCommitment.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CommitmentsAwsSPCommitment) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CommitmentsAwsSPCommitment'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CommitmentsAwsSPCommitment'", e);
      }

      // deserialize CommitmentsAzureVMRICommitment
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CommitmentsAzureVMRICommitment.class.equals(Integer.class)
            || CommitmentsAzureVMRICommitment.class.equals(Long.class)
            || CommitmentsAzureVMRICommitment.class.equals(Float.class)
            || CommitmentsAzureVMRICommitment.class.equals(Double.class)
            || CommitmentsAzureVMRICommitment.class.equals(Boolean.class)
            || CommitmentsAzureVMRICommitment.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CommitmentsAzureVMRICommitment.class.equals(Integer.class)
                        || CommitmentsAzureVMRICommitment.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CommitmentsAzureVMRICommitment.class.equals(Float.class)
                        || CommitmentsAzureVMRICommitment.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CommitmentsAzureVMRICommitment.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CommitmentsAzureVMRICommitment.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CommitmentsAzureVMRICommitment.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CommitmentsAzureVMRICommitment) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CommitmentsAzureVMRICommitment'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'CommitmentsAzureVMRICommitment'", e);
      }

      // deserialize CommitmentsAzureComputeSPCommitment
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CommitmentsAzureComputeSPCommitment.class.equals(Integer.class)
            || CommitmentsAzureComputeSPCommitment.class.equals(Long.class)
            || CommitmentsAzureComputeSPCommitment.class.equals(Float.class)
            || CommitmentsAzureComputeSPCommitment.class.equals(Double.class)
            || CommitmentsAzureComputeSPCommitment.class.equals(Boolean.class)
            || CommitmentsAzureComputeSPCommitment.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CommitmentsAzureComputeSPCommitment.class.equals(Integer.class)
                        || CommitmentsAzureComputeSPCommitment.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CommitmentsAzureComputeSPCommitment.class.equals(Float.class)
                        || CommitmentsAzureComputeSPCommitment.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CommitmentsAzureComputeSPCommitment.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CommitmentsAzureComputeSPCommitment.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CommitmentsAzureComputeSPCommitment.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CommitmentsAzureComputeSPCommitment) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CommitmentsAzureComputeSPCommitment'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CommitmentsAzureComputeSPCommitment'",
            e);
      }

      CommitmentsListItem ret = new CommitmentsListItem();
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
    public CommitmentsListItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "CommitmentsListItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CommitmentsListItem() {
    super("oneOf", Boolean.FALSE);
  }

  public CommitmentsListItem(CommitmentsAwsEC2RICommitment o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CommitmentsListItem(CommitmentsAwsRDSRICommitment o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CommitmentsListItem(CommitmentsAwsElasticacheRICommitment o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CommitmentsListItem(CommitmentsAwsSPCommitment o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CommitmentsListItem(CommitmentsAzureVMRICommitment o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CommitmentsListItem(CommitmentsAzureComputeSPCommitment o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "CommitmentsAwsEC2RICommitment", new GenericType<CommitmentsAwsEC2RICommitment>() {});
    schemas.put(
        "CommitmentsAwsRDSRICommitment", new GenericType<CommitmentsAwsRDSRICommitment>() {});
    schemas.put(
        "CommitmentsAwsElasticacheRICommitment",
        new GenericType<CommitmentsAwsElasticacheRICommitment>() {});
    schemas.put("CommitmentsAwsSPCommitment", new GenericType<CommitmentsAwsSPCommitment>() {});
    schemas.put(
        "CommitmentsAzureVMRICommitment", new GenericType<CommitmentsAzureVMRICommitment>() {});
    schemas.put(
        "CommitmentsAzureComputeSPCommitment",
        new GenericType<CommitmentsAzureComputeSPCommitment>() {});
    JSON.registerDescendants(CommitmentsListItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CommitmentsListItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CommitmentsAwsEC2RICommitment, CommitmentsAwsRDSRICommitment,
   * CommitmentsAwsElasticacheRICommitment, CommitmentsAwsSPCommitment,
   * CommitmentsAzureVMRICommitment, CommitmentsAzureComputeSPCommitment
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(CommitmentsAwsEC2RICommitment.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CommitmentsAwsRDSRICommitment.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CommitmentsAwsElasticacheRICommitment.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CommitmentsAwsSPCommitment.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CommitmentsAzureVMRICommitment.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CommitmentsAzureComputeSPCommitment.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CommitmentsAwsEC2RICommitment,"
            + " CommitmentsAwsRDSRICommitment, CommitmentsAwsElasticacheRICommitment,"
            + " CommitmentsAwsSPCommitment, CommitmentsAzureVMRICommitment,"
            + " CommitmentsAzureComputeSPCommitment");
  }

  /**
   * Get the actual instance, which can be the following: CommitmentsAwsEC2RICommitment,
   * CommitmentsAwsRDSRICommitment, CommitmentsAwsElasticacheRICommitment,
   * CommitmentsAwsSPCommitment, CommitmentsAzureVMRICommitment, CommitmentsAzureComputeSPCommitment
   *
   * @return The actual instance (CommitmentsAwsEC2RICommitment, CommitmentsAwsRDSRICommitment,
   *     CommitmentsAwsElasticacheRICommitment, CommitmentsAwsSPCommitment,
   *     CommitmentsAzureVMRICommitment, CommitmentsAzureComputeSPCommitment)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CommitmentsAwsEC2RICommitment`. If the actual instance is not
   * `CommitmentsAwsEC2RICommitment`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CommitmentsAwsEC2RICommitment`
   * @throws ClassCastException if the instance is not `CommitmentsAwsEC2RICommitment`
   */
  public CommitmentsAwsEC2RICommitment getCommitmentsAwsEC2RICommitment()
      throws ClassCastException {
    return (CommitmentsAwsEC2RICommitment) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CommitmentsAwsRDSRICommitment`. If the actual instance is not
   * `CommitmentsAwsRDSRICommitment`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CommitmentsAwsRDSRICommitment`
   * @throws ClassCastException if the instance is not `CommitmentsAwsRDSRICommitment`
   */
  public CommitmentsAwsRDSRICommitment getCommitmentsAwsRDSRICommitment()
      throws ClassCastException {
    return (CommitmentsAwsRDSRICommitment) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CommitmentsAwsElasticacheRICommitment`. If the actual instance is
   * not `CommitmentsAwsElasticacheRICommitment`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CommitmentsAwsElasticacheRICommitment`
   * @throws ClassCastException if the instance is not `CommitmentsAwsElasticacheRICommitment`
   */
  public CommitmentsAwsElasticacheRICommitment getCommitmentsAwsElasticacheRICommitment()
      throws ClassCastException {
    return (CommitmentsAwsElasticacheRICommitment) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CommitmentsAwsSPCommitment`. If the actual instance is not
   * `CommitmentsAwsSPCommitment`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CommitmentsAwsSPCommitment`
   * @throws ClassCastException if the instance is not `CommitmentsAwsSPCommitment`
   */
  public CommitmentsAwsSPCommitment getCommitmentsAwsSPCommitment() throws ClassCastException {
    return (CommitmentsAwsSPCommitment) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CommitmentsAzureVMRICommitment`. If the actual instance is not
   * `CommitmentsAzureVMRICommitment`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CommitmentsAzureVMRICommitment`
   * @throws ClassCastException if the instance is not `CommitmentsAzureVMRICommitment`
   */
  public CommitmentsAzureVMRICommitment getCommitmentsAzureVMRICommitment()
      throws ClassCastException {
    return (CommitmentsAzureVMRICommitment) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CommitmentsAzureComputeSPCommitment`. If the actual instance is not
   * `CommitmentsAzureComputeSPCommitment`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CommitmentsAzureComputeSPCommitment`
   * @throws ClassCastException if the instance is not `CommitmentsAzureComputeSPCommitment`
   */
  public CommitmentsAzureComputeSPCommitment getCommitmentsAzureComputeSPCommitment()
      throws ClassCastException {
    return (CommitmentsAzureComputeSPCommitment) super.getActualInstance();
  }
}
