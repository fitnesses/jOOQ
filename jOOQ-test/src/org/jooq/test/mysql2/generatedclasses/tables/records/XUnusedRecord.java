/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "x_unused", schema = "test2", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ID", "NAME"})
})
public class XUnusedRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.XUnusedRecord> implements org.jooq.Record14<java.lang.Integer, java.lang.String, java.math.BigInteger, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.math.BigDecimal> {

	private static final long serialVersionUID = -1060991411;

	/**
	 * Setter for <code>test2.x_unused.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.ID, value);
	}

	/**
	 * Getter for <code>test2.x_unused.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.ID);
	}

	/**
	 * Setter for <code>test2.x_unused.NAME</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.NAME, value);
	}

	/**
	 * Getter for <code>test2.x_unused.NAME</code>. 
	 */
	@javax.persistence.Column(name = "NAME", nullable = false, length = 10)
	public java.lang.String getName() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.NAME);
	}

	/**
	 * Setter for <code>test2.x_unused.BIG_INTEGER</code>. 
	 */
	public void setBigInteger(java.math.BigInteger value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.BIG_INTEGER, value);
	}

	/**
	 * Getter for <code>test2.x_unused.BIG_INTEGER</code>. 
	 */
	@javax.persistence.Column(name = "BIG_INTEGER", precision = 25)
	public java.math.BigInteger getBigInteger() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.BIG_INTEGER);
	}

	/**
	 * Setter for <code>test2.x_unused.ID_REF</code>. 
	 */
	public void setIdRef(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.ID_REF, value);
	}

	/**
	 * Getter for <code>test2.x_unused.ID_REF</code>. 
	 */
	@javax.persistence.Column(name = "ID_REF", precision = 10)
	public java.lang.Integer getIdRef() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.ID_REF);
	}

	/**
	 * Setter for <code>test2.x_unused.NAME_REF</code>. 
	 */
	public void setNameRef(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF, value);
	}

	/**
	 * Getter for <code>test2.x_unused.NAME_REF</code>. 
	 */
	@javax.persistence.Column(name = "NAME_REF", length = 10)
	public java.lang.String getNameRef() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF);
	}

	/**
	 * Setter for <code>test2.x_unused.CLASS</code>. 
	 */
	public void setClass_(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.CLASS, value);
	}

	/**
	 * Getter for <code>test2.x_unused.CLASS</code>. 
	 */
	@javax.persistence.Column(name = "CLASS", precision = 10)
	public java.lang.Integer getClass_() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.CLASS);
	}

	/**
	 * Setter for <code>test2.x_unused.FIELDS</code>. 
	 */
	public void setFields_(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.FIELDS, value);
	}

	/**
	 * Getter for <code>test2.x_unused.FIELDS</code>. 
	 */
	@javax.persistence.Column(name = "FIELDS", precision = 10)
	public java.lang.Integer getFields_() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.FIELDS);
	}

	/**
	 * Setter for <code>test2.x_unused.CONFIGURATION</code>. 
	 */
	public void setConfiguration_(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.CONFIGURATION, value);
	}

	/**
	 * Getter for <code>test2.x_unused.CONFIGURATION</code>. 
	 */
	@javax.persistence.Column(name = "CONFIGURATION", precision = 10)
	public java.lang.Integer getConfiguration_() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.CONFIGURATION);
	}

	/**
	 * Setter for <code>test2.x_unused.U_D_T</code>. 
	 */
	public void setUDT(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.U_D_T, value);
	}

	/**
	 * Getter for <code>test2.x_unused.U_D_T</code>. 
	 */
	@javax.persistence.Column(name = "U_D_T", precision = 10)
	public java.lang.Integer getUDT() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.U_D_T);
	}

	/**
	 * Setter for <code>test2.x_unused.META_DATA</code>. 
	 */
	public void setMetaData(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.META_DATA, value);
	}

	/**
	 * Getter for <code>test2.x_unused.META_DATA</code>. 
	 */
	@javax.persistence.Column(name = "META_DATA", precision = 10)
	public java.lang.Integer getMetaData() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.META_DATA);
	}

	/**
	 * Setter for <code>test2.x_unused.TYPE0</code>. 
	 */
	public void setType0(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.TYPE0, value);
	}

	/**
	 * Getter for <code>test2.x_unused.TYPE0</code>. 
	 */
	@javax.persistence.Column(name = "TYPE0", precision = 10)
	public java.lang.Integer getType0() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.TYPE0);
	}

	/**
	 * Setter for <code>test2.x_unused.PRIMARY_KEY</code>. 
	 */
	public void setPrimaryKey(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.PRIMARY_KEY, value);
	}

	/**
	 * Getter for <code>test2.x_unused.PRIMARY_KEY</code>. 
	 */
	@javax.persistence.Column(name = "PRIMARY_KEY", precision = 10)
	public java.lang.Integer getPrimaryKey() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.PRIMARY_KEY);
	}

	/**
	 * Setter for <code>test2.x_unused.PRIMARYKEY</code>. 
	 */
	public void setPrimarykey(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.PRIMARYKEY, value);
	}

	/**
	 * Getter for <code>test2.x_unused.PRIMARYKEY</code>. 
	 */
	@javax.persistence.Column(name = "PRIMARYKEY", precision = 10)
	public java.lang.Integer getPrimarykey() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.PRIMARYKEY);
	}

	/**
	 * Setter for <code>test2.x_unused.FIELD 737</code>. 
	 */
	public void setField_737(java.math.BigDecimal value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.FIELD_737, value);
	}

	/**
	 * Getter for <code>test2.x_unused.FIELD 737</code>. 
	 */
	@javax.persistence.Column(name = "FIELD 737", precision = 25, scale = 2)
	public java.math.BigDecimal getField_737() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.FIELD_737);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.String> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.Integer, java.lang.String, java.math.BigInteger, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.math.BigDecimal> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9(), field10(), field11(), field12(), field13(), field14());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.Integer, java.lang.String, java.math.BigInteger, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.math.BigDecimal> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9(), value10(), value11(), value12(), value13(), value14());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field3() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.BIG_INTEGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.ID_REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.CLASS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.FIELDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.CONFIGURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.U_D_T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.META_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.TYPE0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.PRIMARY_KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field13() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.PRIMARYKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field14() {
		return org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.FIELD_737;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value3() {
		return getBigInteger();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getIdRef();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getNameRef();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getClass_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getFields_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getConfiguration_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getUDT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getMetaData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getType0();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getPrimaryKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value13() {
		return getPrimarykey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value14() {
		return getField_737();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XUnusedRecord
	 */
	public XUnusedRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED);
	}
}
