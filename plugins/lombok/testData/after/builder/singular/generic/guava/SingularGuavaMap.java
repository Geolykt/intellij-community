// Generated by delombok at Sat Jun 11 11:00:46 CEST 2016

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class SingularGuavaMap<A, B> {
  private ImmutableMap rawTypes;
  private ImmutableMap<Integer, Float> integers;
  private ImmutableMap<A, B> generics;
  private ImmutableMap<? extends Number, ? extends String> extendsGenerics;

  public static void main(String[] args) {
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  SingularGuavaMap(final ImmutableMap rawTypes, final ImmutableMap<Integer, Float> integers, final ImmutableMap<A, B> generics, final ImmutableMap<? extends Number, ? extends String> extendsGenerics) {
    this.rawTypes = rawTypes;
    this.integers = integers;
    this.generics = generics;
    this.extendsGenerics = extendsGenerics;
  }


  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public static class SingularGuavaMapBuilder<A, B> {
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableMap.Builder<java.lang.Object, java.lang.Object> rawTypes;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableMap.Builder<Integer, Float> integers;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableMap.Builder<A, B> generics;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableMap.Builder<Number, String> extendsGenerics;

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    SingularGuavaMapBuilder() {
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> rawType(final java.lang.Object key, final java.lang.Object value) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableMap.builder();
      this.rawTypes.put(key, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> rawTypes(final java.util.Map<?, ?> rawTypes) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableMap.builder();
      this.rawTypes.putAll(rawTypes);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> clearRawTypes() {
      this.rawTypes = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> integer(final Integer key, final Float value) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableMap.builder();
      this.integers.put(key, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> integers(final java.util.Map<? extends Integer, ? extends Float> integers) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableMap.builder();
      this.integers.putAll(integers);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> clearIntegers() {
      this.integers = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> generic(final A key, final B value) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableMap.builder();
      this.generics.put(key, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> generics(final java.util.Map<? extends A, ? extends B> generics) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableMap.builder();
      this.generics.putAll(generics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> clearGenerics() {
      this.generics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> extendsGeneric(final Number key, final String value) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableMap.builder();
      this.extendsGenerics.put(key, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> extendsGenerics(final java.util.Map<? extends Number, ? extends String> extendsGenerics) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableMap.builder();
      this.extendsGenerics.putAll(extendsGenerics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMapBuilder<A, B> clearExtendsGenerics() {
      this.extendsGenerics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaMap<A, B> build() {
      com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> rawTypes = this.rawTypes == null ? com.google.common.collect.ImmutableMap.<java.lang.Object, java.lang.Object>of() : this.rawTypes.build();
      com.google.common.collect.ImmutableMap<Integer, Float> integers = this.integers == null ? com.google.common.collect.ImmutableMap.<Integer, Float>of() : this.integers.build();
      com.google.common.collect.ImmutableMap<A, B> generics = this.generics == null ? com.google.common.collect.ImmutableMap.<A, B>of() : this.generics.build();
      com.google.common.collect.ImmutableMap<Number, String> extendsGenerics = this.extendsGenerics == null ? com.google.common.collect.ImmutableMap.<Number, String>of() : this.extendsGenerics.build();
      return new SingularGuavaMap<A, B>(rawTypes, integers, generics, extendsGenerics);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public java.lang.String toString() {
      return "SingularGuavaMap.SingularGuavaMapBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public static <A, B> SingularGuavaMapBuilder<A, B> builder() {
    return new SingularGuavaMapBuilder<A, B>();
  }
}
