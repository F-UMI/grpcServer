// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: property.proto

// Protobuf Java Version: 3.25.1
package io.grpc.examples.property;

public interface PropertyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:property.PropertyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string homeID = 1;</code>
   * @return The homeID.
   */
  java.lang.String getHomeID();
  /**
   * <code>string homeID = 1;</code>
   * @return The bytes for homeID.
   */
  com.google.protobuf.ByteString
      getHomeIDBytes();

  /**
   * <code>string owner = 2;</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 2;</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string address = 3;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 3;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>uint64 price = 4;</code>
   * @return The price.
   */
  long getPrice();
}
