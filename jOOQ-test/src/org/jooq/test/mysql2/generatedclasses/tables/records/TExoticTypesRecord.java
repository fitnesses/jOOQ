/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_exotic_types", schema = "test2")
public class TExoticTypesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TExoticTypesRecord> implements org.jooq.Record2<java.lang.Integer, java.util.UUID> {

	private static final long serialVersionUID = 1988422472;

	/**
	 * Setter for <code>test2.t_exotic_types.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.ID, value);
	}

	/**
	 * Getter for <code>test2.t_exotic_types.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.ID);
	}

	/**
	 * Setter for <code>test2.t_exotic_types.UU</code>. 
	 */
	public void setUu(java.util.UUID value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.UU, value);
	}

	/**
	 * Getter for <code>test2.t_exotic_types.UU</code>. 
	 */
	@javax.persistence.Column(name = "UU", length = 36)
	public java.util.UUID getUu() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.UU);
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
	public org.jooq.Row2<java.lang.Integer, java.util.UUID> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.util.UUID> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field2() {
		return org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.UU;
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
	public java.util.UUID value2() {
		return getUu();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TExoticTypesRecord
	 */
	public TExoticTypesRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);
	}
}
