/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_725LobTestRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql.generatedclasses.tables.records.T_725LobTestRecord> implements org.jooq.Record2<java.lang.Integer, byte[]> {

	private static final long serialVersionUID = -1645326241;

	/**
	 * Setter for <code>test.t_725_lob_test.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.T_725LobTest.ID, value);
	}

	/**
	 * Getter for <code>test.t_725_lob_test.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.T_725LobTest.ID);
	}

	/**
	 * Setter for <code>test.t_725_lob_test.LOB</code>. 
	 */
	public void setLob(byte[] value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.T_725LobTest.LOB, value);
	}

	/**
	 * Getter for <code>test.t_725_lob_test.LOB</code>. 
	 */
	public byte[] getLob() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.T_725LobTest.LOB);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.mysql.generatedclasses.tables.T_725LobTest.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field2() {
		return org.jooq.test.mysql.generatedclasses.tables.T_725LobTest.LOB;
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
	public byte[] value2() {
		return getLob();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.mysql.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}
}
