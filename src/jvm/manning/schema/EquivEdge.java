/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package manning.schema;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-4-29")
public class EquivEdge implements org.apache.thrift.TBase<EquivEdge, EquivEdge._Fields>, java.io.Serializable, Cloneable, Comparable<EquivEdge> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EquivEdge");

  private static final org.apache.thrift.protocol.TField ID1_FIELD_DESC = new org.apache.thrift.protocol.TField("id1", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ID2_FIELD_DESC = new org.apache.thrift.protocol.TField("id2", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EquivEdgeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EquivEdgeTupleSchemeFactory());
  }

  private PersonID id1; // required
  private PersonID id2; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID1((short)1, "id1"),
    ID2((short)2, "id2");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID1
          return ID1;
        case 2: // ID2
          return ID2;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID1, new org.apache.thrift.meta_data.FieldMetaData("id1", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PersonID.class)));
    tmpMap.put(_Fields.ID2, new org.apache.thrift.meta_data.FieldMetaData("id2", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PersonID.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EquivEdge.class, metaDataMap);
  }

  public EquivEdge() {
  }

  public EquivEdge(
    PersonID id1,
    PersonID id2)
  {
    this();
    this.id1 = id1;
    this.id2 = id2;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EquivEdge(EquivEdge other) {
    if (other.is_set_id1()) {
      this.id1 = new PersonID(other.id1);
    }
    if (other.is_set_id2()) {
      this.id2 = new PersonID(other.id2);
    }
  }

  public EquivEdge deepCopy() {
    return new EquivEdge(this);
  }

  @Override
  public void clear() {
    this.id1 = null;
    this.id2 = null;
  }

  public PersonID get_id1() {
    return this.id1;
  }

  public void set_id1(PersonID id1) {
    this.id1 = id1;
  }

  public void unset_id1() {
    this.id1 = null;
  }

  /** Returns true if field id1 is set (has been assigned a value) and false otherwise */
  public boolean is_set_id1() {
    return this.id1 != null;
  }

  public void set_id1_isSet(boolean value) {
    if (!value) {
      this.id1 = null;
    }
  }

  public PersonID get_id2() {
    return this.id2;
  }

  public void set_id2(PersonID id2) {
    this.id2 = id2;
  }

  public void unset_id2() {
    this.id2 = null;
  }

  /** Returns true if field id2 is set (has been assigned a value) and false otherwise */
  public boolean is_set_id2() {
    return this.id2 != null;
  }

  public void set_id2_isSet(boolean value) {
    if (!value) {
      this.id2 = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID1:
      if (value == null) {
        unset_id1();
      } else {
        set_id1((PersonID)value);
      }
      break;

    case ID2:
      if (value == null) {
        unset_id2();
      } else {
        set_id2((PersonID)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID1:
      return get_id1();

    case ID2:
      return get_id2();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID1:
      return is_set_id1();
    case ID2:
      return is_set_id2();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EquivEdge)
      return this.equals((EquivEdge)that);
    return false;
  }

  public boolean equals(EquivEdge that) {
    if (that == null)
      return false;

    boolean this_present_id1 = true && this.is_set_id1();
    boolean that_present_id1 = true && that.is_set_id1();
    if (this_present_id1 || that_present_id1) {
      if (!(this_present_id1 && that_present_id1))
        return false;
      if (!this.id1.equals(that.id1))
        return false;
    }

    boolean this_present_id2 = true && this.is_set_id2();
    boolean that_present_id2 = true && that.is_set_id2();
    if (this_present_id2 || that_present_id2) {
      if (!(this_present_id2 && that_present_id2))
        return false;
      if (!this.id2.equals(that.id2))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id1 = true && (is_set_id1());
    list.add(present_id1);
    if (present_id1)
      list.add(id1);

    boolean present_id2 = true && (is_set_id2());
    list.add(present_id2);
    if (present_id2)
      list.add(id2);

    return list.hashCode();
  }

  @Override
  public int compareTo(EquivEdge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_id1()).compareTo(other.is_set_id1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_id1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id1, other.id1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_id2()).compareTo(other.is_set_id2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_id2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id2, other.id2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EquivEdge(");
    boolean first = true;

    sb.append("id1:");
    if (this.id1 == null) {
      sb.append("null");
    } else {
      sb.append(this.id1);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("id2:");
    if (this.id2 == null) {
      sb.append("null");
    } else {
      sb.append(this.id2);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_id1()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id1' is unset! Struct:" + toString());
    }

    if (!is_set_id2()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id2' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EquivEdgeStandardSchemeFactory implements SchemeFactory {
    public EquivEdgeStandardScheme getScheme() {
      return new EquivEdgeStandardScheme();
    }
  }

  private static class EquivEdgeStandardScheme extends StandardScheme<EquivEdge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EquivEdge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID1
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.id1 = new PersonID();
              struct.id1.read(iprot);
              struct.set_id1_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ID2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.id2 = new PersonID();
              struct.id2.read(iprot);
              struct.set_id2_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, EquivEdge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id1 != null) {
        oprot.writeFieldBegin(ID1_FIELD_DESC);
        struct.id1.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.id2 != null) {
        oprot.writeFieldBegin(ID2_FIELD_DESC);
        struct.id2.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EquivEdgeTupleSchemeFactory implements SchemeFactory {
    public EquivEdgeTupleScheme getScheme() {
      return new EquivEdgeTupleScheme();
    }
  }

  private static class EquivEdgeTupleScheme extends TupleScheme<EquivEdge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EquivEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.id1.write(oprot);
      struct.id2.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EquivEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id1 = new PersonID();
      struct.id1.read(iprot);
      struct.set_id1_isSet(true);
      struct.id2 = new PersonID();
      struct.id2.read(iprot);
      struct.set_id2_isSet(true);
    }
  }

}
